package com.TechStash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TechStash.entity.Blog_setting;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class BlogController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private FooterService footerService;
	
	@Autowired
	private ContentService contentService;

	@RequestMapping("/blogs")
	public String Blogs(Model theModel){
		
		List<Blog_setting> dbResultBlogSetting = settingService.blogResultWebsite();
		
		theModel.addAttribute("blogSetting", dbResultBlogSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);
		
		List<Header_section> result=contentService.headerContentAdminList(2);
		theModel.addAttribute("header_section", result);
		
		return "blogs";
	}
	
}
