<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="2">

 <c:forEach var="list" items="${listOfEmployees}">
  <tr>
  <td><c:out value="${list.id}"></c:out></td>
  <td><c:out value="${list.name}"></c:out></td>
  <td><c:out value="${list.city}"></c:out></td>
  <td><c:out value="${list.phone}"></c:out></td>
  <td><a href="editEmployee?id=${list.id}">Edit</a>
  <td><a href="deleteEmployee?id=${list.id}">Delete</a>
  </tr>
 </c:forEach>

 </table>
</body>
</html>