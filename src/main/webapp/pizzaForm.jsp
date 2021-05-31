<%--
  Created by IntelliJ IDEA.
  User: vanessa
  Date: 5/30/21
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<%--select the crust type, sauce type, size type (use select inputs),
toppings (checkboxes),
delivery address (text input).--%>
<body>
<h1>Pizza Order Form</h1>
<form action="/pizza-order" method="POST">
    <h2>Please fill out your order below: </h2>

    <div class="form-group">
        <label for="crust">Select crust type:</label>
        <select name="crust" id="crust">
                <option value="thin">Thin Crust</option>
                <option value="hand-tossed">Hand-Tossed</option>
            <option value="stuffed">Stuffed Crust</option>
        </select><br>

        <br>
        <label for="sauce">Select sauce type:</label>
        <select name="sauce" id="sauce">
            <option value="marinara">Traditional Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="pesto">Pesto</option>
        </select><br>

        <br>
        <label for="size">Select size:</label>
        <select name="size" id="size">
            <option value="small">Personal (small - 8")</option>
            <option value="medium">Shareable (medium - 12")</option>
            <option value="large">Party (large - 16")</option>
        </select><br>

        <br>
        <input type="checkbox" id="toppings1" name="toppings1" value="pepperoni">
        <label for="toppings1"> Pepperoni</label><br>

        <input type="checkbox" id="toppings2" name="toppings2" value="sausage">
        <label for="toppings2">Sausage</label><br>

        <input type="checkbox" id="toppings3" name="toppings3" value="jalapeno">
        <label for="toppings3">Jalapeno</label><br>

        <input type="checkbox" id="toppings4" name="toppings4" value="mushrooms">
        <label for="toppings4"> Mushrooms</label><br>

        <input type="checkbox" id="toppings5" name="toppings5" value="bell-peppers">
        <label for="toppings5">Bell Peppers</label><br>

        <input type="checkbox" id="toppings6" name="toppings6" value="bacon">
        <label for="toppings6">Bacon</label><br>

        <br>
        <label for = "address">Please enter your address:</label><br>
        <input type="text" id="address" name="address"><br>
        <input type="submit" value="Submit">
    </div>

</form>
</body>
</html>
