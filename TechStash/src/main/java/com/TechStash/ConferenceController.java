package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class ConferenceController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private ContentService contentService;
	
	@Autowired
	private HomeSettingService homeSettingService;

	@RequestMapping("/conference")
	public String Conference(Model theModel){
		
		List<Conference_setting> dbResultConferenceSetting = settingService.conferenceResultWebsite();
		
		theModel.addAttribute("conferenceSetting", dbResultConferenceSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Conference> conferenceResult=contentService.conferenceTable();
		theModel.addAttribute("conferenceContent", conferenceResult);
		
		List<Carousel> carouselResult=contentService.carouselResultWebsite();
		theModel.addAttribute("carouselImages", carouselResult);
		
		List<Carousel> carouselMinId=contentService.carouselResultMinId();
		
		for(Carousel dbresult : carouselMinId) {
			System.out.println(dbresult.getId());
			theModel.addAttribute("carouselMinId", dbresult.getId());
        }
		
		return "conference";
	}
}
