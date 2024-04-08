<%--
  Created by IntelliJ IDEA.
  User: kali
  Date: 4/7/24
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin:AddBook</title>
    <%@include file="allCSS.jsp"%>
</head>
<body style="background-color: #f0f2f2">
    <%@include file="navbar.jsp"%>
    <div class="container">
        <div class="row">
            <div class="col-md-4 offset-md-4">
                <div class="card">
                    <div class="card-body">
                        <form action="register" method="POST">

                            <div class="z-3">
                                <label for="full-names" class="form-label">Book Name</label>
                                <input type="text" class="form-control" id="full-names" aria-describedby="emailHelp" required="required" name="fname">
                            </div>

                            <div class="mb-3">
                                <label for="authName" class="form-label">Author name</label>
                                <input type="text" class="form-control" id="authName" aria-describedby="emailHelp" required="required" name="email">
                            </div>

                            <div class="mb-3">
                                <label for="price" class="form-label">Price</label>
                                <input type="number" class="form-control" id="price" aria-describedby="emailHelp" required="required" name="phono">
                            </div>

                            <div class="mb-3">
                                <label for="inputState" class="form-label">Book categories</label>
                                <select id="inputState" name="btype" class="form-control">
                                    <option selected>--select--</option>
                                    <option value="New">New book</option>
                                </select>
                            </div>

                            <div class="mb-3">
                                <label for="inputState" class="form-label">Book status</label>
                                <select id="inputStatus" name="bstatus" class="form-control">
                                    <option selected>--select--</option>
                                    <option value="Active">Active</option>
                                    <option value="Inactive">Inactive</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlFile1">Upload photo</label>
                                <input name="bimg" type="file" class="mt-1 form-control-file" id="exampleFormControlFile1" />
                            </div>
<%--                            <div class="mb-3 form-check">--%>
<%--                                <input type="checkbox" class="form-check-input" id="exampleCheck1" name="check">--%>
<%--                                <label class="form-check-label" for="exampleCheck1">Agree terms&conditions</label>--%>
<%--                            </div>--%>
                            <button type="submit" class="btn mt-3 btn-primary">Add</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>
