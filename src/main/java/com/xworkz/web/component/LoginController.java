package com.xworkz.web.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.RegisterService;

@Component
@RequestMapping("/")
public class LoginController {
	@Autowired
	private RegisterService registerService;
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	public LoginController() {
		System.out.println("login details"+getClass().getSimpleName());
		
	}
	@RequestMapping("/login.odc")
	public String onLogin(HttpServletRequest request,RegisterDTO registerDTO,Model model) {
		System.out.println("invoked onLogin");
		try {
			String mail=request.getParameter("email");
			String password=request.getParameter("password");
			boolean validateEmailandPassword = registerService.validateEmailandPassword(registerDTO);
			model.addAttribute("username", registerDTO.getUsername());
			if(validateEmailandPassword) {
				return "home";
				
			}
			else {
				return "login";
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("cant login");
	    	 return "login";
		}
		
	}

}
