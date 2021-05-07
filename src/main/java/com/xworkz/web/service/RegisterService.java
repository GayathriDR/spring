package com.xworkz.web.service;

import java.util.List;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.dto.ResetPasswordDTO;

public interface RegisterService {
	public boolean validateForm(RegisterDTO registerDTO);
	public List<RegisterDTO> findAll();
	public boolean validateEmailandPassword(RegisterDTO registerDTO);
	public boolean validateEmail(RegisterDTO registerDTO);
	public boolean resetPassword(RegisterDTO registerDTO);
	public RegisterDTO findMailandUpdate(RegisterDTO registerDTO);
	public boolean updateForExsisting(RegisterDTO registerDTO);


}
