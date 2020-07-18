package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Subscriber;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class SubscribeListController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
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
				e.printStackTrace();
			}
			
			List<Subscriber> result=contentService.subscriberContent();
			theModel.addAttribute("subscriberList", result);
			
			Long subscriberCount=contentService.subscriberCount();
			theModel.addAttribute("subscriberCount", subscriberCount);
			
			return "admin/subscribe_list";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}

}
