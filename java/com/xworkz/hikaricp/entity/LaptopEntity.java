package com.xworkz.hikaricp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariConfig;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@RequiredArgsConstructor
@Entity
@ToString
@Table(name="laptop")
public class LaptopEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LAPTOP_ID")
	private int laptopId;
	@Column(name="LAPTOP_BRAND")
	private String laptopBrand;
	
	public LaptopEntity(String laptopBrand){
		super();
		this.laptopBrand=laptopBrand;
	}
	
}
