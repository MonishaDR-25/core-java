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
                <form action="soap" method="post">
                    <div class="mb-3">
                        <label for="name" class="form-label">Soap Name</label>
                        <input type="text" class="form-control" name="name" id="name" required>
                    </div>

                    <div class="mb-3">
                        <label for="brand" class="form-label">Brand</label>
                        <input type="text" class="form-control" name="brand" id="brand" required>
                    </div>

                    <div class="mb-3">
                        <label for="price" class="form-label">Price (₹)</label>
                        <input type="number" step="0.01" class="form-control" name="price" id="price" required>
                    </div>

                    <div class="mb-3">
                        <label for="manufactureDate" class="form-label">Manufacturing Date</label>
                        <input type="date" class="form-control" name="manufactureDate" id="manufactureDate" required>
                    </div>

                    <div class="mb-3">
                        <label for="fragrant" class="form-label">Is Fragrant?</label>
                        <select class="form-select" name="fragrant" id="fragrant">
                            <option value="true">Yes</option>
                            <option value="false">No</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label for="color" class="form-label">Color</label>
                        <input type="text" class="form-control" name="color" id="color" required>
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
