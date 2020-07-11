package com.TechStash;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Conference;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Resource_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;
import com.TechStash.entity.Resources;

@Controller
public class ResourceController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/resources")
	public String Resources(Model theModel){
		
		List<Resource_setting> dbResultResourceSetting = settingService.resourceResultWebsite();
		
		theModel.addAttribute("resourceSetting", dbResultResourceSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		List<Header_section> result=contentService.headerContentAdminList(5);
		theModel.addAttribute("header_section", result);
		
		List<Resources> resourceResult=contentService.resourcesWebsiteContent();
		
		for(Resources value : resourceResult) {
			
			int i = value.getId();
			int last= i%10;
			
			if(last == 1 || last == 7){
				value.setColor("linear-gradient(315deg, #ffdde1 0%, #ee9ca7 52%)");
			}
			
			if(last == 2 || last == 8){
				value.setColor("linear-gradient(315deg,#FF5F6D  0%, #FFC371  52%)");
			}

			if(last == 3 || last == 9){
				value.setColor("linear-gradient(315deg, #91EAE4 0%, #7F7FD5 52%)");
			}
			
			if(last == 4 || last == 0){
				value.setColor("linear-gradient(315deg, #91EAE4 0%, #CF8BF3 52%)");
			}

			if(last == 5){
				value.setColor("linear-gradient(315deg, #B3FFAB 0%, #12FFF7 52%)");
			}

			if(last == 6){
				value.setColor("linear-gradient(315deg, #BB377D 0%, #FBD3E9 52%)");
			}
        }
		
		
		theModel.addAttribute("resourceContent", resourceResult);
		
		return "resources";
	}

}
