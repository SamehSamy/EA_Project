<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link
	href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css" />
<link
	href="<c:url value="	https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/my.css" />"
	rel="stylesheet" type="text/css" />
<title>Login</title>
</head>
<style>

</style>
<body>
	<div class="login">
		<c:if test="${error eq true}">
			<p>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</p>
		</c:if>
		<form method="post" action="<c:url value='j_spring_security_check' />"
			class="form-signin">
			<h2 class="form-signin-heading">Please sign in</h2>

			<input class="form-control" placeholder="User Name" name="j_username"
				value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>' />
			<br /> <label for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="Password" required="" name='j_password'>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me"
					name="_spring_security_remember_me"> Remember me
				</label>
			</div>
			<input type="hidden" name="<c:out value="${_csrf.parameterName}"/>"
				value="<c:out value="${_csrf.token}"/>" />
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>
	</div>


</body>
</html>
