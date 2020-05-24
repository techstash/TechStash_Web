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
  
<input type="hidden" id="speakerdetails" name="speakerdetails" value="speakerdetails">
  
<jsp:include page="header_nontransparent.jsp"/> 


<section class="page-alignment-speakers-details section-lg-bottom">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <img src="images/speakers/speaker-2.jpg" onerror="this.src='images/placehoder.jpg'" alt="Speaker 1" class="img-fluid img-alignment-speakers img-circle">
          </div>
<div class="col-lg-12 text-center">
<br>
        <h2 class="section-title">Speaker Name</h2>
        
        <ul class="list-inline social-icons">
            <li class="list-inline-item"><a href="#" target="_blank"><i style="color: black;" class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i style="color: black;" class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i style="color: black;" class="fa fa-youtube"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i style="color: black;" class="fa fa-github"></i></a></li>
          </ul>
    </div>
          <div class="col-md-12">
              
              <p class="text-black">Monica is the Innovation Lead for Collaboration and Workplace Automation at Roche where she helps translate ambiguity into a vision for transformative Enterprise Solutions that have superior demonstrable business value. Roche is a Swiss multinational with a mission to create innovative medicines and diagnostic tests that help millions of patients globally. She has been the Chief Evangelist for G Suite since she started on this journey in 2009 as Technical Lead for the migration of Genentech Mail/Calendar to G Suite. Genentech was the first US biotech to move to the cloud very early and at that time G Suiteâs biggest customer. After the acquisition of Genentech by Roche in 2009, the two companies had several platform interoperability issues since Roche was on MSFT Exchange. In order to enable seamless collaboration across the global organization, Roche migrated 90,000 employees to G Suite in 2013. Monica was instrumental in transitioning the organization towards a new way of working by listening, understanding the pain points and helping teams across the various business groups become more productive by working closely with leadership and change management organization to build trust and know-how for the new cloud solutions. She was selected from Roche to be part Googleâs G Suite Product Strategists team as a consultant to give their product teams feedback on what they could do to make their products a better fit for large enterprises, meet business and compliance demands and offer a better user experience. She has led several initiatives within a very large global enterprise like Roche, including pioneering new ways of working and developing applications to build the adoption of G Suite, help change mindsets and navigate a highly regulated environment while still keeping a great customer experience at the heart of it all. Monica passion for solving problems, natural ability to work with technical and business communities and in-depth knowledge of G Suite apps, has enabled her to identify opportunities for applying G Suite's power and its extensions as well as other Google Cloud Platform technologies to improve, 
              redesign and transform existing business solutions. Monica has a background in Mechanical Engineering, 
              </p>
              
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