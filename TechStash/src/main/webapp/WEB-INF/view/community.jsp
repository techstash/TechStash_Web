<!DOCTYPE html>

<head>
  <meta charset="utf-8">
  <title>TechStash</title>

  <!-- mobile responsive meta -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <!-- ** Plugins Needed for the Project ** -->
  <link href="css/index.css" rel="stylesheet">
  <!-- Bootstrap -->
  <link rel="stylesheet" href="plugins/bootstrap/bootstrap.min.css">
  
  <!-- venobox -->
  <link rel="stylesheet" href="plugins/venobox/venobox.css">
  
  <!-- slick -->
  <link rel="stylesheet" href="plugins/slick/slick.css">
  
  <!-- AOS -->
  <link rel="stylesheet" href="plugins/aos/aos.css">

<link href="css/main.css" rel="stylesheet">
  <!--Favicon-->
  <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
  <link rel="icon" href="images/favicon.ico" type="image/x-icon">
  
  <!-- font-awesome -->
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  
  <script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

</head>


<style>

.band {
  width: 90%;
  max-width: 1240px;
  margin: 0 auto;
  
  display: grid;
  
  grid-template-columns: 1fr;
  grid-template-rows: auto;
  grid-gap: 20px;
  
}

@media only screen and (min-width: 500px) {
  .band {
    grid-template-columns: 1fr;
  }  
}

@media only screen and (min-width: 750px) {
  .band {
    grid-template-columns: 1fr 1fr;
  }
}

@media only screen and (min-width: 850px) {
  .band {
    grid-template-columns: 1fr 1fr 1fr;
  }
}


.card {
  min-height: 100%;
  background: white;
  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
  display: flex;
  flex-direction: column;
  text-decoration: none;
  color: #444;
  position: relative;
  top: 0;
  transition: all .1s ease-in;
}

.card:hover {
  top: -2px;
  box-shadow: 0 4px 5px rgba(0,0,0,0.2);
}

.card article {
  padding: 20px;
  display: flex;
  
  flex: 1;
  justify-content: space-between;
  flex-direction: column;
  
}
.card .thumb {
  padding-bottom: 60%;
  background-size: cover;
  background-position: center center;
}

.card p { 
  flex: 1; /* make p grow to fill available space*/
  line-height: 1.4;
}

.card span {
  font-size: 12px;
  font-weight: bold;
  color: #999;
  text-transform: uppercase;
  letter-spacing: .05em;
  margin: 2em 0 0 0;
}

</style>

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
          <li class="nav-item active">
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
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">Community<span class="watermark-sm">Community</span></h1>
                <p class="text-white pt-4 pb-4" data-aos="fade-up" data-aos-delay="1200">A global network of highly experienced technology experts, influencers and thought leaders.</p>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="images/community/community.svg" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>

<section class="section-grid section-lg-bottom" style="background-color:#f4f6f9">
       <div class="container">
        <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Meet your local community</h2>
    </div>
    <div class="row">
        	<div class="band">
    			<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/chennai.webp);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here</h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
    			</div>
    			
				<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
    			</div>
    			
    			<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
    			</div>
    			
    			<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
    			</div>
    			
    			<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
    			</div>
    			
    			<div class="card border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 style="font-weight: normal;">29/04/2020</h6>
             			<h6 style="font-weight: normal;">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary" style="padding-top: 10px;padding-right: 30px;padding-bottom: 10px;padding-left: 30px;">
                Read More</a></div>
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

<!-- slick -->
<!-- venobox -->
<script src="plugins/venobox/venobox.min.js"></script>
<!-- Aos -->
<script src="plugins/aos/aos.js"></script>

<!-- Main Script -->
<script src="js/blog.js"></script>
<script src="js/main.js"></script>

</body>
</html>