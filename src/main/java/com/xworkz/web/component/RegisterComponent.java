package com.xworkz.web.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.RegisterService;

@Component
@RequestMapping("/")
public class RegisterComponent {
	@Autowired
	private RegisterService registerService;
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	public RegisterComponent() {
		System.out.println("registerd"+getClass().getSimpleName());
	}
	@RequestMapping("/register.odc")
	public String onRegister(@ModelAttribute RegisterDTO registerDTO,Model model) {
		System.out.println("invoked onregister");
		System.out.println(registerDTO);
		boolean validUser=registerService.validateForm(registerDTO);
		model.addAttribute("username",registerDTO.getUsername());
//		return "success";
		if(validUser)
		{
			return " Result";
		}
		else {
			
		}
		return "register";
		
	}

}
