package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Aboutus_setting;
import com.TechStash.entity.Blog_setting;
import com.TechStash.entity.Community_setting;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Faq_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Job_setting;
import com.TechStash.entity.Podcast_setting;
import com.TechStash.entity.Postblog_setting;
import com.TechStash.entity.Postconference_setting;
import com.TechStash.entity.Postjob_setting;
import com.TechStash.entity.Privacypolicy_setting;
import com.TechStash.entity.Resource_setting;
import com.TechStash.entity.Speaker_setting;
import com.TechStash.entity.Subscribe_setting;
import com.TechStash.entity.Volunteer_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class SettingController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@RequestMapping("/admin/admindashboard/conference_setting")
	public String ConferenceSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Conference_setting dbresult=settingService.conferenceContent();
				theModel.addAttribute("conference_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/conference_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/postconference_setting")
	public String postConferenceSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Postconference_setting dbresult=settingService.postConferenceContent();
				theModel.addAttribute("postconference_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/postconference_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/postjob_setting")
	public String postJobSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Postjob_setting dbresult=settingService.postJobContent();
				theModel.addAttribute("postjob_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/postjob_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/postblog_setting")
	public String postBlogSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Postblog_setting dbresult=settingService.postBlogContent();
				theModel.addAttribute("postblog_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/postblog_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/postblogsettingupdate")
	public String postBlogSettingUpdate(@ModelAttribute("postblog_setting") Postblog_setting postblog_setting,HttpServletRequest request) {
		settingService.postBlogSettingUpdate(postblog_setting.getMetatitle(), postblog_setting.getMetadescription(), postblog_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/postblog_setting";
			
	}
	
	@PostMapping("/admin/admindashboard/postjobsettingupdate")
	public String postJobSettingUpdate(@ModelAttribute("postjob_setting") Postjob_setting postjob_setting,HttpServletRequest request) {
		settingService.postJobSettingUpdate(postjob_setting.getMetatitle(), postjob_setting.getMetadescription(), postjob_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/postjob_setting";
			
	}
	
	@PostMapping("/admin/admindashboard/postconferencesettingupdate")
	public String postConferenceSettingUpdate(@ModelAttribute("postconference_setting") Postconference_setting postconference_setting,HttpServletRequest request) {
		settingService.postConferenceSettingUpdate(postconference_setting.getMetatitle(), postconference_setting.getMetadescription(), postconference_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/postconference_setting";
			
	}
	
	@PostMapping("/admin/admindashboard/conferencesettingupdate")
	public String ConferenceSettingUpdate(@ModelAttribute("conference_setting") Conference_setting conference_setting,HttpServletRequest request) {
		settingService.conferenceSettingUpdate(conference_setting.getMetatitle(), conference_setting.getMetadescription(), conference_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/conference_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/jobs_setting")
	public String JobsSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Job_setting dbresult=settingService.jobContent();
				theModel.addAttribute("job_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/jobs_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/jobsettingupdate")
	public String JobSettingUpdate(@ModelAttribute("job_setting") Job_setting job_setting,HttpServletRequest request) {
		settingService.jobSettingUpdate(job_setting.getMetatitle(), job_setting.getMetadescription(), job_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/jobs_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/speakers_setting")
	public String SpeakersSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Speaker_setting dbresult=settingService.speakerContent();
				theModel.addAttribute("speaker_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/speakers_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/speakersettingupdate")
	public String SpeakerSettingUpdate(@ModelAttribute("speaker_setting") Speaker_setting speaker_setting,HttpServletRequest request) {
		settingService.speakerSettingUpdate(speaker_setting.getMetatitle(), speaker_setting.getMetadescription(), speaker_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/speakers_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/blog_setting")
	public String BlogSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Blog_setting dbresult=settingService.blogContent();
				theModel.addAttribute("blog_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/blog_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
	}
	
	@PostMapping("/admin/admindashboard/blogsettingupdate")
	public String BlogSettingUpdate(@ModelAttribute("blog_setting") Blog_setting blog_setting,HttpServletRequest request) {
		settingService.blogSettingUpdate(blog_setting.getMetatitle(), blog_setting.getMetadescription(), blog_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/blog_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/podcast_setting")
	public String PodcastSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Podcast_setting dbresult=settingService.podcastContent();
				theModel.addAttribute("podcast_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/podcast_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/podcastsettingupdate")
	public String PodcastSettingUpdate(@ModelAttribute("podcast_setting") Podcast_setting podcast_setting,HttpServletRequest request) {
		settingService.podcastSettingUpdate(podcast_setting.getMetatitle(), podcast_setting.getMetadescription(), podcast_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/podcast_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/community_setting")
	public String CommunitySetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Community_setting dbresult=settingService.communityContent();
				theModel.addAttribute("community_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/community_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/communitysettingupdate")
	public String CommunitySettingUpdate(@ModelAttribute("community_setting") Community_setting community_setting,HttpServletRequest request) {
		settingService.communitySettingUpdate(community_setting.getMetatitle(), community_setting.getMetadescription(), community_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/community_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/resource_setting")
	public String ResourcesSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Resource_setting dbresult=settingService.resourceContent();
				theModel.addAttribute("resource_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/resource_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/resourcesettingupdate")
	public String ResourceSettingUpdate(@ModelAttribute("resource_setting") Resource_setting resource_setting,HttpServletRequest request) {
		settingService.resourceSettingUpdate(resource_setting.getMetatitle(), resource_setting.getMetadescription(), resource_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/resource_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/volunteer_setting")
	public String VolunteerSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Volunteer_setting dbresult=settingService.volunteerContent();
				theModel.addAttribute("volunteer_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/volunteer_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/volunteersettingupdate")
	public String VolunteerettingUpdate(@ModelAttribute("volunteer_setting") Volunteer_setting volunteer_setting,HttpServletRequest request) {
		settingService.volunteerSettingUpdate(volunteer_setting.getMetatitle(), volunteer_setting.getMetadescription(), volunteer_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/volunteer_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/subscribe_setting")
	public String SubscribeSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Subscribe_setting dbresult=settingService.subscribeContent();
				theModel.addAttribute("subscribe_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/subscribe_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/subscribesettingupdate")
	public String SubscribeSettingUpdate(@ModelAttribute("subscribe_setting") Subscribe_setting subscribe_setting,HttpServletRequest request) {
		settingService.subscribeSettingUpdate(subscribe_setting.getMetatitle(), subscribe_setting.getMetadescription(), subscribe_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/subscribe_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/contactus_setting")
	public String ContactSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Contactus_setting dbresult=settingService.contactusContent();
				theModel.addAttribute("contactus_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/contactus_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/contactussettingupdate")
	public String ContactusSettingUpdate(@ModelAttribute("contactus_setting") Contactus_setting contactus_setting,HttpServletRequest request) {
		settingService.contactusSettingUpdate(contactus_setting.getMetatitle(), contactus_setting.getMetadescription(), contactus_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/contactus_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/aboutus_setting")
	public String AboutSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Aboutus_setting dbresult=settingService.aboutusContent();
				theModel.addAttribute("aboutus_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/aboutus_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/aboutussettingupdate")
	public String AboutusSettingUpdate(@ModelAttribute("aboutus_setting") Aboutus_setting aboutus_setting,HttpServletRequest request) {
		settingService.aboutusSettingUpdate(aboutus_setting.getMetatitle(), aboutus_setting.getMetadescription(), aboutus_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/aboutus_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/privacypolicy_setting")
	public String PrivacyPolicySetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Privacypolicy_setting dbresult=settingService.privacypolicyContent();
				theModel.addAttribute("privacypolicy_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/privacypolicy_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/privacypolicysettingupdate")
	public String PrivacyPolicySettingUpdate(@ModelAttribute("privacypolicy_setting") Privacypolicy_setting privacypolicy_setting,HttpServletRequest request) {
		settingService.privacypolicySettingUpdate(privacypolicy_setting.getMetatitle(), privacypolicy_setting.getMetadescription(), privacypolicy_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/privacypolicy_setting";
			
	}
	
	@RequestMapping("/admin/admindashboard/faq_setting")
	public String FaqSetting(HttpServletRequest request, Model theModel){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Faq_setting dbresult=settingService.faqContent();
				theModel.addAttribute("faq_setting", dbresult);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/faq_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/faqsettingupdate")
	public String FaqSettingUpdate(@ModelAttribute("faq_setting") Faq_setting faq_setting,HttpServletRequest request) {
		settingService.faqSettingUpdate(faq_setting.getMetatitle(), faq_setting.getMetadescription(), faq_setting.getBrowsertitle());
		return "redirect:/admin/admindashboard/faq_setting";
			
	}
}
