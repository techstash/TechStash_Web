<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">

	<c:forEach var="tempMetaDetails" items="${homeSetting}">
	<link rel="shortcut icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	<link rel="icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	</c:forEach>

</head>

<body>
  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<c:forEach var="tempMetaDetails" items="${volunteerSetting}">
	<input type="hidden" id="volunteer" name="volunteer" value="volunteer">
	<input type="hidden" id="metaTitleIndexVolunteer" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionVolunteer" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexVolunteer" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

<jsp:include page="header_nontransparent.jsp"/> 

<form:form action="savevolunteer" method="POST" modelAttribute="volunteer" enctype="multipart/form-data" >
<section class="page-alignment-speakers bg-cover section-lg-bottom overflow-hidden section-color">
<div class="page-wrapper p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card-form card-6">
                <div class="col-lg-12 text-center">
        <h2 class="section-title">Join Volunteer Membership</h2>
    			</div>
                <div class="card-body card border-0 shadow rounded-lg">
                        <div class="form-row">
                            <div class="name">First Name <span class="required-color"> * </span></div>
                            <div class="value">
                                <form:input class="input--style-6" path="firstname" type="text" required="required"/>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Last Name <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="lastname" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Email Address <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="email" type="email" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">City<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="city" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                         <div class="form-row">
                            <div class="name">Gender<span class="required-color"> * </span></div>
                             <div class="value">
                              <div class="form-group col-md-6">
                                  
                                  <form:select id="inputState" class="form-control" path="gender" required="required">
                                    <option value="">Choose</option>
                                    <option> Male</option>
                                    <option> Female</option>
                                    <option> Other</option>
                                    <option> Decline to State</option>
                                   </form:select>
                        </div>
                        </div>
                        </div>
                         <div class="form-row">
                            <div class="name">Highest Level of Education<span class="required-color"> * </span></div>
                             <div class="value">
                              <div class="form-group col-md-6">
                                  
                                  <form:select id="inputState" class="form-control" path="education" required="required">
                                    <option value="">Choose</option>
                                    <option> Primary education</option>
                                    <option> Secondary education</option>
                                    <option> Associate degree</option>
                                    <option> Vocational education</option>
                                    <option> Undergraduate degree</option>
                                    <option> Masters degree</option>
                                    <option> Doctoral education (PhD)</option>
                                    <option> Non-standardized education: self-taught</option>
                                    <option> Bootcamp</option>
                                    <option> Other</option>
                                  </form:select>
                        </div>
                        </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Specialization?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="Specialization" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">How many hours?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="hours" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                         <div class="form-row">
                            <div class="name">Few details about you?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:textarea class="textarea--style-6" path="details" rows="3" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Linkedin<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="linkedin" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Github<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="github" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Twitter<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:input class="input--style-6" path="twitter" type="text" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Personal portfolio?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:textarea class="textarea--style-6" path="portfolio" rows="3" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Photo to upload <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                      			<div class="custom-file">
                        		<input type="file" name="photo" class="custom-file-input" id="exampleInputFile" accept=".png, .jpg, .jpeg" size="50" required="required"/>
                        		<label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      			</div>
                  				</div>
                                <div class="label--desc">Upload the image. Max file size 3 MB</div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">How did you hear about TechStash?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:textarea class="textarea--style-6" path="hear_about_techstash" rows="3" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Any ideas that you would like to share?<span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:textarea class="textarea--style-6" path="ideas_to_techstash" rows="3" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer col-lg-12  text-center">
                    <button class="btn btn-outline-primary" type="submit" >Submit</button>
                    </div>
                
                </div>
                
            </div>
        </div>
    </div>

</section>
</form:form>

<section class="subscription bg-white">
  <div class="container">
    <div class="subscription-wrapper">
      <div class="d-flex position-relative mx-5 justify-content-between align-items-center flex-column flex-md-row text-center">
        <h3 class="flex-fill">Subscribe <br> to our newsletter</h3>
        <form action="#" class="row flex-fill">
          <div class="col-lg-7 my-md-2 my-2">
            <input type="email" class="form-control px-4 border-0 w-100 text-center text-md-left" id="email" placeholder="Your Email" name="email">
          </div>
          <div class="col-lg-5 my-md-2 my-2">
            <button type="submit" class="btn btn-primary btn-lg border-0 w-100">Subscribe Now</button>
          </div>
        </form>
      </div>
    </div>
  </div>
</section>
<jsp:include page="footer.jsp"/> 

<script src="plugins/jQuery/jquery.min.js"></script>

<script src="plugins/bootstrap/bootstrap.min.js"></script>

<script src="plugins/slick/slick.min.js"></script>

<script src="plugins/venobox/venobox.min.js"></script>

<script src="plugins/aos/aos.js"></script>

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

<script src="js/form.js"></script>

<script src="admin/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>

<script src="https://www.google.com/recaptcha/api.js?render=6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ"></script>
<script>
grecaptcha.ready(function() {
    grecaptcha.execute('6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ', {action: 'homepage'}).then(function(token) {
       
    });
});    
</script>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

</body>

</html>
