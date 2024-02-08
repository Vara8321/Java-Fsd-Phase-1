<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<br>
<br>
<div align="center">
<h2>Edit Citizen</h2>

	<form:form action="editCitizen" method="post" modelAttribute="citizen">
		<form:input path="citizenid" value="${citizen.citizenid}" hidden="true"/>

		<form:label path="citizenname">Citizen Name:</form:label>
		<form:input path="citizenname" value="${citizen.citizenname}" />
		<br>
		<br>
		<form:label path="citizencity">Citizen City:</form:label>
		<form:input path="citizencity" value="${citizen.citizencity}" />
		<br>
		<br>
		<form:label path="no_of_doses">No. Of Doses:</form:label>
		<form:input path="no_of_doses" value="${citizen.no_of_doses}" />
		<br>
		<br>
		<form:label path="vaccination_status">Vaccination Status:</form:label>
		<form:input path="vaccination_status" value="${citizen.vaccination_status}" />
		<br>
		<br>
		<form:label path="vaccination_center_name">Vaccination Center:</form:label>
		<form:input path="vaccination_center_name" value="${citizen.vaccination_center_name}" />
		<br>
		<br>

		<form:button>Submit</form:button>

	</form:form>

	<br>
	<a href="/welcome"> Back to HOME</a>
</div>