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
                <h1>Student Maintenance</h1>  
            </div>
            <div class="list-group">
                
                <a href="addstudent.jsp" class="list-group-item" style="margin:5px;">Add Student Data</a>
                <br>
                <br>
                <a href="modstudent.jsp" class="list-group-item" style="margin:5px;">Modify Student Data</a>
                <br>
                <br>
                <a href="delstudent.jsp" class="list-group-item" style="margin:5px;">Delete Student Data</a>
                <br>
                <br>
                <a href="loadstudent.jsp" class="list-group-item" style="margin:5px;">Load Student Records</a>
                <br>
                <br>
                <a href="recordmanagement.jsp" class="list-group-item" style="margin:5px;">Return to Record Management</a><br>
                
            </div>
        </div>
    </body>
</html>

