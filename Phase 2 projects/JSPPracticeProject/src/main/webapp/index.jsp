<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Product Details</h1>
 <form action="productDisplay.jsp" method="post">
 
 <label for="productId">Product ID:</label>
 <input type="text" id="productId" name="productId"
required><br><br>

 <label for="productName">Product Name:</label>
 <input type="text" id="productName" name="productName"
required><br><br>

 <label for="productDescription">Product Description:</label>
 <textarea type="text" id="productDescription"
name="productDescription" rows="2" cols="20"
required></textarea><br><br>

 <label for="productPrice">Product Price:</label>
 <input type="text" id="productPrice" name="productPrice"
required><br><br>

 <input type="submit" value="Submit">
 </form>

</body>
</html>