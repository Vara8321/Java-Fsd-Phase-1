<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
<br>
<br>
<h2>Add New Citizen</h2>

	<form:form action="addCitizen" method="post" modelAttribute="citizen">

		<form:label path="citizenname">Citizen Name:</form:label>
		<form:input path="citizenname" />
		<br>
		<br>
		<form:label path="citizencity">Citizen City:</form:label>
		<form:input path="citizencity" />
		<br>
		<br>
		<form:label path="no_of_doses">No. Of Doses:</form:label>
		<form:input path="no_of_doses" />
		<br>
		<br>
		<form:label path="vaccination_status">Vaccination Status:</form:label>
		<form:input path="vaccination_status" />
		<br>
		<br>
		<form:label path="vaccination_center_name">Vaccination Center Name:</form:label>
		<form:input path="vaccination_center_name" />
		<br>
		<br>
		<form:button>Submit</form:button>

	</form:form>

	<br>
	<a href="/welcome"> Back to HOME</a>
</div>