<%--
  Created by IntelliJ IDEA.
  User: kali
  Date: 4/8/24
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin: all books</title>
    <%@include file="allCSS.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<h3 class="text-center">Hello Admin</h3>
<table class="table table-striped">
    <thead class="bg-primary">
    <tr>
        <th scope="col">Order Id</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Ph No</th>
        <th scope="col">Book Name</th>
        <th scope="col">Author</th>
        <th scope="col">Price</th>
        <th scope="col">Payment type</th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>otto</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>

    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>otto</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>

    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
        <td>otto</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>
        <td>@mdo</td>

    </tr>
    </tbody>
</table>
<div style="position: absolute; bottom: 0px; width: 100% ">
    <%@include file="footer.jsp" %>
</div>
</body>
</html>
