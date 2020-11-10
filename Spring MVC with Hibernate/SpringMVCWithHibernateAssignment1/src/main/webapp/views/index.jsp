<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student Details</title>
</head>
<body>
	<h2>Enter Student Details</h2>
	<form:form action="InsertStudent" modelAttribute="stud" method="post">
		<label>Enter Student Id: </label>
		<form:input path="sid"/>
		<br>
		<label>Enter Student Name: </label>
		<form:input path="sname"/>
		<br>
		<label>Enter Student Age: </label>
		<form:input path="sage"/>
		<br>
		<input type="submit" value="Insert Student">
	</form:form>
</body>
</html>