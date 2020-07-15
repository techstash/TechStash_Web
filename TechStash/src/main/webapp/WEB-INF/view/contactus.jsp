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
  

<c:forEach var="tempMetaDetails" items="${contactusSetting}">
	<input type="hidden" id="contactus" name="contactusSetting" value="contactus">
	<input type="hidden" id="metaTitleIndexContactus" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionContactus" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexContactus" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

<jsp:include page="header_nontransparent.jsp"/>  

<form:form action="savecontact" method="POST" modelAttribute="contact" >
<section class="page-alignment-speakers bg-cover section-lg-bottom overflow-hidden section-color">
<div class="page-wrapper p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card-form card-6">
                <div class="col-lg-12 text-center">
        <h2 class="section-title">ContactUs</h2>
    			</div>
                <div class="card-body card border-0 shadow rounded-lg">
                    <form method="POST">
                        <div class="form-row">
                            <div class="name">Full Name <span class="required-color"> * </span></div>
                            <div class="value">
                                <form:input class="input--style-6" path="fullname" type="text" required="required"/>
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
                            <div class="name">Message <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <form:textarea class="textarea--style-6" path="message" rows="3" required="required"/>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer col-lg-12  text-center">
                    <button class="btn btn-outline-primary" type="submit" >Submit</button>
                    </div>
                
                    </form>
                    
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

<script src="https://www.google.com/recaptcha/api.js"></script>

<script src="js/form.js"></script>

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

<script src="https://www.google.com/recaptcha/api.js?render=6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ"></script>
<script>
grecaptcha.ready(function() {
    grecaptcha.execute('6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ', {action: 'homepage'}).then(function(token) {
    });
});
</script>

</body>

</html>
