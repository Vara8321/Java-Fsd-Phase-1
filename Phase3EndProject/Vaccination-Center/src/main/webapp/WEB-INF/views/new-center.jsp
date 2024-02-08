<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
<br>
<br>
<h2>Add New Vaccine Center</h2>

	<form:form action="addCenter" method="post" modelAttribute="center">

		<form:label path="centername">Center Name:</form:label>
		<form:input path="centername" />
		<br>
		<br>
		<form:label path="city">Center City:</form:label>
		<form:input path="city" />
		<br>
		<br>
		<form:button>Submit</form:button>

	</form:form>

	<br>
	<a href="/welcome"> Back to HOME</a>
</div>