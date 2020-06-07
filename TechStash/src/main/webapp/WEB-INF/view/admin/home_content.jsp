<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  
  <title>TechStash Home Content</title>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="/admin/plugins/fontawesome-free/css/all.min.css">
  
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  
  <link rel="stylesheet" href="/admin/css/index.css">
  
  <link rel="stylesheet" href="/admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  
  <link rel="stylesheet" href="/admin/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
  
  <link rel="stylesheet" href="/admin/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
   
  <link rel="stylesheet" href="/admin/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
  
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  
  <link rel="shortcut icon" href="/images/favicon.ico" type="image/x-icon">
  <link rel="icon" href="/images/favicon.ico" type="image/x-icon">
  
</head>
<body class="hold-transition sidebar-mini layout-fixed">

<div class="wrapper">
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
    </ul>

    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" id="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link"  href="logout" role="button">
          <i class="fas fa-sign-out-alt"></i>
        </a>
      </li>
    </ul>
  </nav>

  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index" class="brand-link">
      <img src="/images/logo/logo.png"
           alt="TechStash"
           class="brand-image elevation-3"
           style="opacity: .8">
      <span class="brand-text">TechStash</span>
    </a>

    <div class="sidebar">
      <!-- Sidebar user (optional) -->
     <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
        <img src="data:image/jpg;base64,${image}" class="elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="profile" class="d-block">Welcome ${name}</a>
        </div>
      </div>

    <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" id="table" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview">
            <a href="index" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Dashboard
              </p>
            </a>
          </li>
          <li class="nav-item has-treeview menu-open">
            <a href="#" class="nav-link active">
              <i class="nav-icon fas fa-home"></i>
              <p>
                Home
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="home_setting" class="nav-link">
                  <i class="fa fa-cogs nav-icon"></i>
                  <p>Home Setting</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="home_content" class="nav-link active">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Home Content</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-file"></i>
              <p>
                Pages
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-handshake"></i>
              <p>
                Conferences
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="conference_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Conference Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="conference_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Conference Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-briefcase"></i>
              <p>
                Jobs
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="jobs_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Job Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="jobs_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Job Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-microphone"></i>
              <p>
                Speakers
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="speakers_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Speaker Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="speakers_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Speaker Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-newspaper"></i>
              <p>
                Blogs
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="blog_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Blog Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="blog_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Blog Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-podcast"></i>
              <p>
                Podcasts
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="podcast_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Podcast Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="podcast_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Podcast Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-users"></i>
              <p>
                Communities
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="community_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Community Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="community_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Community Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-book"></i>
              <p>
                Resources
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="resource_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Resource Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="resource_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Resource Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-fist-raised"></i>
              <p>
                Volunteer
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="volunteer_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Volunteer Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="volunteer_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Volunteer Content</p>
                </a>
              </li>
              <c:choose>
				<c:when test="${designation=='Founder/CEO/Admin'}">
              <li class="nav-item">
                <a href="volunteer_details" class="nav-link">
                  <i class="fas fa-info-circle nav-icon"></i>
                  <p>Volunteer Details</p>
                </a>
              </li>
              </c:when>
			</c:choose>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user-tie"></i>
              <p>
                Subscriber
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="subscribe_list" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Subscribe List</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="subscribe_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>Subscribe Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="unsubscribe_list" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Unsubscribe List</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-id-card"></i>
              <p>
                ContactUS
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="contactus_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>ContactUs Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="contactus_response" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>ContactUs responses</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user"></i>
              <p>
                About Us
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="aboutus_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>AboutUs Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="aboutus_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>AboutUs Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-lock"></i>
              <p>
                PrivacyPolicy
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="privacypolicy_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>PrivacyPolicy Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="privacypolicy_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>PrivacayPolicy Content</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="#" class="nav-link">
              <i class="nav-icon fas fa-question-circle"></i>
              <p>
                FAQ
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="faq_setting" class="nav-link">
                  <i class="fas fa-cogs nav-icon"></i>
                  <p>FAQ Settings</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="faq_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>FAQ Contents</p>
                </a>
              </li>
             </ul>
            </li>
            </ul>
            <ul class="nav nav-treeview">
              <li class="nav-item ">
                <a href="footer" class="nav-link">
              <i class="nav-icon fas fa-copyright"></i>
              <p>
                Footer
              </p>
            </a>
            </li>
            </ul>
          </li>
          	<c:choose>
    		<c:when test="${designation=='Founder/CEO/Admin'}">
          	<li class="nav-item">
            	<a href="organizer" class="nav-link">
              	<i class="nav-icon fas fa-users"></i>
              		<p>
                		Organizer
              		</p>
            	</a>
          	</li>
          	</c:when>
          </c:choose>
          <c:choose>
    		<c:when test="${designation=='Founder/CEO/Admin'}">
          	<li class="nav-item">
            	<a href="pricing_details" class="nav-link">
              	<i class="nav-icon fas fa-rupee-sign"></i>
              		<p>
                		Pricing Plan
              		</p>
            	</a>
          	</li>
          	</c:when>
          </c:choose>
          <c:choose>
    		<c:when test="${designation=='Founder/CEO/Admin'}">
          	<li class="nav-item">
            	<a href="keys" class="nav-link">
              	<i class="nav-icon fas fa-key"></i>
              		<p>
                		Keys
              		</p>
            	</a>
          	</li>
          	</c:when>
          </c:choose>
          	<li class="nav-item">
            	<a href="logout" class="nav-link">
              	<i class="nav-icon fas fa-sign-out-alt"></i>
              		<p>
                		Logout
              		</p>
            	</a>
          	</li>
        </ul>
      </nav>
    </div>
  </aside>

  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Home Content</h1>
          </div>
        </div>
      </div>
    </section>
	
    <section class="content">
    <form:form action="bannerupdate" modelAttribute="banner" method="POST" enctype="multipart/form-data">
    <form:hidden path="id" />
      <div class="card">
          <div class="card-header">
            	<h4>Banner</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Banner Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                      <input type="file" name="photo" class="custom-file-input" id="bannerImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <input type="hidden" name="photo" />
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBannerImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Banner Title
                  </div>
                  <div class="col-6">
                   <form:input path="title" type="text" id="bannerTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBannerTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Banner Subtitle
                  </div>
                  <div class="col-6">
                    <form:textarea path="subtitle" class="form-control" id="bannerSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBannerSubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="conferencesectionupdate" modelAttribute="conferencesection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Conference</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Conference Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                        <input type="file" name="photo" class="custom-file-input" id="conferenceImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editConferenceImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Conference Title
                  </div>
                  <div class="col-6">
                    <form:input path="title" type="text" id="conferenceTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editConferenceTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Conference Subtitle
                  </div>
                  <div class="col-6">
                     <form:textarea path="subtitle" class="form-control" id="conferenceSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editConferenceSubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                      <form:input path="buttontextleft" type="text" id="conferenceButtonLeft" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editConferenceButtonLeft" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                      <form:input path="buttontextright" type="text" id="conferenceButtonRight" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editConferenceButtonRight" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
     <form:form action="jobsectionupdate" modelAttribute="jobsection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Jobs</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Jobs Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="jobImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editJobImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Jobs Title
                  </div>
                  <div class="col-6">
                    <form:input path="title" type="text" id="jobTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editJobTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Jobs Subtitle
                  </div>
                  <div class="col-6">
                    <form:textarea path="subtitle" class="form-control" id="jobSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editSubTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontextleft" type="text" id="jobButtonLeft" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editButtonLeft" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                   <form:input path="buttontextright" type="text" id="jobButtonRight" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editButtonRight" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="speakersectionupdate" modelAttribute="speakersection" method="POST">
      <div class="card">
          <div class="card-header">
            	<h4>Speaker</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Speaker Title
                  </div>
                  <div class="col-6">
                    <form:input path="title" type="text" id="spakerTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editSpeakerTtile" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontext" type="text" id="speakerButton" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editSpeakerButton" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="blogsectionupdate" modelAttribute="blogsection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Blog</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Blog Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="blogImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBlogImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Blog Title
                  </div>
                  <div class="col-6">
                   <form:input path="title" type="text" id="blogTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBlogTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Blog Subtitle
                  </div>
                  <div class="col-6">
                    <form:textarea path="subtitle" class="form-control" id="blogSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editBlogSubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                   <form:input path="buttontextleft" type="text" id="blogbuttonleft" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editblogleft" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontextright" type="text" id="blogbuttonright" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editblogright" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="podcastsectionupdate" modelAttribute="podcastsection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Podcast</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Podcast Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="podcastImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editPodcastImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Podcast Title
                  </div>
                  <div class="col-6">
                    <form:input path="title" type="text" id="podcastTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editPodcastTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Podcast Subtitle
                  </div>
                  <div class="col-6">
                   <form:textarea path="subtitle" class="form-control" id="podcastSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editPodcastSubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontext" type="text" id="buttonTextPodcast" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editButonPodcast" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="communitysectionupdate" modelAttribute="communitysection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Community</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Community Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="communityImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editCommunityImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Community Title
                  </div>
                  <div class="col-6">
                   <form:input path="title" type="text" id="communityTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editCommunityTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Community Subtitle
                  </div>
                  <div class="col-6">
                    <form:textarea path="subtitle" class="form-control" id="communitySubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editcommunitySubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontextleft" type="text" id="CommunityLeft" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editCommunityLeft" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontextright" type="text" id="CommunityRight" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editCommunityRight" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="resourcesectionupdate" modelAttribute="resourcesection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Resources</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Resource Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="resourceImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editResourceImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Resource Title
                  </div>
                  <div class="col-6">
                   <form:input path="title" type="text" id="resourceTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editResourceTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Resource Subtitle
                  </div>
                  <div class="col-6">
                    <form:textarea path="subtitle" class="form-control" id="resourceSubtitle" rows="3" readonly="true"></form:textarea>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editResourceSubtitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Button Text
                  </div>
                  <div class="col-6">
                    <form:input path="buttontext" type="text" id="resourceButton" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editResourceButton" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
    </section>
    <br>
    <section class="content">
    <form:form action="newslettersectionupdate" modelAttribute="newslettersection" method="POST" enctype="multipart/form-data">
      <div class="card">
          <div class="card-header">
            	<h4>Subscribe Newsletter</h4>
          </div>
              <div class="card-body">
              <div class="row">
                  <div class="col-3">
                    Newsletter Title
                  </div>
                  <div class="col-6">
                   <form:input path="title" type="text" id="newsletterTitle" class="form-control" readonly="true"/>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editNewsletterTitle" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Newsletter Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                         <input type="file" name="photo" class="custom-file-input" id="newsletterImage" accept=".png, .jpg, .jpeg" size="200" disabled/>
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm editNewsletterImage" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Visible/Not Visible
                  </div>
                  <div class="col-6">
                    <div class="form-check">
                          <form:checkbox path="status" class="form-check-input"/>
                        </div>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="submit" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
      </form:form>
      <br>
    </section> 
  </div>

  <aside class="control-sidebar control-sidebar-dark">
  </aside>
  
 <footer class="main-footer">
    <strong>Copyright &copy;  <script>
              var CurrentYear = new Date().getFullYear()
              document.write(CurrentYear +',')
            </script> made with  <i class="fa fa-heart" style="color:red">
                              </i>  by<a href="https://techstash.in" target='_blank'>TechStash.</a></strong>
    All Rights Reserved.
  </footer>
