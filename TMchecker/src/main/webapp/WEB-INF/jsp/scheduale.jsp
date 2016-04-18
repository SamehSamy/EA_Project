<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/jquery.datetimepicker.css" />"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery.datetimepicker.full.js" />"></script>
</head>
<body>
<body>
	<form:form modelAttribute="appointment" action="employee" method="post">
		<fieldset>
			<legend>Scheduale an appointment </legend>
			<br> <label>Choose a time slot : </label> <input type="text"
				id="datetimepicker5" /><br>
			<br> <label>Choose a TM checker : </label>
			<menu id="checker"></menu>
			<br> <input id="reset" type="reset"> <input id="submit"
				type="submit" value="Scheduale">
		</fieldset>
	</form:form>
</body>
</body>
<script>
	/*
	window.onerror = function(errorMsg) {
	$('#console').html($('#console').html()+'<br>'+errorMsg)
	}*/

	$.ajax("<c:url value="/rest/student/timeSlot"/>", {
		"type" : "get"
	}).done(displayPictures);

	function displayPictures(data) {
		$("#checker").html(data);
	}

	$.datetimepicker.setLocale('en');
	$('#datetimepicker5').datetimepicker(
			{
				minTime : '08:00',
				minDate : '-1970/01/01', // yesterday is minimum date
				maxDate : '+1970/01/31', // and tommorow is maximum date calendar
				datepicker : true,
				allowTimes : [ '08:00', '08:30', '09:00', '09:30', '10:00',
						'10:30', '11:00', '11:30', '12:30', '1:30', '02:00',
						'02:30', '03:00' ],
				step : 5
			});
</script>
</html>