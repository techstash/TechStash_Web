package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Jobs;
import com.TechStash.entity.Resources;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class ResourceContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/admin/admindashboard/resource_content")
	public String ResourcesContent(HttpServletRequest request, Model theModel){
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
				
				Header_section dbresult=contentService.headerContentAdmin(5);
				theModel.addAttribute("header_section", dbresult);
				
				List<Header_section> result=contentService.headerContentAdminList(5);
				theModel.addAttribute("headerimage", result);
				
				List<Resources> resourceContent=contentService.resourceContent();
				theModel.addAttribute("resourceContent", resourceContent);
				
				Resources resources = new Resources();
				theModel.addAttribute("resources", resources);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "admin/resource_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/newresource")
	public String saveResource(@ModelAttribute("resources") Resources resources,HttpServletRequest request) {
			contentService.saveResource(resources);
			return "redirect:/admin/admindashboard/resource_content";
	}
	
	@GetMapping("/admin/admindashboard/deleteresource")
	public String deleteResource(@RequestParam("id") int id){
		
		contentService.deleteResource(id);
		return "redirect:/admin/admindashboard/resource_content";
	}
	
	@GetMapping("/admin/admindashboard/editresource")
	public String editResource(HttpServletRequest request, @RequestParam("id") int id, Model theModel)
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
			
			Resources dbresult=contentService.resourceEditResult(id);
			theModel.addAttribute("resources", dbresult);
			
			return "admin/edit_resource";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	  }
	
	@GetMapping("/admin/admindashboard/editresourcestatus")
	public String editResourceStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.resourceStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/resource_content";
		  }
		  else
		  {
			  status="1";
			  contentService.resourceStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/resource_content";
		  }
		
	  }	
	
	@PostMapping("/admin/admindashboard/resourceeditupdate")
	public String editResourceUpdate(@ModelAttribute("resources") Resources resources) {
	
	contentService.resourceContentUpdate(resources.getId(), resources.getName(),resources.getLink());
				
	return "redirect:/admin/admindashboard/resource_content";
			
	}
	
	@PostMapping("/admin/admindashboard/saveheadersectionresource")
	public String resourceHeaderSectionupdate(@ModelAttribute("header_section") Header_section header_section,HttpServletRequest request, @RequestParam(required = false, value = "headerImage") MultipartFile headerPhoto,@RequestParam(required = false, value = "backgroundImage") MultipartFile backgroundPhoto) {
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
				
		return "redirect:/admin/admindashboard/resource_content";
			
		 
	}

}
