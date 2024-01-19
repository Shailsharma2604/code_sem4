# from flask import Flask

# app=Flask(__name__)

# @app.route("/")
# def home():
#     return "Hello,World!"

# if __name__=="__main__":
#     app.run(debug=True)



from flask import Flask

app=Flask(__name__)

# @app.route("/")
def hello_world():
    return "<h1>Hello,World!<h1/>"
app.add_url_rule('/','he',hello_world)

if __name__=="__main__":
    app.run(debug=True)
