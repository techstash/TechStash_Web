package com.TechStash;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Home_setting;
import com.TechStash.service.HomeSettingService;



@Controller
public class HomeSettingController {
	
	@Autowired
	private HomeSettingService homeSettingService;

	
	@RequestMapping("/admin/admindashboard/home_setting")
	public String HomeSetting(HttpServletRequest request, Model theModel){
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
				
				Home_setting dbresult=homeSettingService.getContent();
				theModel.addAttribute("home_setting", dbresult);
				
				
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
	
	@PostMapping("/admin/admindashboard/homesettingupdate")
	public String HomeSettingUpdate(@ModelAttribute("home_setting") Home_setting home_setting,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			home_setting.setFavicon(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<Home_setting> result=homeSettingService.getImage(1);
			  for(Home_setting dbresult : result) {
				  image=dbresult.getFavicon();
		        }
			  home_setting.setFavicon(image);
		}
		homeSettingService.homeSettingUpdate(home_setting.getMetatitle(), home_setting.getMetadescription(), home_setting.getBrowsertitle(), home_setting.getFavicon());
				
		return "redirect:/admin/admindashboard/home_setting";
			
	}
}
