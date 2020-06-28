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
import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.PrivacyPolicy;
import com.TechStash.entity.Privacypolicy_setting;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.PrivacyPolicyService;
import com.TechStash.service.SettingService;

@Controller
public class PrivacyController {
	
	@Autowired
	private PrivacyPolicyService privacyPolicyService;
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@RequestMapping("/admin/admindashboard/privacypolicy_content")
	public String PrivacyPolicyContent(HttpServletRequest request, Model theModel){
		
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
				PrivacyPolicy dbresult=privacyPolicyService.getResult();
				theModel.addAttribute("privacypolicy", dbresult);
				
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
	
	@RequestMapping("/admin/admindashboard/privacypolicyupdate")
	public String PrivacyPolicyUpdate(HttpServletRequest request,Model theModel, @ModelAttribute("privacypolicy") PrivacyPolicy privacypolicy){
		
		privacyPolicyService.saveContent(privacypolicy.getContent());
		HttpSession session = request.getSession();
		session.setAttribute("privacypolicy", privacypolicy.getContent());
		return "redirect:/admin/admindashboard/privacypolicy_content";
	}
	
	@RequestMapping("/privacypolicy")
	public String PrivacyPolicy(Model theModel){
		
		List<PrivacyPolicy> dbresult = privacyPolicyService.getContent();
		
		theModel.addAttribute("privacypolicy", dbresult);	
		
		List<Privacypolicy_setting> dbResultPrivacypolicySetting = settingService.privacypolicyResultWebsite();
		
		theModel.addAttribute("privacypolicySetting", dbResultPrivacypolicySetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		return "privacypolicy";
	}

}
