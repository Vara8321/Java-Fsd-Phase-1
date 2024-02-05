<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%><hr>

<table border=1>
	<tr>
		<th>ID
		<th>NAME
		<th>Price
		<th>Date
		<th>DELETE
	</tr>
	
	<c:forEach var="product" items="${prodlist}">
		<tr>
			<td>${product.ID}
			<td>${product.name}
			<td>${product.price}
			<td>${product.date_added}
			<td><a href="deleteProduct?id=${product.ID}">DELETE</a>
		</td>
	
	</c:forEach>



</table>