from flask import Flask, render_template
from datetime import datetime

app = Flask ("hello")

posts = [
    {
        "title": "O meu primeiro post",
        "body": "Aqui é o texto do post",
        "author": "Paulo",
        "created":datetime(2022,7,25)
    },
    {
        "title": "O meu segundo post",
        "body": "Texto do segundo post",
        "author": "Claudio",
        "created": datetime(2022,7,26)
    }

]

@app.route("/")
def index():
    return render_template("index.html", posts=posts)

@app.route('/login')
def Login():
    return render_template("login.html")