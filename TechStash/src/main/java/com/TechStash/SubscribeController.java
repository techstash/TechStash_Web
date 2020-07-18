package com.TechStash;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Conference;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Subscribe_setting;
import com.TechStash.entity.Subscriber;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class SubscribeController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/subscribe")
	public String Subscribe(Model theModel){
		
		List<Subscribe_setting> dbResultSubscribeSetting = settingService.subscriberResultWebsite();
		
		theModel.addAttribute("subscribeSetting", dbResultSubscribeSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		Subscriber subscriber = new Subscriber();
		theModel.addAttribute("subscriber", subscriber);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		return "subscribe";
	}
	
	@PostMapping("/newsubscribe")
	public String saveConference(@ModelAttribute("subscriber") Subscriber subscriber,HttpServletRequest request) {
		
		contentService.saveSubscriber(subscriber);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/subscribewithus")
	public String SubscribeSection(Model theModel, @RequestParam("email") String email){
		
		List<Subscribe_setting> dbResultSubscribeSetting = settingService.subscriberResultWebsite();
		
		theModel.addAttribute("subscribeSetting", dbResultSubscribeSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		Subscriber subscriber = new Subscriber();
		subscriber.setEmail(email);
		theModel.addAttribute("subscriber", subscriber);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		return "subscribe";
	}

}
