package com.TechStash;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.TechStash.entity.Conference;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Volunteer_setting;
import com.TechStash.entity.Volunteers;
import com.TechStash.mail.MailTemplate;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class VolunteerController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@Autowired
	private FooterService footerService;
	
	@RequestMapping("/volunteer")
	public String Volunteer(Model theModel){
		
		List<Volunteer_setting> dbResultVolunteerSetting = settingService.volunteerResultWebsite();
		
		theModel.addAttribute("volunteerSetting", dbResultVolunteerSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		Volunteers volunteer = new Volunteers();
		theModel.addAttribute("volunteer", volunteer);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);	
		
		
		return "volunteer";
	}
	
	@PostMapping("/savevolunteer")
	public String saveVolunteer(@ModelAttribute("volunteer") Volunteers volunteer,HttpServletRequest request, @RequestParam MultipartFile photo) {
		try {
			byte[] photoBytes = photo.getBytes();
			volunteer.setImage(photoBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		contentService.saveVolunteer(volunteer);
		MailTemplate.volunteerMail(volunteer.getFirstname(), volunteer.getLastname(), volunteer.getEmail(), volunteer.getCity(), volunteer.getGender(), volunteer.getEducation(), volunteer.getSpecialization(), 
				volunteer.getHours(), volunteer.getDetails(), volunteer.getLinkedin(), volunteer.getGithub(), volunteer.getTwitter(), volunteer.getPortfolio(), volunteer.getHear_about_techstash(), volunteer.getIdeas_to_techstash());
			return "thanksvolunteer";
		}
	
	@GetMapping("/volunteerapprove/{email}/{key}/{status}")
	  @ResponseBody
	  public String volunteerAcceptRejectInputFromCEO(@PathVariable("email") String email,@PathVariable("key") String key,@PathVariable("status") String status)
	  {
		  if(key.equals("2f1c1999c8897d77224133cfabei3f59c708e6f8f05872efa0e584e633db15")){
			  
			  if(status.equals("true")){
				  status = "1";
				  contentService.volunteerAcceptRejectInputFromCEO(email,status);
				  MailTemplate.WelcomeVolunteer(email);
				  return "Volunteer Accepted";
			  }
			  if(status.equals("false")){
				  status = "0";
				  contentService.volunteerAcceptRejectInputFromCEO(email,status);
				  return "Volunteer Rejected";
			  }
			  
			  return "error";
			  
		  }
		  else
		  {
			  return "error";
		  }
	  }

}
