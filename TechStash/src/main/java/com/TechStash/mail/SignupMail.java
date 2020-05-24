package com.TechStash.mail;

import java.io.UnsupportedEncodingException;

import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

public class SignupMail {
	public static void  WelcomeMail(String email,String name){
        
        
        String subject = "Thank you and Introduction from TechStash";
        
        InternetHeaders headers = new InternetHeaders();
        headers.addHeader("Content-type", "text/html; charset=UTF-8");
        String html = "Hi " + name + "\n\nI wanted to get in touch to say thanks for signing up with us! \nWe are all really looking forward to working with you! "
        		+ "\n\nI wanted to check to see if you have any questions about how we work or our process. \nIf you have any questions, I’m happy to chat! Just reply to this email."
        		+ "\n\nThanks and speak soon, \n\nKamal Shree \nCEO,TechStash";
        try {
			MimeBodyPart body = new MimeBodyPart(headers, html.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        MailCredential.sendMail(email,subject,html);
        System.out.println("Welcome Email Send Successfully to the user - "+email);
        
        
}

	public static void  LoginDetails(String name, String email, String password){
  
		 String subject = "Credentials from TechStash";
	        
	        InternetHeaders headers = new InternetHeaders();
	        headers.addHeader("Content-type", "text/html; charset=UTF-8");
	        String html = "Hi " + name + "\n\nBelow are the credentials to login to the TechStash Dashboard. \n\nUsername: " + email + ""
	        		+ "\nPassword: " + password + "\n\nIf you have any questions, I’m happy to chat! Just reply to this email."
	        		+ "\n\nThanks and speak soon, \n\nKamal Shree \nCEO,TechStash";
	        try {
				MimeBodyPart body = new MimeBodyPart(headers, html.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        MailCredential.sendMail(email,subject,html);
	        System.out.println("Login Credentials Send Successfully to the user - "+email);
  
}
	
	public static void  ForgotPassword(String name, String email, String password){
		  
		 String subject = "TechStash Forgot Password";
	        
	        InternetHeaders headers = new InternetHeaders();
	        headers.addHeader("Content-type", "text/html; charset=UTF-8");
	        String html = "Dear " + name + "\n\nAt your request, we have retrieved your password. \nPassword: " + password + ""
	        		+ "\n\nYour account security is important to us. If any of the above information is inaccurate, please contact us using the information below."
	        		+ "\n\nThank you, \nTechStash";
	        try {
				MimeBodyPart body = new MimeBodyPart(headers, html.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        MailCredential.sendMail(email,subject,html);
	        System.out.println("As per forgot password request, Password email has triggered to the user - "+email);
 
}
	
	public static void  ApproveMail(String name, String email, String phone, String location, String bio, String designation, String linkedin, String github, String twitter, String facebook){
		  
		 String subject = "Required Approval: New User SignedUp";
	        
	        String html = "Name : " + name + "\nEmail Address : "+ email +" \nPhone : " + phone + "\nLocation : "+ location + "\nBio : " + bio +" \nDesignation : " + designation + "\nLinkedin : "+ linkedin + "\nGithub : " + github +""
	       		+ "\nFacebook : " + facebook + "\n\nPlease use below url to approve"
	       	+ "\nhttps://techstash.in/approvalauth/"+email+"/2f1c1999c8897d77224133cfabei3f59c708e6f8f05872efa0e584e633db15/true"
	       	+ "\n\nPlease use below url to Decline"
	        + "\nhttps://techstash.in/decline/"+email+"/2f1c1999c8897d77224133cfabei3f59c708e6f8f05872efa0e584e633db15/false";
	        
		 InternetHeaders headers = new InternetHeaders();
         headers.addHeader("Content-type", "text/html; charset=UTF-8");
        // String html = "Test\n" + name + "\n<a href='http://test.com'>Test.com</a>";
         try {
				MimeBodyPart body = new MimeBodyPart(headers, html.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         
	        email="techstashinfo@gmail.com";        // Have to keep techstash email id techstashinfo@gmail.com
	        MailCredential.sendMail(email,subject,html);
	        System.out.println("Approval Send Successfully to the CEO");
 
}

}
