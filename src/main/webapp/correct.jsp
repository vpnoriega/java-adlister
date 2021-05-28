<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 5/28/21
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Answers Page</title>
</head>
<body>

<c:if test="${url.equals('correct')}">

    <h1>You got it right!</h1>

</c:if>

<c:if test="${url.equals('/incorrect')}">

    <h1>You got it wrong :(</h1>

</c:if>

</body>
</html>
