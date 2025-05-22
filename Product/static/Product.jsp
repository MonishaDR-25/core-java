<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-dark bg-dark mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Product Management</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center mb-4">Product Form</h2>
    <h5 class="text-danger">${message}</h5>
    <form action="product" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" name="name" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Type</label>
            <select name="type" class="form-select" required>
                <option value="">Select Type</option>
                <option>Electronics</option>
                <option>Clothing</option>
                <option>Grocery</option>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Incoming Price</label>
            <input type="number" name="incomingPrice" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Selling Price</label>
            <input type="number" name="sellingPrice" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">MRP</label>
            <input type="number" name="mrp" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <input type="text" name="description" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" name="brand" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Quantity</label>
            <input type="number" name="quantity" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Color</label>
            <select name="color" class="form-select" required>
                <option value="">Select Color</option>
                <option>Red</option>
                <option>Blue</option>
                <option>Green</option>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Weight</label>
            <input type="number" name="weight" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Manufacture Date</label>
            <input type="date" name="manufDate" class="form-control" required/>
        </div>
        <div class="mb-3">
            <label class="form-label">Warranty</label>
            <select name="warranty" class="form-select" required>
                <option value="">Select Warranty</option>
                <option>6 Months</option>
                <option>1 Year</option>
                <option>2 Years</option>
            </select>
        </div>
        <div class="mb-3 form-check">
            <input type="checkbox" name="returnPolicy" class="form-check-input"/>
            <label class="form-check-label">Return Policy Available</label>
        </div>
        <button type="submit" class="btn btn-primary">Submit Product</button>
    </form>
</div>
</body>
</html>
