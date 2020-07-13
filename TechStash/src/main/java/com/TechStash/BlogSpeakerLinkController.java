package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Blogs;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Speakers;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class BlogSpeakerLinkController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;

	@RequestMapping("/{link}")
	public String BlogSpeakerLink(Model theModel,@PathVariable("link") String link){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);
		
		List<Blogs> blogresult=contentService.blogDetailResult(link);
		theModel.addAttribute("blogdetail", blogresult);
		
		List<Speakers> speakerresult=contentService.speakerDetailResult(link);
		theModel.addAttribute("speakerdetail", speakerresult);
		
		boolean blogvalue = blogresult.isEmpty(); 
		boolean speakervalue = speakerresult.isEmpty(); 
		
		
		if(blogvalue==true && speakervalue==true){
			return "error";
		}
		
		else if (blogvalue!=true){
			return "blogdetails";
		}
		else {
			return "speakerdetails";
		}
		
	}
}
