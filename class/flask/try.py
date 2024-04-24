import subprocess
from flask import Flask

app = Flask(__name__)

@app.route('/')
def index():
    # Replace 'other_script.py' with the name of the Python file you want to run
    process = subprocess.Popen(['python', 'class_12.py'], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()
    
    if process.returncode == 0:
        return f'Success! Output: {stdout.decode("utf-8")}'
    else:
        return f'Error! Output: {stderr.decode("utf-8")}'

if __name__ == '__main__':
    app.run()
