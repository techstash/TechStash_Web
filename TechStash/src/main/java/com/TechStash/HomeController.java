package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.TechStash.entity.Home_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	// ********Navigation into the requested url TechStash Website******** //
	
	@RequestMapping("/postblog")
	public String PostBlog(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "postblog";
	}
	
	@RequestMapping("/postconference")
	public String PostConference(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "postconference";
	}
	
	@RequestMapping("/postjob")
	public String PostJob(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "postjob";
	}
	
	@RequestMapping("/blogdetails")
	public String BlogDetail(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "blogdetails";
	}
	
	@RequestMapping("/speakerdetails")
	public String SpeakerDetail(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "speakerdetails";
	}
	
	// ********Navigation into the requested url TechStash Admin******** //
	
	@RequestMapping("/admin/admindashboard/blog_content")
	public String BlogContent(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/community_content")
	public String CommunityContent(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/contactus_content")
	public String ContactContent(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/faq_content")
	public String FaqContent(HttpServletRequest request, Model theModel){
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
	
	
	@RequestMapping("/admin/admindashboard/jobs_content")
	public String JobContent(HttpServletRequest request, Model theModel){
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
	
	
	@RequestMapping("/admin/admindashboard/podcast_content")
	public String PodcastContent(HttpServletRequest request, Model theModel){
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
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
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
	
	@RequestMapping("/admin/admindashboard/resource_content")
	public String ResourcesContent(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/speakers_content")
	public String SpeakersContent(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/subscribe_list")
	public String SubscribeList(HttpServletRequest request, Model theModel){
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
	
	@RequestMapping("/admin/admindashboard/volunteer_content")
	public String VolunteerContent(HttpServletRequest request, Model theModel){
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
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
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
