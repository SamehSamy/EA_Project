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
		<h3>List Of Checking Appointment  </h3> 
		  <c:if test="${!empty appointment}">   
		<table align="center" border="0.5">  
		
<thead>
			<tr>
				<th>appointId</th>		
				<th>status</th>	
				<th>studentId</th>									
				 <th>firstName</th> 
				<th>lastName</th>
				 <th>Action</th>
				
					 
			</tr>
</thead>
       
			<c:forEach var="appoint" items="${appointment}"  >
			<tr>
			    <%-- <td><c:out value="${status.index + 1}"/></td> --%>
			    <td><c:out value="${appoint.appointId}"/></td>
				<td><c:out value="${appoint.status}"/></td>							
			    <td><c:out value="${appoint.studentId}"/></td>
				<td><c:out value="${appoint.firstName}"/></td>
				<td><c:out value="${appoint.lastName}"/></td>
				<%-- <td><c:out value="${appoint.date}"/></td>
				<td><c:out value="${appoint.startDate}"/></td>
				<td><c:out value="${appoint.endDate}"/></td> --%>
				<td>
                        <a href="/Tmchecker/checker/approve">Approve</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/Tmchecker/checker/reject">Reject</a>                        
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/Tmchecker/checker/update/{appointId}">Reschedule</a>
                        
                    </td>
				</tr>
			</c:forEach>
		</table>
     
		
	
	 </c:if>   
</body>
</html>