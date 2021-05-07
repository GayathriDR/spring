package com.xworkz.web.dto;

public class ResetPasswordDTO {
	
	
	private String email;
	private String randPaassword;
	private String password;
	private String confirmPassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRandPaassword() {
		return randPaassword;
	}
	public void setRandPaassword(String randPaassword) {
		this.randPaassword = randPaassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "ResetPasswordDTO [email=" + email + ", randPaassword=" + randPaassword + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
	

}
