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
                </form>
                <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
