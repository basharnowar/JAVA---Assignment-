<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fruits</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

    <h1>Fruits!</h1>

    <c:forEach var="fruit" items="${yousef}">
        <h2>
            <span class="label">name:</span>
            <span style="color: ${fruit.name.startsWith('G') ? 'orange' : 'black'}">${fruit.name}</span>,
            <span class="label">price:</span>
            <c:out value="${fruit.price}"/>
        </h2>
    </c:forEach>

</body>
</html>