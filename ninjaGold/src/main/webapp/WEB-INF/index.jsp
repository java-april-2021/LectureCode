<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<p>Your Gold: <c:out value="${totalGold}"/></p>

<div class="building">
<form method="POST" action="/findGold">
<h3>Farm</h3>
<p>Earns 10-20 Gold</p>
<input type="hidden" value="farm" name="building">
<button>Find Gold!</button>
</form>
</div>

<div class="building">
<form method="POST" action="/findGold">
<h3>Cave</h3>
<p>Earns 5-10 Gold</p>
<input type="hidden" value="cave" name="building">
<button>Find Gold!</button>
</form>
</div>
<div class="building">
<form method="POST" action="/findGold">
<h3>House</h3>
<p>Earns 2-5 Gold</p>
<input type="hidden" value="house" name="building">
<button>Find Gold!</button>
</form>
</div>
<div class="building">
<form method="POST" action="/findGold">
<h3>Casino</h3>
<p>Earns / Loses 50 Gold</p>
<input type="hidden" value="casino" name="building">
<button>Find Gold!</button>
</form>
</div>

<div class="activities">
<c:forEach items="${activity}" var="act">
<p class='${act.contains("ouch")? "red" : "green"}'>${act}</p>
</c:forEach>
</div>
</body>
</html>