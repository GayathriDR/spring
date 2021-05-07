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
public class UpdateForExsistingController {
		
		@Autowired
		private RegisterService registerService;

		public RegisterService getRegisterService() {
			return registerService;
		}

		public void setRegisterService(RegisterService registerService) {
			this.registerService = registerService;
		}

		public UpdateForExsistingController() {
			System.out.println("login details" + getClass().getSimpleName());

		}

		@RequestMapping("/newData.odc")
		public String updateExsistingData(HttpServletRequest request, @ModelAttribute RegisterDTO registerDTO,Model model) {
			System.out.println("invoked updateExsistingData");
			try {
//				String userName=request.getParameter("username");
//				String password=request.getParameter("password");
//				String email=request.getParameter("email");
				boolean updateData=registerService.updateForExsisting(registerDTO);
				if(updateData) {
					return "updatesuccess";
				}
				else {
					return "TobeUpdate";
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("cant login");
		    	 return "login";
			}
			
		}

}
