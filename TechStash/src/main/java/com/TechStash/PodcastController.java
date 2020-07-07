package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Footer;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Podcast_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class PodcastController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/podcast")
	public String podcast(Model theModel){
		
		List<Podcast_setting> dbResultPodcastSetting = settingService.podcastResultWebsite();
		
		theModel.addAttribute("podcastSetting", dbResultPodcastSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		List<Header_section> result=contentService.headerContentAdminList(3);
		theModel.addAttribute("header_section", result);
		
		return "podcast";
	}

}
