<%-- 
    Document   : enroll
    Created on : 02 2, 21, 7:57:38 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enroll - CCINFOM</title>

    </head>
    <body>
        <div>
            <div>
                <h1>Enrollment Page</h1>
                <form name="search" action="enroll_process.jsp" method="POST">
                    <p>Student ID: </p>
                    <input type="text" name="studentid" id="studentid">

                    <p>Current Term </p>
                    <input type="text" name="currentTerm" id="currentTerm">

                    <p>School Year </p>
                    <input type="text" name="schoolYear" id="schoolYear">
                    <br />
                    <br />
                    <input type="submit" value="search" name="Search">
                </form>

            </div>
        </div>
    </body>
</html>