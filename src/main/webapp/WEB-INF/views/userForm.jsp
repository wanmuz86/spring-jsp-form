<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
   <title>User Form</title>
   <style>
	.error {
		color:red;
	}
	</style>
</head>

<body>
   <h2>Enter User Information</h2>
   <form:form modelAttribute="user" action="/submitForm" method="post">
	
         <label for="name">Name:</label>
         <form:input path="name" id="name" />
         <form:errors path="name" cssClass="error" />
         <br/>
		 
         <label for="email">Email:</label>
         <form:input path="email" id="email" />
         <form:errors path="email" cssClass="error" />
         <br/>
		 
         <input type="submit" value="Submit" />
		 
     </form:form>
</body>
</html>
