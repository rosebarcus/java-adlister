<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rosebarcus
  Date: 6/30/21
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

if (request.getMethod().equalsIgnoreCase("post")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
}

%>
<html>
<head>
    <title>JSP Login</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<form method="post" action="/WEB-INF/login.jsp">
    <div class="row mb-3">
        <label for="username" class="col-sm-2 col-form-label">Username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" name="username">
        </div>
    </div>
    <div class="row mb-3">
        <label for="password" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="password" name="password">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Sign in</button>
</form>

<%--<c:choose>

    <c:when test="${param.username == 'admin' && param.password == 'password'}">
        <c:redirect url="./profile.jsp">
            <c:param name="username" value="${param.username}"></c:param>
            <c:param name="password" value="${param.password}"></c:param>
        </c:redirect>
    </c:when>

    <c:otherwise>

        <h1>User Login</h1>
        <h2>Username: ${param.username}</h2>

    </c:otherwise>
</c:choose>--%>
<%@include file="partials/scripts.jsp"%>
</body>
</html>
