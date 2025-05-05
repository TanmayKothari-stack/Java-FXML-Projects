from flask import Flask, request, jsonify
from flask_cors import CORS
import mysql.connector

conn = mysql.connector.connect(host="localhost",user="root",password="", database="test")
cursor = conn.cursor()

app = Flask(__name__)
CORS(app)

@app.route("/api/get_data", methods=["GET"])
def get_data():
    return ({"message": "Hello from flask"})

@app.route("/api/send_data", methods=["POST"])
def send_data():
    data = request.get_json()
    #print("Received Data: ", data , flush=True)
    name = data.get("name")
    pass_ = data.get("pass")
    conpass = data.get("conpass")
    email = data.get("email")

    cursor.execute("insert into testtable (name,password,conpassword,email) values(%s,%s,%s,%s) ",(name,pass_,conpass,email))
    conn.commit()

    return "Data is Submitted"

if __name__ == "__main__":
    app.run(debug=True)
