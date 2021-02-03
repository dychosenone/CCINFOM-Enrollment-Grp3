<%-- 
    Document   : addCourse
    Created on : 02 3, 21, 2:05:07 AM
    Author     : ccslearner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add to Cart</title>
    </head>
    <body>
        <jsp:useBean id="coursesBean" class="enrollment.enroll" scope="session" />
        <%  int currentTerm = (int) request.getSession().getAttribute("term");
            int schoolYear = (int) request.getSession().getAttribute("year");
            String courseid = request.getParameter("courseid");
            int returnValue = coursesBean.addEnrollment(courseid, currentTerm, schoolYear);
            
            if(returnValue == 1) { %>
                <p>The course was added to the cart successfully.</p>
        <%    } %>
        <a href="enroll_process.jsp">Return to Enrollment Page </a>
    </body>
</html>
