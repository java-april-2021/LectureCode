<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To Our Web Page</title>
</head>
<body>
<h1>Tell A Joke</h1>

<form method="POST" action="/result">
<label>Name: </label> <input type="text" name="name">
<label>Email: </label> <input type="text" name="email">
<label>Joke: </label> <textarea name="joke"></textarea>
<button>Submit</button>

</form>
</body>
</html>