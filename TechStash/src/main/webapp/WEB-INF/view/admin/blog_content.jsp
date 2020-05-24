<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  
  <title>TechStash Blog Content</title>
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="/admin/plugins/fontawesome-free/css/all.min.css">
  
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  
  <link rel="stylesheet" href="/admin/css/index.css">
  
  <link rel="stylesheet" href="/admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  
  <link rel="stylesheet" href="/admin/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
   
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
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
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
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
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
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
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
                <a href="home_content" class="nav-link">
                  <i class="far fa-file-alt nav-icon"></i>
                  <p>Home Content</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item has-treeview menu-open">
            <a href="#" class="nav-link active">
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
                <a href="#" class="nav-link active">
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
                <a href="blog_content" class="nav-link active">
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
            <h1>Blog Content</h1>
          </div>
        </div>
      </div>
    </section>

<div class="modal fade" id="modal-default">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Add Blogs</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="card-body">
                <div class="row">
                  <div class="col-4">
                    Blog Title
                  </div>
                  <div class="col-8">
                    <input type="text" class="form-control" placeholder="">
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-4">
                    Blog Image
                  </div>
                  <div class="col-8">
                    <div class="input-group">
                      <div class="custom-file">
                        <input type="file" class="custom-file-input" id="exampleInputFile">
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-4">
                    Author
                  </div>
                  <div class="col-8">
                    <input type="text" class="form-control" placeholder="">
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-4">
                    Date
                  </div>
                  <div class="col-8">
                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
                        <input type="text" class="form-control datetimepicker-input" data-target="#reservationdate"/>
                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datetimepicker">
                            <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                        </div>
                    </div>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-4">
                    Blog Category
                  </div>
                  <div class="col-8">
                    <input type="text" class="form-control" placeholder="">
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-4">
                    Blog Description
                  </div>
                  <div class="col-8">
                    <div class="form-group">
                        <textarea class="form-control" rows="3" placeholder=""></textarea>
                      </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="modal-footer justify-content-between">
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              <button type="button" class="btn btn-primary">Save</button>
            </div>
          </div>
        </div>
      </div>
	
    <section class="content">
      <div class="card">
          <div class="card-header">
            	<h4>Header</h4>
          </div>
              <div class="card-body">
                <div class="row">
                  <div class="col-3">
                    Header Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                        <input type="file" class="custom-file-input" id="exampleInputFile">
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                          <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                              Delete
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Header title
                  </div>
                  <div class="col-6">
                    <input type="text" class="form-control" placeholder="">
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                          <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                              Delete
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Header subtitle
                  </div>
                  <div class="col-6">
                    <input type="text" class="form-control" placeholder="">
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                          <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                              Delete
                          </a>
                  </div>
                </div>
                <br>
                <div class="row">
                  <div class="col-3">
                    Background Image
                  </div>
                  <div class="col-6">
                    <div class="input-group">
                      <div class="custom-file">
                        <input type="file" class="custom-file-input" id="exampleInputFile">
                        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                      </div>
                    </div>
                  </div>
                  <div class="col-3">
                          <a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                              Edit
                          </a>
                          <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                              Delete
                          </a>
                  </div>
                </div>
              </div>
            </div>
      <div class="row">
      <div class="col-5"></div>
        <div class="col-2">
          <button type="button" class="btn btn-block btn-primary">Submit</button>
        </div>
      <div class="col-5"></div>
      </div>
    </section>
    <br>
    <section class="content">
      <div class="card">
              <div class="card-header">
              <div class="row">
                <div class="col-12">
                  <h4>
                    Blogs
                    <small class="float-right"><button type="button" class="btn btn-info float-right" data-toggle="modal" data-target="#modal-default">
                  Add Blogs
                </button></small>
                  </h4>
                </div>
              </div>
              </div>
              <div class="card-body">
                <table id="searchtable" class="table table-bordered table-striped">
                  <thead>
                  <tr>
                    <th>ID</th>
                    <th>Blog Title</th>
                    <th>Blog Image</th>
                    <th>Author</th>
                    <th>Date</th>
                    <th>Blog Category</th>
                    <th>Blog Description</th>
                    <th>Edit</th>
                    <th>Delete</th>
                    <th>Visible</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                 <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                 <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                 <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                 <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                  <tr>
                    <td>1</td>
                    <td>Blog Title</td>
                    <td><img src="images/blog/blog-post-2.jpg" width="100" height="72"></td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td>Technology</td>
                    <td>Few Contents Here</td>
                    <td><a class="btn btn-info btn-sm" href="#">
                              <i class="fas fa-pencil-alt">
                              </i>
                          </a></td>
                    <td> <a class="btn btn-danger btn-sm" href="#">
                              <i class="fas fa-trash">
                              </i>
                          </a></td>
                    <td><div class="form-check">
                          <input class="form-check-input" type="checkbox">
                        </div></td>
                  </tr>
                  </tbody>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
    </section>
  </div>

  <aside class="control-sidebar control-sidebar-dark">
  </aside>
  
  <footer class="main-footer">
    <strong>Copyright &copy;  <script>
              var CurrentYear = new Date().getFullYear()
              document.write(CurrentYear +',')
            </script> made with ❤ by<a href="https://techstash.in" target='_blank'>TechStash.</a></strong>
    All Rights Reserved.
  </footer>
</div>

<script src="/admin/plugins/jquery/jquery.min.js"></script>

<script src="/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

<script src="/admin/js/index.js"></script>

<script src="/admin/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>

<script src="/admin/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>

<script src="/admin/plugins/datatables/jquery.dataTables.min.js"></script>

<script src="/admin/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>

<link rel="stylesheet" href="/admin/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">

<script src="/admin/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>

<script src="/admin/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>

<script src="/admin/plugins/moment/moment.min.js"></script>

<script src="/admin/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>

<script>
  $(function () {
    $('#reservationdate').datetimepicker({
        format: 'L'
    });

  })
</script>

<script type="text/javascript">
$(document).ready(function () {
  bsCustomFileInput.init();
});
</script>

<script>
  $(function () {
    $("#searchtable").DataTable({
      "responsive": true,
      "autoWidth": false,
    });
  });
</script>

</body>

</html>
