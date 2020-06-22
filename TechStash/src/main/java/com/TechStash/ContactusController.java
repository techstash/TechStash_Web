package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class ContactusController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	
	@RequestMapping("/contact")
	public String Contact(Model theModel){
		
		List<Contactus_setting> dbResultContactusSetting = settingService.cotactusResultWebsite();
		
		theModel.addAttribute("contactusSetting", dbResultContactusSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		return "contactus";
	}

}
