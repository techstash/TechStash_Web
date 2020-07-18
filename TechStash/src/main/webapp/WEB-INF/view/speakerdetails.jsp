<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">
	
	<c:forEach var="tempSpeakerDetail" items="${speakerdetail}">
	<meta name="title" content="TechStash Speaker Detail - ${tempSpeakerDetail.name}" />
	<meta name="description" content="${tempSpeakerDetail.bio}" />
	<title>TechStash Speaker Detail - ${tempSpeakerDetail.name}</title>
	</c:forEach>
	
	<c:forEach var="tempMetaDetails" items="${homeSetting}">
	<link rel="shortcut icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	<link rel="icon" href="data:image/jpg;base64,${tempMetaDetails.encodedImage}" type="image/jpg">
	</c:forEach>

</head>

<body id="body">

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<jsp:include page="header_nontransparent.jsp"/> 

<c:forEach var="tempSpeakerDetail" items="${speakerdetail}">
<section class="page-alignment-speakers-details section-lg-bottom">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <img src="data:image/jpg;base64,${tempSpeakerDetail.encodedImage}" onerror="this.src='images/placehoder.jpg'" alt="Speaker" class="img-fluid img-alignment-speakers img-circle">
          </div>
	<div class="col-lg-12 text-center">
<br>
        <h2 class="section-title">${tempSpeakerDetail.name}</h2>
        
        <ul class="list-inline social-icons">
            <li class="list-inline-item"><a href="${tempSpeakerDetail.facebook}" target="_blank"><i style="color: black;" class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="${tempSpeakerDetail.twitter}" target="_blank"><i style="color: black;" class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i style="color: black;" class="fa fa-youtube"></i></a></li>
            <li class="list-inline-item"><a href="${tempSpeakerDetail.github}" target="_blank"><i style="color: black;" class="fa fa-github"></i></a></li>
          </ul>
    </div>
          <div class="col-md-12">
              
              <p class="text-black">${tempSpeakerDetail.bio}</p>
              
            </div>
          </div>

        </div>

    </section>
  </c:forEach>
 
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

<script src="plugins/masonry/masonry.js"></script>

<script src="plugins/smooth-scroll/smooth-scroll.js"></script>

<script src="plugins/headroom/headroom.js"></script>

<script src="plugins/venobox/venobox.min.js"></script>

<script src="plugins/aos/aos.js"></script>

<script src="js/blog.js"></script>

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

</body>

</html>