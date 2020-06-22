package com.TechStash;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Keys_details;
import com.TechStash.service.DashboardUserService;
import com.TechStash.service.HomeSettingService;
import com.TechStash.service.KeysService;

@Controller
public class KeysController {
	
	@Autowired
	private KeysService keysService;
	
	@Autowired
	private HomeSettingService homeSettingService;

	@RequestMapping("/admin/admindashboard/keys")
	public String Keys(HttpServletRequest request, Model theModel,  @ModelAttribute("keys") Keys_details keysDetails){
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
		HttpSession session = request.getSession();
		String sessiondesignation=(String) session.getAttribute("designation");
		String sessionValue=(String) session.getAttribute("session"); 
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null && sessiondesignation.equals("Founder/CEO/Admin")){
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
			List<Keys_details> theKeys = keysService.getKeys();
			
			theModel.addAttribute("keys", theKeys);
			
			return "admin/keys";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/keysupdate")
	public String KeysFieldAdd(HttpServletRequest request, Model theModel){
		
		String keyName = request.getParameter("keyName");
        String keyValue = request.getParameter("keyValue");
		
		HttpSession session = request.getSession();
		String sessiondesignation=(String) session.getAttribute("designation");
		String sessionValue=(String) session.getAttribute("session"); 
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null && sessiondesignation.equals("Founder/CEO/Admin")){
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
			keysService.keysAdd(keyName, keyValue);
			return "redirect:/admin/admindashboard/keys";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@GetMapping("/admin/admindashboard/keydelete")
	public String deleteKeys(@RequestParam("id") int id){
		
		keysService.deleteKey(id);
		return "redirect:/admin/admindashboard/keys";
	}
	
	@RequestMapping("/admin/admindashboard/keysedit")
	public String KeyEdit(HttpServletRequest request){
		
		String id = request.getParameter("keyId");
		int idValue=Integer.parseInt(id);
        String keyValue = request.getParameter("keyValue");
		
		keysService.updateKey(idValue, keyValue);
		
		return "redirect:/admin/admindashboard/keys";
	}
	
}
