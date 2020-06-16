package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class ConferenceController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;

	@RequestMapping("/conference")
	public String Conference(Model theModel){
		
		List<Conference_setting> dbResultConferenceSetting = settingService.conferenceResultWebsite();
		
		theModel.addAttribute("conferenceSetting", dbResultConferenceSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		return "conference";
	}
}
