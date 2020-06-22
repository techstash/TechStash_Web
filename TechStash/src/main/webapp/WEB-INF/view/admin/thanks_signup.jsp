<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>TechStash Thanks</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<c:forEach var="tempMetaDetails" items="${homeSetting}">
	<link rel="shortcut icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	<link rel="icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	</c:forEach>
	<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/util.css">
	<link rel="stylesheet" type="text/css" href="/admin/css/login.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
			
				<div class="login100-form validate-form">
					<div class="login100-form-avatar">
						<img src="/images/logo/logo.png" alt="TechStash">
					</div>
				<h3 class="text-white font-weight-bold">Thank you for signing in, you will receive an email to your inbox shortly.</h3>
					<div class="text-center w-full p-t-25">
						<a href="login" class="txt1 text-white">
						Back to login Screen
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</div>
	
	<script src="/admin/plugins/jquery/jquery.min.js"></script>

</body>
</html>