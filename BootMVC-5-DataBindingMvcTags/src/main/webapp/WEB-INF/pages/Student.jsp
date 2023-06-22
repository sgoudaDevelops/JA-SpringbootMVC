<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration thing</title>
</head>
<body>
<frm:form modelAttribute="stud">
<nav style="background: lime; padding: 10px ;border-color: red;border-radius: 30%;width:fit-content;margin-left:20%; height:40px;">
<h1 style="color:red;text-align:center;">Registration form for student</h1></nav>	
<div style="background-color:aqua; padding: 10px; width:fit-content; margin-left:40% ">
       <div>
         <label>Student Name::</label>
        <frm:input path="sname"/>
       </div>
       <div> <br>
         <label> Student Number</label>
         <frm:input path="sno"/>
       </div><br>
       <div>
         <label>Student Address::</label>
        <frm:input path="saddrs"/>
       </div><br>
       <div>
         <label>Student Averege::</label>
        <frm:input path="savg"/>
       </div><br>
       <br>
       <div>
       <input type="submit" value="register">
       <input type="reset" value="cancel">
       </div>

</div>
</frm:form>
</body>
</html>