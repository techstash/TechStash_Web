package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.TechStash.entity.Dashboard_users;
import com.TechStash.mail.SignupMail;
import com.TechStash.service.DashboardUserService;

@Controller
public class AdminUserController {
	
	@Autowired
	private DashboardUserService dashboardUserService;
	
	@RequestMapping("/admin/admindashboard/login")
	public String Login(HttpServletRequest request,Model theModel){
		Dashboard_users dashboard_users = new Dashboard_users();
		theModel.addAttribute("login", dashboard_users);
		return "admin/login";
	}
	
	@RequestMapping("/admin/admindashboard/index")
	public String validateUser(@ModelAttribute("users") Dashboard_users dashboard_users,HttpServletRequest request, Model theModel) {
		String status="false";
		String designation=null;
		byte[] image=null;
		String name=null;
		String password=null;
		String email=null;
		int id;
		List<Dashboard_users> validateAuth = dashboardUserService.validateUser(dashboard_users.getEmail(), dashboard_users.getPassword());
		HttpSession session = request.getSession();
		boolean value = validateAuth.isEmpty(); 
		
		for(Dashboard_users authDbresult : validateAuth) {
            email=authDbresult.getEmail();
            password=authDbresult.getPassword();
        }
		
		List<Dashboard_users> result=dashboardUserService.getEmail(dashboard_users.getEmail());
		  for(Dashboard_users dbresult : result) {
	            status=dbresult.getStatus();
	            id=dbresult.getId();
	            designation=dbresult.getDesignation();
	            image=dbresult.getImage();
	            name=dbresult.getName();
	            session.setAttribute("id", id);
	            session.setAttribute("designation", designation);
	        }
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue==null){
		if(value==true ){
			return "admin/popup_validation";
		}
		}
		
		if(value==false && status.equals("true") && dashboard_users.getEmail().equals(email) && dashboard_users.getPassword().equals(password)){
			session.setAttribute("session", dashboard_users.getEmail());
			int sessionId=(int) session.getAttribute("id");
			Dashboard_users dbresultModel=dashboardUserService.getUserDetail(sessionId);
			session.setAttribute("image", dbresultModel.getImage());
	        session.setAttribute("name", dbresultModel.getName());
			byte[] encode = java.util.Base64.getEncoder().encode(dbresultModel.getImage());
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			theModel.addAttribute("userdetails", dbresultModel);
			return "admin/index";
		}
		
		if(sessionValue != null){
			int sessionId=(int) session.getAttribute("id");
			Dashboard_users dbresultModel=dashboardUserService.getUserDetail(sessionId);
			session.setAttribute("image", dbresultModel.getImage());
	        session.setAttribute("name", dbresultModel.getName());
			byte[] encode = java.util.Base64.getEncoder().encode(dbresultModel.getImage());
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			theModel.addAttribute("userdetails", dbresultModel);
			return "admin/index";
		}
		
