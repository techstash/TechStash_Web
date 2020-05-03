<%@ include file="head.html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">
	
	<script src="plugins/jQuery/jquery.min.js"></script>
	<script> 
     	$(function(){ $("head").load("head.html") });
   	</script>
   	
  	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
  	<link rel="icon" href="images/favicon.ico" type="image/x-icon">
  
  	<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

</head>

<body>
  <!-- preloader start -->
  <!-- preloader end -->

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>

<div class="conference-navigation fixed-top transition nav-bg" id="topheader">
  <div class="container">
    <nav class="navbar navbar-expand-lg navbar-dark p-0">
      <a class="navbar-brand p-0" href="\"><img src="images/logo/logo.png" alt="TechStashLogo"></a>
      <button class="navbar-toggler third-button" type="button" data-toggle="collapse" data-target="#navbarSupportedContent20"
    aria-controls="navbarSupportedContent20" aria-expanded="false" aria-label="Toggle navigation">
    <div class="animated-icon3"><span></span><span></span><span></span></div>
  </button>

      <div class="collapse navbar-collapse text-center" id="navbarSupportedContent20">
        <ul class="navbar-nav mx-auto">
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="\">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="\conference">Conference</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="\jobs">Jobs</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="#">Volunteer</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="\blogs">Blog</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</div>  

<section class="page-alignment-speakers bg-cover section-lg-bottom overflow-hidden" style="background-color:#f4f6f9">
<div class="page-wrapper p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card-form card-6">
                <div class="col-lg-12 text-center">
        <h2 class="section-title">Submit Blog</h2>
    			</div>
                <div class="card-body card border-0 shadow rounded-lg">
                    <form method="POST">
                        <div class="form-row">
                            <div class="name">Name <span style="color:red;"> * </span></div>
                            <div class="value">
                                <input class="input--style-6" type="text" name="name" placeholder="" required>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Topics <span style="color:red;"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="topics" placeholder="" required>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Description <span style="color:red;"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="description" placeholder="" required></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Image <span style="color:red;"> * </span></div>
                            <div class="value">
                                <div class="input-group js-input-file">
                                    <input class="input-file" type="file" name="file_cv" id="file">
                                    <label class="label--file" for="file">Choose file</label>
                                    <span class="input-file__info">No file chosen</span>
                                </div>
                                <div class="label--desc">Upload the image. Max file size 3 MB</div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Category <span style="color:red;"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="category" placeholder="" required>
                                </div>
                            </div>
                        </div>
                        
                        <div class="g-recaptcha" data-sitekey="6LdSVvEUAAAAAAQY49q-j8afGRMFMr9HBo-5pJTr"></div>
                        <div class="card-footer col-lg-12  text-center">
                    <button class="btn btn-outline-primary" type="submit" >Submit</button>
                    </div>
                
                    </form>
                    
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
  </section>
  <!-- copyright part end -->
</footer>

<!-- jQuery -->
<script src="plugins/jQuery/jquery.min.js"></script>
<!-- Bootstrap JS -->
<script src="plugins/bootstrap/bootstrap.min.js"></script>
<!-- slick -->
<script src="plugins/slick/slick.min.js"></script>
<!-- venobox -->
<script src="plugins/venobox/venobox.min.js"></script>
<!-- Aos -->
<script src="plugins/aos/aos.js"></script>

<script src="https://www.google.com/recaptcha/api.js"></script>
<!-- google map -->
<!-- Main Script -->
<script src="js/main.js"></script>

<script src="js/form.js"></script>

 <script type="text/javascript">
 window.onload = function () {
     setMeta();
 }
function setMeta(){
 	document.getElementById("title").setAttribute("content","Input data");
 	document.getElementById("description").setAttribute("content","Input data");
 	document.title = 'TechStash Submit Blog';
}
</script>

</body>

</html>
