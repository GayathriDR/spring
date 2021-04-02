package com.xworkz.web.service;

import java.util.List;

import com.xworkz.web.dto.RegisterDTO;

public interface RegisterService {
	public boolean validateForm(RegisterDTO registerDTO);
	public List<RegisterDTO> findAll();
	public boolean validateEmailandPassword(RegisterDTO registerDTO);


}
