package com.xworkz.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//@ToString
//@Setter
//@Getter
@Entity
@Table(name="register_form")
@NamedQueries({ @NamedQuery(name="fetchall",query="from RegisterDTO "),@NamedQuery(name="getMailId",query="select count(*)  from RegisterDTO where id=:mailId and password=:pwd")})
public class RegisterDTO implements Serializable {
	@Id
	@Column(name="EMAIL")
	private String email;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="CONFIRM_PASSWORD")
	private String cpassword;

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
		return "RegisterDTO [username=" + username + ", email=" + email + ", password=" + password
				+ ", cpassword=" + cpassword + "]";
	}
	
}
