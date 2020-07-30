package com.TechStash;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import com.TechStash.entity.Conference;
import com.TechStash.entity.Dashboard_users;
import com.TechStash.entity.Home_setting;
import com.TechStash.entity.Pricing_details;
import com.TechStash.entity.Subscriber;
import com.TechStash.mail.MailTemplate;
import com.TechStash.service.ContentService;
import com.TechStash.service.DashboardUserService;
import com.TechStash.service.HomeSettingService;

@Controller
public class AdminUserController {
	
	@Autowired
	private HomeSettingService homeSettingService;
	
	@Autowired
	private ContentService contentService;
	
	@Autowired
	private DashboardUserService dashboardUserService;
	
	@RequestMapping("/admin/admindashboard/login")
	public String Login(HttpServletRequest request,Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		Dashboard_users dashboard_users = new Dashboard_users();
		theModel.addAttribute("login", dashboard_users);
		return "admin/login";
	}
	
	@RequestMapping("/admin/admindashboard/index")
	public String validateUser(@ModelAttribute("users") Dashboard_users dashboard_users,HttpServletRequest request, Model theModel) {
		
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		
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
			
			Long subscriberCount=contentService.subscriberCount();
			theModel.addAttribute("subscriberCount", subscriberCount);
			
			Long unSubscriberCount=contentService.unSubscriberCount();
			theModel.addAttribute("unSubscriberCount", unSubscriberCount);
			
			Long organizerCount=contentService.organizerCount();
			theModel.addAttribute("organizerCount", organizerCount);
			
			List<Subscriber> subscriberLocation=contentService.subscriberLocations();
			theModel.addAttribute("subscriberLocation", subscriberLocation);
			
			// State Report
			List<Subscriber> stateReport=contentService.subscriberLocations();
			
			stateReportCalculation(stateReport, theModel);
			
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
			
			Long subscriberCount=contentService.subscriberCount();
			theModel.addAttribute("subscriberCount", subscriberCount);
			
			Long unSubscriberCount=contentService.unSubscriberCount();
			theModel.addAttribute("unSubscriberCount", unSubscriberCount);
			
			Long organizerCount=contentService.organizerCount();
			theModel.addAttribute("organizerCount", organizerCount);
			
			List<Subscriber> subscriberLocation=contentService.subscriberLocations();
			theModel.addAttribute("subscriberLocation", subscriberLocation);
			
			theModel.addAttribute("userdetails", dbresultModel);
			return "admin/index";
		}
		
