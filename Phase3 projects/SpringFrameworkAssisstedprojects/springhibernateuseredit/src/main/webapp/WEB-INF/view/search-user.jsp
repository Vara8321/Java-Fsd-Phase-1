<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

Edit Product<hr>

<div align="center">
Edit Product<hr>

	<form:form action="editUser" method="post" modelAttribute="user">
		<form:input path="userId" value="${user.userId}" hidden="true"/>

		<form:label path="userName">User name:</form:label>
		<form:input path="userName" value="${user.userName}" />
		<br />
		
		<form:label path="userAddress">User Address:</form:label>
		<form:input path="userAddress" value="${user.userAddress}" />
		<br />
		
		<form:button>Edit and Save Product</form:button>

	</form:form>

	<br>
	<br> <a href="/"> Back to HOME</a>