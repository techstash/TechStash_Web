package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Speaker_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class SpeakerController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@RequestMapping("/speakers")
	public String Speakers(Model theModel){
		List<Speaker_setting> dbResultSpeakerSetting = settingService.speakerResultWebsite();
		
		theModel.addAttribute("speakerSetting", dbResultSpeakerSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "speakers";
	}

}
