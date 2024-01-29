<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %><hr>

<table border=1>
<tr> <th>ID <th>NAME <th>ADDRESS <th>DELETE </tr>

<c:forEach var="user" items="${userlist}">   
 <tr>  <td> ${user.userId} <td>${user.userName} <td>${user.userAddress}
</c:forEach>

</table>