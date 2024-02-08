<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>

	<a href="/listofcitizens">Citizens</a>
	&nbsp;&nbsp;| &nbsp;&nbsp;
	
    <a href="/vaccinationCenters">Vaccination Centers</a>
    &nbsp;&nbsp;| &nbsp;&nbsp;
    
    <a href="/logout">Logout</a>
	&nbsp;&nbsp;| &nbsp;&nbsp;
	
	<a href="/welcome" > Welcome, ${sessionScope.username}! </a>&nbsp;&nbsp;| &nbsp;&nbsp;
</body>
</html>
