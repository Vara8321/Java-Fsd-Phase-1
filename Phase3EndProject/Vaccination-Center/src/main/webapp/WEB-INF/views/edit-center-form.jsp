<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<br>
<br>
<div align="center">
<h2>Edit Vaccine Center</h2>

	<form:form action="editCenter" method="post" modelAttribute="center">
		<form:input path="centerid" value="${center.centerid}" hidden="true"/>

		<form:label path="centername">Center name:</form:label>
		<form:input path="centername" value="${center.centername}" />
		<br>
		<br>
		<form:label path="city">Center City:</form:label>
		<form:input path="city" value="${center.city}" />
		<br>
		<br>

		<form:button>Submit</form:button>

	</form:form>

	<br>
	<a href="/welcome"> Back to HOME</a>
</div>