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

import com.TechStash.service.FooterService;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Footer;

@Controller
public class FooterController {
	
	@Autowired
	private FooterService footerService;

	@RequestMapping("/admin/admindashboard/footer")
	public String Footer(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			Footer dbresult=footerService.getDetails(1);
			theModel.addAttribute("footerdetails", dbresult);
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
			return "admin/footer";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/footerupdate")
	public String profileUpdate(@ModelAttribute("footerdetails") Footer footer,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		HttpSession session = request.getSession();
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			footer.setLogo_image(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(photo==null){
			
			List<Footer> result=footerService.getLogoImage(1);
			  for(Footer dbresult : result) {
				  image=dbresult.getLogo_image();
		        }
			footer.setLogo_image(image);
		}
		footerService.footerUpdate(1, footer.getLogo_image(), footer.getFooter_text(), footer.getFacebook_url(), footer.getTwitter_url(), footer.getYoutube_url(), footer.getLinkedin_url());			
		return "redirect:/admin/admindashboard/footer";
			
	}
	
}
