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
  
<input type="hidden" id="error" name="error" value="error">

<jsp:include page="header_nontransparent.jsp"/>

<section class="page-height-conference bg-cover overflow-hidden">
<div class="container">
        <div class="row">
        <div class="col-lg-3"></div>
            <div class="col-lg-6">
        <img src="images/error/error.svg" class="img-fluid">
      </div>
       <div class="col-lg-3"></div>
        </div>
    </div>
<div class="col-lg-12 text-center">
        <h2 class="section-title">Oops, looks like the page is lost.</h2>
        <h4>This is not a fault, just an accident that was not intentional.</h4>
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

<script src="js/master.js"></script>

</body>
</html>