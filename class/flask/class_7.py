from flask import Flask, render_template
import sqlite3


conn = sqlite3.connect('test.db')           # Connect to the database

print("Opened database successfully")

conn.execute('''                            
    CREATE TABLE COMPANY (
    ID          INT         PRIMARY KEY     NOT NULL,
    NAME        TEXT        NOT NULL,
    AGE         INT         NOT NULL,
    ADDRESS     CHAR(50)    NOT NULL,
    SALARY      REAL);
'''
)

# Execute the SQL query to create the table

print("Table created successfully")

conn.close()