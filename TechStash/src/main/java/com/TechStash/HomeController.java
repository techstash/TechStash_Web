package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.TechStash.entity.Dashboard_users;

@Controller
public class HomeController {
	
	
	
	// ********Navigation into the requested url TechStash Website******** //
	
	@RequestMapping("/")
	public String Home(){
		return "index";
	}
	
	@RequestMapping("/conference")
	public String Conference(){
		return "conference";
	}
	
	@RequestMapping("/jobs")
	public String Jobs(){
		return "jobs";
	}
	
	@RequestMapping("/speakers")
	public String Speakers(){
		return "speakers";
	}
	
	@RequestMapping("/blogs")
	public String Blogs(){
		return "blogs";
	}
	
	@RequestMapping("/podcast")
	public String podcast(){
		return "podcast";
	}
	
	@RequestMapping("/community")
	public String Community(){
		return "community";
	}
	
	@RequestMapping("/resources")
	public String Resources(){
		return "resources";
	}
	
	@RequestMapping("/subscribe")
	public String Subscribe(){
		return "subscribe";
	}
	
	@RequestMapping("/volunteer")
	public String Volunteer(){
		return "volunteer";
	}
	
	@RequestMapping("/submit_blog")
	public String SubmitBlog(){
		return "submit_blog";
	}
	
	@RequestMapping("/contact")
	public String Contact(){
		return "contactus";
	}
	
	@RequestMapping("/postblog")
	public String PostBlog(){
		return "postblog";
	}
	
	@RequestMapping("/postconference")
	public String PostConference(){
		return "postconference";
	}
	
	@RequestMapping("/postjob")
	public String PostJob(){
		return "postjob";
	}
	
	@RequestMapping("/about")
	public String About(){
		return "aboutus";
	}
	
	@RequestMapping("/privacypolicy")
	public String PrivacyPolicy(){
		return "privacypolicy";
	}
	
	@RequestMapping("/blogdetails")
	public String BlogDetail(){
		return "blogdetails";
	}
	
	@RequestMapping("/speakerdetails")
	public String SpeakerDetail(){
		return "speakerdetails";
	}
	
	// ********Navigation into the requested url TechStash Admin******** //
	
	// About
	@RequestMapping("/admin/admindashboard/aboutus_setting")
	public String AboutSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/aboutus_content")
	public String AboutContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/aboutus_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
	}
	
	//Blog
	@RequestMapping("/admin/admindashboard/blog_setting")
	public String BlogSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/blog_content")
	public String BlogContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/blog_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Community
	@RequestMapping("/admin/admindashboard/community_setting")
	public String CommunitySetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/community_content")
	public String CommunityContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/community_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Conference
	@RequestMapping("/admin/admindashboard/conference_setting")
	public String ConferenceSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/conference_content")
	public String ConferenceContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/conference_content";
		}	
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//contact us
	@RequestMapping("/admin/admindashboard/contactus_setting")
	public String ContactSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/contactus_content")
	public String ContactContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/contactus_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/contactus_response")
	public String ContactResponses(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/contactus_response";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//FAQ
	@RequestMapping("/admin/admindashboard/faq_setting")
	public String FaqSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/faq_content")
	public String FaqContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/faq_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Home
	@RequestMapping("/admin/admindashboard/home_setting")
	public String HomeSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/home_setting";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/home_content")
	public String HomeContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/home_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Jobs
	@RequestMapping("/admin/admindashboard/jobs_setting")
	public String JobsSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/jobs_content")
	public String JobContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/jobs_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Organizer
	@RequestMapping("/admin/admindashboard/organizer")
	public String Organizer(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessiondesignation=(String) session.getAttribute("designation");
		String sessionValue=(String) session.getAttribute("session"); 
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null && sessiondesignation.equals("Founder/CEO/Admin")){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/organizer";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Podacast
	@RequestMapping("/admin/admindashboard/podcast_setting")
	public String PodcastSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/podcast_content")
	public String PodcastContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/podcast_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Pricing
	@RequestMapping("/admin/admindashboard/pricing_details")
	public String PricingDetails(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		String sessiondesignation=(String) session.getAttribute("designation");
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null&& sessiondesignation.equals("Founder/CEO/Admin")){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/pricing_details";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Privacy Policy
	@RequestMapping("/admin/admindashboard/privacypolicy_setting")
	public String PrivacyPolicySetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/privacypolicy_content")
	public String PrivacyPolicyContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/privacypolicy_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	// Resources
	@RequestMapping("/admin/admindashboard/resource_setting")
	public String ResourcesSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/resource_content")
	public String ResourcesContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/resource_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Speakers
	@RequestMapping("/admin/admindashboard/speakers_setting")
	public String SpeakersSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/speakers_content")
	public String SpeakersContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/speakers_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Subscribe
	@RequestMapping("/admin/admindashboard/subscribe_setting")
	public String SubscribeSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/subscribe_list")
	public String SubscribeList(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/subscribe_list";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/unsubscribe_list")
	public String UnubscribeList(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/unsubscribe_list";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	//Volunteer
	@RequestMapping("/admin/admindashboard/volunteer_setting")
	public String VolunteerSetting(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
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
	
	@RequestMapping("/admin/admindashboard/volunteer_content")
	public String VolunteerContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/volunteer_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/volunteer_details")
	public String VolunteerDetails(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		String sessiondesignation=(String) session.getAttribute("designation");
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null && sessiondesignation.equals("Founder/CEO/Admin")){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/volunteer_details";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	
	// ********Handling Error******** //
	
    /*@ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest request, Exception e)   {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Request: " + request.getRequestURL() + " raised " + e);
        return new ModelAndView("error");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handleError404(HttpServletRequest request, Exception e)   {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Request: " + request.getRequestURL() + " raised " + e);
        return new ModelAndView("error");
    }*/

    
}
