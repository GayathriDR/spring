package com.xworkz.jpa.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@RequiredArgsConstructor

@Table(name="bank")
@Entity
@NamedQueries({@NamedQuery(name="fetchall", query="SELECT b FROM BankEntity b"),@NamedQuery(name="update", query="UPDATE bankName set bankIfsc=:ifsccode where bankId=:id")})
public class BankEntity implements Serializable  {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="BANK_ID")
	private int bankId;
	@Column(name="BANK_NAME")
	private String bankName;
	@Column(name="BANK_IFSC")
	private String bankIfsc;
	@Column(name="BANK_ACCOUNT")
	private String bankAccountNumber;
	public BankEntity() {
		
	}
	
	public BankEntity(String bankName,String bankIfsc,String bankAccountNumber) {
		this.bankName=bankName;
		this.bankIfsc=bankIfsc;
		this.bankAccountNumber=bankAccountNumber;
	}
	
	
	

}
