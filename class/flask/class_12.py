
################################## Without api ##########################

# from flask import Flask,jsonify,request

# app=Flask(__name__)

# @app.route('/',methods=['GET','POST'])
# def home():
#     if(request.method=='GET'):
#         data="Hello World!"
#         return jsonify({'data':data})
    
# @app.route('/home/<int:num>',methods=['GET'])
# def disp(num):
#     return jsonify({'data':num**2})

# app.run(debug=True)

################################## With api ##########################

# from flask import Flask,jsonify,request

# app=Flask(__name__)

# api=api(app)

# @app.route('/',methods=['GET','POST'])
# def home():
#     if(request.method=='GET'):
#         data="Hello World!"
#         return jsonify({'data':data})
    
# api.app_resource(Hello,'/')
# api.app_resource(Square,'/Square/<int:num>')
    
# @app.route('/home/<int:num>',methods=['GET'])
# def disp(num):
#     return jsonify({'data':num**2})

# app.run(debug=True)

################################## Unauthorized ##########################

from flask import Flask,request,abort
from flask_sqlalchemy import SQLAlchemy

app=Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///example.db'
db = SQLAlchemy (app)

#Define User-Role Many-to-Many Relationship Table

user_roles = db.Table('user_roles',
                      db.Column('user_id', db.Integer, db.ForeignKey('user.id'), primary_key=True),
                      db.Column('role_id', db.Integer, db.ForeignKey('role.id'), primary_key=True)
                     )

                       
#Define User Model
class User (db.Model):
    id= db.Column (db. Integer, primary_key=True)
    username = db.Column (db.String(80), unique=True, nullable=False)
    password = db.Column(db.String(128), nullable=False)
    roles = db.relationship('Role', secondary=user_roles, backref=db.backref ('users', lazy='dynamic'))
                                                                              
# Define Role Model
    
class Role (db.Model):
    id = db.Column(db. Integer, primary_key=True)
    name = db.Column (db.String (88), unique=True, nullable=False)


# Authentication Mechanism (simplified)
    
def authenticate(username, password):
    user = User.query.filter_by (username=username, password=password).first()
    return user

#Authorization Logic

def requires_role(role_name):
    def decorator (func):
        def wrapper (*args, **kwargs):
            auth =request.authorization
            if not auth or not authenticate (auth.username, auth.password):
                return abort (401, 'Authentication required')
            user=authenticate(auth.username, auth.password)
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

if __name__=='__main__':
    with app.app_context():
        db.create_all()
    app.run(debug=True)