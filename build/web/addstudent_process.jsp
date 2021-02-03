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
        <a href="studentmaintainance.jsp">Back to Student Maintenance</a><br>
    </body>
</html>
