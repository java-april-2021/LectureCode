<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thanks for adding your joke!</title>
</head>
<body>
<p>Name: <c:out value="${name}"/></p>
<p>Email: <c:out value="${email}"/></p>
<p>Joke: <c:out value="${joke }"/></p>
</body>
</html>