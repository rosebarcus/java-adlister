<%--
  Created by IntelliJ IDEA.
  User: rosebarcus
  Date: 7/1/21
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Servlets and JSPs</title>
    <%@include file="partials/head.jsp"%>
</head>
<body>
    <form action="pizza-order" method="POST">
        <%--@declare id="address"--%>
        <h4>Choose a Crust</h4>
        <select name="pizza-crust" id="pizza-crust">
            <option value="cheese-crust">Cheese-Stuffed Crust</option>
            <option value="thin-crust">Thin Crust</option>
            <option value="deep-dish">Deep Dish</option>
            <option value="hand-tossed">Hand Tossed Crust</option>
        </select>
            <br>
            <h4>Choose a Sauce</h4>
        <select name="sauce" id="sauce">
            <option value="none">None</option>
            <option value="white-sauce">Garlic White Sauce</option>
            <option value="marinara">Marinara</option>
        </select>
            <br>
            <h4>Choose a Size</h4>
        <select name="size" id="size">
            <option value="small">12in Personal Pizza</option>
            <option value="med">16 inches</option>
            <option value="large">18 inches</option>
            <option value="extra-large">21 inches</option>
        </select>
        <br>
            <h4>Choose your toppings</h4>
        <input type="checkbox" id="olives" name="toppings" value="olives">
        <label for="olives">Black Olives</label><br>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
        <label for="pepperoni">Pepperoni</label><br>
        <input type="checkbox" id="sausage" name="toppings" value="sausage">
        <label for="sausage">Sausage</label><br>
        <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
        <label for="pineapple">Pineapple</label>
        <br>
            <h4>Delivery Address</h4>
        <label for="fname">Name:</label><br>
        <input type="text" id="fname" name="fname"><br>
        <label for="address">Address:</label><br>
        <input type="text" id=address" name="address"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
