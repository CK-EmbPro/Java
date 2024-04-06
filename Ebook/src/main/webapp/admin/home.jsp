<%--
  Created by IntelliJ IDEA.
  User: kali
  Date: 4/6/24
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Admin:home</h1>
<c:if test = "${not empty userObj.name}" >
    <h3>${userObj.name}</h3>
</c:if>
</body>
</html>
