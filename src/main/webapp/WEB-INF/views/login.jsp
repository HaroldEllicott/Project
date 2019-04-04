<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	
	<body>
		<sf:form action = "loginUser" method = "POST" modelAttribute="user">
			Username: <sf:input path="username" type = "text" required = "required" name = "username" />
			Password: <sf:input path="password" type = "password" required = "required" name = "password" />
			<input type = "submit" value = "login">
		</sf:form>

	</body>
</html>