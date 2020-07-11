<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <c:forEach var="tempFooter" items="${footerContent}">
        <div class="col-md-5 mb-4 mb-md-0">
          <img src="data:image/jpg;base64,${tempFooter.encodedImage}" class="mb-4" alt="agico">
          <p class="text-light mb-4">${tempFooter.footer_text}</p>
          <ul class="list-inline social-icons">
            <li class="list-inline-item"><a href="${tempFooter.facebook_url}" target="_blank"><i class="fa fa-facebook"></i></a></li>
            <li class="list-inline-item"><a href="${tempFooter.twitter_url}" target="_blank"><i class="fa fa-twitter"></i></a></li>
            <li class="list-inline-item"><a href="${tempFooter.youtube_url}" target="_blank"><i class="fa fa-youtube"></i></a></li>
            <li class="list-inline-item"><a href="${tempFooter.linkedin_url}"><i class="fa fa-github"></i></a></li>
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
        </c:forEach>
      </div>
    </div>
  </section>
 </

  <section class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-lg-12  text-center mb-3 mb-md-0">
        <div id="copyright"></div>
        </div>
      </div>
    </div>
  </section>
</footer>

<script type="text/javascript">
  var CurrentYear = new Date().getFullYear()  
  var copyright = document.getElementById("copyright");
  copyright.innerHTML = "<p class='mb-0 text-light'>Copyright &copy;"+CurrentYear+", made with <span class='copyright-color'> <i class='fa fa-heart' style='color:red'></i></span> by <a href='https://twitter.com/techstashin' target='_blank'><strong class='unique-color'>TechStash.</strong></a> All Rights Reserved.</p>";
</script>