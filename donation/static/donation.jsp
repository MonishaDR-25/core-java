<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Donation Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Donation System</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center mb-4">Donation Form</h2>
    ${message}
    <form action="donation" method="post">
        <div class="mb-3">
            <label class="form-label">Donor Name</label>
            <input type="text" name="donorName" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Amount</label>
            <input type="number" name="amount" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Purpose</label>
            <input type="text" name="purpose" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Email</label>
            <input type="email" name="email" class="form-control" required/>
        </div>
        <button type="submit" class="btn btn-primary">Submit Donation</button>
    </form>
</div>
</body>
</html>
