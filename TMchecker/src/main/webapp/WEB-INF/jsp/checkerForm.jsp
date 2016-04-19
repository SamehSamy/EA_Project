<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Registration Checker</title>
</head>
<body>


<p>heloooooooooooooo</p>
<%-- 	<form:form modelAttribute="checkerAdd"  action="addChecker" method="post">  --%>
	
		 <form:form action="addChecker" method="post"> 
		
		<h2>Checker Registration</h2>
		<form:errors path="*" cssStyle="color : red;" element="div" />
		<table cellpadding="0" cellspacing="0" border="0" width="50%">
			<tr>
				<td><label for="firstName">First Name: </label></td>
				<td><form:input id="firstName" path="user.firstName" /> <form:errors
						path="user.firstName" cssStyle="color : red;" /></td>
			
				<td><label for="lastName">Last Name: </label></td>
				<td><form:input id="lastName" path="user.lastName" /> <form:errors
						path="user.lastName" cssStyle="color : red;" /></td>
			</tr>

			<tr>
				<td><label for="username">UserName: </label></td>
				<td><form:input id="username" path="user.username" /> <form:errors
						path="user.username" cssStyle="color : red;" /></td>
			</tr>


			<tr>
				<td><label for="password">Password: </label></td>
				<td><form:input id="password" path="user.password" /> <form:errors
						path="user.password" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			
			<tr id="buttons">
				<td><input id="submit" type="submit" value="Register">
				</td>
			</tr>
		</table>
		 
	 </form:form> 
</body>
</html>