<%-- 
    Document   : addstudent_process
    Created on : 02 3, 21, 6:31:39 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Add Student Data Record</title>
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
        <h1>Adding New Student Record</h1>
        <jsp:useBean id="studentsBean" class="enrollment.students" scope="page" />
        <%  studentsBean.studentid      = Long.parseLong(request.getParameter("studentid"));
            studentsBean.completename   = request.getParameter("completename");
            studentsBean.degreeid       = request.getParameter("degreeid");
             
            if (studentsBean.addRecord()!=0) {
        %>
        Adding of new student record with id number <%=studentsBean.studentid%> was successful<br>
        <%
            } else {
        %>
        Adding of new student record with id number was not successful<br>        
        <%        
            }
        %>
        <br>     
        <a href="studentmaintenance.jsp">Back to Student Maintenance</a><br>
    </body>
</html>
