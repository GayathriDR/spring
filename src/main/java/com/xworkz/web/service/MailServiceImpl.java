package com.xworkz.web.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sendEmail.odc")
public class MailServiceImpl implements MailService {
	@Autowired
    private JavaMailSender javaMailSender;

	@Override
	@RequestMapping("/sendEmail.odc")

	    public String doSendEmail(String mailId) {
			System.out.println("mail send has invoked");
		 System.out.println("created emailform:"+getClass().getSimpleName());
	        // takes input from e-mail form
	     try {
	    	 
//	     
//		 String recipientAddress = request.getParameter("recipient");
//	        String subject = request.getParameter("subject");
//	        String message = request.getParameter("message");
//	         
	        // prints debug info
//	        System.out.println("To: " + recipientAddress);
//	        System.out.println("Subject: " + subject);
//	        System.out.println("Message: " + message);
	     // creates a simple e-mail object
	        SimpleMailMessage email = new SimpleMailMessage();
	        email.setTo(mailId);
	        email.setSubject("register integration with mail");
	        email.setText("hi you have successfully regitered the register form! thankyou!");
	     // sends the e-mail
	        javaMailSender.send(email);
	     }
	     catch (Exception e) {
	    	 e.printStackTrace();
	    	 System.out.println("cant send");
	    	 return " Error";
		}
	        // forwards to the view named "Result"
			return " Result";
	 

	}

	}


