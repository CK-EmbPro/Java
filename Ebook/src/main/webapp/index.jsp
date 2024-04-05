<%@ page import="java.sql.Connection" %>
<%@ page import="com.DB.DBconnect" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ebook: Home</title>
    <%@include file="./all_components/allCSS.jsp" %>
    <style type="text/css">
        .back-img {
            background: url("./images/ebooks2.jpeg");
            height: 50vh;
            width: 100%;
            background-size: cover;
            background-repeat: no-repeat;

        }

        .no-select {
            user-select: none;
        }

        .btnLink {
            width: 7em;
            min-width: 1em;
            height: 2em;
            border: 2px solid green;
            padding: 0;
            margin: 0;
            text-decoration: none;
            color: white;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .btnLink1 {
            background-color: darkred;
            max-width: 6em;
        }

        .btnLink2 {
            background-color: green;
        }

        .btnLink3 {
            background-color: darkred;
            max-width: 4em;
        }

        .cardHovered:hover {
            background-color: #fffafa;
        }

    </style>
</head>
<body style="background-color: #f7f7f7">
<%@include file="./all_components/navbar.jsp" %>

<div class="container-fluid back-img">
    <h2 class="text-center text-light no-select">EBook Management System</h2>
</div>

<% Connection conn= DBconnect.getConn(); out.print(conn); %>
<%--Recent book section--%>
<div class="container-fluid">
    <h3 class="text-center">Recent book</h3>
    <div class="row">

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2"><i class="fa-solid fa-cart-shopping"></i> Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>


        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="text-center mt-2">
        <a href="#" class="btn btn-danger btn-sm text-white">View All</a>
    </div>
</div>
<%--End Recent book section--%>

<%--new book section--%>
<div class="container-fluid">
    <h3 class="text-center">New book</h3>
    <div class="row">

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>


        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-danger btn-sm ms-2">Add cart</a>
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-1">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="text-center mt-2">
        <a href="#" class="btn btn-danger btn-sm text-white">View All</a>
    </div>
</div>
<%--End new book section--%>

<%--old book section--%>
<div class="container-fluid">
    <h3 class="text-center">Old book</h3>
    <div class="row">

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-5">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>


        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-5">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-5">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card cardHovered">
                <div class="card-body text-center">
                    <img alt="" src="./books/java.jpeg" style="height: 200px; width: 150px" class="img-thumbnail">
                    <p>Java programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories: New</p>

                    <div class="row">
                        <a href="#" class="btn col-md-4 btn-success btn-sm ms-5">View details</a>
                        <a href="#" class="btn col-md-3 btn-danger btn-sm ms-1">299</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="text-center mt-2">
        <a href="#" class="btn btn-danger btn-sm text-white">View All</a>
    </div>
</div>
<%--End old book section--%>

<%@include file="all_components/footer.jsp" %>
</div>
</body>
</html>