package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Banner;
import com.TechStash.entity.Carousel;
import com.TechStash.entity.Conference;
import com.TechStash.entity.Conference_setting;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Keys_details;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class ConferenceContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/admin/admindashboard/conference_content")
	public String ConferenceContent(HttpServletRequest request, Model theModel){
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
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Conference conference = new Conference();
			theModel.addAttribute("conference", conference);
			
			List<Conference> result=contentService.conferenceContent();
			theModel.addAttribute("conferenceContent", result);
			
			List<Carousel> carousel = contentService.getCarousel();
			
			theModel.addAttribute("carousel", carousel);
			
			return "admin/conference_content";
		}	
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/newconference")
	public String saveConference(@ModelAttribute("conference") Conference conference,HttpServletRequest request, @RequestParam MultipartFile photo) {
		
		try {
			byte[] photoBytes = photo.getBytes();
			conference.setImage(photoBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		contentService.saveConference(conference);
			return "redirect:/admin/admindashboard/conference_content";
		}
	
	@GetMapping("/admin/admindashboard/deleteconference")
	public String deleteKeys(@RequestParam("id") int id){
		
		contentService.deleteConference(id);
		return "redirect:/admin/admindashboard/conference_content";
	}
	
	@GetMapping("/admin/admindashboard/editconference")
	public String editConference(HttpServletRequest request, @RequestParam("id") int id, Model theModel)
	  {
		
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
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Conference dbresult=contentService.conferenceEditResult(id);
			theModel.addAttribute("conference", dbresult);
			
			return "admin/edit_conference";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	  }
	
	@GetMapping("/admin/admindashboard/editconferencestatus")
	public String editConferenceStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.conferenceStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/conference_content";
		  }
		  else
		  {
			  status="1";
			  contentService.conferenceStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/conference_content";
		  }
		
	  }	
	
	@PostMapping("/admin/admindashboard/conferenceeditupdate")
	public String editConferenceUpdate(@ModelAttribute("conference") Conference conference, @RequestParam(required = false, value = "photo") MultipartFile photo) {
	
	byte[] image=null;
	try {
		if(photo!=null){
		byte[] photoBytes = photo.getBytes();
		conference.setImage(photoBytes);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	if(photo==null){
		List<Conference> result=contentService.getConfereceImage(conference.getId());
		  for(Conference dbresult : result) {
			  image=dbresult.getImage();
	        }
		  conference.setImage(image);
	}
	
	contentService.conferenceContentUpdate(conference.getId(), conference.getTitle(),conference.getImage(), conference.getDescription(),conference.getLocation(),conference.getLink(),conference.getDate());
				
	return "redirect:/admin/admindashboard/conference_content";
			
	}
	
	@GetMapping("/admin/admindashboard/carouseldelete")
	public String carouselDelete(@RequestParam("id") int id){
		
		contentService.deleteCarousel(id);
		return "redirect:/admin/admindashboard/conference_content";
	}
	
	@PostMapping("/admin/admindashboard/carouseledit")
	public String carouselEdit(@ModelAttribute("carousel") Carousel carousel,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {

		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			carousel.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(photo==null){
			System.out.println("Hai");
			List<Carousel> result=contentService.getCarouselImage(carousel.getId());
			  for(Carousel dbresult : result) {
				  image=dbresult.getImage();
		        }
			  carousel.setImage(image);
		}
		
		contentService.carouselUpdate(carousel.getId(), carousel.getImage());
		
		return "redirect:/admin/admindashboard/conference_content";
			
	}
	
	@GetMapping("/admin/admindashboard/editcarouselstatus")
	public String editCarouselStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.carouseleStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/conference_content";
		  }
		  else
		  {
			  status="1";
			  contentService.carouseleStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/conference_content";
		  }
		
	  }	
	
	@PostMapping("/admin/admindashboard/newcarousel")
	public String newcarousel(@ModelAttribute("carousel") Carousel carousel,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo)
	  {
		System.out.println(photo);
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			carousel.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		carousel.setStatus(false);
		contentService.newcarousel(carousel.getImage());
	    return "redirect:/admin/admindashboard/conference_content";
		
	  }	
		
	}