		return "admin/popup_validation";
	}
	
	@RequestMapping("/admin/admindashboard/signup")
	public String Signup(HttpServletRequest request,Model theModel){
		Dashboard_users dashboard_users = new Dashboard_users();

		theModel.addAttribute("user", dashboard_users);
		
		return "admin/signup";
	}
	
	@PostMapping("/admin/admindashboard/signupaction")
	public String saveUser(@ModelAttribute("users") Dashboard_users dashboard_users,HttpServletRequest request, @RequestParam MultipartFile photo) {
		
	List<Dashboard_users> result=dashboardUserService.getEmail(dashboard_users.getEmail());
		
		try {
			byte[] photoBytes = photo.getBytes();
			dashboard_users.setImage(photoBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(result.isEmpty()){
			dashboardUserService.saveUsers(dashboard_users);
			SignupMail.ApproveMail(dashboard_users.getName(), dashboard_users.getEmail(), dashboard_users.getPhone(), dashboard_users.getLocation(), dashboard_users.getBio(), dashboard_users.getDesignation(), dashboard_users.getLinkedin(), dashboard_users.getGithub(), dashboard_users.getTwitter(), dashboard_users.getFacebook());
			return "admin/thanks_signup";
		}
		else{
			return "admin/popup_user";
		}
		
	}
	
	  @GetMapping("/approvalauth/{email}/{key}/{status}")
	  @ResponseBody
	  public String ApproveProfile(@PathVariable("email") String email,@PathVariable("key") String key,@PathVariable("status") String status)
	  {
		  String useremail=null;
		  String profilename=null;
		  String userpass=null;
		  if(key.equals("2f1c1999c8897d77224133cfabei3f59c708e6f8f05872efa0e584e633db15")){
			  dashboardUserService.approveProfile(email,status);
			  
			  List<Dashboard_users> result=dashboardUserService.getEmail(email);
			  for(Dashboard_users dashboard_users : result) {
		            useremail=dashboard_users.getEmail();
		            profilename=dashboard_users.getName();
		            userpass=dashboard_users.getPassword();
		        }
			  SignupMail.WelcomeMail(useremail, profilename);
			  SignupMail.LoginDetails(profilename,useremail, userpass);
			  return "Profile Approved";
		  }
		  else
		  {
			  return "error";
		  }
	  }
	  
	  @GetMapping("/decline/{email}/{key}/{status}")
	  @ResponseBody
	  public String DeclineProfile(@PathVariable("email") String email,@PathVariable("key") String key,@PathVariable("status") String status)
	  {
		  if(key.equals("2f1c1999c8897d77224133cfabei3f59c708e6f8f05872efa0e584e633db15")){
			  
			  return "Profile Declined";
		  }
		  else
		  {
			  return "error";
		  }
	  }
	  
	
	@RequestMapping("/admin/admindashboard/forgotpassword")
	public String ForgotPassword(HttpServletRequest request,Model theModel){
		Dashboard_users dashboard_users = new Dashboard_users();
		theModel.addAttribute("forgotpassword", dashboard_users);
		return "admin/forgotpassword";
	}
	
	@PostMapping("/admin/admindashboard/forgotpasswordaction")
	public String ForgotPasswordAction(@ModelAttribute("forgotpassword") Dashboard_users dashboard_users,HttpServletRequest request) {
	
	String useremail=null;
	String profilename=null;
	String userpass=null;
	String userstatus=null;
	
	List<Dashboard_users> result=dashboardUserService.getEmail(dashboard_users.getEmail());
	
		if(result.isEmpty()){
			return "admin/popup_notexist";
		}
		else{
			 for(Dashboard_users dbresult : result) {
				 	useremail=dbresult.getEmail();
				 	profilename=dbresult.getName();
		            userpass=dbresult.getPassword();
		            userstatus=dbresult.getStatus();
		        }
			if(userstatus.equals("true")){ 
			SignupMail.ForgotPassword(profilename,useremail, userpass); 
			return "admin/thanks_forgotpassword";
			}
			else
			{
				return "admin/popup_notexist";
			}
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/profile")
	public String Profile(HttpServletRequest request, Model theModel){
		HttpSession session = request.getSession();
		String sessionValue=(String) session.getAttribute("session"); 
		if(sessionValue != null){
			int sessionId=(int) session.getAttribute("id");
			Dashboard_users dbresult=dashboardUserService.getUserDetail(sessionId);
			theModel.addAttribute("userdetails", dbresult);
			byte[] encode = java.util.Base64.getEncoder().encode(dbresult.getImage());
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Map<String, String> designation = new HashMap<>();
	        designation.put("TSO(TechStash Organizers)", "TSO(TechStash Organizers)");
	        designation.put("TSC (TechStash corodinator)", "TSC (TechStash corodinator)");
	        designation.put("TSC (TechStash chapter)", "TSC (TechStash chapter)");
	        designation.put("TSM (TechStash Members)", "TSM (TechStash Members)");
	        designation.put("Volunteer", "Volunteer");
	        designation.put("Founder/CEO/Admin", "Founder/CEO/Admin");
	        theModel.addAttribute("designation", designation);
	        
			return "admin/profile";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
			
		}
	
	
	@PostMapping("/admin/admindashboard/profileupdate")
	public String profileUpdate(@ModelAttribute("userdetails") Dashboard_users dashboard_users,HttpServletRequest request, @RequestParam(required = false, value = "photo") MultipartFile photo) {
		HttpSession session = request.getSession();
		try {
			if(photo!=null){
			byte[] photoBytes = photo.getBytes();
			dashboard_users.setImage(photoBytes);
			session.setAttribute("image", dashboard_users.getImage());}
		} catch (IOException e) {
			e.printStackTrace();
		}
	String sessionDesingation=(String) session.getAttribute("designation");
	byte[] sessionImage=(byte[]) session.getAttribute("image"); 
	
	if(photo==null){
		dashboard_users.setImage(sessionImage);
	}
	
	String designation=dashboard_users.getDesignation();
	if(dashboard_users.getDesignation()==null){
		designation=sessionDesingation;
		session.setAttribute("designation", designation);
	}
	
	dashboardUserService.profileUpdate(dashboard_users.getId(), dashboard_users.getName(), dashboard_users.getPassword(), dashboard_users.getPhone(), dashboard_users.getLocation(),dashboard_users.getImage(), 
						dashboard_users.getBio(), designation, dashboard_users.getLinkedin(), dashboard_users.getGithub(), dashboard_users.getTwitter(), dashboard_users.getFacebook());
				
			 	return "redirect:/admin/admindashboard/profile";
			
		 
	}
	
	@RequestMapping("/admin/admindashboard/logout")
	public String Logout(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.invalidate();
		return "admin/logout";
	}
	
}
