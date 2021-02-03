<%-- 
    Document   : addstudent.jsp
    Created on : 02 3, 21, 6:16:43 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Student - CCINFOM</title>
        <style>
            body {   
                font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
                font-size: 14px;
                line-height: 1.42857143;
                color: #333;
                background-color: #fff;
            } 
        </style>
    </head>
    <body>
        <div>
            <div>
                <h1>Enter the student details to add:</h1>
                <form name="addstudent"   action="addstudent_process.jsp" method="POST">
                    <p>Student ID </p>
                    <input type="text" name="studentid" id="studentid">

                    <p>Complete Name </p>
                    <input type="text" name="completename" id="completename">

                    <p>Degree ID </p>
                    <input type="text" name="degreeid" id="degreeid">
                    <br />
                    <br />
                    <input type="submit" value="Submit" name="submit">
                    <br />
                    <br />
                    <br />
                </form>
                <a href="studentmaintenance.jsp">Back to Student Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
