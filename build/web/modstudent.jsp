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
    </head>
    <body>
        <div>
            <div>
                <h1>Enter the student details to modify:</h1>
                <form name="modstudent"   action="modstudent_process.jsp" method="POST">
                    <p>Student ID </p>
                    <input type="text" name="studentid" id="studentid">
                    <br />
                    <br />
                    <input type="submit" value="Search" name="search">
                    <br />
                    <br />
                </form>
                <a href="studentmaintainance.jsp">Back to Student Maintenance</a><br>
            </div>
        </div>
    </body>
</html>
