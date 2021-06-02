<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 5/31/21
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form action="/viewcolor" method="GET">
    <h1>Pick a Color!</h1>
    <div class="form-group">
        <label for="colorpick">Please tell me your favorite color to put it to work:</label><br>
        <br><input type="text" id="colorpick" name="userColor"><br>
        <br><input type="submit" value="Work it">
    </div>

</form>
</body>
</html>
