<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Total Marks</title>
</head>
<body>
<h3>Calculate Total Marks</h3>
	<form action="CalSum">
		<label for="sm">Enter Science Marks: </label>
		<input type="number" name="sm" required="required">
		<br>
		<label for="mm">Enter Maths Marks: </label>
		<input type="number" name="mm" required="required">
		<br>
		<label for="em">Enter English Marks: </label>
		<input type="number" name="em" required="required">
		<br>
		<input type="submit" value="Calculate Total Marks">
	</form>
</body>
</html>