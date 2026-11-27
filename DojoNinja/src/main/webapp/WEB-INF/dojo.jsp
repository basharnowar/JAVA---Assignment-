<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo</title>
</head>
<body>

	<form action="/createdojo" method="post">
		<label for="name">Dojo</label>
		<input type="text" name="name" id="name">
		<input type="submit" value="submit">
	</form>
	
</body>
</html>