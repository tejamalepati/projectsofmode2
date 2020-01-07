<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="save" modelAttribute="employee">
 <h1>Add New Employee</h1>
 <table>
 <tr>
  <%-- <form:hidden path="id"></form:hidden> --%>
  <td>Id :</td>
  <td><form:input path="id" id="id" /></td>
 </tr>

 <tr>

  <td>Name :</td>
  <td><form:input path="name" id="name" /></td>
 </tr>

 <tr>
  <td>City :</td>
  <td><form:input path="city" id="city" /></td>
 </tr>
 <tr>
  <td>Phone :</td>
  <td><form:input path="phone" id="phone" value="" /></td>

 </tr>
 <tr>
  <td><br /></td>
  <td><input type="submit" value="Update" /></td>
 </tr>
 </table>

</form:form>