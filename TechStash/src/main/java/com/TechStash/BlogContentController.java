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
import com.TechStash.entity.Communities;
import com.TechStash.entity.Header_section;
import com.TechStash.entity.Home_setting;
import com.TechStash.service.ContentService;
import com.TechStash.service.HomeSettingService;

@Controller
public class BlogContentController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/admin/admindashboard/blog_content")
	public String BlogContent(HttpServletRequest request, Model theModel){
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
				
				Header_section dbresult=contentService.headerContentAdmin(2);
				theModel.addAttribute("header_section", dbresult);
				
				List<Header_section> result=contentService.headerContentAdminList(2);
				theModel.addAttribute("headerimage", result);
				
				Blogs blogs = new Blogs();
				theModel.addAttribute("blogs", blogs);
				
				List<Blogs> blogcontent=contentService.blogContent();
				theModel.addAttribute("blogsContent", blogcontent);
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return "admin/blog_content";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	@PostMapping("/admin/admindashboard/newblog")
	public String saveBlog(@ModelAttribute("blogs") Blogs blogs,HttpServletRequest request, @RequestParam MultipartFile photo) {
		
		try {
			byte[] photoBytes = photo.getBytes();
			blogs.setImage(photoBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String createLink = ""; 
        
        for (int i = 0; i < blogs.getTitle().length(); ++i) { 
      
            if (blogs.getTitle().charAt(i) == ' ')  
            	createLink += '-'; 
              
            else
            	createLink += blogs.getTitle().charAt(i); 
              
        } 
        
        blogs.setLink(createLink);
		
		contentService.saveBlog(blogs);
		return "redirect:/admin/admindashboard/blog_content";
	}
	
	@GetMapping("/admin/admindashboard/deleteblog")
	public String deleteBlog(@RequestParam("id") int id){

		contentService.deleteBlog(id);
		return "redirect:/admin/admindashboard/blog_content";
	}
	
	@GetMapping("/admin/admindashboard/editblog")
	public String editBlog(HttpServletRequest request, @RequestParam("id") int id, Model theModel)
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
			
			Blogs dbresult=contentService.blogEditResult(id);
			theModel.addAttribute("blogs", dbresult);
			
			return "admin/edit_blog";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	  }
	
	@GetMapping("/admin/admindashboard/editblogstatus")
	public String editCommunityStatus(HttpServletRequest request, @RequestParam("id") int id,@RequestParam("status") String status, Model theModel)
	  {
		
		if(status.equals("true")){
			  status="0";
			  contentService.blogStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/blog_content";
		  }
		  else
		  {
			  status="1";
			  contentService.blogStatusUpdate(id,status);
			  return "redirect:/admin/admindashboard/blog_content";
		  }
		
	  }	
	
	@PostMapping("/admin/admindashboard/blogeditupdate")
	public String editCommunityUpdate(@ModelAttribute("blogs") Blogs blogs, @RequestParam(required = false, value = "photo") MultipartFile photo) {
	byte[] image=null;
	try {
		if(photo!=null){
		byte[] photoBytes = photo.getBytes();
		blogs.setImage(photoBytes);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	if(photo==null){
		List<Blogs> result=contentService.getBlogImage(blogs.getId());
		  for(Blogs dbresult : result) {
			  image=dbresult.getImage();
	        }
		  blogs.setImage(image);
	}
	
	String createLink = ""; 
    
    for (int i = 0; i < blogs.getTitle().length(); ++i) { 
  
        if (blogs.getTitle().charAt(i) == ' ')  
        	createLink += '-'; 
          
        else
        	createLink += blogs.getTitle().charAt(i); 
          
    } 
    
    blogs.setLink(createLink);
	
	contentService.blogContentUpdate(blogs.getId(), blogs.getTitle(),blogs.getImage(), blogs.getAuthor(),blogs.getDate(),blogs.getCategory(),blogs.getDescription(),blogs.getLink());
				
	return "redirect:/admin/admindashboard/blog_content";
			
	}
	
	@PostMapping("/admin/admindashboard/saveheadersectionblog")
	public String blogHeaderSectionupdate(@ModelAttribute("header_section") Header_section header_section,HttpServletRequest request, @RequestParam(required = false, value = "headerImage") MultipartFile headerPhoto,@RequestParam(required = false, value = "backgroundImage") MultipartFile backgroundPhoto) {
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
				
		return "redirect:/admin/admindashboard/blog_content";
			
		 
	}

}
