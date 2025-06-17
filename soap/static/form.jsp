<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Soap Details Entry</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container py-5">
    <a href="index.jsp" class="btn btn-secondary mb-3">Home</a>

    <h2 class="text-center text-primary mb-4">Enter Your Soap Details</h2>

    <p class="text-success">${success}</p>
    <p class="text-danger">${failure}</p>

    <form action="soap" method="post" class="row g-3">

        <div class="col-md-6">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" required value="${dto.name}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Brand</label>
            <input type="text" name="brand" class="form-control" required value="${dto.brand}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Price</label>
            <input type="number" step="0.01" name="price" class="form-control" required value="${dto.price}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Manufacture Date</label>
            <input type="date" name="manufactureDate" class="form-control" required value="${dto.manufactureDate}">
        </div>

        <div class="col-md-6">
            <label class="form-label">Color</label>
            <input type="text" name="color" class="form-control" required value="${dto.color}">
        </div>

        <div class="col-md-6">
            <div class="form-check mt-4">
                <input type="checkbox" name="fragrant" class="form-check-input" id="fragrant"
                       <c:if test="${dto.fragrant}">checked</c:if>>
                <label class="form-check-label" for="fragrant">Fragrant</label>
            </div>
        </div>

        <div class="col-12 text-center mt-4">
            <input type="submit" value="Submit" class="btn btn-success btn-lg px-5">
        </div>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(function () {
        $("form").submit(function (e) {
            let valid = true;

            const name = $("input[name='name']").val().trim();
            const brand = $("input[name='brand']").val().trim();
            const price = $("input[name='price']").val();
            const date = $("input[name='manufactureDate']").val();
            const color = $("input[name='color']").val().trim();

            if (name.length < 3) {
                alert("Name must be at least 3 characters.");
                valid = false;
            }

            if (brand.length < 3) {
                alert("Brand must be at least 3 characters.");
                valid = false;
            }

            if (price === "" || parseFloat(price) <= 0) {
                alert("Enter a valid price greater than 0.");
                valid = false;
            }

            if (!date) {
                alert("Please enter a manufacture date.");
                valid = false;
            }

            if (color.length < 3) {
                alert("Color must be at least 3 characters.");
                valid = false;
            }

            if (!valid) {
                e.preventDefault();
            }
        });
    });
</script>
</body>
</html>
