<%-- 
    Document   : cm_modcourse
    Created on : 02 3, 21, 10:02:03 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Existing Course - CCINFOM</title>
    </head>
    <body>
        <div>
            <div>
                <h1>Enter the course details to modify:</h1>
                <form name="cm_modcourse"   action="cm_modcourse_process.jsp" method="POST">
                    <p>Course ID </p>
                    <input type="text" name="courseid" id="coursetid">

                    <p>Modified Course Name </p>
                    <input type="text" name="coursename" id="coursename">

                    <p>Modified Department </p>
                    <input type="text" name="department" id="department">
                    <br />
                    <br />
                    <input type="submit" value="Modify Record" name="modify record">
                    <br />
                    <br />
                </form>
                <a href="coursemaintenance.jsp">Back to Course Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
