package com.TechStash.mail;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailCredential {
	
	public static List<String> Credential()
	{
		String host ="smtp.gmail.com" ;
        String user = "techstashinfo@gmail.com";
        String pass = "pyiqdsngsxilmxkn";               
        String from = "techstashinfo@gmail.com";

		return Arrays.asList(host, user, pass, from);
	}

	
	public static void sendMail(String to, String subject, String messageText){
		
		try{
			
			List<String> login = Credential();
			
			
		 boolean sessionDebug = false;

         Properties props = System.getProperties();

         props.put("mail.smtp.starttls.enable", "true");
         props.put("mail.smtp.host", login.get(0));
         props.put("mail.smtp.port", "587");
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.starttls.required", "true");

         java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
         Session mailSession = Session.getDefaultInstance(props, null);
         mailSession.setDebug(sessionDebug);
         Message msg = new MimeMessage(mailSession);
         msg.setFrom(new InternetAddress(login.get(3)));
         InternetAddress[] address = {new InternetAddress(to)};
         msg.setRecipients(Message.RecipientType.TO, address);
         msg.setSubject(subject); msg.setSentDate(new Date());
         msg.setText(messageText);

        Transport transport=mailSession.getTransport("smtp");
        transport.connect(login.get(0), login.get(1), login.get(2));
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
     }catch(Exception ex)
     {
         System.out.println(ex);
     }
	
	}
	
}
	