package com.xworkz.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

import com.xworkz.web.dao.RegisterDAO;
import com.xworkz.web.dto.RegisterDTO;
@Component
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterDAO registerDAO;
	@Autowired
	private MailService mailservice;
	

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


	

}
