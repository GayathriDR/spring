package com.xworkz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class RegisterComponent {
	public RegisterComponent() {
		System.out.println("registerd"+getClass().getSimpleName());
	}
	@RequestMapping("/register.odc")
	public String onRegister(@RequestParam("username")String name,@RequestParam("email")String email,@RequestParam("password")String password,@RequestParam("cpassword")String confirmpassword) {
		System.out.println("invoked onregister");
		System.out.println("UserName:"+name+" Email:"+email+" password:"+password+" Confirm Password:"+confirmpassword);
		
		return "/success.jsp";
		
	}

}
