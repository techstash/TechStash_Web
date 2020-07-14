(function ($) {
	
	$(window).on('load', function () {
		
		$('head').append('<meta charset="utf-8">');
		$('head').append('<meta name="language" content="en" />');
		$('head').append('<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />');
		$('head').append('<meta name="copyright" content="TechStash" />');
		$('head').append('<meta name="company" content="TechStash" />');
		
		var metaTitleIndex = $('#metaTitleIndex').val();
		var metaDescriptionIndex = $('#metaDescriptionIndex').val();
		var documentTitleIndex = $('#documentTitleIndex').val();
		
		var metaTitleIndexConference = $('#metaTitleIndexConference').val();
		var metaDescriptionConference = $('#metaDescriptionConference').val();
		var documentTitleIndexConference = $('#documentTitleIndexConference').val();
		
		var metaTitleIndexJob = $('#metaTitleIndexJob').val();
		var metaDescriptionJob = $('#metaDescriptionJob').val();
		var documentTitleIndexJob = $('#documentTitleIndexJob').val();
		
		var metaTitleIndexSpeaker = $('#metaTitleIndexSpeaker').val();
		var metaDescriptionSpeaker = $('#metaDescriptionSpeaker').val();
		var documentTitleIndexSpeaker = $('#documentTitleIndexSpeaker').val();
		
		var metaTitleIndexBlogs = $('#metaTitleIndexBlogs').val();
		var metaDescriptionBlogs = $('#metaDescriptionBlogs').val();
		var documentTitleIndexBlogs = $('#documentTitleIndexBlogs').val();
		
		var metaTitleIndexPodcast = $('#metaTitleIndexPodcast').val();
		var metaDescriptionPodcast = $('#metaDescriptionPodcast').val();
		var documentTitleIndexPodcast = $('#documentTitleIndexPodcast').val();
		
		var metaTitleIndexCommunity = $('#metaTitleIndexCommunity').val();
		var metaDescriptionCommunity = $('#metaDescriptionCommunity').val();
		var documentTitleIndexCommunity = $('#documentTitleIndexCommunity').val();
		
		var metaTitleIndexResource = $('#metaTitleIndexResource').val();
		var metaDescriptionResource = $('#metaDescriptionResource').val();
		var documentTitleIndexResource = $('#documentTitleIndexResource').val();
		
		var metaTitleIndexVolunteer = $('#metaTitleIndexVolunteer').val();
		var metaDescriptionVolunteer = $('#metaDescriptionVolunteer').val();
		var documentTitleIndexVolunteer = $('#documentTitleIndexVolunteer').val();
		
		var metaTitleIndexSubscribe = $('#metaTitleIndexSubscribe').val();
		var metaDescriptionSubscribe = $('#metaDescriptionSubscribe').val();
		var documentTitleIndexSubscribe = $('#documentTitleIndexSubscribe').val();
		
		var metaTitleIndexContactus = $('#metaTitleIndexContactus').val();
		var metaDescriptionContactus = $('#metaDescriptionContactus').val();
		var documentTitleIndexContactus = $('#documentTitleIndexContactus').val();
		
		var metaTitleIndexAboutus = $('#metaTitleIndexAboutus').val();
		var metaDescriptionAboutus = $('#metaDescriptionAboutus').val();
		var documentTitleIndexAboutus = $('#documentTitleIndexAboutus').val();
		
		var metaTitleIndexPrivacy = $('#metaTitleIndexPrivacy').val();
		var metaDescriptionPrivacy = $('#metaDescriptionPrivacy').val();
		var documentTitleIndexPrivacy = $('#documentTitleIndexPrivacy').val();
		
		var metaTitlePostConference = $('#metaTitlePostConference').val();
		var metaDescriptionPostConference = $('#metaDescriptionPostConference').val();
		var documentTitlePostConference = $('#documentTitlePostConference').val();
		
		var metaTitlePostJob = $('#metaTitlePostJob').val();
		var metaDescriptionPostJob = $('#metaDescriptionPostJob').val();
		var documentTitlePostJob = $('#documentTitlePostJob').val();
		
		var metaTitlePostBlog = $('#metaTitlePostBlog').val();
		var metaDescriptionPostBlog = $('#metaDescriptionPostBlog').val();
		var documentTitlePostBlog = $('#documentTitlePostBlog').val();
		
		var index=$("#index").val();
		var conference=$("#conference").val();
		var jobs=$("#jobs").val();
		var blogs=$("#blogs").val();
		var community=$("#community").val();
		var resources=$("#resources").val();
		var speakers=$("#speakers").val();
		var podcast=$("#podcast").val();
		var subscribe=$("#subscribe").val();
		var volunteer=$("#volunteer").val();
		var postblog=$("#postblog").val();
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
			$('head').append('<meta name="title" content="'+metaTitleIndexConference+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionConference+'" />');
			document.title = documentTitleIndexConference;
		}
		
		if(jobs == 'jobs'){
			$('head').append('<meta name="title" content="'+metaTitleIndexJob+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionJob+'" />');
			document.title = documentTitleIndexJob;
		}
		
		if(blogs == 'blogs'){
			$('head').append('<meta name="title" content="'+metaTitleIndexBlogs+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionBlogs+'" />');
			document.title = documentTitleIndexBlogs;
		}
		
		if(community == 'community'){
			$('head').append('<meta name="title" content="'+metaTitleIndexCommunity+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionCommunity+'" />');
			document.title = documentTitleIndexCommunity;
		}
		
		if(resources == 'resources'){
			$('head').append('<meta name="title" content="'+metaTitleIndexResource+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionResource+'" />');
			document.title = documentTitleIndexResource;
		}
		
		if(speakers == 'speakers'){
			$('head').append('<meta name="title" content="'+metaTitleIndexSpeaker+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionSpeaker+'" />');
			document.title = documentTitleIndexSpeaker;
		}
		
		if(podcast == 'podcast'){
			$('head').append('<meta name="title" content="'+metaTitleIndexPodcast+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionPodcast+'" />');
			document.title = documentTitleIndexPodcast;
		}
		
		if(subscribe == 'subscribe'){
			$('head').append('<meta name="title" content="'+metaTitleIndexSubscribe+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionSubscribe+'" />');
			document.title = documentTitleIndexSubscribe;
		}
		
		if(volunteer == 'volunteer'){
			$('head').append('<meta name="title" content="'+metaTitleIndexVolunteer+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionVolunteer+'" />');
			document.title = documentTitleIndexVolunteer;
		}
		
		if(postblog == 'postblog'){
			$('head').append('<meta name="title" content="'+metaTitlePostBlog+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionPostBlog+'" />');
			document.title = documentTitlePostBlog;
		}
		
		if(postjob == 'postjob'){
			$('head').append('<meta name="title" content="'+metaTitlePostJob+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionPostJob+'" />');
			document.title = documentTitlePostJob;
		}
		
		if(postconference == 'postconference'){
			$('head').append('<meta name="title" content="'+metaTitlePostConference+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionPostConference+'" />');
			document.title = documentTitlePostConference;
		}
		
		if(contactus == 'contactus'){
			$('head').append('<meta name="title" content="'+metaTitleIndexContactus+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionContactus+'" />');
			document.title = documentTitleIndexContactus;
		}
		
		if(aboutus == 'aboutus'){
			$('head').append('<meta name="title" content="'+metaTitleIndexAboutus+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionAboutus+'" />');
			document.title = documentTitleIndexAboutus;
		}
		
		if(privacy == 'privacy'){
			$('head').append('<meta name="title" content="'+metaTitleIndexPrivacy+'" />');
			$('head').append('<meta name="description" content="'+metaDescriptionPrivacy+'" />');
			document.title = documentTitleIndexPrivacy;
		}
		
		if(error == 'error'){
			$('head').append('<meta name="title" content="TechStash - One stop for tech resources|TechStash" />');
			$('head').append('<meta name="description" content="One stop point for tech resources from events, conferences, blogs, jobs, communicty, podcast" />');
		 	document.title = 'TechStash Error';
		}
		
	  });
	
})(jQuery);