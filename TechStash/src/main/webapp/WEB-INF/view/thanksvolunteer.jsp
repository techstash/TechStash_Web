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

<section class="page-alignment-speakers bg-cover section-lg-bottom overflow-hidden section-color">
<div class="page-wrapper p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card-form card-6">
                <div class="card-body card border-0 shadow rounded-lg">
                        <div class="col-lg-12 text-center">
        <h3 class="section-title">Thanks for volunteering, the TechStash team will contact you shortly</h3>
    			</div>
                </div>
                
            </div>
        </div>
    </div>

</section>

<section class="subscription bg-white">
  <div class="container">
    <div class="subscription-wrapper">
      <div class="d-flex position-relative mx-5 justify-content-between align-items-center flex-column flex-md-row text-center">
        <h3 class="flex-fill">Subscribe <br> to our newsletter</h3>
        <form:form action="subscribewithus" method="GET" class="row flex-fill">
          <div class="col-lg-7 my-md-2 my-2">
            <input type="email" class="form-control px-4 border-0 w-100 text-center text-md-left" id="email" placeholder="Your Email" name="email" required>
          </div>
          <div class="col-lg-5 my-md-2 my-2">
            <button type="submit" class="btn btn-primary btn-lg border-0 w-100">Subscribe Now</button>
          </div>
        </form:form>
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
