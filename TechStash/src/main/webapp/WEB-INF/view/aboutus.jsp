<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">

	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="icon" href="images/favicon.ico" type="image/x-icon">

</head>

<body>

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<input type="hidden" id="aboutus" name="aboutus" value="aboutus">

<jsp:include page="header.jsp"/>
  
<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="images/background/blog.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-7">
                <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">About<span class="watermark-sm">About</span></h1>
            </div>
            <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="images/about/aboutus.svg" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>

<section class="section-grid section-lg-bottom section-color">
  <div class="container">
    <div class="row">
          <div class="col-lg-12  grid-margin">
            <div class="card border-0 shadow rounded-lg">
            <br>
              <div class="text-left blog-alignment ">
              <br>
                <p class="text-black">Welcome to TechStash, your number one free tech resources ranging from conferences, podcasts, 
                latest jobs, speakers and blogs. We're dedicated to giving you the best curated list of tech resources via our weekly 
                newsletter, with a focus to provide one stop solution for tech.</p>
                <br>
                <p class="text-black"> We are on mission to making technology more accessible, affordable, secure, and simpler for everyone. 
                and our specially designed volunteering program connecting technology professionals with high impact nonprofits to form a global community through the web.
                </p>
                <br>
                <p class="text-black"> We now serve customers all over India and are thrilled that we're able to turn our passion into [my/our] own website.
                </p>
				<br>
				<p class="text-black"> I hope you enjoy our services as much as I enjoy offering them to you. If you have any questions or comments, please 
				do not hesitate to contact us techstashinfo@gmail.com
                </p>
               	<br>
               	<p class="text-black">Sincerely,</p>
               	<p class="text-black">TechStash </p>
               
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

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

</body>

</html>