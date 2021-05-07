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
public class ForgotPasswordController {
	@Autowired
	private RegisterService registerService;
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	public ForgotPasswordController() {
		System.out.println("forgot password"+getClass().getSimpleName());
		
	}
	@RequestMapping("/send.odc")
	public String onForgotPassword(HttpServletRequest request,@ModelAttribute RegisterDTO registerDTO) {
		System.out.println("invoked onLogin");
		try {
			String mail=request.getParameter("email");
			boolean validateEmail=registerService.validateEmail(registerDTO);
			if(validateEmail) {
				return "resetPasswordSuccess";
			}
			else {
				return "invalid email,do register";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("cant login");
	    	 return " Error";
		}

}
}
