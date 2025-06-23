<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Naming Ceremony Viewer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<!-- Home Button -->
<div class="m-3">
    <a href="index.jsp" class="btn btn-secondary">🏠 Home Page</a>
</div>

<div class="container py-5">
    <div class="card shadow-lg">
        <div class="card-header bg-primary text-white text-center">
            <h3>Search Naming Ceremony Event by ID</h3>
        </div>
        <div class="card-body">
            <form action="eventViewer" method="get" class="row g-3">
                <div class="col-md-6">
                            <label class="form-label">Child Name</label>
                            <input type="text" name="childId" class="form-control" required placeholder="Enter Child Id">
                        </div>

                <div class="col-12 text-center mt-4">
                    <input type="submit" value="Search" class="btn btn-success btn-lg px-5">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>
