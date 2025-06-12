<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Weather Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="text-center text-primary mb-4">Weather Information Form</h2>
    <form action="weather" method="post">

        <div class="mb-3">
            <label class="form-label">Place Name</label>
            <input type="text" name="place" class="form-control" required/>
        </div>

        <div class="mb-3">
            <label class="form-label">Weather</label>
            <input type="text" name="weather" class="form-control" required/>
        </div>

        <div class="mb-3">
            <label class="form-label">Min Temp</label>
            <input type="number" step="0.1" name="minTemp" class="form-control" required/>
        </div>

        <div class="mb-3">
            <label class="form-label">Max Temp</label>
            <input type="number" step="0.1" name="maxTemp" class="form-control" required/>
        </div>

        <div class="mb-3">
            <label class="form-label">Cloudy</label>
            <input type="text" name="cloudy" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Raining</label>
            <input type="text" name="raining" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Rain In MM</label>
            <input type="number" step="0.1" name="rainInMM" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Humidity (%)</label>
            <input type="number" step="0.1" name="humidity" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Wind Speed (km/h)</label>
            <input type="number" step="0.1" name="windSpeed" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Sun Rise Time</label>
            <input type="time" name="sunRise" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Sun Set Time</label>
            <input type="time" name="sunSet" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Moon Rise Time</label>
            <input type="time" name="moonRise" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Moon Set Time</label>
            <input type="time" name="moonSet" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Rain Start Time</label>
            <input type="time" name="rainStart" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Rain End Time</label>
            <input type="time" name="rainEnd" class="form-control"/>
        </div>

        <div class="mb-3">
            <label class="form-label">Precipitation</label>
            <input type="text" name="precipitation" class="form-control"/>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Submit Weather Info</button>
        </div>

    </form>
</div>
</body>
</html>
