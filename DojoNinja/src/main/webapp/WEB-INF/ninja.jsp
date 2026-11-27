<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja</title>
</head>
<body>

	<form action="/createninja" method="post">
		
		<select name="dojoid">
			
			<c:forEach var="dojo" items="${dojos}" >
			
			<option   value="${dojo.id}" ><c:out value="${dojo.name}"></c:out></option>	
			
			
			</c:forEach>
			
		</select>
		
		<label for="firstName">First Name:</label>
		<input type="text" name="firstName" id="firstName">
		
		<label for="lastName">Last Name:</label>
		<input type="text" name="lastName" id="lastName">
		
		<label for="age">Age:</label>
		<input type="text" name="age" id="age">
		<input type="submit" value="submit">
	</form>
	
</body>
</html>