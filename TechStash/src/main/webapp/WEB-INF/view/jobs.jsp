<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">

	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="icon" href="images/favicon.ico" type="image/x-icon">

</head>


<body id="body">

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<input type="hidden" id="jobs" name="jobs" value="jobs">

<jsp:include page="header.jsp"/>  

<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="images/background/jobs.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">Jobs<span class="watermark-sm">Jobs</span></h1>
                <p class="text-white pt-4 pb-4" data-aos="fade-up" data-aos-delay="1200">Search and find the latest jobs near you.</p>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="images/jobs/jobs_banner.svg" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>

<section class="section-grid section-lg-bottom section-color">

  <div class="container">
    <div class="row align-items-center" id="myBtnContainer">
       <div class="col-lg-6 col-md-5 text-center text-md-left order-md-1">
       <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Jobs Board</h2>
      </div>
      <div class="col-lg-6 col-md-7 text-center text-md-left  order-md-2 mb-4 mb-md-0">
       <button class="btn btn-outline-primary" onclick="filterSelection('full-time')" >Full Time</button>
        <button class="btn btn-outline-primary" onclick="filterSelection('part-time')">Part Time</button>
     	<button class="btn btn-outline-primary" onclick="filterSelection('remote')">Remote</button> 

      </div>
    </div>
    <br>
    <div class="row">
          <div class="col-lg-4 mb-4 grid-margin full-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/yahoo.com"  onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Yahoo<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
               <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/google.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Google<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
               <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/hexaware.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Hexaware<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
               <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/hcl.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">HCL<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
               <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin full-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/tcs.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">TCS<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/fidelity.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Fidelity<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/capgemini.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Capgemini<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/adobe.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Adobe<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/yahoo.com" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p class="text-black">Yahoo<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i class="fa fa-map-marker unique-color"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Apply Now</a></div>
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