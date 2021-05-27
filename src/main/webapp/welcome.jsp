<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 5/27/21
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Welcome, Marco</title>
    <%-- Must remember to not have any servlets listening to the root --%>
    <link rel = "stylesheet" href="css/styles.css">
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<%! int counter = 0; %> <!-- instance variable -->

<% counter++;
request.setAttribute("age", 39);
request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7});
%>

<!-- Hello from a comment -->
<h1>Hello, Marco</h1>

<!-- the % is a PAGE DIRECTIVE. JSP directives allow us to set conditions that apply to the entire JSP file (there are multiple) -->
<p>What is 1+1? <%= 1 + 1 %> Would be the answer.</p>

<p>This page was requested using the method <span><%=request.getMethod()%></span></p>

<p>Path:<%= request.getRequestURL()%></p>

<p>Name parameter in the query string <%=request.getParameter("name")%></p>
<!-- the line below is the same as the one above, just with some syntactical sugar -->
<p>name: ${param.name}</p>

<div>This page has been visited <%= counter%></div>
<p>Douglas is ${age}</p>

<%--<c:if test="${age <= 10}">--%>
<%--    <a href="http://www.neopets.com/"> Neopets for the win!</a>--%>
<%--</c:if>--%>

<%--<c:if test="${age > 10}">--%>
<%--    <p>You should really go find some stuff</p>--%>
<%--    <a href="http://www.google.com">Google</a>--%>
<%--</c:if>--%>

<c:choose>
    <c:when test = "${age <= 10}">
        <a href="http://www.neopets.com/"> Neopets for the win!</a>
    </c:when>
    <c:otherwise>
        <a href="http://www.google.com">Google</a>
    </c:otherwise>
</c:choose>

<ul>
<c:forEach items="${numbers}" var="number">
    <li>Item number ${number}</li>
</c:forEach>
</ul>

<script src = js/scripts.js ></script>
</body>
</html>
