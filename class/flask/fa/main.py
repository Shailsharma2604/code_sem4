from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("main.html")

@app.route("/about/<name_of_user>")
def about(name_of_user):
    return render_template("about_1.html", name=name_of_user)

@app.route("/contact")
def contact():
    d = {
        "name": "Rohit",
        "email": "rohitgmail.com"
    }
    return render_template("contact_1.html", data=d)

def Hello_URL():
    return "HELLO"
app.add_url_rule('/hello', 'he', Hello_URL)

if(__name__ == '__main__'):
    app.run(debug=True)
    