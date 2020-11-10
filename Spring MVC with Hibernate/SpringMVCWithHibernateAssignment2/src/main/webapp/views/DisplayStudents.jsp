<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Students Details</title>
</head>
<body>
	<h1>Details of All Students</h1>
	<table border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
		</tr>
		<c:forEach items="${ss}" var="s">
			<tr>
				<td><c:out value="${s.getSid()}"></c:out></td>
				<td><c:out value="${s.getSname()}"></c:out></td>
				<td><c:out value="${s.getSage()}"></c:out></td>
			</tr>		
		</c:forEach>
				
	</table>
</body>
</html>