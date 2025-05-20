<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Donation Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Donation System</a>
        <a class="btn btn-outline-light" href="donation.jsp">Home</a>
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
            <td>Donor Name</td>
            <td>${dto.donorName}</td>
        </tr>
        <tr>
            <td>Amount</td>
            <td>${dto.amount}</td>
        </tr>
        <tr>
            <td>Purpose</td>
            <td>${dto.purpose}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${dto.email}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
