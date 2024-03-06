# from flask import Flask
# from flask_bcrypt import Bcrypt

# app= Flask(__name__)
# bcrypt=Bcrypt(app)

# @app.route('/')
# def index():
#     password='Hello@123'
#     # Generate_password_hash
#     hashed_passwaord=bcrypt.generate_password_hash(password).decode('utf-8')
#     is_valid=bcrypt.check_password_hash(hashed_passwaord,password)
#     return f"Password:{password}<br>Hashed Password:{hashed_passwaord}<br> Is Valid: {is_valid}"
# app.run(debug=True)

# from flask import Flask, render_template, request, url_for, redirect
# from flask_sqlalchemy import SQLAlchemy
# from flask_login import LoginManager, UserMixin, login_user, logout_user
# from flask_bcrypt import Bcrypt

# app = Flask(__name__)
# app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///db.sqlite"
# app.config["SECRET_KEY"] = "abc"
# db = SQLAlchemy()
# bcrypt = Bcrypt(app)
# login_manager = LoginManager()
# login_manager.init_app(app)

# # User model
# class Users(UserMixin, db.Model):
#     id = db.Column(db.Integer, primary_key=True)
#     username = db.Column(db.String(250), unique=True, nullable=False)
#     password = db.Column(db.String(250), nullable=False)

# @login_manager.user_loader
# def load_user(user_id):
#     return Users.query.get(user_id)

# @app.route('/sign-up', methods=["GET", "POST"])
# def register():
#     if request.method == "POST":
#         username = request.form.get("username")
#         password = request.form.get("password")
#         hashed_password = bcrypt.generate_password_hash(password).decode('utf-8')
#         user = Users(username=username, password=hashed_password)
#         db.session.add(user)
#         db.session.commit()
#         return redirect(url_for("login"))
#     return render_template("sign-up.html")

# @app.route("/login", methods=["GET", "POST"])
# def login():
#     if request.method == "POST":
#         username = request.form.get("username")
#         password = request.form.get("password")
#         user = Users.query.filter_by(username=username).first()
#         if user and bcrypt.check_password_hash(user.password, password):
#             login_user(user)
#             return redirect(url_for("home1"))
#     return render_template("login.html")

# @app.route("/logout")
# def logout():
#     logout_user()
#     return redirect(url_for("home1"))

# @app.route("/")
# def home1():
#     return render_template("home1.html")

# if __name__ == "__main__":
#     app.run(debug=True)


from flask import Flask, render_template, request, url_for, redirect, abort
from flask_sqlalchemy import SQLAlchemy
from flask_login import LoginManager, UserMixin, login_user, logout_user
from flask_bcrypt import Bcrypt

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///example.db'
app.config['SECRET_KEY'] = "abc"
db = SQLAlchemy(app)
bcrypt = Bcrypt(app)

login_manager = LoginManager()
login_manager.init_app(app)

@login_manager.user_loader
def load_user(user_id):
    return User.query.get(int(user_id))

# Define User-Role Many-to-Many Relationship Table
user_roles = db.Table('user_roles',
                      db.Column('user_id', db.Integer, db.ForeignKey('user.id'), primary_key=True),
                      db.Column('role_id', db.Integer, db.ForeignKey('role.id'), primary_key=True)
                      )

# Define User Model
class User(UserMixin, db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(80), unique=True, nullable=False)
    password = db.Column(db.String(128), nullable=False)
    roles = db.relationship('Role', secondary=user_roles, backref=db.backref('users', lazy='dynamic'))

# Define Role Model
class Role(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(88), unique=True, nullable=False)

# Authentication Mechanism (simplified)
def authenticate(username, password):
    user = User.query.filter_by(username=username).first()
    if user and bcrypt.check_password_hash(user.password, password):
        return user
    return None

# Authorization Logic
def requires_role(role_name):
    def decorator(func):
        def wrapper(*args, **kwargs):
            auth = request.authorization
            if not auth or not authenticate(auth.username, auth.password):
                return abort(401, 'Authentication required')
            user = authenticate(auth.username, auth.password)
            if user is None or role_name not in [role.name for role in user.roles]:
                return abort(403, 'Forbidden')
            return func(*args, **kwargs)
        return wrapper
    return decorator

# Protected Route
@app.route('/admin')
@requires_role('admin')
def admin_route():
    return 'Admin route accessed successfully'

@app.route('/sign-up', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        username = request.form.get("username")
        password = request.form.get("password")
        try:
            user = User(username=username, password=bcrypt.generate_password_hash(password).decode('utf-8'))
            db.session.add(user)
            db.session.commit()
            return redirect(url_for('login'))
        except Exception as e:
            db.session.rollback()
            error_message = "An error occurred. Please try again later."
            return render_template('sign-up.html', error=error_message)
    return render_template('sign-up.html')

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        try:
            user = authenticate(request.form.get("username"), request.form.get("password"))
            if user:
                login_user(user)
                return redirect(url_for('home'))
            return render_template('login.html', error="Invalid username or password.")
        except Exception as e:
            print(f"An error occurred during login: {str(e)}")
            return render_template('login.html', error="An unexpected error occurred. Please try again later.")
    return render_template('login.html')

@app.route('/logout')
def logout():
    logout_user()
    return redirect(url_for('home'))

@app.route('/')
def home():
    return render_template('home1.html')

# if _name_ == '_main_':
with app.app_context():
    db.create_all()
app.run(debug=True)