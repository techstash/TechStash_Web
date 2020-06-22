<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>TechStash Admin</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<c:forEach var="tempMetaDetails" items="${homeSetting}">
	<link rel="shortcut icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	<link rel="icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	</c:forEach>
	<link rel="stylesheet" type="text/css" href="/admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/util.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/login.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-136 p-b-30">
				<form:form class="login100-form validate-form" action="index" modelAttribute="login" method="POST" >
					<div class="login100-form-avatar">
						<img src="/images/logo/logo.png" alt="TechStash">
					</div>

					<div class="wrap-input100 validate-input m-b-10" data-validate = "Email is required">
						<form:input class="input100" path="email" type="email" placeholder="Email Address"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-user"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
						<form:input class="input100" path="password" type="password" placeholder="Password"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock"></i>
						</span>
					</div>

					<div class="container-login100-form-btn p-t-10">
						<button class="btn btn-outline-primary">
							Login
						</button>
					</div>

					<div class="text-center w-full p-t-25">
						<a href="forgotpassword" class="txt1 text-white">
							Forgot Password?
						</a>
					</div>
					
					<div class="text-center w-full p-t-25 p-b-128">
						<a href="signup" class="txt1 text-white">
							Sign Up
						</a>
					</div>

				</form:form>
			</div>
		</div>
	</div>
	
	<script src="/admin/plugins/jquery/jquery.min.js"></script>
	<script src="/admin/js/validation.js"></script>

</body>
</html>