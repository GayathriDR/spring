package com.xworkz.web.dao;

import java.util.List;

import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.dto.ResetPasswordDTO;

public interface RegisterDAO {
	public void saveForm(RegisterDTO registerDTO);
	public List<RegisterDTO> getData();
	public long getMail(String mailId,String password);
	public long findByEmailId(String email,String newPassword);
	public void resetPassword(String email,String password,String confirmpassword);
	public RegisterDTO updateInfo(String email);
	public void updateForExsisting(String email,String userName,String password);
	

}
