<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="header.jsp"%>

<br>
<br>
<br>

<a href="addCitizen">Add New Citizen</a>

<br>
<br>

<table border=1>
<thead>
	<tr>
		<th>ID
		<th>NAME
		<th>CITY
		<th>No.Of DOSES
		<th>VACCINATION STATUS
		<th>VACCINATION CENTER
		<th>ACTION
	</tr>
	</thead>
	<tbody>
	<c:forEach var="citizen" items="${citizenlist}">
		<tr>
			<td>${citizen.citizenid}
			<td>${citizen.citizenname}
			<td>${citizen.citizencity}
			<td>${citizen.no_of_doses}
			<td>${citizen.vaccination_status}
			<td>${citizen.vaccination_center_name}
			<td><a href="deleteCitizen?id=${citizen.citizenid}">VIEW</a> <a href="editCitizen?id=${citizen.citizenid}">EDIT</a> <a href="deleteCitizen?id=${citizen.citizenid}">DELETE</a>
		</tr>
		</c:forEach>
		</tbody>
        <tfoot>
            <tr>
                <td colspan="6">Total ${citizenlist.size()} Citizens Found</td>
            </tr>
        </tfoot>
</table>

