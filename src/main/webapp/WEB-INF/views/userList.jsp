<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<html>
<head>
   <title>User List</title>
</head>
<body>
	<h1>User List</h1>
	<p><a href="/showForm">Add new User</a></p>
	<c:if test="${not empty userList.users}">
		<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
		</tr>	
		<!--   userList is the object in controller (Mock DB)-->
		<!--users  is the getter from UserList class -->
		<c:forEach var="user" items="${userList.users}">
		
		<tr>
		<td><c:out value="${user.name}"/></td>
		<td><c:out value="${user.email}"/></td>
		</tr>
		</c:forEach>
		</table>	
	</c:if>
	<c:if test="${empty userList.users}">
	<p>No user available at the moment.</p>
	</c:if>
</body>