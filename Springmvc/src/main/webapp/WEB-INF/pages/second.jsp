<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome to second page : ${key1}
	<br>
	<table border="1" >
		<tr>
			
			<th>Student Number</th>
			
			<th>Student Name</th>
			
		</tr>
		<tr>
			<td>${key2.stdId}</td>
		
			<td>${key2.stdName}</td>
		</tr>
	</table>
</body>
</html>