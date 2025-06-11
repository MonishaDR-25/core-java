<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Stampede Case</a>
        <a class="btn btn-outline-light" href="StampedeCase.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">${message}</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr><th>Field</th><th>Value</th></tr>
        </thead>
        <tbody>
        <tr><td>Event</td><td>${dto.event}</td></tr>
         <tr><td>Location</td><td>${dto.location}</td></tr>
        <tr><td>No Of Deaths</td><td>${dto.deaths}</td></tr>
         <tr><td>No Of Injuries</td><td>${dto.injuries}</td></tr>


        </tbody>
    </table>
</div>
</body>
</html>
