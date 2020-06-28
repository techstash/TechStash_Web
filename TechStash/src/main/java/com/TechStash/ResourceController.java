package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Resource_setting;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class ResourceController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@RequestMapping("/resources")
	public String Resources(Model theModel){
		
		List<Resource_setting> dbResultResourceSetting = settingService.resourceResultWebsite();
		
		theModel.addAttribute("resourceSetting", dbResultResourceSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		return "resources";
	}

}
