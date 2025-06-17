<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Soap Entry Form</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #f8f9fa;">

    <div class="container mt-5">
        <div class="card shadow-lg">
            <div class="card-header bg-primary text-white">
                <h3 class="text-center mb-0">Soap Entry Form</h3>
            </div>
            <div class="card-body">
                <form action="search" method="get">
                    <div class="mb-3">
                        <label for="name" class="form-label">Soap Name</label>
                        <input type="text" name="soapId" class="form-control" required placeholder="Enter Soap Id">
                    </div>



                    <div class="d-grid">
                        <button type="submit" class="btn btn-success">Submit Soap Details</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
