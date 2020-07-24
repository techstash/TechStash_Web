package com.TechStash;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Contactus_setting;
import com.TechStash.entity.Contact;
import com.TechStash.entity.Footer;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Volunteers;
import com.TechStash.mail.MailTemplate;
import com.TechStash.service.ContentService;
import com.TechStash.service.FooterService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.SettingService;

@Controller
public class ContactusController {
	
	@Autowired
	private SettingService settingService;
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@Autowired
	private FooterService footerService;
	
	
	@RequestMapping("/contact")
	public String Contact(Model theModel){
		
		List<Contactus_setting> dbResultContactusSetting = settingService.cotactusResultWebsite();
		
		theModel.addAttribute("contactusSetting", dbResultContactusSetting);
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		Contact contact = new Contact();
		theModel.addAttribute("contact", contact);
		
		List<Footer> dbResultFooter = footerService.getFooterResultWebsite();
		theModel.addAttribute("footerContent", dbResultFooter);
		
		return "contactus";
	}
	
	@PostMapping("/savecontact")
	public String saveContact(@ModelAttribute("contact") Contact contact,HttpServletRequest request) {
		
		MailTemplate.contactMailtoCEO(contact.getFullname(),contact.getEmail(),contact.getMessage());
		
		MailTemplate.contactMailUser(contact.getEmail());
		
		contentService.saveContact(contact);
		return "thankscontact";
		
	}
}
