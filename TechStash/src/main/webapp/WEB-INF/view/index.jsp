<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  
<input type="hidden" id="index" name="index" value="index">

<jsp:include page="header.jsp"/>

<!-- Banner -->
<c:forEach var="tempBanner" items="${banner}">
<c:if test="${tempBanner.status}">
<section class="hero-area bg-cover" data-background="images/background/banner.png">
  <div class="container">
    <div class="row align-items-center justify-content-between">
      <div class="col-lg-6 pl-lg-0 text-center text-lg-left">
        <h1 class="text-white position-relative" data-aos="fade-up" data-aos-delay="1000">${tempBanner.title}</h1>
        <p class="text-white pt-2 pb-3" data-aos="fade-up" data-aos-delay="1200">${tempBanner.subtitle}</p>
       
      <a href="/subscribe" class="btn btn-primary" data-aos="fade-up" data-aos-delay="1400">Subscribe</a>
      </div>
      <div class="col-lg-5 pl-lg-0 pt-5 pt-lg-0 text-lg-right text-center">
        <img src="data:image/jpg;base64,${tempBanner.encodedImage}" class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
    </div>
  </div>
</section>
</c:if>
</c:forEach>

<!-- Conference -->
<c:forEach var="tempConferenceSection" items="${conferenesection}">
<c:if test="${tempConferenceSection.status}">
<section id="conference" class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row align-items-center">
       <div class="col-lg-6 col-md-5 text-center text-md-left order-md-1 order-1">
        <img src="data:image/jpg;base64,${tempConferenceSection.encodedImage}" class="img-fluid" alt="conference" data-aos="fade-right">
      </div>
      <div class="col-lg-6 col-md-7 text-center text-md-left  order-md-2 mb-4 mb-md-0">
        <h2 class="section-title" data-aos="fade-left" data-aos-delay="200">${tempConferenceSection.title}</h2>
        <p class="mb-4" data-aos="fade-left" data-aos-delay="300">${tempConferenceSection.subtitle}</p>
        <a href="/conference" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">${tempConferenceSection.buttontextleft}</a>&nbsp;&nbsp;
         <a href="/postconference" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">${tempConferenceSection.buttontextright}</a>

      </div>
    </div>
  </div>
</section>
</c:if>
</c:forEach>

<!-- jobs -->
<section id="blog" class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row align-items-center">
      <div class="col-lg-6 col-md-7 text-center text-md-left order-md-1 ">
        <h2 class="section-title" data-aos="fade-right" data-aos-delay="200">Jobs</h2>
        <p class="mb-4" data-aos="fade-right" data-aos-delay="300"> Explore the latest Core Technical Jobs</p>
        <a href="/jobs" class="btn btn-outline-primary" data-aos="fade-right" data-aos-delay="500">View Jobs</a>
        &nbsp;&nbsp;
         <a href="/postjob" class="btn btn-outline-primary" data-aos="fade-right" data-aos-delay="500">Post a Job</a>
      </div>
      <div class="col-lg-6 col-md-5 text-center text-md-left  order-md-2 mb-4 mb-md-0">
        <img src="images/home/jobs.svg" class="img-fluid w-100" alt="jobs" data-aos="fade-left">
      </div>
    </div>
  </div>
</section>

	<!-- Speakers -->
<section class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row">
      <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Speakers</h2>
      </div>
    </div>
    <div class="row testimonial-slider" data-aos="fade-up" data-aos-delay="200">
    
      <div class="team-member col-md-4 col-sm-6 col-xs-12 text-center">
		<div class="img-hexagon">
			<img src="images/speakers/speaker-1.jpg" alt="Team Member" class="img-responsive">
			
				<span class="img-top"></span>
				<span class="img-bottom"></span>
			</div>
		<h4>Speaker 1</h4>
		<span class="text-black">Designation</span>
		</div>
		
     <div class="team-member col-md-3 col-sm-6 col-xs-12  text-center">
		<div class="img-hexagon">
			<img src="images/speakers/speaker-2.jpg" alt="Team Member" class="img-responsive">
				<span class="img-top"></span>
				<span class="img-bottom"></span>
			</div>
		<h4>Speaker 2</h4>
		<span class="text-black">Designation</span>
		</div>
		
		
      <div class="team-member col-md-3 col-sm-6 col-xs-12  text-center">
		<div class="img-hexagon">
			<img src="images/speakers/speaker-3.jpg" alt="Team Member" class="img-responsive">
				<span class="img-top"></span>
				<span class="img-bottom"></span>
			</div>
		<h4>Speaker 3</h4>
		<span class="text-black">Designation</span>
		</div>
		
		
      <div class="team-member col-md-3 col-sm-6 col-xs-12  text-center">
		<div class="img-hexagon">
			<img src="images/speakers/speaker-4.jpg" alt="Team Member" class="img-responsive">
				<span class="img-top"></span>
				<span class="img-bottom"></span>
			</div>
		<h4>Speaker 4</h4>
		<span class="text-black">Designation</span>
		</div>
		
		<div class="team-member col-md-3 col-sm-6 col-xs-12  text-center">
		<div class="img-hexagon">
			<img src="images/speakers/speaker-5.jpg" alt="Team Member" class="img-responsive">
				<span class="img-top"></span>
				<span class="img-bottom"></span>
			</div>
		<h4>Speaker 5</h4>
		<span class="text-black">Designation</span>
		</div>
    </div>
    <br>
    <br>
    <div class="row align-items-center justify-content-between">
      <div class="col-lg-12 text-center text-lg-center text-md-center">
      <a href="/speakers" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">Load More Speakers</a>
      </div>
      </div>
      
  </div>
