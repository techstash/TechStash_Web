<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link href="css/main.css" rel="stylesheet">

	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="icon" href="images/favicon.ico" type="image/x-icon">

</head>


<body>
  <div class="preloader">
    <img src="images/preloader.gif" alt="preloader" class="img-fluid">
  </div>
  
<input type="hidden" id="postblog" name="postblog" value="postblog">

<jsp:include page="header_nontransparent.jsp"/>  

<section class="page-alignment-speakers bg-cover section-lg-bottom overflow-hidden section-color">
<div class="page-wrapper p-t-100 p-b-50">
        <div class="wrapper wrapper--w900">
            <div class="card-form card-6">
                <div class="col-lg-12 text-center">
        <h2 class="section-title">Submit Blog</h2>
    			</div>
                <div class="card-body card border-0 shadow rounded-lg">
                    <form method="POST">
                        <div class="form-row">
                            <div class="name">Name <span class="required-color"> * </span></div>
                            <div class="value">
                                <input class="input--style-6" type="text" name="name" placeholder="" required>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Topics <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="topics" placeholder="" required>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Description <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="description" placeholder="" required></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Image <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group js-input-file">
                                    <input class="input-file" type="file" name="file_cv" id="file">
                                    <label class="label--file" for="file">Choose file</label>
                                    <span class="input-file__info">No file chosen</span>
                                </div>
                                <div class="label--desc">Upload the image. Max file size 3 MB</div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Category <span class="required-color"> * </span></div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-6" type="text" name="category" placeholder="" required>
                                </div>
                            </div>
                        </div>
                        <div class="card-footer col-lg-12  text-center">
                    <button class="btn btn-outline-primary" type="submit" >Submit</button>
                    </div>
                
                    </form>
                    
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

<jsp:include page="footer.jsp"/>>  

<script src="plugins/jQuery/jquery.min.js"></script>

<script src="plugins/bootstrap/bootstrap.min.js"></script>

<script src="plugins/slick/slick.min.js"></script>

<script src="plugins/venobox/venobox.min.js"></script>

<script src="plugins/aos/aos.js"></script>

<script src="https://www.google.com/recaptcha/api.js" async defer></script>

<script src="js/master.js"></script>

<script type='text/javascript' src='https://platform-api.sharethis.com/js/sharethis.js#property=5ea458c39ad3eb0012e1642f&product=sticky-share-buttons&cms=website' async='async'></script>

<script src="js/form.js"></script>

<script src="https://www.google.com/recaptcha/api.js?render=6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ"></script>
<script>
grecaptcha.ready(function() {
    grecaptcha.execute('6LdSVvEUAAAAAEz4LL4fwEhjb5TxLBh7hnuJ4FXJ', {action: 'homepage'}).then(function(token) {
    });
});
</script>

</body>

</html>