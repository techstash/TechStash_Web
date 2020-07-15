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

import com.TechStash.entity.Contact;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class ContactusContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
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
				e.printStackTrace();
			}
			
			List<Contact> result=contentService.contactContent();
			theModel.addAttribute("contactContent", result);
			
			return "admin/contactus_response";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@GetMapping("/admin/admindashboard/editcontactstatus")
	public String editContactStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("responded") String responded, Model theModel)
	  {
		
		if(responded.equals("true")){
			responded="0";
			  contentService.contactStatusUpdate(id,responded);
			  return "redirect:/admin/admindashboard/contactus_response";
		  }
		  else
		  {
			  responded="1";
			  contentService.contactStatusUpdate(id,responded);
			  return "redirect:/admin/admindashboard/contactus_response";
		  }
		
	  }	

}
