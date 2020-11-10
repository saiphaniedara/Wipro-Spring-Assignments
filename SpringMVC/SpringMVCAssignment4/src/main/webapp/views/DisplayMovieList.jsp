<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top View Series / Movies</title>
</head>
<body>
	<h2>Top 10 Movies / Series</h2>
	<table>
	<c:forEach var="movie" items="${movies.getMoviesList()}">
		<tr>
			<td>
				<c:out value="${movie}"></c:out>
			</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>