<%--
  Created by IntelliJ IDEA.
  User: rosebarcus
  Date: 6/30/21
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int instanceCount = 0; %>

<%
    int localCount =1;
    localCount += 1;
    instanceCount += 1;
%>

<html>
<head>
    <title>JSP Tags</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
    <%@include file="partials/navbar.jsp"%>
    <h1 class="bg-primary">Hello there!</h1>
    <h2> The local count is: <%= localCount%></h2>
    <h2> The instance count is: <%= instanceCount%></h2>

    <%@include file="partials/national-parks.jsp"%>
</body>
</html>
