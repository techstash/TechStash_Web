package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class PodcastContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;

	
	@RequestMapping("/admin/admindashboard/podcast_content")
	public String PodcastContent(HttpServletRequest request, Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
				
				Header_section dbresult=contentService.headerContentAdmin(3);
				theModel.addAttribute("header_section", dbresult);
				
				List<Header_section> result=contentService.headerContentAdminList(3);
				theModel.addAttribute("headerimage", result);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/podcast_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/saveheadersectionpodcast")
	public String podcastHeaderSectionupdate(@ModelAttribute("header_section") Header_section header_section,HttpServletRequest request, @RequestParam(required = false, value = "headerImage") MultipartFile headerPhoto,@RequestParam(required = false, value = "backgroundImage") MultipartFile backgroundPhoto) {
		HttpSession session = request.getSession();
		byte[] image1=null;
		byte[] image2=null;
		try {
			if(headerPhoto!=null){
			byte[] photoBytes1 = headerPhoto.getBytes();
			header_section.setHeaderimage(photoBytes1);
			}
			if(backgroundPhoto!=null){
				byte[] photoBytes2 = backgroundPhoto.getBytes();
				header_section.setBackgroundimage(photoBytes2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(headerPhoto==null){
			List<Header_section> result=contentService.getSectionHeaderImage(header_section.getId());
			  for(Header_section dbresult : result) {
				  image1=dbresult.getHeaderimage();
		        }
			  header_section.setHeaderimage(image1);
		}
		
		if(backgroundPhoto==null){
			List<Header_section> result=contentService.getSectionBackgroundImage(header_section.getId());
			  for(Header_section dbresult : result) {
				  image2=dbresult.getBackgroundimage();
		        }
			  header_section.setBackgroundimage(image2);
		}
		
		contentService.headerSectionUpdate(header_section.getId(),header_section.getHeaderimage(), header_section.getTitle(), header_section.getSubtitle(),header_section.getBackgroundimage());
				
		return "redirect:/admin/admindashboard/podcast_content";
			
		 
	}
}