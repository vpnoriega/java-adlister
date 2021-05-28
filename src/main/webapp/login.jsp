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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <style>
    <%@ include file="partials/css/stylesheet.css" %>
    </style>

    </head>
<body>
<%@ include file="partials/navbar.jsp" %>

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

<script>
<%@ include file="partials/js/scripts.js" %>
</script>
</body>
</html>