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
<input type="hidden" id="subscribe" name="subscribe" value="subscribe">

<jsp:include page="header.jsp"/> 

<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="images/background/blog.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">Subscribe<span class="watermark-sm">Subscribe</span></h1>
                <p class="text-white pt-4 pb-4" data-aos="fade-up" data-aos-delay="1200">Latest News</p>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="images/newsletter/newsletter.svg" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>

<section class="section-grid section-lg-bottom">
   <div class="container">
    <div class="row">
    <div class="col-lg-3"></div>
          <div class="col-lg-6 mb-4 grid-margin" >
            <div class="card border-0 shadow rounded-lg">
<form class="text-center border border-light p-5 section-color" name="subscribeform" action="#" >

    <div class="col-lg-12 text-center">
        <h2 class="section-title">Join Us!</h2>
    </div>

    <input type="email" id="email" name="email" class="form-control mb-4" placeholder="E-mail" required>

    <input type="text" id="name"  name="name" class="form-control mb-4" placeholder="Full Name" required >
    
    <div class="subscribe-alignment">
    

    <div class="d-flex justify-content-around">
        <div>
            <div class="checkbox-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="subscribejobs">
                <label class="custom-control-label text-black" for="subscribejobs">Subscribe to Jobs</label>
            </div>
            
            <div class="checkbox-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="subscribeevents">
                <label class="custom-control-label text-black" for="subscribeevents">Subscribe to events, hackthons, conference</label>
            </div>
            
            <div class="checkbox-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="subscribepodcast">
                <label class="custom-control-label text-black" for="subscribepodcast">Subscribe to podcast </label>
            </div>
        </div>
    </div>
    </div>
	<button class="btn btn-outline-primary my-4" type="submit">Subscribe</button>
	</form>
</div>
</div>
<div class="col-lg-3"></div>
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