		return "admin/popup_validation";
	}
	
	@RequestMapping("/admin/admindashboard/signup")
	public String Signup(HttpServletRequest request,Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
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
			MailTemplate.ApproveMail(dashboard_users.getName(), dashboard_users.getEmail(), dashboard_users.getPhone(), dashboard_users.getLocation(), dashboard_users.getBio(), dashboard_users.getDesignation(), dashboard_users.getLinkedin(), dashboard_users.getGithub(), dashboard_users.getTwitter(), dashboard_users.getFacebook());
			return "redirect:/admin/admindashboard/thanks_signup";
		}
		else{
			return "admin/popup_user";
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/thanks_signup")
	public String ThanksSignup(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "admin/thanks_signup";
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
			  MailTemplate.WelcomeUser(useremail, profilename);
			  MailTemplate.LoginDetails(profilename,useremail, userpass);
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
			  dashboardUserService.declineProfile(email);
			  return "Profile Declined & Record deleted from database";
		  }
		  else
		  {
			  return "error";
		  }
	  }
	  
	
	@RequestMapping("/admin/admindashboard/forgotpassword")
	public String ForgotPassword(HttpServletRequest request,Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
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
			MailTemplate.ForgotPassword(profilename,useremail, userpass); 
			return "redirect:/admin/admindashboard/thanks_forgot";
			}
			else
			{
				return "admin/popup_notexist";
			}
		}
		
	}
	
	@RequestMapping("/admin/admindashboard/thanks_forgot")
	public String ThanksForgot(Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		return "admin/thanks_forgotpassword";
	}
	
	@RequestMapping("/admin/admindashboard/profile")
	public String Profile(HttpServletRequest request, Model theModel){
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
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
	        String sessionDesignation=(String) session.getAttribute("designation");
	        if(sessionDesignation.equals("Founder/CEO/Admin")){
	        designation.put("Founder/CEO/Admin", "Founder/CEO/Admin");
	        }
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
	
	@RequestMapping("/admin/admindashboard/organizer")
	public String Organizer(HttpServletRequest request, Model theModel, @ModelAttribute("organizer") Dashboard_users dashboard_users) throws UnsupportedEncodingException{
		List<Home_setting> dbResultHomeSetting = homeSettingService.getResultWebsite();
		theModel.addAttribute("homeSetting", dbResultHomeSetting);
		HttpSession session = request.getSession();
		byte[] profileImage=null;
		String sessiondesignation=(String) session.getAttribute("designation");
		String sessionValue=(String) session.getAttribute("session"); 
		
		if(sessionValue==null && sessiondesignation==null){
			return "admin/popup_sessioninvalid";
		}
		
		if(sessionValue != null && sessiondesignation.equals("Founder/CEO/Admin")){
			
			List<Dashboard_users> result=dashboardUserService.getOrganizer();
			
			theModel.addAttribute("organizer", result);
			
			String sessionName=(String) session.getAttribute("name");
			byte[] image=(byte[]) session.getAttribute("image");
			byte[] encode = java.util.Base64.getEncoder().encode(image);
			try {
				theModel.addAttribute("image", new String(encode, "UTF-8"));
				theModel.addAttribute("name", sessionName);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return "admin/organizer";
		}
		else if(!sessiondesignation.equals("Founder/CEO/Admin")) {
			return "admin/popup_notfound";
		}
		else
		{
			return "admin/popup_sessioninvalid";
		}
		
	}
	
	  @GetMapping("/admin/admindashboard/updateorganizerstatus")
	  public String UpdateOrganizerStatus(@RequestParam("id") int id,@RequestParam("status") String status)
	  {
		  if(status.equals("true")){
			  status="false";
			  dashboardUserService.updateOrganizerStatus(id,status);
			  return "redirect:/admin/admindashboard/organizer";
		  }
		  else
		  {
			  status="true";
			  dashboardUserService.updateOrganizerStatus(id,status);
			  return "redirect:/admin/admindashboard/organizer";
		  }
	  }
	  
	  public void stateReportCalculation(List<Subscriber> stateReport, Model theModel)
	  {
		 
		  int ArunachalPradeshCount=0;
		  int AssamCount=0;
		  int BiharCount=0;
		  int ChhattisgarhCount=0;
		  int GoaCount=0;
		  int GujaratCount=0;
		  int HaryanaCount=0;
		  int HimachalPradeshCount=0;
		  int JharkhandCount=0;
		  int KarnatakaCount=0;
		  int KeralaCount=0;
		  int MadhyaPradeshCount=0;
		  int MaharashtraCount=0;
		  int ManipurCount=0;
		  int MeghalayaCount=0;
		  int MizoramCount=0;
		  int NagalandCount=0;
		  int AndhraPradesh=0;
		  int OdishaCount=0;
		  int PunjabCount=0;
		  int RajasthanCount=0;
		  int SikkimCount=0;
		  int TamilNaduCount=0;
		  int TelanganaCount=0;
		  int TripuraCount=0;
		  int UtterPradeshCount=0;
		  int UtterakhandCount=0;
		  int WestBengalCount=0;
		  
		  for(Subscriber dbResult : stateReport) {
				
				Pattern value1 = Pattern.compile("Arunachal Pradesh");
				Matcher stateDb1 = value1.matcher( dbResult.getLocation() );
				while (stateDb1.find()) {
					ArunachalPradeshCount++;
				}
				
				Pattern value2 = Pattern.compile("Assam");
				Matcher stateDb2 = value2.matcher( dbResult.getLocation() );
				while (stateDb2.find()) {
					AssamCount++;
				}
				
				Pattern value3 = Pattern.compile("Bihar");
				Matcher stateDb3 = value3.matcher( dbResult.getLocation() );
				while (stateDb3.find()) {
					BiharCount++;
				}
				
				Pattern value4 = Pattern.compile("Chhattisgarh");
				Matcher stateDb4 = value4.matcher( dbResult.getLocation() );
				while (stateDb4.find()) {
					ChhattisgarhCount++;
				}
				
				Pattern value5 = Pattern.compile("Goa");
				Matcher stateDb5 = value5.matcher( dbResult.getLocation() );
				while (stateDb5.find()) {
					GoaCount++;
				}
				
				Pattern value6 = Pattern.compile("Gujarat");
				Matcher stateDb6 = value6.matcher( dbResult.getLocation() );
				while (stateDb6.find()) {
					GujaratCount++;
				}
				
				Pattern value7 = Pattern.compile("Haryana");
				Matcher stateDb7 = value7.matcher( dbResult.getLocation() );
				while (stateDb7.find()) {
					HaryanaCount++;
				}
				
				Pattern value8 = Pattern.compile("Himachal Pradesh");
				Matcher stateDb8 = value8.matcher( dbResult.getLocation() );
				while (stateDb8.find()) {
					HimachalPradeshCount++;
				}
				
				Pattern value9 = Pattern.compile("Jharkhand");
				Matcher stateDb9 = value9.matcher( dbResult.getLocation() );
				while (stateDb9.find()) {
					JharkhandCount++;
				}
				
				Pattern value10 = Pattern.compile("Karnataka");
				Matcher stateDb10 = value10.matcher( dbResult.getLocation() );
				while (stateDb10.find()) {
					KarnatakaCount++;
				}
				
				Pattern value11 = Pattern.compile("Kerala");
				Matcher stateDb11 = value11.matcher( dbResult.getLocation() );
				while (stateDb11.find()) {
					KeralaCount++;
				}
				
				Pattern value12 = Pattern.compile("Madhya Pradesh");
				Matcher stateDb12 = value12.matcher( dbResult.getLocation() );
				while (stateDb12.find()) {
					MadhyaPradeshCount++;
				}
				
				Pattern value13 = Pattern.compile("Maharashtra");
				Matcher stateDb13 = value13.matcher( dbResult.getLocation() );
				while (stateDb13.find()) {
					MaharashtraCount++;
				}
				
				Pattern value14 = Pattern.compile("Manipur");
				Matcher stateDb14 = value14.matcher( dbResult.getLocation() );
				while (stateDb14.find()) {
					ManipurCount++;
				}
				
				Pattern value15 = Pattern.compile("Meghalaya");
				Matcher stateDb15 = value15.matcher( dbResult.getLocation() );
				while (stateDb15.find()) {
					MeghalayaCount++;
				}
				
				Pattern value16 = Pattern.compile("Mizoram");
				Matcher stateDb16 = value16.matcher( dbResult.getLocation() );
				while (stateDb16.find()) {
					MizoramCount++;
				}
				
				Pattern value17 = Pattern.compile("Nagaland");
				Matcher stateDb17 = value17.matcher( dbResult.getLocation() );
				while (stateDb17.find()) {
					NagalandCount++;
				}
				
				Pattern value18 = Pattern.compile("Odisha");
				Matcher stateDb18 = value18.matcher( dbResult.getLocation() );
				while (stateDb18.find()) {
					OdishaCount++;
				}
				
				Pattern value19 = Pattern.compile("Andhra Pradesh");
				Matcher stateDb19 = value19.matcher( dbResult.getLocation() );
				while (stateDb19.find()) {
					AndhraPradesh++;
				}
				
				Pattern value20 = Pattern.compile("Punjab");
				Matcher stateDb20 = value20.matcher( dbResult.getLocation() );
				while (stateDb20.find()) {
					PunjabCount++;
				}
				
				Pattern value21 = Pattern.compile("Rajasthan");
				Matcher stateDb21 = value21.matcher( dbResult.getLocation() );
				while (stateDb21.find()) {
					RajasthanCount++;
				}
				
				Pattern value22 = Pattern.compile("Sikkim");
				Matcher stateDb22 = value22.matcher( dbResult.getLocation() );
				while (stateDb22.find()) {
					SikkimCount++;
				}
				
				Pattern value23 = Pattern.compile("Tamil Nadu");
				Matcher stateDb23 = value23.matcher( dbResult.getLocation() );
				while (stateDb23.find()) {
					TamilNaduCount++;
				}
				
				Pattern value24 = Pattern.compile("Telangana");
				Matcher stateDb24 = value24.matcher( dbResult.getLocation() );
				while (stateDb24.find()) {
					TelanganaCount++;
				}
				
				Pattern value25 = Pattern.compile("Tripura");
				Matcher stateDb25 = value25.matcher( dbResult.getLocation() );
				while (stateDb25.find()) {
					TripuraCount++;
				}
				
				Pattern value26 = Pattern.compile("Uttar Pradesh");
				Matcher stateDb26 = value26.matcher( dbResult.getLocation() );
				while (stateDb26.find()) {
					UtterPradeshCount++;
				}
				
				Pattern value27 = Pattern.compile("Uttarakhand");
				Matcher stateDb27 = value27.matcher( dbResult.getLocation() );
				while (stateDb27.find()) {
					UtterakhandCount++;
				}
				
				Pattern value28 = Pattern.compile("West Bengal");
				Matcher stateDb28 = value28.matcher( dbResult.getLocation() );
				while (stateDb28.find()) {
					WestBengalCount++;
				}
				
	        }
			theModel.addAttribute("ArunachalPradeshCount", ArunachalPradeshCount);
			theModel.addAttribute("AssamCount", AssamCount);
			theModel.addAttribute("BiharCount", BiharCount);
			theModel.addAttribute("ChhattisgarhCount", ChhattisgarhCount);
			theModel.addAttribute("GoaCount", GoaCount);
			theModel.addAttribute("GujaratCount", GujaratCount);
			theModel.addAttribute("HaryanaCount", HaryanaCount);
			theModel.addAttribute("HimachalPradeshCount", HimachalPradeshCount);
			theModel.addAttribute("JharkhandCount", JharkhandCount);
			theModel.addAttribute("KarnatakaCount", KarnatakaCount);
			theModel.addAttribute("KeralaCount", KeralaCount);
			theModel.addAttribute("MadhyaPradeshCount", MadhyaPradeshCount);
			theModel.addAttribute("MaharashtraCount", MaharashtraCount);
			theModel.addAttribute("ManipurCount", ManipurCount);
			theModel.addAttribute("MeghalayaCount", MeghalayaCount);
			theModel.addAttribute("MizoramCount", MizoramCount);
			theModel.addAttribute("NagalandCount", NagalandCount);
			theModel.addAttribute("AndhraPradesh", AndhraPradesh);
			theModel.addAttribute("OdishaCount", OdishaCount);
			theModel.addAttribute("PunjabCount", PunjabCount);
			theModel.addAttribute("RajasthanCount", RajasthanCount);
			theModel.addAttribute("SikkimCount", SikkimCount);
			theModel.addAttribute("TamilNaduCount", TamilNaduCount);
			theModel.addAttribute("TelanganaCount", TelanganaCount);
			theModel.addAttribute("TripuraCount", TripuraCount);
			theModel.addAttribute("UtterPradeshCount", UtterPradeshCount);
			theModel.addAttribute("UtterakhandCount", UtterakhandCount);
			theModel.addAttribute("WestBengalCount", WestBengalCount);
			
	  }
	
}
