package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Volunteers;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class VolunteerContentDetailsController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
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
				e.printStackTrace();
			}
			
			List<Volunteers> result=contentService.volunteerContent();
			theModel.addAttribute("volunteerContent", result);
			
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
				e.printStackTrace();
			}
			
			List<Volunteers> result=contentService.volunteerContent();
			theModel.addAttribute("volunteerContent", result);
			
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
	
	@GetMapping("/admin/admindashboard/editvolunteerstatus")
	public String editVolunteerStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.volunteerStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/volunteer_details";
		  }
		  else
		  {
			  status="1";
			  contentService.volunteerStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/volunteer_details";
		  }
		
	  }	
}
