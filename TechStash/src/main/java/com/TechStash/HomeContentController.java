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

import com.TechStash.entity.Aboutus;
import com.TechStash.entity.Banner;
import com.TechStash.entity.ConferenceSection;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;
import com.TechStash.service.BannerService;
import com.TechStash.service.ConferenceSectionService;


@Controller
public class HomeContentController {

	@Autowired
	private BannerService bannerService;
	
	@Autowired
	private ConferenceSectionService conferenceSectionService;
	
	@RequestMapping("/")
	public String Home(Model theModel){
		
		List<Banner> dbResultBanner = bannerService.getDetail();
		theModel.addAttribute("banner", dbResultBanner);
		
		List<ConferenceSection> dbResultConference = conferenceSectionService.getResultWebsite();
		theModel.addAttribute("conferenesection", dbResultConference);
		
		return "index";
	}
	
	@RequestMapping("/admin/admindashboard/home_content")
	public String HomeContent(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Banner dbresultBanner=bannerService.getContent();
			theModel.addAttribute("banner", dbresultBanner);
			
			ConferenceSection dbresultConference=conferenceSectionService.getResultAdmin();
			theModel.addAttribute("conferencesection", dbresultConference); 
			
			
			return "admin/home_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/bannerupdate")
	public String BannerUpdate(@ModelAttribute("banner") Banner banner,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			banner.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<Banner> result=bannerService.getImage(1);
			  for(Banner dbresult : result) {
				  image=dbresult.getImage();
		        }
			banner.setImage(image);
		}
		bannerService.bannerUpdate(banner.getImage(), banner.getTitle(), banner.getSubtitle(), banner.getStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
	@PostMapping("/admin/admindashboard/conferencesectionupdate")
	public String ConferenceUpdate(@ModelAttribute("conferencesection") ConferenceSection conferenceSection,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			conferenceSection.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(photo==null){
			List<ConferenceSection> result=conferenceSectionService.getImage(1);
			  for(ConferenceSection dbresult : result) {
				  image=dbresult.getImage();
		        }
			  conferenceSection.setImage(image);
		}
		conferenceSectionService.conferenceSectionupdate(conferenceSection.getImage(), conferenceSection.getTitle(), conferenceSection.getSubtitle(), conferenceSection.getButtontextleft(),conferenceSection.getButtontextright(),conferenceSection.isStatus());
				
		return "redirect:/admin/admindashboard/home_content";
			
	}
	
}
