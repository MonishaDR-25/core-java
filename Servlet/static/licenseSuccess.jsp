<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>License Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">License System</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">${message}</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Name</td>
            <td>${dto.name}</td>
        </tr>
        <tr>
            <td>Contact Number</td>
            <td>${dto.contactNumber}</td>
        </tr>
        <tr>
            <td>Father Name</td>
            <td>${dto.fatherName}</td>
        </tr>
        <tr>
            <td>Adhar Number</td>
            <td>${dto.adharNumber}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${dto.address}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
