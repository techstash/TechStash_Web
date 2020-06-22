package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Community_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class CommunityController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@RequestMapping("/community")
	public String Community(Model theModel){
		
		List<Community_setting> dbResultCommunitySetting = settingService.communityResultWebsite();
		
		theModel.addAttribute("communitySetting", dbResultCommunitySetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "community";
	}

}
