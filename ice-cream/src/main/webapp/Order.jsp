<html>
<body>
<h2>Ice Cream Order</h2>
<form action="saveIceCream" method="post" enctype="multipart/form-data">
    Name<input type="text" name="name" placeholder="Enter the name"><br><br>
    Email<input type="email" name="email" placeholder="Enter the email"><br><br>
    Flavour<input type="text" name="flavour" placeholder="Enter the flavour"><br><br>
    Quantity<input type="number" name="quantity" placeholder="Enter the Quantity"><br><br>
    TakeAway<input type="text" name="takeAway" placeholder="To Take Away"><br><br>
    AddOns<input type="text" name="addOns" placeholder="Need Add Ons"><br><br>
    Coupon<input type="text" name="coupon" placeholder="Enter the coupon code"><br><br>
    <input type="file" name="multipartFile">
    <button type="save">save</button>
</form>
</body>
</html>