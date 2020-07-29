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
import com.TechStash.entity.Jobs;
import com.TechStash.entity.Pricing_details;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class PricingDetailsController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/admin/admindashboard/pricing_details")
	public String PricingDetails(HttpServletRequest request, Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		String sessiondesignation=(String) session.getAttribute("designation");
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null&& sessiondesignation.equals("Founder/CEO/Admin")){
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			
			Pricing_details dbresult1=contentService.pricingDetailContent(1);
			theModel.addAttribute("pricingDetail_1", dbresult1);
			
			Pricing_details dbresult2=contentService.pricingDetailContent(2);
			theModel.addAttribute("pricingDetail_2", dbresult2);
			
			Pricing_details dbresult3=contentService.pricingDetailContent(3);
			theModel.addAttribute("pricingDetail_3", dbresult3);
			
			
			return "admin/pricing_details";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/savepricingplan_1")
	public String updatePricingDetail_1(@ModelAttribute("pricingDetail_1") Pricing_details pricing_details,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			pricing_details.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(photo==null){
			List<Pricing_details> result=contentService.getPricingDetailsContent(pricing_details.getId());
			  for(Pricing_details dbresult : result) {
				  image=dbresult.getImage();
		        }
			  pricing_details.setImage(image);
		}
		
		contentService.updatePricingDetail(pricing_details.getId(),pricing_details.getPlanname(),pricing_details.getImage(),pricing_details.getPlanprice(),pricing_details.getPlanservice());
		return "redirect:/admin/admindashboard/pricing_details";
		 
	}
	
	@PostMapping("/admin/admindashboard/savepricingplan_2")
	public String updatePricingDetail_2(@ModelAttribute("pricingDetail_2") Pricing_details pricing_details,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			pricing_details.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(photo==null){
			List<Pricing_details> result=contentService.getPricingDetailsContent(pricing_details.getId());
			  for(Pricing_details dbresult : result) {
				  image=dbresult.getImage();
		        }
			  pricing_details.setImage(image);
		}
		
		contentService.updatePricingDetail(pricing_details.getId(),pricing_details.getPlanname(),pricing_details.getImage(),pricing_details.getPlanprice(),pricing_details.getPlanservice());
		return "redirect:/admin/admindashboard/pricing_details";
		 
	}
	
	@PostMapping("/admin/admindashboard/savepricingplan_3")
	public String updatePricingDetail_3(@ModelAttribute("pricingDetail_3") Pricing_details pricing_details,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		
		byte[] image=null;
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			pricing_details.setImage(photoBytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(photo==null){
			List<Pricing_details> result=contentService.getPricingDetailsContent(pricing_details.getId());
			  for(Pricing_details dbresult : result) {
				  image=dbresult.getImage();
		        }
			  pricing_details.setImage(image);
		}
		
		contentService.updatePricingDetail(pricing_details.getId(),pricing_details.getPlanname(),pricing_details.getImage(),pricing_details.getPlanprice(),pricing_details.getPlanservice());
		return "redirect:/admin/admindashboard/pricing_details";
		 
	}

}
