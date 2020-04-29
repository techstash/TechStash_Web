package com.TechStash;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@Controller
public class HomeController {
	
	// Navigation into the requested url TechStash Website
	
	@RequestMapping("/")
	public String Home(){
		return "index";
	}
	
	@RequestMapping("/conference")
	public String Conference(){
		return "conference";
	}
	
	@RequestMapping("/jobs")
	public String Jobs(){
		return "jobs";
	}
	
	@RequestMapping("/speakers")
	public String Speakers(){
		return "speakers";
	}
	
	@RequestMapping("/blogs")
	public String Blogs(){
		return "blogs";
	}
	
	@RequestMapping("/podcast")
	public String podcast(){
		return "podcast";
	}
	
	@RequestMapping("/community")
	public String Community(){
		return "community";
	}
	
	@RequestMapping("/resources")
	public String Resources(){
		return "resources";
	}
	
	@RequestMapping("/subscribe")
	public String Subscribe(){
		return "subscribe";
	}
	
	@RequestMapping("/blog_detail")
	public String BlogDetail(){
		return "blog_detail";
	}
	
	@RequestMapping("/speaker_detail")
	public String SpeakerDetail(){
		return "speaker_detail";
	}
	
	// Handling Error redirected to error jsp page
	
	@ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest request, Exception e)   {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Request: " + request.getRequestURL() + " raised " + e);
        return new ModelAndView("error");
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handleError404(HttpServletRequest request, Exception e)   {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Request: " + request.getRequestURL() + " raised " + e);
        return new ModelAndView("error");
    }

}
