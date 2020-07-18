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
  
<c:forEach var="tempMetaDetails" items="${podcastSetting}">
	<input type="hidden" id="podcast" name="podcast" value="podcast">
	<input type="hidden" id="metaTitleIndexPodcast" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionPodcast" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexPodcast" value='${tempMetaDetails.browsertitle}'/>
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
    <div class="row masonry-container">
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-2.jpg" onerror="this.src='images/placehoder.jpg'" class="thumb img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      
      <div class="col-lg-4 col-sm-6 mb-5">
      <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg, #91EAE4 0%, #7F7FD5 52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-2.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#02cab1 0%, #01afe7 52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg, #91EAE4 0%, #CF8BF3 52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
            <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg, #91EAE4 0%, #CF8BF3 52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#02cab1 0%, #01afe7 52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
             <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
        </div>
      </div>
      <div class="col-lg-4 col-sm-6 mb-5">
     <div class="card border-0 shadow rounded-lg" >
        <article>
          <div class="card border-0 shadow rounded-lg" style="background: linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%);">
              <div class="card-body col-lg-8 ">
          <h4 class="title-border"><a class="text-white" href="blog-single.html">Launching your design career</a></h4>
          <br>
          <h6 class="title-border text-white">Speaker Name</h6>
          <h6 class="title-border text-white">Designation</h6>
          </div>
          <br>
          <br>
          <br>
          <div class="row ">
             <div class="col-lg-6 col-sm-6 col-6">
             <div class="pulse-container">
            <div class="pulse-box">
              <a class="venobox play-icon icon-center" data-autoplay="true" data-vbtype="video" href="https://www.youtube.com/watch?v=acjtWVc_7sc"><i class="playbutton-alignment fa fa-play text-secondary"></i></a>
              <svg class="pulse-svg" width="90px" height="90px" viewBox="0 0 50 50" version="1.1" xmlns="http://www.w3.org/2000/svg"
                xmlns:xlink="http://www.w3.org/1999/xlink">
                <circle class="circle first-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle second-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle third-circle" fill="#fff" cx="25" cy="25" r="25"></circle>
                <circle class="circle" fill="#fff" cx="25" cy="25" r="25"></circle>
              </svg>
            </div>
             </div>
            </div>
            <div class="col-lg-5 col-sm-5 col-5 podcast-padding">
             <img src="images/speakers/speaker-1.jpg" onerror="this.src='images/placehoder.jpg'" class="img-fluid card-img-top rounded-image podcast-img-border" alt="post-thumb">
             </div>
            </div> 
            </div>
        </article>
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

</body>
</html>