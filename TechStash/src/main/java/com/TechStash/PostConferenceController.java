package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Postconference_setting;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class PostConferenceController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private SettingService settingService;
	
	@RequestMapping("/postconference")
	public String PostConference(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);
		
		List<Postconference_setting> dbResult = settingService.postConferenceWebsite();
		
		theModel.addAttribute("postconferenceSetting", dbResult);
		
		return "postconference";
	}

}
