<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Product Display</h1>
		 <%-- Get the form data --%>
		 <%
		 int productId = Integer.parseInt(request.getParameter("productId"));
		 String productName = request.getParameter("productName");
		 String productDescription = request.getParameter("productDescription");
		 double productPrice = Double.parseDouble(request.getParameter("productPrice"));
		 %>
		 <p>Product ID: <%= productId %></p>
		 <p>Product Name: <%= productName %></p>
		 <p>Product Description: <%= productDescription %></p>
		 <p>Product Price: <%= productPrice %></p>
</body>
</html>