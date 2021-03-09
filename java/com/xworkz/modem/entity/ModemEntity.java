package com.xworkz.modem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table(name="modem")
public class ModemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MODEM_ID")
	private int modemId;
	@Column(name="BRAND")
	private String brand;
	@Column(name="BANDWIDTH")
	private String bandwidth;
	@Column(name="TYPE")
	private String type;
	@Column(name="MODEM_RANGE")
	private int range;
	@Column(name="MODEL_NO")
	private double modelNo;
	
	public ModemEntity(String brand, String bandwidth, String type, int range, double modelNo) {
		super();
		this.brand = brand;
		this.bandwidth = bandwidth;
		this.type = type;
		this.range = range;
		this.modelNo = modelNo;
	}
	

	

}
