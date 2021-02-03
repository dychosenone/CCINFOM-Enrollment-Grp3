<%-- 
    Document   : cm_loadcourse
    Created on : 02 4, 21, 7:45:27 AM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Maintenance - CCINFOM</title>
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
                <h1>Load Course Records</h1>  
            </div>
            <div class="list-group">
                
                <jsp:useBean id="coursesBean" class="enrollment.courses" scope="session" />
                <jsp:useBean id="coursesTemp" class="enrollment.courses" scope="page"    />
                <% coursesBean.viewAllRecords(); %>
                Complete Course Records on Enrollment Database<br><br>
                <table style="width:75%" border="1">
                    <tr>
                        <td>Course ID</td>
                        <td>Course Name</td>
                        <td>Department ID</td>
                    </tr>
                    <tr>
                    <%  coursesBean.viewAllRecords();
                        for (int i=0; i<coursesBean.courselist.size(); i++) {
                           coursesTemp = coursesBean.courselist.get(i);
                    %>
                    <tr>
                        <td><%=coursesTemp.courseid%></td>
                        <td><%=coursesTemp.coursename%></td>
                        <td><%=coursesTemp.department%></td>
                    </tr>
                    <% }
                    %>
                </table>
                <br>
                <br>
                
                <a href="coursemaintenance.jsp" class="list-group-item" style="margin:5px;">Return to Course Maintenance</a><br>
                
            </div>
        </div>
    </body>
</html>


