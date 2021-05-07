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

public class UpdateController {
	@Autowired
	private RegisterService registerService;

	public RegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public UpdateController() {
		System.out.println("login details" + getClass().getSimpleName());

	}

	@RequestMapping("/update.odc")
	public String updateInfo(HttpServletRequest request, @ModelAttribute RegisterDTO registerDTO,Model model) {
		System.out.println("invoked updateInfo");
		try {
//			String mail=request.getParameter("email");
			RegisterDTO updatedData=registerService.findMailandUpdate(registerDTO);
			model.addAttribute("Data", updatedData);
			if(updatedData!=null) {
				model.addAttribute("data", updatedData);
				return "TobeUpdate";
				
			}
			else {
				return "update";
			}
			
		}

	catch(

	Exception e)
	{
		e.printStackTrace();
		System.out.println("cant login");
		return "update";
	}

}

}
