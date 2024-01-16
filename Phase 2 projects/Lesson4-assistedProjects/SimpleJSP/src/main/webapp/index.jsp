<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
     out.println("<h2>My first JSP page.</h2>");
%>
	
<%String arr[]={"shasi","somu","robert"};
for(int i=0;i<arr.length;i++){
	out.print("<li>"+arr[i]);
}
%>
	
</body>
</html>