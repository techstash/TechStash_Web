<div class="naviagtion fixed-top transition" id="topheader">
  <div class="container">
    <nav class="navbar navbar-expand-lg navbar-dark p-0">
      <a class="navbar-brand p-0" href="/"><img src="images/logo/logo.png" alt="TechStashLogo"></a>
      <button class="navbar-toggler third-button" type="button" data-toggle="collapse" data-target="#navbarSupportedContent20"
    aria-controls="navbarSupportedContent20" aria-expanded="false" aria-label="Toggle navigation">
    <div class="animated-icon3"><span></span><span></span><span></span></div>
  </button>

      <div class="collapse navbar-collapse text-center" id="navbarSupportedContent20">
       <ul class="nav navbar-nav mx-auto">
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/conference">Conference</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/jobs">Jobs</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/volunteer">Volunteer</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/blogs">Blog</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white text-capitalize" href="/contact">Contact</a>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</div>  
<script src="plugins/jQuery/jquery.min.js"></script>

<script>

$(document).ready(function() {
	// get current URL path and assign 'active' class
	var pathname = window.location.pathname;
	$('.nav > li > a[href="'+pathname+'"]').parent().addClass('active');
	
})

</script>