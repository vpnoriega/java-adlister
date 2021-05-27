<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("POST")) {
       String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>
<html>
<head>
    <title>Login Page</title>
    <link rel = "stylesheet" href="partials/css/stylesheet.css">
</head>
<body>

<h1>Welcome to the Login Page!</h1>

<form action="/login.jsp" method="POST">
    <p>
    Username: <input id="username" name = "username" type="text">
    </p>
    <p>
    Password: <input id="password" name = "password" type="password">
    </p>
    <input type="submit">
</form>

<p>

</p>

<script src="partials/js/scripts.js"></script>
</body>
</html>