</section>
<!-- Blogs -->
<section id="conference" class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row align-items-center">
       <div class="col-lg-6 col-md-5 text-center text-md-left order-md-1 order-1">
        <img src="images/home/blog.svg" class="img-fluid" alt="blog" data-aos="fade-right">
      </div>
      <div class="col-lg-6 col-md-7 text-center text-md-left  order-md-2 mb-4 mb-md-0">
        <h2 class="section-title" data-aos="fade-left" data-aos-delay="200">Blogs</h2>
        <p class="mb-4" data-aos="fade-left" data-aos-delay="300">Staying current with the latest technology and is a great place to read and learn from a wide range of authors.</p>
        <a href="/blogs" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">View Blogs</a>
        &nbsp;&nbsp;
        <a href="/postblog" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">Post a Blog</a>
      </div>
    </div>
  </div>
</section>

	<!-- Podcast -->
<section id="blog" class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row align-items-center">
      <div class="col-lg-6 col-md-7 text-center text-md-left order-md-1 ">
        <h2 class="section-title" data-aos="fade-right" data-aos-delay="200">Podcast</h2>
        <p class="mb-4" data-aos="fade-right" data-aos-delay="300">New technology is emerging every day, and it can be difficult to keep up with the latest research and trends. Listen to our 
  collection of best tech podcasts from industry experts.</p>
        <a href="/podcast" class="btn btn-outline-primary" data-aos="fade-right" data-aos-delay="500">View Podcast</a>
      </div>
      <div class="col-lg-6 col-md-5 text-center text-md-left  order-md-2 mb-4 mb-md-0">
        <img src="images/home/podcast.svg" class="img-fluid w-100" alt="podcast" data-aos="fade-left">
      </div>
    </div>
  </div>
</section>

	<!-- Community -->
<section id="conference" class="section pb-0 overflow-hidden">
  <div class="container">
    <div class="row align-items-center">
       <div class="col-lg-6 col-md-5 text-center text-md-left order-md-1 order-1">
        <img src="images/home/community.svg" class="img-fluid" alt="community" data-aos="fade-right">
      </div>
      <div class="col-lg-6 col-md-7 text-center text-md-left  order-md-2 mb-4 mb-md-0">
        <h2 class="section-title" data-aos="fade-left" data-aos-delay="200">Community</h2>
        <p class="mb-4" data-aos="fade-left" data-aos-delay="300">Find a community and meet people near you who share your interests or identifying, expanding, and sharing their expertise 
  with the support of an engaged peer network.</p>
        <a href="/community class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">View Community</a>
        &nbsp;&nbsp;
        <a href="/volunteer" class="btn btn-outline-primary" data-aos="fade-left" data-aos-delay="500">Volunteer</a>

      </div>
    </div>
  </div>
</section>

<section class="section-lg pb-0 bg-cover" data-background="images/background/twitter-background.png">
	<div class="elfsight-app-f5798e0d-505b-4f1f-b37d-5e9e5b0be181"></div>
</section>

	<!-- Resources -->
<section class="bg-triangles bg-gradient-primary overflow-hidden">
  <div class="container">
    <div class="row">
      <div class="col-lg-6 text-center text-lg-left">
         <div class="section">
          <h2 class="section-title text-white" data-aos="fade-up">Resources</h2>
          <p class="text-white mb-4" data-aos="fade-up" data-aos-delay="200">Best collection of online resources that caters your quest to upgrade your skills.</p>
          <ul class="list-inline">
            <li class="list-inline-item mb-3 mb-lg-0">
              <a href="/resources" class="btn btn-primary" data-aos="fade-up" data-aos-delay="1400">Resources</a>
            </li>
          </ul>
        </div> 
      </div>
      <div class="col-lg-6 align-self-end" data-aos="fade-left" data-aos-delay="600">
        <img src="images/home/resources.svg" class="img-fluid w-100" alt="mobile-screen">
      </div>
    </div>
  </div>
