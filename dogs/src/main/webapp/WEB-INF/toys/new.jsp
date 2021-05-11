<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gift Toy To Dog</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Toy Gift Bonanza!</h1>
<hr>
<form:form method="POST" action="/toys/new" modelAttribute="toy">
    <div class="form-group">
    	<form:label path="dog">Gift This Toy To:</form:label>
    	<form:errors path="dog"/>
    	<form:select path="dog">
    	<c:forEach items="${allDogs}" var="dog">
    		<option value="${dog.id}">${dog.name}</option>    		
    	</c:forEach>
    	</form:select>    
    </div>
    <div class="form-group">
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    </div>
    <div class="form-group">
    <form:label path="price">Price
    <form:errors path="price"/>
    <form:input  type="decimal" path="price"/></form:label>
    </div>
	<div class="form-group">
    <form:label path="description">Description
    <form:errors path="description"/>
    <form:input path="description"/></form:label>
	</div>
    <button>Add Toy To Database!</button>
</form:form>
</div>
</body>
</html>