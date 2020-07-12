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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Blogs;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Speakers;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class SpeakerContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	
	@RequestMapping("/admin/admindashboard/speakers_content")
	public String SpeakersContent(HttpServletRequest request, Model theModel){
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
				
				Speakers speakers = new Speakers();
				theModel.addAttribute("speakers", speakers);
				
				List<Speakers> speakercontent=contentService.speakerContent();
				theModel.addAttribute("speakersContent", speakercontent);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return "admin/speakers_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/newspeaker")
	public String saveSpeaker(@ModelAttribute("speakers") Speakers speakers,HttpServletRequest request, @RequestParam MultipartFile photo) {
		
		try {
			byte[] photoBytes = photo.getBytes();
			speakers.setImage(photoBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String createLink = ""; 
        
        for (int i = 0; i < speakers.getName().length(); ++i) { 
      
            if (speakers.getName().charAt(i) == ' ')  
            	createLink += '-'; 
              
            else
            	createLink += speakers.getName().charAt(i); 
              
        } 
        createLink=createLink.toLowerCase();
        speakers.setLink(createLink);
		contentService.saveSpeaker(speakers);
		return "redirect:/admin/admindashboard/speakers_content";
	}
	
	@GetMapping("/admin/admindashboard/deletespeaker")
	public String deleteSpeaker(@RequestParam("id") int id){

		contentService.deleteSpeaker(id);
		return "redirect:/admin/admindashboard/speakers_content";
	}
	
	@GetMapping("/admin/admindashboard/editspeaker")
	public String editSpeaker(HttpServletRequest request, @RequestParam("id") int id, Model theModel)
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
				e.printStackTrace();
			}
			
			Speakers dbresult=contentService.speakerEditResult(id);
			theModel.addAttribute("speakers", dbresult);
			
			return "admin/edit_speaker";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	  }
	
	@GetMapping("/admin/admindashboard/editspeakerstatus")
	public String editSpeakerStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.speakerStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/speakers_content";
		  }
		  else
		  {
			  status="1";
			  contentService.speakerStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/speakers_content";
		  }
		
	  }	
	
	@PostMapping("/admin/admindashboard/speakereditupdate")
	public String editSpeakerUpdate(@ModelAttribute("speakers") Speakers speakers, @RequestParam(required = false, value = "photo") MultipartFile photo) {
	byte[] image=null;
	try {
		if(photo!=null){
		byte[] photoBytes = photo.getBytes();
		speakers.setImage(photoBytes);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	if(photo==null){
		List<Speakers> result=contentService.getSpeakerImage(speakers.getId());
		  for(Speakers dbresult : result) {
			  image=dbresult.getImage();
	        }
		  speakers.setImage(image);
	}
	
	String createLink = ""; 
    
    for (int i = 0; i < speakers.getName().length(); ++i) { 
  
        if (speakers.getName().charAt(i) == ' ')  
        	createLink += '-'; 
          
        else
        	createLink += speakers.getName().charAt(i); 
          
    } 
    
    createLink=createLink.toLowerCase();
    speakers.setLink(createLink);
	
	contentService.speakerContentUpdate(speakers.getId(), speakers.getName(),speakers.getImage(), speakers.getLocation(),speakers.getCategory(),speakers.getBio(),speakers.getFacebook(),speakers.getTwitter(),speakers.getGithub(),speakers.getLatitude(),speakers.getLongitude(),speakers.getLink());
				
	return "redirect:/admin/admindashboard/speakers_content";
			
	}
	
}
