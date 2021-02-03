<%-- 
    Document   : delstudent_process
    Created on : 02 3, 21, 9:01:39 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Delete Student Data Record</title>
    </head>
    <body>
        <h1>Deleting Existing Student Record</h1>
        <jsp:useBean id="studentsBean" class="enrollment.students" scope="page" />
        <%  studentsBean.studentid = Long.parseLong(request.getParameter("studentid"));
            
            studentsBean.viewAllRecords();
            
            int found = 0;
            for (int i=0; i< studentsBean.studlist.size(); i++) 
                if (studentsBean.studlist.get(i).studentid == studentsBean.studentid)
                    found = 1;
            
            if (found != 0) {
                studentsBean.delRecord();
        %>
        Deleting of existing student record with id number <%=studentsBean.studentid%> was successful<br>
        <%
            } else {
        %>
        Deleting of existing student record with id number was not successful<br>        
        <%        
            }
        %>
        <br>     
        <a href="studentmaintenance.jsp">Back to Student Maintenance</a><br>
    </body>
</html>