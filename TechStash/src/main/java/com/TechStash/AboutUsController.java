package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Aboutus;
import com.TechStash.entity.Aboutus_setting;
import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Keys_details;
import com.TechStash.service.AboutUsService;
import com.TechStash.service.DashboardUserService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class AboutUsController {
	
	@Autowired
	private AboutUsService aboutUsService;
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;

	
	@RequestMapping("/admin/admindashboard/aboutus_content")
	public String AboutContent(HttpServletRequest request, Model theModel){
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
				Aboutus dbresult=aboutUsService.getResult();
				theModel.addAttribute("aboutus", dbresult);
				
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
	
	@RequestMapping("/admin/admindashboard/aboutusupdate")
	public String AboutUsUpdate(HttpServletRequest request,Model theModel, @ModelAttribute("aboutus") Aboutus aboutus){
		
		aboutUsService.saveContent(aboutus.getContent());
		HttpSession session = request.getSession();
		session.setAttribute("aboutus", aboutus.getContent());
		return "redirect:/admin/admindashboard/aboutus_content";
	}
	

	@RequestMapping("/about")
	public String About(Model theModel){
		
		List<Aboutus> dbresult = aboutUsService.getContent();
		
		theModel.addAttribute("aboutus", dbresult);
		
		List<Aboutus_setting> dbResultAboutusSetting = settingService.aboutusResultWebsite();
		
		theModel.addAttribute("aboutusSetting", dbResultAboutusSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		return "aboutus";
	}
}
