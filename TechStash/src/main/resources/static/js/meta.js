(function ($) {
	
	$(window).on('load', function () {
		
		var metaTitleIndex = $('#metaTitleIndex').val();
		var metaDescriptionIndex = $('#metaDescriptionIndex').val();
		var documentTitleIndex = $('#documentTitleIndex').val();
		$('head').append('<meta charset="utf-8">');
		$('head').append('<meta name="language" content="en" />');
		$('head').append('<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />');
		$('head').append('<meta name="copyright" content="TechStash" />');
		$('head').append('<meta name="company" content="TechStash" />');

		var index=$("#index").val();
		var conference=$("#conference").val();
		var jobs=$("#jobs").val();
		var blogs=$("#blogs").val();
		var community=$("#community").val();
		var resources=$("#resources").val();
		var speakers=$("#speakers").val();
		var podcast=$("#podcast").val();
		var subscribe=$("#subscribe").val();
		var blogdetails=$("#blogdetails").val();
		var speakerdetails=$("#speakerdetails").val();
		var volunteer=$("#volunteer").val();
		var postblog=$("#post_blog").val();
		var postjob=$("#postjob").val();
		var postconference=$("#postconference").val();
		var contactus=$("#contactus").val();
		var aboutus=$("#aboutus").val();
		var privacy=$("#privacy").val();
		var error=$("#error").val();
		

		if(index == 'index'){
			$('head').append('<meta name="title" content="'+metaTitleIndex+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionIndex+'" />');
			document.title = documentTitleIndex;
		}
		
		if(conference == 'conference'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
			document.title = 'TechStash Conference';
		}
		
		if(jobs == 'jobs'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Jobs';
		}
		
		if(blogs == 'blogs'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Blogs';
		}
		
		if(community == 'community'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Community';
		}
		
		if(resources == 'resources'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Resources';
		}
		
		if(speakers == 'speakers'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Speakers';
		}
		
		if(podcast == 'podcast'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Podcast';
		}
		
		if(subscribe == 'subscribe'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Subscribe';
		}
		
		if(blogdetails == 'blogdetails'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Blog Details'; 
		}
		
		if(speakerdetails == 'speakerdetails'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Speaker Details';
		}
		
		if(volunteer == 'volunteer'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Volunteer';
		}
		
		if(postblog == 'postblog'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Post Blog';
		}
		
		if(postjob == 'postjob'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Post Job';
		}
		
		if(postconference == 'postconference'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Post Conference';
		}
		
		if(contactus == 'contactus'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Contactus';
		}
		
		if(aboutus == 'aboutus'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash About';
		}
		
		if(privacy == 'privacy'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Privacy Policy';
		}
		
		if(error == 'error'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Error';
		}
		
	  });
	
})(jQuery);