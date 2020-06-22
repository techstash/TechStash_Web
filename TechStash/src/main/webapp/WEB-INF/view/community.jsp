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

<c:forEach var="tempMetaDetails" items="${communitySetting}">
	<input type="hidden" id="community" name="community" value="community">
	<input type="hidden" id="metaTitleIndexCommunity" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionCommunity" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexCommunity" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

<jsp:include page="header.jsp"/>   

<section class="page-title page-title-overlay bg-cover overflow-hidden" data-background="images/background/community.jpg">
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

<section class="section-grid section-lg-bottom section-color">
       <div class="container">
        <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Meet your local community</h2>
    </div>
    <div class="row">
        	<div class="band">
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/chennai.webp), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here</h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Read More</a></div>
    			</div>
    			
				<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Read More</a></div>
    			</div>
    			
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Read More</a></div>
    			</div>
    			
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Read More</a></div>
    			</div>
    			
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
                Read More</a></div>
    			</div>
    			
    			<div class="card-grid border-0 shadow rounded-lg">
            			<div class="thumb img-fluid card-img-top rounded-top-lg" style="background-image: url(images/community/delhi.jpg), url(images/placehoder.jpg);"></div>
            			<article class="text-center">
             			<h5>Few Wordings Here </h5>
             			<h6 class="word-fontweight">29/04/2020</h6>
             			<h6 class="word-fontweight">Few Wordings Here </h6>
            			</article>
            			<div class="community-btn-alignment"><a href="#" class="btn btn-outline-primary button-size">
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