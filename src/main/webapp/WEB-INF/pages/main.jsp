<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Advertisements List</h3>

    <form class="form-inline" role="form" action="/search" method="post">
        <input type="text" class="form-control" name="pattern" placeholder="Search">
        <input type="submit" class="btn btn-default" value="Search">
    </form>

    <table class="table table-striped">
        <thead>
        <tr>
            <td><b>Video</b></td>
            <td><b>Name</b></td>
            <td><b>User</b></td>
            <td><b>Category</b></td>
            <td><b>Price</b></td>
            <td><b>Action</b></td>
        </tr>
        </thead>
        <c:forEach items="${advs}" var="adv">
            <tr>
                <td><iframe width="600" height="400" src=${recipe.video} frameborder="0" allowfullscreen></iframe></td>
                <td>${recipe.name}</td>
                <td>${recipe.idUser}</td>
                <td>${recipe.idCategory}</td>
                <td><a href="/delete?id=${adv.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>

    <form class="form-inline" role="form" action="/add_page" method="post">
        <input type="submit" class="btn btn-default" value="Add new">
    </form>
</div>
</body>
</html>
