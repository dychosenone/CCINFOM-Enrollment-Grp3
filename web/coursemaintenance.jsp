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
                <h1>Course Maintenance</h1>  
            </div>
            <div class="list-group">
                
                <a href="cm_addcourse.jsp" class="list-group-item" style="margin:5px;">Add Course Data</a>
                <br>
                <br>
                <a href="cm_modcourse.jsp" class="list-group-item" style="margin:5px;">Modify Course Data</a>
                <br>
                <br>
                <a href="cm_delcourse.jsp" class="list-group-item" style="margin:5px;">Delete Course Data</a>
                <br>
                <br>
                <a href="cm_loadcourse.jsp" class="list-group-item" style="margin:5px;">Load Course Records</a>
                <br>
                <br>
                <a href="recordmanagement.jsp" class="list-group-item" style="margin:5px;">Return to Record Management</a><br>
                
            </div>
        </div>
    </body>
</html>

