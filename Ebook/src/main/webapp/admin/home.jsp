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
    <title>Admin:Home</title>
    <%@include file="allCSS.jsp" %>

    <style>
        a {
            text-decoration: none;
            color: black;
        }
    </style>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
    <div class="row p-5">
        <div class="col-md-3">
            <a href="add_book.jsp">
                <div class="card">
                    <div class="card-body text-center">
                        <i class="fa-solid fa-square-plus fa-3x text-primary"></i><br>
                        <h4>Add books</h4>
                        ---------
                    </div>
                </div>
            </a>

        </div>

        <div class="col-md-3">
            <a href="all_books.jsp">
                <div class="card">
                    <div class="card-body text-center">
                        <i class="fa-solid fa-book-open fa-3x text-danger"></i><br>
                        <h4>All books</h4>
                        ---------
                    </div>
                </div>
            </a>

        </div>

        <div class="col-md-3">
            <a href="orders.jsp">
                <div class="card">
                    <div class="card-body text-center">
                        <i class="fa-solid fa-box-open fa-3x text-warning"></i><br>
                        <h4>Orders</h4>
                        ---------
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="logout.jsp">
                <div class="card">
                    <div class="card-body text-center">
                        <i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br>
                        <h4>Logout</h4>
                        ---------
                    </div>
                </div>
            </a>
        </div>
    </div>
</div>
<div  style="position: absolute; bottom: 0px; width: 100% ">
    <%@include file="footer.jsp" %>
</div>

</body>
</html>
