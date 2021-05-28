<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 5/28/21
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a Number</title>
</head>
<body>
<h1>Welcome to the Guessing Game!</h1>

<form action="/guess" method="POST">

<h2>Guess a number between 1-3: </h2>
    <div class="form-group">
        <input type="text" id="number" name="userInput">
        <input type="submit" value="Submit">
    </div>

</form>

</body>
</html>
