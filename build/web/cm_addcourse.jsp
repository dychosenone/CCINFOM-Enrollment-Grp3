<%-- 
    Document   : cm_addcourse
    Created on : 02 3, 21, 10:01:49 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a Course - CCINFOM</title>
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
                <h1>Enter the course details to add:</h1>
                <form name="cm_addcourse"   action="cm_addcourse_process.jsp" method="POST">
                    <p>Course ID </p>
                    <input type="text" name="courseid" id="coursetid">

                    <p>Course Name </p>
                    <input type="text" name="coursename" id="coursename">

                    <p>Department </p>
                    <input type="text" name="department" id="department">
                    <br />
                    <br />
                    <input type="submit" value="Submit" name="submit">
                    <br />
                    <br />
                    <br />
                </form>
                <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
