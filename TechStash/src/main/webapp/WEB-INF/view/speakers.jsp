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

  <c:forEach var="tempMetaDetails" items="${speakerSetting}">
	<input type="hidden" id="speakers" name="speakers" value="speakers">
	<input type="hidden" id="metaTitleIndexSpeaker" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionSpeaker" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexSpeaker" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

<jsp:include page="header_nontransparent.jsp"/> 

<section class="page-alignment-speakers bg-cover overflow-hidden">
	<div id="map" class="map-height-width"></div>  
</section>


<section class="section-grid section-lg-bottom section-color">
      <div class="col-lg-12 text-center">
        <h2 class="section-title" data-aos="fade-up" data-aos-delay="100">Speakers Directory</h2>
    </div>
  <div class="container">
    <div class="row">
      <c:forEach var="tempSpeaker" items="${speakersContent}">
          <div class="col-lg-4 col-sm-6 mb-4 grid-margin">
            <div class="card border-0 shadow rounded-lg">
            <br>
              <img src="data:image/jpg;base64,${tempSpeaker.encodedImage}" onerror="this.src='images/placehoder.jpg'" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">
              <div class="text-center">
              <br>
                <h5><a class="title-color" href="${tempSpeaker.link}" target="_blank">${tempSpeaker.name}</a></h5>
                <p class="speakers-city-alignment">${tempSpeaker.location}</p>
                <p class="speakers-lineheight"><span class="speakers-category-alignment">Category</span></p>
                <p class="text-black">${tempSpeaker.category}</p>
              </div>
            </div>
          </div>
        </c:forEach>
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
<script src="https://unpkg.com/leaflet@1.3.1/dist/leaflet.js" integrity="sha512-/Nsx9X4HebavoBvEBuyp3I7od5tA0UzAxs+j83KgC8PU0kgB4XiK4Lfe4y4cgBtaRJQEIFCW+oC506aPT2L1zw==" crossorigin=""></script>
<script src="https://maximeh.github.io/leaflet.bouncemarker/bouncemarker.js"></script>
<script src="https://unpkg.com/leaflet-gesture-handling"></script>
   <script>
   
   var template = '<br">\
	   <img src="images/speakers/speaker-1.jpg" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">\
	   <div class="text-center">\
	   <br>\
	   <h5><a class="title-color" href="#">Speaker Name</a></h5>\
	   <p class="popup-city-alignment">Delhi</p>\
	   <p class="popup-category-alignment"><span class="speakers-category-alignment">Category</span></p>\
	   <p class="text-black">Google Cloud Platform</p>\
	   </div>';
   
   
   var Icon = new L.Icon({
	   iconUrl: 'images/marker/marker.png',
	   shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
	   iconSize: [25, 41],
	   iconAnchor: [12, 41],
	   popupAnchor: [1, -34],
	   shadowSize: [41, 41]
	 });
   
   var map = L.map('map', {
       center: [21.0000, 78.0000],
       zoom: 4,
       gestureHandling: true
   });
   
   L.tileLayer('https://{s}.tile.osm.org/{z}/{x}/{y}.png', {
     attribution: '&copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors'
   }).addTo(map);
   
   <c:forEach items="${speakersContent}" var="tempSpeaker">
   
   var id${tempSpeaker.id} = '<br">\
	   <img src="data:image/jpg;base64,${tempSpeaker.encodedImage}" class="card-img-top rounded-top-lg img-alignment img-circle" alt="post-thumb">\
	   <div class="text-center">\
	   <br>\
	   <h5><a class="title-color" href="${tempSpeaker.link}">${tempSpeaker.name}</a></h5>\
	   <p class="popup-city-alignment">${tempSpeaker.location}</p>\
	   <p class="popup-category-alignment"><span class="speakers-category-alignment">Category</span></p>\
	   <p class="text-black">${tempSpeaker.category}</p>\
	   </div>';
   
   var popup = new L.Marker([${tempSpeaker.latitude}, ${tempSpeaker.longitude}], {bounceOnAdd: true,icon: Icon}).addTo(map).bindPopup(id${tempSpeaker.id});
   
   </c:forEach>
   
   //popup.openPopup();
   
   </script>  

</body>
</html>