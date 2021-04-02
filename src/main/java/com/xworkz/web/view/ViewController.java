package com.xworkz.web.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.RegisterService;

@Component
@RequestMapping("/")
public class ViewController {
	@Autowired
	private RegisterService registerService;
	
	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	 public ViewController() {
		 System.out.println("view details"+getClass().getSimpleName());
	}
	@RequestMapping("/viewRegister.odc")
	public String onViewRegister(@ModelAttribute RegisterDTO registerDTO,Model model) {
		System.out.println("invoked view register");
		System.out.println(registerDTO);
		List<RegisterDTO> dtoList=registerService.findAll();
		System.out.println(dtoList);
		model.addAttribute("list", dtoList);
		

		System.out.println("done with view");
		return "viewRegister";
		
	}
	

}
