package com.xworkz.shop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor

@Entity
@Table(name="shops")
public class ShopEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHOP_ID")
	private int shopId;
	
	@Column(name="SHOP_NAME")
	private String shopName;
	
	@Column(name="SHOP_LOCATION")
	private String shopLoction;
	
	@Column(name="OWNER_NAME")
	private String owenerName;
	
	@Column(name="SHOP_OPEN")
	private int shopOpen;
	
	public ShopEntity(String shopName, String shopLoction, String owenerName, int shopOpen) {
		super();
		this.shopName = shopName;
		this.shopLoction = shopLoction;
		this.owenerName = owenerName;
		this.shopOpen = shopOpen;
	}
	
	
	
	

}
