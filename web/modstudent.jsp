<%-- 
    Document   : modstudent
    Created on : 02 3, 21, 8:05:11 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Existing Student - CCINFOM</title>
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
                <h1>Enter the student details to modify:</h1>
                <form name="modstudent"   action="modstudent_process.jsp" method="POST">
                    <p>Student ID </p>
                    <input type="text" name="studentid" id="studentid">

                    <p>Modified Complete Name </p>
                    <input type="text" name="completename" id="completename">

                    <p>Modified Degree ID </p>
                    <input type="text" name="degreeid" id="degreeid">
                    <br />
                    <br />
                    <input type="submit" value="Modify Record" name="modify record">
                    <br />
                    <br />
                    <br />
                </form>
                <a href="studentmaintenance.jsp">Back to Student Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
