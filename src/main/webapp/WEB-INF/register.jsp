<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 6/3/21
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form class="form-group" action="/register" method="POST">
    <label for="username"><b>username</b></label>
    <input type="text" name="username" id="username" placeholder="Enter Username" required>

    <label for="email"><b>Email</b></label>
    <input type="email" name="email" id="email" placeholder="Enter Email" required>

    <label for="password"><b>Password</b></label>
    <input type="password" name="password" id="password" placeholder="Password" required>

    <input type="submit" value="Register">
</form>
</body>
</html>
