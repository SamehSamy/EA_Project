<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Appointments</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	
		<h2>List of Appointments</h2>
	<!-- 	<h3><a href="add.html">Add More Employee</a></h3> -->
		  <c:if test="${!empty appointment}">  
		 
		 <table align="left" border="1"> 
		 
			<tr>
				<th>appointId</th>		
				<th>status</th>				
				<th>date</th> 
				<th>startDate</th>
				<th>endDate</th>		
			</tr>

			<c:forEach var="appoint" items="${appointment}">
			
			<td><c:out value="${appoint.appointId}"/></td>
				<td><c:out value="${appoint.status}"/></td>
				<td><c:out value="${appoint.date}"/></td>
				<td><c:out value="${appoint.startDate}"/></td>
				<td><c:out value="${appoint.endDate}"/></td>
				
				<br>
			</c:forEach>
		</table>

		<form action="approve" method="get">
			<input id="submit" type="submit" value="approve">
		</form>
		<br>


	
	 </c:if>  
</body>
</html>