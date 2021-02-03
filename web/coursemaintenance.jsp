<%-- 
    Document   : coursemaintenance
    Created on : 02 3, 21, 9:55:12 PM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Maintenance - CCINFOM</title>
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1>Course Maintenance</h1>  
            </div>
            <div class="list-group">
                
                <jsp:useBean id="coursesBean" class="enrollment.courses" scope="session" />
                <jsp:useBean id="coursesTemp" class="enrollment.courses" scope="page"    />
                <% coursesBean.viewAllRecords(); %>
                <br>Complete Course Records on Enrollment Database<br>
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
                <a href="cm_addcourse.jsp" class="list-group-item">Add Course Data</a>
                <a href="cm_modcourse.jsp" class="list-group-item">Modify Course Data</a>
                <a href="cm_delcourse.jsp" class="list-group-item">Delete Course Data</a>
                
            </div>
        </div>
    </body>
</html>

