<%--
  Created by IntelliJ IDEA.
  User: kali
  Date: 4/6/24
  Time: 12:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User: home</h1>
<c:if test = "${not empty userObj.getName()}" >
    <h3>${userObj.getName()}</h3>
<%--    <c:remove var="userObj.name" scope="session" />--%>
</c:if>
</body>
</html>
