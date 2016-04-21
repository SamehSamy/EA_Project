<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h1 style="text-align: center"></h1>
	<div style="text-align: center">
		<a href="/Tmchecker/checker/">Student Home</a>
	</div>	
	<br>
	<div style="margin-left: 600px;">
		<c:choose>
			<c:when test="${not empty Student}">
				<h2>Checker Register</h2>
				<form:form modelAttribute="Student"
					action="${pageContext.request.contextPath}/register/" method="post">
				<form:errors path="*" cssStyle="color : red;" element="div" />
				<table border="1">
					<tr>
						<td>FirstName:</td>
						<td><form:input path="firstName" /></td>
						<td><form:errors path="firstName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>LastName:</td>
						<td><form:input path="lastName" /></td>
						<td><form:errors path="lastName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>Username:</td>
						<td><form:input path="userName" /></td>
						<td><form:errors path="userName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><form:input path="password" /></td>
						<td><form:errors path="password" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>StudentId:</td>
						<td><form:input path="studentId" /></td>
						<td><form:errors path="studentId" cssStyle="color:red" /></td>
					</tr>
				</table>
				<br> <input type="submit" value="Regieter" /> &nbsp;&nbsp;
		
				</form:form>			
			</c:when>
	
			<c:otherwise>
				<h2>Checker Register</h2>
				<form:form modelAttribute="Checker"
					action="${pageContext.request.contextPath}/register/" method="post">
				<form:errors path="*" cssStyle="color : red;" element="div" />
				
				<table border="1">
					<tr>
						<td>FirstName:</td>
						<td><form:input path="firstName" /></td>
						<td><form:errors path="firstName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>LastName:</td>
						<td><form:input path="lastName" /></td>
						<td><form:errors path="lastName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>Username:</td>
						<td><form:input path="userName" /></td>
						<td><form:errors path="userName" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><form:input path="password" /></td>
						<td><form:errors path="password" cssStyle="color:red" /></td>
					</tr>
					<tr>
						<td>CheckId:</td>
						<td><form:input path="checkerId" /></td>
						<td><form:errors path="checkerId" cssStyle="color:red" /></td>
					</tr>
				</table>
				<br> <input type="submit" value="Regieter" /> &nbsp;&nbsp;
		
				</form:form>			
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>