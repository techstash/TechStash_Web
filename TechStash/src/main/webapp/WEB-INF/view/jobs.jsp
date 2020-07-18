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


<body id="body">

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<c:forEach var="tempMetaDetails" items="${jobSetting}">
	<input type="hidden" id="jobs" name="jobs" value="jobs">
	<input type="hidden" id="metaTitleIndexJob" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionJob" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexJob" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

<jsp:include page="header.jsp"/>  

<c:forEach var="tempheader" items="${header_section}">
<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="data:image/jpg;base64,${tempheader.encodedBackgroundimage}">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">${tempheader.title}<span class="watermark-sm">${tempheader.title}</span></h1>
                <p class="text-white pt-4 pb-4" data-aos="fade-up" data-aos-delay="1200">${tempheader.subtitle}</p>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="data:image/jpg;base64,${tempheader.encodedHeaderimage}" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>
</c:forEach>

<section class="section-grid section-lg-bottom section-color">

  <div class="container">
    <div class="row align-items-center" id="myBtnContainer">
       <div class="col-lg-6 col-md-5 text-center text-md-left order-md-1">
       <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Jobs Board</h2>
      </div>
      <div class="col-lg-6 col-md-7 text-center text-md-left  order-md-2 mb-4 mb-md-0">
       <button class="btn btn-outline-primary" onclick="filterSelection('Full Time')" >Full Time</button>
        <button class="btn btn-outline-primary" onclick="filterSelection('Part Time')">Part Time</button>
     	<button class="btn btn-outline-primary" onclick="filterSelection('Remote')">Remote</button> 

      </div>
    </div>
    <br>
    <div class="row">
      <c:forEach var="tempJob" items="${jobContent}">
          <div class="col-lg-4 mb-4 grid-margin ${tempJob.type} filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">${tempJob.type}</div>
              <img src="data:image/jpg;base64,${tempJob.encodedImage}"  onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>${tempJob.title}</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">${tempJob.companyname}<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>${tempJob.address}</p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold"><i class="fa fa-rupee"></i> ${tempJob.salary}</h4></div>
               <div class="apply-btn-alignment"><a href="${tempJob.link}" target="_blank" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
        </c:forEach>
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

<script src="plugins/masonry/masonry.js"></script>

<script src="plugins/smooth-scroll/smooth-scroll.js"></script>

<script src="plugins/headroom/headroom.js"></script>

<script src="plugins/venobox/venobox.min.js"></script>

<script src="plugins/aos/aos.js"></script>

<script src="js/blog.js"></script>

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>
<script>

$('button').on('click', function(){
    $('button').removeClass('selected');
    $(this).addClass('selected');
});

filterSelection("all")
function filterSelection(c) {
  var x, i;
  x = document.getElementsByClassName("filterDiv");
  if (c == "all") c = "";
  for (i = 0; i < x.length; i++) {
    w3RemoveClass(x[i], "show");
    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], "show");
  }
}

function w3AddClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    if (arr1.indexOf(arr2[i]) == -1) {element.className += " " + arr2[i];}
  }
}

function w3RemoveClass(element, name) {
  var i, arr1, arr2;
  arr1 = element.className.split(" ");
  arr2 = name.split(" ");
  for (i = 0; i < arr2.length; i++) {
    while (arr1.indexOf(arr2[i]) > -1) {
      arr1.splice(arr1.indexOf(arr2[i]), 1);     
    }
  }
  element.className = arr1.join(" ");
}

var btnContainer = document.getElementById("myBtnContainer");
var btns = btnContainer.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function(){
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>

</body>
</html>