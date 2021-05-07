package com.xworkz.web.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.dto.ResetPasswordDTO;
import com.xworkz.web.service.RegisterService;

//@Component
//@RequestMapping("/")
//public class ResetPasswordController {
//	@Autowired
//	private RegisterService registerService;
//	
//	public RegisterService getRegisterService() {
//		return registerService;
//	}
//	public void setRegisterService(RegisterService registerService) {
//		this.registerService = registerService;
//	}
//	public ResetPasswordController() {
//		System.out.println("login details"+getClass().getSimpleName());
//		
//	}
//	@RequestMapping("/changepassword.odc")
//	public String onResetPassword(HttpServletRequest request,@ModelAttribute RegisterDTO registerDTO) {
//		System.out.println("invoked resetpassword");
//		try {
//			String mail=request.getParameter("email");
//			String randomPassword=request.getParameter("randompassword");
//			String password=request.getParameter("password");
//			String confirmPassword=request.getParameter("cpassword");
//			boolean validateResetPassword=registerService.resetPassword(registerDTO);
//			if(validateResetPassword) {
//				return "resetPasswordSuccess";
//			}
//			else {
//				return "invalid email,do register";
//			} 
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("cant change the password");
//	    	 return " Error";
//		}
//}
//}
