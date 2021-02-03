<%-- 
    Document   : cm_delcourse
    Created on : 02 3, 21, 10:02:16 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deleting Existing Course - CCINFOM</title>
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
                <h1>Enter the course details to delete:</h1>
                <form name="cm_delcourse"   action="cm_delcourse_process.jsp" method="POST">
                    <p>Student ID </p>
                    <input type="text" name="courseid" id="courseid">
                    <br />
                    <br />
                    <input type="submit" value="Delete" name="delete">
                    <br />
                    <br />
                    <br />
                </form>
                <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
