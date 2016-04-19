<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Appointments</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	<div id="global">
		<h2>heloooooooo</h2>


		<table>
			<tr><!-- 
				<th>Name</th>
				<th>Phone</th>
				<th>Address</th> -->
			</tr>

			<c:forEach var="appoint" items="${appointment}">
				<tr>
					<td>${appoint.appointId}</td>
					<td>${appoint.status}</td>
					<td>${appoint.date}</td>
					<td>${appoint.startDate}</td>
					<td>${appoint.endDate}</td>

				</tr>
				<br>
			</c:forEach>
		</table>

		<form action="approve" method="POST">
			<input id="submit" type="submit" value="approve">
		</form>
		<br>


	</div>
</body>
</html>