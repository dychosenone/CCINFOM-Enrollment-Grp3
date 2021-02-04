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
            int returnValue = 1;
            int found = 0;
            for(int i = 0; i < coursesBean.EnrollmentList.size(); i++) {
                if((coursesBean.EnrollmentList.get(i).courseid).equals(courseid))
                    returnValue = 0;
            }
            
            for(int i = 0; i < coursesBean.CourseList.size(); i++) {
                if((coursesBean.CourseList.get(i).courseid).equals(courseid))
                    found = 1;
            }
            
            if(returnValue == 1 && found == 1)
                returnValue = coursesBean.addEnrollment(courseid, currentTerm, schoolYear);
            
            if(returnValue == 1 && found == 1) { %>
                <p>The course was added to the cart successfully.</p>
        <%    } else {%>
            <p>There was a problem adding the course.</p>
        <% } %>
        <a href="enroll_process.jsp">Return to Enrollment Page </a>
    </body>
</html>
