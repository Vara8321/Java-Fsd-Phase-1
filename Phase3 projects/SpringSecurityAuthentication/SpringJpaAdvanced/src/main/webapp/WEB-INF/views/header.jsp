<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<a href="/" > Home </a>&nbsp;&nbsp;| &nbsp;&nbsp;

<a href="listproducts" >List of Products</a>
&nbsp;&nbsp;| &nbsp;&nbsp;

<a href="/addProduct">Add a Product</a>
&nbsp;&nbsp;| &nbsp;&nbsp;

<% if (session != null) { %>

<a href="/logout">Logout </a>

&nbsp;&nbsp;| &nbsp;&nbsp;
<% } %>