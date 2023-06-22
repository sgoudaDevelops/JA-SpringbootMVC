<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration thing</title>
</head>
<body>
<h1 style="color:red;text-align:center;">Registration form for student</h1>
<form action="register" method="POST">
       <div>
         <label>Student Name::</label>
         <input type="text" name="sname">
       </div>
       <div> <br>
         <label> Student Number</label>
         <input type="text" name="sno">
       </div><br>
       <div>
         <label>Student Address::</label>
         <input type="text" name="saddrs">
       </div><br>
       <div>
         <label>Student Averege::</label>
         <input type="text" name="savg">
       </div><br>
       <br>
       <div>
       <input type="submit" value="register">
       </div>
</form>


</body>
</html>