package com.xworkz.web.dao;

import java.util.List;

import com.xworkz.web.dto.RegisterDTO;

public interface RegisterDAO {
	public void saveForm(RegisterDTO registerDTO);
	public List<RegisterDTO> getData();
	public long getMail(String mailId,String password);
	

}
