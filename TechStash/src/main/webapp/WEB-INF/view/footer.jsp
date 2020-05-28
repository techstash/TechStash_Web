<style>

.clearbit-disable {
	display: none;
}

.clearbit-enable {
	display: block;
}

</style>

<footer class="bg-secondary pt-5">
  <section class="section border-bottom border-color">
    <div class="container">
      <div class="row justify-content-between">
        <div class="col-md-5 mb-4 mb-md-0">
          <img src="images/logo/logo.png" class="mb-4" alt="agico">
          <p class="text-light mb-4">Our mission is to create one stop solution for tech resources ranging from conferences, events, blogs, speaker community, podcasts and Weekly newsletter which is free-for-all.</p>
          <ul class="list-inline social-icons">
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="#" target="_blank"><i class="fa fa-youtube"></i></a></li>
            <li class="list-inline-item"><a href="#"><i class="fa fa-github"></i></a></li>
          </ul>
        </div>
        <div class="col-lg-4 col-md-3 col-sm-6 center-mobile footer-padding">
          <h4 class="text-white mb-4">Quick Links</h4>
          <ul class="list-hover-underline list-unstyled">
            <li class="mb-3 text-light"><a href="/about" class="text-light">About us</a></li>
            <li class="mb-3 text-light"><a href="/privacypolicy" class="text-light">Privacy Policy</a></li>
            <li class="mb-3 text-light"><a href="#" class="text-light">FAQs</a></li>
            
          </ul>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 center-mobile footer-padding">
          <h4 class="text-white mb-4">Contact</h4>
          <ul class="list-inline">
          <li class="list-inline-item"><i class="fa fa-envelope footer-icon"></i></li>
          <li class="list-inline-item"><a class="text-light" href="mailto:techstashinfo@gmail.com">techstashinfo@gmail.com</a></li>
          </ul>
        </div>
      </div>
    </div>
  </section>

  <section class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-lg-12  text-center mb-3 mb-md-0">
        <div id="copyright"></div>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-lg-12  text-center mb-3 mb-md-0">
          <p class="mb-0 text-light clearbit-logo clearbit-disable">
          <a href="https://clearbit.com" class="unique-color" target="_blank">Logos provided by Clearbit</a>
           </p> 
        </div>
      </div>
    </div>
  </section>
</footer>

<script type="text/javascript">
  var CurrentYear = new Date().getFullYear()  
  var copyright = document.getElementById("copyright");
  copyright.innerHTML = "<p class='mb-0 text-light'>Copyright &copy;"+CurrentYear+", made with <span class='copyright-color'> <i class='fa fa-heart' style='color:red'></i></span> by <a href='https://twitter.com/techstashin' target='_blank'><strong class='unique-color'>TechStash.</strong></a> All Rights Reserved.</p>";

  $(document).ready(function() {
		var pathname = window.location.pathname;
		
		if(pathname == "/jobs")
			{
		 		$(".clearbit-logo").removeClass("clearbit-disable");
		 		$(".clearbit-logo").addClass("clearbit-enable");
			}
	})
</script>