package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Footer;
import com.TechStash.entity.Speakers;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Speaker_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class SpeakerController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/speakers")
	public String Speakers(Model theModel){
		List<Speaker_setting> dbResultSpeakerSetting = settingService.speakerResultWebsite();
		
		theModel.addAttribute("speakerSetting", dbResultSpeakerSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		List<Speakers> speakersResult=contentService.speakerWebsiteContent();
		theModel.addAttribute("speakersContent", speakersResult);
		
		return "speakers";
	}
	
	@RequestMapping("speaker/{link}")
	public String speakerDetails(Model theModel,@PathVariable("link") String link){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);
		
		List<Speakers> result=contentService.speakerDetailResult(link);
		
		boolean value = result.isEmpty(); 
		
		if(value==true ){
			return "error";
		}
		
		
		theModel.addAttribute("speakerdetail", result);
		
		return "speakerdetails";
	}

}