</section>

	<section class="section section-lg-bottom">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-title" data-aos="fade-up" data-aos-delay="100">choose
					your plan</h2>
			</div>
			<div class="col-lg-4 col-sm-6 mb-lg-0 mb-4" data-aos="fade-up">
				<div
					class="pricing-table position-relative text-center px-4 py-5 rounded-lg shadow transition bg-white">
					<span
						class="badge badge-pill badge-light font-weight-medium mb-3 py-2 px-4 text-primary">Basic</span>
					<img src="images/pricing/price-1.svg" class="img-fluid w-100"
						alt="mobile-screen">
					<hr>
					<div class="h2 text-dark">
						INR 1000<span class="paragraph text-lowercase"> / mo</span>
					</div>
					<h5 class="mb-4 font-weight-normal text-color">Basic Services</h5>
					<ul class="list-unstyled my-4">
						<li class="my-3">2 Posting of Jobs and 2 Conferences</li>
						<li class="my-3"> Feature it on our Newsletters </li>
						<li class="my-3dash"> - </li>
						<li class="my-3dash"> - </li>
					</ul>
					<a href="#" class="btn btn-outline-primary">select plan</a>
				</div>
			</div>
			<div class="col-lg-4 col-sm-6 mb-lg-0 mb-4" data-aos="fade-up"
				data-aos-delay="200">
				<div
					class="pricing-table position-relative text-center px-4 py-5 rounded-lg shadow transition bg-white">
					<span
						class="badge badge-pill badge-light font-weight-medium mb-3 py-2 px-4 text-primary">Professional</span>
					<img src="images/pricing/price-2.svg" class="img-fluid w-100"
						alt="mobile-screen">
					<hr>
					<div class="h2 text-dark">
						INR 1500<span class="paragraph text-lowercase"> / mo</span>
					</div>
					<h5 class="mb-4 font-weight-normal text-color">Premium services</h5>
					<ul class="list-unstyled my-4">
						<li class="my-3">10 posting of Jobs and 5 Conferences</li>
						<li class="my-3">Feature it on our Newsletters</li>
						<li class="my-3">Highlight on Social Media</li>
						<li class="my-3dash"> - </li>
					</ul>
					<a href="#" class="btn btn-outline-primary">select plan</a>
				</div>
			</div>
			<div class="col-lg-4 col-sm-6 mb-lg-0 mb-4" data-aos="fade-up"
				data-aos-delay="400">
				<div
					class="pricing-table position-relative text-center px-4 py-5 rounded-lg shadow transition bg-white">
					<span
						class="badge badge-pill badge-light font-weight-medium mb-3 py-2 px-4 text-primary">Business</span>
					<img src="images/pricing/price-3.svg" class="img-fluid w-100"
						alt="mobile-screen">
					<hr>
					<div class="h2 text-dark">
						INR 2000<span class="paragraph text-lowercase"> / mo</span>
					</div>
					<h5 class="mb-4 font-weight-normal text-color">Best Services</h5>
					<ul class="list-unstyled my-4">
						<li class="my-3">Unlimited posting of Jobs and Conferences</li>
						<li class="my-3">Feature it on our Newsletters</li>
						<li class="my-3">Highlight on Social Media </li>
						<li class="my-3">Customer support via email</li>
					</ul>
					<a href="#" class="btn btn-outline-primary">select plan</a>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="bg-triangles bg-gradient-primary overflow-hidden">
  <div class="container">
    <div class="row">
      <div class="col-lg-6 text-center text-lg-left">
         <div class="section">
          <h2 class="section-title text-white" data-aos="fade-up">Subscribe to our newsletter</h2>
         <form action="#" class="flex-fill" data-aos="fade-up">
          <div class="row">
            <div class="col-lg-7 my-md-2 my-2">
              <input type="email" class="form-control px-4 border-0 w-100 text-center text-md-left"
                id="email" placeholder="Your Email" name="email" required>
            </div>
            <div class="col-lg-5 my-md-2 my-2">
              <button type="submit" class="btn btn-primary btn-lg border-0 w-100">Subscribe Now</button>
            </div>
          </div>
        </form>
        </div> 
      </div>
      <div class="col-lg-6 align-self-end" data-aos="fade-left" data-aos-delay="600">
        <img src="images/home/newsletter.png" class="img-fluid w-100" alt="mobile-screen">
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

<script src="https://apps.elfsight.com/p/platform.js" defer></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>
</body>

</html>
