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
  
  <c:forEach var="tempMetaDetails" items="${conferenceSetting}">
	<input type="hidden" id="conference" name="conference" value="conference">
	<input type="hidden" id="metaTitleIndexConference" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionConference" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexConference" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>
  <input type="hidden" id="carouselMinId" value='${carouselMinId}'/>
<jsp:include page="header_nontransparent.jsp"/>

<section class="page-height-conference bg-cover overflow-hidden">
           <div id="carouselExample1" class="carousel slide z-depth-1-half" data-ride="carousel">
      <div class="carousel-inner">
      <c:forEach var="tempCarousel" items="${carouselImages}">
        <div class="carousel-item carouselArgument" id="${tempCarousel.id}">
          <img class="d-block w-100" src="data:image/jpg;base64,${tempCarousel.encodedImage}" onerror="this.src='images/placehoder.jpg'" alt="Third slide">
        </div>
        </c:forEach>
      </div>
      
      <a class="carousel-control-prev" href="#carouselExample1" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExample1" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
</section>

      <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Upcoming Conferences</h2>
    </div>

<section class="section-grid section-lg-bottom section-color">
  <div class="container">
    <div class="row">
        	<div class="band">
        	<c:forEach var="tempOrganizer" items="${conferenceContent}">
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(data:image/jpg;base64,${tempOrganizer.encodedImage}), url(images/placehoder.jpg);"></div>
            			<article>
            			<p class="text-dark">${tempOrganizer.date}</p>
             			<h5><a class="text-dark" href="${tempOrganizer.link}" target="_blank">${tempOrganizer.title}</a></h5>
             			<p class="text-dark">${tempOrganizer.location}</p>
                     	<p>${tempOrganizer.description}</p>
            			</article>
    			</div>
    			</c:forEach>
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


<script type='text/javascript'>

$( document ).ready(function() {

	var  carouselMinId= $('#carouselMinId').val();
	var x = document.getElementsByClassName("carouselArgument")[0].id;
	if(x=carouselMinId){
		var testarray = document.getElementsByClassName("carouselArgument");
		    testarray[0].className += " active";
	}
	
});
</script>

</body>

</html>
