<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Dogs dot Com</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Welcome to Dogs dot Com</h1>
<hr>
<table class="table table-dark">
<thead>
<td>ID</td>
<td>Name</td>
<td>Breed</td>
<td>Age</td>
<td>Registered</td>
</thead>
<tbody>
<c:forEach items="${dogs}" var="dog">
<tr>
<td>${dog.id}</td>
<td><a href="/${dog.id}/">${dog.name}</a></td>
<td>${dog.breed}</td>
<td>${dog.age}</td>
<td>

<c:choose>
<c:when test="${dog.tag != null }">
<p>Registered</p>
</c:when>
<c:otherwise>
<p>Not Yet Registered</p>
</c:otherwise>
</c:choose>

</td>
</tr>
</c:forEach>

</tbody>
</table>

</div>
</body>
</html>