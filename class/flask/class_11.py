from flask import Flask
from flask_bcrypt import Bcrypt

app= Flask(__name__)
bcrypt=Bcrypt(app)

@app.route('/')
def index():
    password='Hello@123'
    # Generate_password_hash
    hashed_passwaord=bcrypt.generate_password_hash(password).decode('utf-8')
    is_valid=bcrypt.check_password_hash(hashed_passwaord,password)
    return f"Password:{password}<br>Hashed Password:{hashed_passwaord}<br> Is Valid: {is_valid}"
app.run(debug=True)