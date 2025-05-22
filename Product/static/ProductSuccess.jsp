<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Product Management</a>
        <a class="btn btn-outline-light" href="Product.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">${message}</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr><th>Field</th><th>Value</th></tr>
        </thead>
        <tbody>
        <tr><td>Name</td><td>${dto.name}</td></tr>
        <tr><td>Type</td><td>${dto.type}</td></tr>
        <tr><td>Incoming Price</td><td>${dto.incomingPrice}</td></tr>
        <tr><td>Selling Price</td><td>${dto.sellingPrice}</td></tr>
        <tr><td>MRP</td><td>${dto.mrp}</td></tr>
        <tr><td>Description</td><td>${dto.description}</td></tr>
        <tr><td>Brand</td><td>${dto.brand}</td></tr>
        <tr><td>Quantity</td><td>${dto.quantity}</td></tr>
        <tr><td>Color</td><td>${dto.color}</td></tr>
        <tr><td>Weight</td><td>${dto.weight}</td></tr>
        <tr><td>Manuf Date</td><td>${dto.manufDate}</td></tr>
        <tr><td>Warranty</td><td>${dto.warranty}</td></tr>
        <tr><td>Return Policy</td><td>${dto.returnPolicy}</td></tr>
        </tbody>
    </table>
</div>
</body>
</html>
