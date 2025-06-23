<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Naming Ceremony Form</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

    <div class="container mt-5">
        <div class="card shadow-lg">
            <div class="card-header bg-primary text-white">
                <h3 class="text-center mb-0">Naming Ceremony Registration</h3>
            </div>

            <div class="card-body">
                <% if (message != null) { %>
                    <div class="alert alert-info text-center"><%= message %></div>
                <% } %>

                <form action="event" method="post">
                    <div class="mb-3">
                        <label for="childName" class="form-label">Child's Name</label>
                        <input type="text" class="form-control" name="childName" id="childName" required>
                    </div>

                    <div class="mb-3">
                        <label for="location" class="form-label">Location</label>
                        <input type="text" class="form-control" name="location" id="location" required>
                    </div>

                    <div class="mb-3">
                        <label for="numberOfGuests" class="form-label">Number of Guests</label>
                        <input type="number" class="form-control" name="numberOfGuests" id="numberOfGuests" required>
                    </div>

                    <div class="mb-3">
                        <label for="decorated" class="form-label">Is Decorated?</label>
                        <select class="form-select" name="decorated" id="decorated">
                            <option value="true">Yes</option>
                            <option value="false">No</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label for="ceremonyDate" class="form-label">Ceremony Date</label>
                        <input type="date" class="form-control" name="ceremonyDate" id="ceremonyDate" required>
                    </div>

                    <div class="d-grid">
                        <button type="submit" class="btn btn-success">Submit Event Details</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
