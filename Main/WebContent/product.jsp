<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.price {
  color: grey;
  font-size: 22px;
}

.card button {
  border: none;
  outline: 0;
  padding: 12px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

.card button:hover {
  opacity: 0.7;
}
</style>
</head>
<body>

<h2 style="text-align:center">Product Card</h2>
<form action="addToCart" method="post">

<div class="card">
  <img src="css/images/image1.jpg" alt="" style="width:100%">
  <h1>Adidas Shoes</h1>
  <p class="price">RS 3500/-</p>
  <p>Item Number: 125515
 Size List : 8/8.5/9.5/10/11
 Brand Name: Adidas </p>
  <p><button>Add to Cart</button></p>
</div>
</form>

</body>
</html>
    