</div>

<script src="/admin/plugins/jquery/jquery.min.js"></script>

<script src="/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

<script src="/admin/js/index.js"></script>

<script src="/admin/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>

<script src="/admin/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>

<script type="text/javascript">
$(function(){
	
	// banner	
    $(".editBannerImage").click(function(){
    	$("#bannerImage").prop("disabled",false);
    	return false;
    });
    $(".editBannerTitle").click(function(){
    	$("#bannerTitle").prop("readonly",false);
    	return false;
    });
    $(".editBannerSubtitle").click(function(){
    	$("#bannerSubtitle").prop("readonly",false);
    	return false;
    });
    
    // conference
    $(".editConferenceImage").click(function(){
    	$("#conferenceImage").prop("disabled",false);
    	return false;
    });
    
    $(".editConferenceTitle").click(function(){
    	$("#conferenceTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editConferenceSubtitle").click(function(){
    	$("#conferenceSubtitle").prop("readonly",false);
    	return false;
    });
    
    $(".editConferenceButtonLeft").click(function(){
    	$("#conferenceButtonLeft").prop("readonly",false);
    	return false;
    });
    
    $(".editConferenceButtonRight").click(function(){
    	$("#conferenceButtonRight").prop("readonly",false);
    	return false;
    });
    
    //jobs
    
    $(".editJobImage").click(function(){
    	$("#jobImage").prop("disabled",false);
    	return false;
    });
    
    $(".editJobTitle").click(function(){
    	$("#jobTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editSubTitle").click(function(){
    	$("#jobSubtitle").prop("readonly",false);
    	return false;
    });
    
    $(".editButtonLeft").click(function(){
    	$("#jobButtonLeft").prop("readonly",false);
    	return false;
    });
    
    $(".editButtonRight").click(function(){
    	$("#jobButtonRight").prop("readonly",false);
    	return false;
    });
    
    // speakers
    
    $(".editSpeakerTtile").click(function(){
    	$("#spakerTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editSpeakerButton").click(function(){
    	$("#speakerButton").prop("readonly",false);
    	return false;
    });
    
    // blog
    
    $(".editBlogImage").click(function(){
    	$("#blogImage").prop("disabled",false);
    	return false;
    });
    
    $(".editBlogTitle").click(function(){
    	$("#blogTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editBlogSubtitle").click(function(){
    	$("#blogSubtitle").prop("readonly",false);
    	return false;
    });
    
    $(".editblogleft").click(function(){
    	$("#blogbuttonleft").prop("readonly",false);
    	return false;
    });
    
    $(".editblogright").click(function(){
    	$("#blogbuttonright").prop("readonly",false);
    	return false;
    });
    
    // podcast
    
    $(".editPodcastImage").click(function(){
    	$("#podcastImage").prop("disabled",false);
    	return false;
    });
    
    $(".editPodcastTitle").click(function(){
    	$("#podcastTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editPodcastSubtitle").click(function(){
    	$("#podcastSubtitle").prop("readonly",false);
    	return false;
    });
    
    $(".editButonPodcast").click(function(){
    	$("#buttonTextPodcast").prop("readonly",false);
    	return false;
    });
    
    // community
    
    $(".editCommunityImage").click(function(){
    	$("#communityImage").prop("disabled",false);
    	return false;
    });
    
    $(".editCommunityTitle").click(function(){
    	$("#communityTitle").prop("readonly",false);
    	return false;
    });
    
    $(".editcommunitySubtitle").click(function(){
    	$("#communitySubtitle").prop("readonly",false);
    	return false;
    });
    
    $(".editCommunityLeft").click(function(){
    	$("#CommunityLeft").prop("readonly",false);
    	return false;
    });
    
    $(".editCommunityRight").click(function(){
    	$("#CommunityRight").prop("readonly",false);
    	return false;
    });
    	
   // resource
   
   $(".editResourceImage").click(function(){
    	$("#resourceImage").prop("disabled",false);
    	return false;
    });
   
   $(".editResourceTitle").click(function(){
   		$("#resourceTitle").prop("readonly",false);
   		return false;
   });
   
   $(".editResourceSubtitle").click(function(){
   		$("#resourceSubtitle").prop("readonly",false);
   		return false;
   });
   
   $(".editResourceButton").click(function(){
   		$("#resourceButton").prop("readonly",false);
   		return false;
   });
    
    // newsletter
    
    $(".editNewsletterImage").click(function(){
    	$("#newsletterImage").prop("disabled",false);
    	return false;
    });
    
    $(".editNewsletterTitle").click(function(){
    	$("#newsletterTitle").prop("readonly",false);
    	return false;
    });
    
    
})
</script>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

<script type='text/javascript'>

$( document ).ready(function() {
	
	var $rows = $('#table li');
	$('#search').keyup(function() {
		 $("li").addClass("menu-open");
	    var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase();
	    
	    $rows.show().filter(function() {
	        var text = $(this).text().replace(/\s+/g, ' ').toLowerCase();
	        return !~text.indexOf(val);
	    }).hide();
	});
	
});
</script>

</body>

</html>
