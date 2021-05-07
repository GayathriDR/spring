package com.xworkz.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@ToString
//@Setter
//@Getter
@Entity
@Table(name = "register_form")
@NamedQueries({ @NamedQuery(name = "fetchall", query = "from RegisterDTO "),
		@NamedQuery(name = "getMailId", query = "select count(*)  from RegisterDTO where id=:mailId and password=:pwd"),
		@NamedQuery(name = "getmail", query = "select count(*) from RegisterDTO where email=:mailid"),
		@NamedQuery(name = "update", query = "update RegisterDTO set password=:newpassword,cpassword=:confirmPassword where email=:emailId"),
		@NamedQuery(name="updateRandomPassword",query="update RegisterDTO set password=:randomPassword where email=:mail"),
		@NamedQuery(name="updateInfo",query="update RegisterDTO set username=:userName,password=:newPassword where email=:emailId")})
public class RegisterDTO implements Serializable {
	@Id
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Transient
//	@Column(name = "CONFIRM_PASSWORD")
	private String cpassword;
//	@Column(name = "RESET_PASSWORD_TOKEN")
//	private String reset_password_token;
//
//	public String getReset_password_token() {
//		return reset_password_token;
//	}
//
//	public void setReset_password_token(String reset_password_token) {
//		this.reset_password_token = reset_password_token;
//	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@Override
	public String toString() {
		return "RegisterDTO [username=" + username + ", email=" + email + ""
				 + "]";
	}

}
