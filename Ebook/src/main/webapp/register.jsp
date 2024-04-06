<%--
  Created by IntelliJ IDEA.
  User: kali
  Date: 3/12/24
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <%@include file="all_components/allCSS.jsp" %>
    <title>EBook Register</title>
</head>
<body style="background-color: #f0f1f2">
<%@include file="all_components/navbar.jsp" %>
<div class="container p-2">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card">
                <div class="card-body">
                    <h4 class="text-center">Registration form</h4>
                    <% if (true){
                        System.out.println("the msg is: ");
                    }%>
<%--                    <c:if test ="${not empty successMsg}">--%>
<%--                        <p class="text-center">msg is: {successMsg}</p>--%>
<%--                    </c:if>>--%>
                    <form action="register" method="POST">

                        <div class="mb-3">
                            <label for="full-names" class="form-label">Enter Full Names</label>
                            <input type="text" class="form-control" id="full-names" aria-describedby="emailHelp" required="required" name="fname">
                        </div>

                        <div class="mb-3">
                            <label for="email-address" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="email-address" aria-describedby="emailHelp" required="required" name="email">
                        </div>

                        <div class="mb-3">
                            <label for="phone-number" class="form-label">Phone No</label>
                            <input type="number" class="form-control" id="phone-number" aria-describedby="emailHelp" required="required" name="phono">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Password</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" required="required" name="password">
                        </div>
                        <div class="mb-3 form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1" name="check">
                            <label class="form-check-label" for="exampleCheck1">Agree terms&conditions</label>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="all_components/footer.jsp"%>
</body>
</html>
