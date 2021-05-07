package com.xworkz.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.xworkz.web.dao.RegisterDAO;
import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.dto.ResetPasswordDTO;
import com.xworkz.web.logic.RandomPassword;
@Component
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterDAO registerDAO;
	@Autowired
	private MailService mailservice;
	@Autowired
    private JavaMailSender javaMailSender;
	@Autowired
	private RandomPassword randomPassword;
	
	
	

	public MailService getMailservice() {
		return mailservice;
	}


	public void setMailservice(MailService mailservice) {
		this.mailservice = mailservice;
	}


	public RegisterDAO getRegisterDAO() {
		return registerDAO;
	}


	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}

	@Override
	public boolean validateForm(RegisterDTO registerDTO) {
		System.out.println("invoked validateform");
		System.out.println("RegisterDTO:"+registerDTO);
		String username=registerDTO.getUsername();
		String email=registerDTO.getEmail();
		String password=registerDTO.getPassword();
		String confirmPassword=registerDTO.getCpassword();
		boolean valid=false;
		if(registerDTO!=null) {
			if(username!=null&&username.length()>=3&&username.length()<=20) {
				System.out.println("username is valid can save");
				valid=true;
			}
			else{
				System.out.println("username invalid, provide minimum 3 charecters or maximum 20 charecters and it should not be empty,cant save the data");
				valid=false;
			}
			if(valid) {
				if(email!=null && email.length()>=5&&email.length()<=30) {
					System.out.println("email is valid can save");
					valid=true;
					
				}
				else{
					System.out.println("email is invalid, provide minimum 5 charecters or maximum 15 charecters and it should not be empty,cant save the data");
					valid=false;
				}
			}
			if(valid) {
				if(password!=null&&password.length()>=4&&password.length()<=20) {
					System.out.println("password is valid can save");
					valid=true;
				}
				else{
					System.out.println("password is invalid, provide minimum 4 charecters or maximum 15 charecters and it should not be empty,cant save the data");
					valid=false;
				}
			}
			if(valid) {
				if(confirmPassword.equals(password)) {
					System.out.println("both password and confirmpassword is equal , can save");
					valid=true;
				}
				else{
					System.out.println("password and confirmpassword are not matching, both should equal");
					valid=false;
				}
				
			}
			
			
		}
		else {
			System.out.println("fill the data to RegisterForm");
		}
		if(valid==true){
			registerDAO.saveForm(registerDTO);
			mailservice.doSendEmail(registerDTO.getEmail());
		
		}
		return valid;
	}

	@Override
	public List<RegisterDTO> findAll() {
		System.out.println("done with service");
		return registerDAO.getData();
	}

	@Override
	public boolean validateEmailandPassword(RegisterDTO registerDTO) {
		System.out.println("invoked validateform");
		String mail=registerDTO.getEmail();
		String password=registerDTO.getPassword();
		registerDAO.getMail(mail, password); 
		long register= registerDAO.getMail(mail, password);
		if(register==1) {
			System.out.println("successfully loged-in");
			return true;
		}
		else {
			System.out.println("unable todo mail fetch");
			return false;
		}
		
		
		
		
		
		
		
	}

	@Override
	public boolean validateEmail(RegisterDTO registerDTO) {
		System.out.println("invoked validateform for forgot password");
		String email=registerDTO.getEmail();
		String randPassword=randomPassword.alphaNumericString(10);
		registerDTO.setPassword(randPassword);
		Long registerMail=registerDAO.findByEmailId(email,randPassword);
		if(registerMail==1) {
//			String rand=RandomPassword.alphaNumericString(9);
//			SimpleMailMessage email = new SimpleMailMessage();
//	        email.setTo(recipientAddress);
//	        email.setSubject(subject);
//	        email.setText(message);
//	     // sends the e-mail
//	        javaMailSender.send(email);
//			registerDTO.setPassword(rand);
			SimpleMailMessage mailMessage=new SimpleMailMessage();
			mailMessage.setTo(email);
			mailMessage.setSubject("forgotpassword");
			mailMessage.setText(randPassword);
//			registerDTO.setPassword(rand);
			
			javaMailSender.send(mailMessage);
		
			System.out.println("email is present");
			return true;
		}
		else {
			System.out.println("unable find the mailid ");
			return false;
		}
	}


	@Override
	public boolean resetPassword(RegisterDTO registerDTO){
		System.out.println("invoked resetpassword service");
		String email=registerDTO.getEmail();
//		String randPassword=registerDTO.getRandPaassword();
		String password=registerDTO.getPassword();
		String confirmPassword=registerDTO.getCpassword();
		boolean valid=false;
		if(registerDTO!=null) {
			if(password!=null&&password.length()>=4&&password.length()<=20) {
				System.out.println("password is valid can save");
				valid=true;
			}
			else{
				System.out.println("password is invalid, provide minimum 4 charecters or maximum 15 charecters and it should not be empty,cant save the data");
				valid=false;
			}
		}
		if(valid) {
			if(confirmPassword.equals(password)) {
				System.out.println("both password and confirmpassword is equal , can save");
				valid=true;
			}
			else{
				System.out.println("password and confirmpassword are not matching, both should equal");
				valid=false;
			}
			
		}
		if(valid==true) {
			registerDAO.resetPassword(email,password,confirmPassword);
			System.out.println("done with resetpassword service");
			
		}
		
		return valid;
	}


	@Override
	public RegisterDTO findMailandUpdate(RegisterDTO registerDTO) {
		System.out.println("invoked findMailandUpdate service");
		String mail=registerDTO.getEmail();
		RegisterDTO registerMailData=registerDAO.updateInfo(mail);
		return registerMailData;
	}


	@Override
	public boolean updateForExsisting(RegisterDTO registerDTO) {
		String userName=registerDTO.getUsername();
		String password=registerDTO.getPassword();
		String email=registerDTO.getEmail();
		boolean valid=false;
		if(userName!=null&&userName.length()>=3&&userName.length()<=20) {
			System.out.println("username is valid can save");
			valid=true;
		}
		else{
			System.out.println("username invalid, provide minimum 3 charecters or maximum 20 charecters and it should not be empty,cant save the data");
			valid=false;
		}
		if(valid) {
			if(password!=null&&password.length()>=4&&password.length()<=20) {
				System.out.println("password is valid can save");
				valid=true;
			}
			else{
				System.out.println("password is invalid, provide minimum 4 charecters or maximum 15 charecters and it should not be empty,cant save the data");
				valid=false;
			}
		}
		if(valid==true){
			registerDAO.updateForExsisting(email,userName,password);
			System.out.println("done with update for exsisting");
			mailservice.doSendEmail(registerDTO.getEmail());
		
		}
		return valid;
		}


	

}
