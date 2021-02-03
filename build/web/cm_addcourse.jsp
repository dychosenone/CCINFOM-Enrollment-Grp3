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
                </form>
                <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
