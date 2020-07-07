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
  
<c:forEach var="tempMetaDetails" items="${blogSetting}">
	<input type="hidden" id="blogs" name="blogs" value="blogs">
	<input type="hidden" id="metaTitleIndexBlogs" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionBlogs" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexBlogs" value='${tempMetaDetails.browsertitle}'/>
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
         <img src="data:image/jpg;base64,${tempheader.encodedHeaderimage}"  class="img-fluid" alt="banner-image" data-aos="zoom-in" data-aos-delay="1500">
      </div>
        </div>
    </div>
</section>
</c:forEach>

<section class="section">
  <div class="container">
      <div class="container">
      <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Latest Blogs</h2>
    </div>
    <div class="row masonry-container">
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
          <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-2.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                   <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-3.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                    <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-4.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
          <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-5.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
          <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-6.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                    <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-7.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                 <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-8.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                   <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
              <img src="images/blog/blog-post-9.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                   <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
         <img src="images/blog/blog-post-10.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
          <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                    <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <img src="images/blog/blog-post-3.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
          <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                   <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
             <img src="images/blog/blog-post-6.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                    <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg">
        <article class="text-center">
          <div class="card border-0 shadow rounded-lg">
             <img src="images/blog/blog-post-2.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-top-lg" alt="post-thumb">
              <div class="card-body">
              <p class="text-uppercase mb-2">TRAVEL</p>
          <h4 class="title-border"><a class="text-dark" href="">Charming Evening Field</a></h4>
                   <p class="blog-alignment">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
        </article>
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