<%-- 
    Document   : studentmaintainance
    Created on : 02 3, 21, 5:48:08 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Maintenance - CCINFOM</title>
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
        <div class="container">
            <div class="page-header">
                <h1>Load Student Records</h1>  
            </div>
            <div class="list-group">
                
                <jsp:useBean id="studentsBean" class="enrollment.students" scope="session" />
                <jsp:useBean id="studentsTemp" class="enrollment.students" scope="page"    />
                <% studentsBean.viewAllRecords(); %>
                Complete Student Records on Enrollment Database<br><br>
                <table style="width:75%" border="1">
                    <tr>
                        <td>Student ID</td>
                        <td>Complete Name</td>
                        <td>Degree ID</td>
                    </tr>
                    <tr>
                    <%  studentsBean.viewAllRecords();
                        for (int i=0; i<studentsBean.studlist.size(); i++) {
                           studentsTemp = studentsBean.studlist.get(i);
                    %>
                    <tr>
                        <td><%=studentsTemp.studentid%></td>
                        <td><%=studentsTemp.completename%></td>
                        <td><%=studentsTemp.degreeid%></td>
                    </tr>
                    <% }
                    %>
                </table>
                <br>
                <br>
                
                <a href="studentmaintenance.jsp" class="list-group-item" style="margin:5px;">Return to Student Maintenance</a><br>
                
            </div>
        </div>
    </body>
</html>

