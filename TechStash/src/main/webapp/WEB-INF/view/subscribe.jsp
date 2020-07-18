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

  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.3.3/leaflet.js"></script>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/leaflet/1.3.3/leaflet.css" rel="stylesheet" type="text/css" />

  <link rel="stylesheet" href="https://maps.locationiq.com/v2/libs/leaflet-geocoder/1.9.6/leaflet-geocoder-locationiq.min.css">
  <script src="https://maps.locationiq.com/v2/libs/leaflet-geocoder/1.9.6/leaflet-geocoder-locationiq.min.js"></script>

</head>

<body id="body">

  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>

<c:forEach var="tempMetaDetails" items="${subscribeSetting}">
	<input type="hidden" id="subscribe" name="subscribe" value="subscribe">
	<input type="hidden" id="metaTitleIndexSubscribe" value='${tempMetaDetails.metatitle}'/>
	<input type="hidden" id="metaDescriptionSubscribe" value='${tempMetaDetails.metadescription}'/>
	<input type="hidden" id="documentTitleIndexSubscribe" value='${tempMetaDetails.browsertitle}'/>
  </c:forEach>

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
<form:form class="text-center border border-light p-5 section-color" action="newsubscribe" modelAttribute="subscriber" method="POST" id="frmMain">

    <div class="col-lg-12 text-center">
        <h2 class="section-title">Join Us!</h2>
    </div>

    <form:input type="email" path="email" class="form-control mb-4" placeholder="E-mail" required="required"/>

    <form:input type="text" path="fullname" class="form-control mb-4" placeholder="Full Name" required="required" />
    
   <div class="col-lg-12 text-center">
        <label class="text-black">Enter your Location</label>
    </div>
    <div class="form-control" style="background-color:transparent!important">
    	<div id="map"></div>
    	<div id="search-box"></div>
    	<div id="result" style="color:transparent!important"></div>
    				<form:input path="location" type="hidden" id="location"/>
        			<form:input path="longitude" type="hidden" id="longitude"/>
                    <form:input path="latitude" type="hidden" id="latitude"/>
    </div>
    
    <div class="subscribe-alignment">
    
    <div class="d-flex justify-content-around">
        <div>
            <div class="checkbox-control custom-checkbox">
                <form:checkbox path="jobs" class="custom-control-input" value="Yes" id="subscribejobs"/>
                <label class="custom-control-label text-black" for="subscribejobs">Subscribe to Jobs</label>
            </div>
            
            <div class="checkbox-control custom-checkbox">
                <form:checkbox path="events" class="custom-control-input" value="Yes" id="subscribeevents"/>
                <label class="custom-control-label text-black" for="subscribeevents">Subscribe to events, hackthons, conference</label>
            </div>
            
            <div class="checkbox-control custom-checkbox">
                <form:checkbox path="podcast" class="custom-control-input" value="Yes" id="subscribepodcast"/>
                <label class="custom-control-label text-black" for="subscribepodcast">Subscribe to podcast </label>
            </div>
        </div>
    </div>
    </div>
	<button class="btn btn-outline-primary my-4" type="submit">Subscribe</button>
	</form:form>
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


<script>
  var frmMain = document.getElementById("frmMain");
  frmMain.onsubmit = function() {
    var requiredDiv = document.getElementById("result");
    if (requiredDiv.innerHTML.trim().length == 0) {
      alert("Please Enter your Location");
      return false;
    }
  };
</script>

<script type="text/javascript">


        // Initialize an empty map without layers (invisible map)
        var map = L.map('map', {
            center: [40.7259, -73.9805], // Map loads with this location as center
            zoom: 12,
            scrollWheelZoom: true,
            zoomControl: false,
            attributionControl: false,
        });
        
        //Geocoder options
        var geocoderControlOptions = {
            bounds: false,          //To not send viewbox
            markers: false,         //To not add markers when we geocoder
            attribution: null,      //No need of attribution since we are not using maps
            expanded: true,         //The geocoder search box will be initialized in expanded mode
            panToPoint: false,       //Since no maps, no need to pan the map to the geocoded-selected location
            params: {               //Set dedupe parameter to remove duplicate results from Autocomplete
                    dedupe: 1,
                }
        }

        //Initialize the geocoder
        var geocoderControl = new L.control.geocoder('pk.967b33e67b902f7de9a27aedc032417e', geocoderControlOptions).addTo(map).on('select', function (e) {
            displayLatLon(e.feature.feature.display_name, e.latlng.lat, e.latlng.lng);
        });

        //Get the "search-box" div
        var searchBoxControl = document.getElementById("search-box");
        //Get the geocoder container from the leaflet map
        var geocoderContainer = geocoderControl.getContainer();
        //Append the geocoder container to the "search-box" div
        searchBoxControl.appendChild(geocoderContainer);        

        //Displays the geocoding response in the "result" div
        function displayLatLon(display_name, lat, lng) {
            var resultString = "Lat: " + lat + " & Lon: " + lng;
            document.getElementById("result").innerHTML = resultString;
            
            document.getElementById("location").value = display_name;
            document.getElementById("latitude").value = lat;
            document.getElementById("longitude").value = lng;
            
        }
	
        </script>

</body>
</html>