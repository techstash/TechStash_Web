<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>TechStash Signup</title>
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
			<div class="wrap-login100 p-t-44">
				<form:form class="login100-form validate-form" action="signupaction" modelAttribute="user" method="POST" enctype="multipart/form-data" >
					<div class="login100-form-avatar">
						<img src="/images/logo/logo.png" alt="TechStash">
					</div>
					<form:hidden path="id" />
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="name" type="text" placeholder="Name" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-user"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="email" type="email" placeholder="Email Address" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="password" type="password" placeholder="Password" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-key"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="phone" type="number" placeholder="Phone" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-phone"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="location" type="text" placeholder="Location" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-map-marker"></i>
						</span>
					</div>
					
					 <div class="wrap-input100 validate-input m-b-10">
                    <div class="input-group">
                      <div class="custom-file">
                        <input type="file" name="photo" class="custom-file-input" id="exampleInputFile" accept=".png, .jpg, .jpeg" size="50" required="required"/>
                        <label class="custom-file-label" for="exampleInputFile">Image Upload</label>
                      </div>
                    </div>
                  </div>   
                  
                 <div class="wrap-input100 validate-input m-b-10">
                        <form:textarea class="form-control" rows="3" placeholder="Bio" path="bio" required="required"></form:textarea>
                      </div>
                      
                  <div class="row">
                  <div class="col-4 text-white">
                    Designation
                  </div>
                  <div class="col-8">
                     <div class="form-group">
                        <form:select class="custom-select" path="designation" required="required">
                          <option value="">Select</option>
                          <option>Founder/CEO/Admin</option>
                          <option>TSO(TechStash Organizers)</option>
                          <option>TSC (TechStash corodinator)</option>
                          <option>TSC (TechStash chapter)</option>
                          <option>TSM (TechStash Members)</option>
                          <option>Volunteer </option>
                        </form:select>
                      </div>
                  </div>
                </div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="linkedin" type="text" placeholder="Linkedin" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-linkedin"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="github" type="text" placeholder="Github" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-github"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="twitter" type="text" placeholder="Twitter" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-twitter"></i>
						</span>
					</div>
					
					<div class="wrap-input100 validate-input m-b-10">
						<form:input class="input100" path="facebook" type="text" placeholder="Facebook" required="required"/>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-facebook"></i>
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
					
					<div class="text-center w-full p-t-25 p-b-128">
						<a href="#" class="txt1">
						</a>
					</div>

				</form:form>
			</div>
		</div>
	</div>
	
<script src="/admin/plugins/jquery/jquery.min.js"></script>
<script src="/admin/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>
</html>