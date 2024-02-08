<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="header.jsp"%>

<br>
<br>
<br>

<a href="addCenter">Add New Center</a>

<br>
<br>

<table border=1>
<thead>
	<tr>
		<th>ID
		<th>NAME
		<th>CITY
		<th>ACTION
	</tr>
	</thead>
	<tbody>
	
	<c:forEach var="center" items="${centerlist}">
		<tr>
			<td>${center.centerid}
			<td>${center.centername}
			<td>${center.city}
			<td><a href="deleteCenter?id=${center.centerid}">VIEW</a> <a href="editCenter?id=${center.centerid}">EDIT</a> <a href="deleteCenter?id=${center.centerid}">DELETE</a>
		</tr>
	
	</c:forEach>
</tbody>
		<tfoot>
            <tr>
                <td colspan="6">Total ${centerlist.size()} Vaccination Centers found</td>
            </tr>
        </tfoot>


</table>