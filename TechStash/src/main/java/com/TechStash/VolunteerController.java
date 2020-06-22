package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Volunteer_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class VolunteerController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@RequestMapping("/volunteer")
	public String Volunteer(Model theModel){
		
		List<Volunteer_setting> dbResultVolunteerSetting = settingService.volunteerResultWebsite();
		
		theModel.addAttribute("volunteerSetting", dbResultVolunteerSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		return "volunteer";
	}

}
