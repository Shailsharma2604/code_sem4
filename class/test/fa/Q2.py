from flask import Flask, render_template, url_for

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("index.html")

@app.route("/about/<name>")
def about(name):
    return render_template("about.html", name=name)

@app.route("/contact")
def contact():
    d = {
        "name": "Rahul",
        "email": "abc@gmail.com"
    }
    return render_template("contact.html", data=d)

def Hello_URL():
    return "HELLO"
app.add_url_rule('/hello', 'he', Hello_URL)

if(__name__ == '__main__'):
    app.run(debug=True)