<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>TechStash</title>
  
  <!-- mobile responsive meta -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <!-- Main Stylesheet -->
  <link href="css/main.css" rel="stylesheet">
  
  <!--Favicon-->
  <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
  <link rel="icon" href="images/favicon.ico" type="image/x-icon">
  
  <!--ShareThis Script-->
  <script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>
</head>


<body id="body">

  <!-- preloader start -->
  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
   <!-- preloader end -->

<div class="naviagtion fixed-top transition" id="topheader">
  <div class="container">
    <nav class="navbar navbar-expand-lg navbar-dark p-0">
      <a class="navbar-brand p-0" href="/"><img src="images/logo/logo.png" alt="TechStashLogo"></a>
      <button class="navbar-toggler third-button" type="button" data-toggle="collapse" data-target="#navbarSupportedContent20"
    aria-controls="navbarSupportedContent20" aria-expanded="false" aria-label="Toggle navigation">
    <div class="animated-icon3"><span></span><span></span><span></span></div>
  </button>

      <div class="collapse navbar-collapse text-center" id="navbarSupportedContent20">
       <ul class="navbar-nav mx-auto">
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/conference">Conference</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/jobs">Jobs</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="#">Volunteer</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/blogs">Blog</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</div>  

<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="images/background/blog.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">Jobs<span class="watermark-sm">Jobs</span></h1>
                <p class="text-white pt-4 pb-4" data-aos="fade-up" data-aos-delay="1200">Latest Jobs</p>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="images/jobs/jobs_banner.svg" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>

<section class="section-grid section-lg-bottom" style="background-color:#f4f6f9">

    
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
              <img src="//logo.clearbit.com/yahoo.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Yahoo<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/google.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Google<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/hexaware.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Hexaware<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/hcl.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">HCL<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin full-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/tcs.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">TCS<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/fidelity.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Fidelity<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/capgemini.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Capgemini<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin remote filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/adobe.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Adobe<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Apply Now</a></div>
            </div>
          </div>
          <div class="col-lg-4 mb-4 grid-margin part-time filterDiv">
            <div class="card border-0 shadow rounded-lg">
            <br>
            <div class="grid-pos-right bg-info-gradiant p-2 d-inline-block text-center rounded text-black position-absolute">Full Time</div>
              <img src="//logo.clearbit.com/yahoo.com" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5>Web Developer</h5>
              </div>
                <hr>
                <div class="box-alignment">
                	<p style="color:black;">Yahoo<p>
				  	<ul class="box-inline">
          				<li class="box-inline-item"><i style="color: #00e0d8;" class="fa fa-map-marker"></i></li>
         				<li class="box-inline-item"><p>Address Here </p></li>
          			</ul> 
          		</div>	   
                <div class="salary-grid-alignment d-inline-block text-center text-black position-absolute"><h4 font-weight:bold">$10,000</h4></div>
                <div class="apply-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
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

<!-- footer part start -->
<footer class="bg-secondary pt-5">
  <section class="section border-bottom border-color">
    <div class="container">
      <div class="row justify-content-between">
        <div class="col-md-5 mb-4 mb-md-0">
          <img src="images/logo/logo.png" class="mb-4" alt="agico">
          <p class="text-light mb-4">Few Content Here Few Content Here Few Content Here Few Content Here Few Content Here Few Content Here Few Content Here Few Content Here Few Content Here</p>
          <ul class="list-inline social-icons">
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-youtube"></i></a></li>
            <li class="list-inline-item"><a href="#"><i class="fa fa-github"></i></a></li>
          </ul>
        </div>
        <div class="col-lg-4 col-md-3 col-sm-6 center-mobile" style="padding-top: 40px;">
          <h4 class="text-white mb-4">Quick Links</h4>
          <ul class="list-hover-underline list-unstyled">
            <li class="mb-3 text-light"><a href="#" class="text-light">About us</a></li>
            <li class="mb-3 text-light"><a href="#" class="text-light">Privacy Policy</a></li>
            <li class="mb-3 text-light"><a href="#" class="text-light">FAQs</a></li>
            
          </ul>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 center-mobile" style="padding-top: 40px;">
          <h4 class="text-white mb-4">Contact</h4>
          <ul class="list-inline">
          <li class="list-inline-item"><i style="color:#00e0d8;" class="fa fa-envelope"></i></li>
          <li class="list-inline-item"><a class="text-light" href="mailto:techstashinfo@gmail.com">techstashinfo@gmail.com</a></li>
          </ul>
        </div>
      </div>
    </div>
  </section>
  <!-- footer part end -->
<!-- <a class="twitter-timeline" data-lang="en" data-dnt="true" data-tweet-limit="3" href="https://twitter.com/AdliveTech" data-theme="dark">Tweets by AdliveTech</a> <script async src="//platform.twitter.com/widgets.js" charset="utf-8"> -->
  <!-- copyright part start -->
  <section class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-lg-12  text-center mb-3 mb-md-0">
          <p class="mb-0 text-light">Copyright &copy;
            <script>
              var CurrentYear = new Date().getFullYear()
              document.write(CurrentYear+",")
            </script>
             made with <span style="color:red;"> ❤ </span> by <a href="https://twitter.com/techstashin" target="_blank"><strong style="color: #00e0d8;">TechStash.</strong></a> All Rights Reserved.</p> 
        </div>
      </div>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-lg-12  text-center mb-3 mb-md-0">
          <p class="mb-0 text-light">
          <a href="https://clearbit.com" style="color: #00e0d8;" target="_blank">Logos provided by Clearbit</a>
           </p> 
        </div>
      </div>
    </div>
  </section>
  <!-- copyright part end -->
</footer>

<!-- jQuery -->
<script src="plugins/jQuery/jquery.min.js"></script>
<!-- Bootstrap JS -->
<script src="plugins/bootstrap/bootstrap.min.js"></script>
<!-- slick slider -->
<script src="plugins/slick/slick.min.js"></script>
<!-- masonry -->
<script src="plugins/masonry/masonry.js"></script>
<!-- instafeed -->
<!-- smooth scroll -->
<script src="plugins/smooth-scroll/smooth-scroll.js"></script>
<!-- headroom -->
<script src="plugins/headroom/headroom.js"></script>
<!-- reading time -->
<!-- Isotope -->
  <script type="text/javascript" src="plugins/isotope/isotope.js"></script>
  <script type="text/javascript" src="plugins/isotope/ini.isotope.js"></script>

<!-- slick -->
<!-- venobox -->
<script src="plugins/venobox/venobox.min.js"></script>
<!-- Aos -->
<script src="plugins/aos/aos.js"></script>

<!-- Main Script -->
<script src="js/blog.js"></script>
<script src="js/main.js"></script>

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

// Add active class to the current button (highlight it)
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