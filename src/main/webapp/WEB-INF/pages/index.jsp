<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h1>${message}</h1>
	<form:form modelAttribute="loginForm" method="post" action="authorize">
		<table>
			<tr>
				<td>Login</td>
				<td><form:input path="login" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enter"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>