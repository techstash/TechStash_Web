<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>TechStash Forgot Password</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="shortcut icon" href="/images/favicon.ico" type="image/x-icon">
	<link rel="icon" href="/images/favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="/admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/util.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/login.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-28 p-b-30">
				<form:form class="login100-form validate-form" action="forgotpasswordaction" modelAttribute="forgotpassword" method="POST" >
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

					<div class="container-login100-form-btn p-t-10">
						<button class="btn btn-outline-primary">
							Submit
						</button>
					</div>

					<div class="text-center w-full p-t-25">
						<a href="login" class="txt1 text-white">
						Back to login Screen
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