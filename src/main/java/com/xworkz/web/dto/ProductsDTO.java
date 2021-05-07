package com.xworkz.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="products")
@NamedQueries({@NamedQuery(name="Fetch",query="from ProductsDTO")})
public class ProductsDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private int productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_QUANTITY")
	private int productquantity;
	
	@Column(name="PRODUCT_PRICE")
	private double productPrice;
	
	@Column(name="PRODUCT_VENDOR")
	private String productVendor;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	
	@Override
	public String toString() {
		return "ProductsDTO [productId=" + productId + ", productName=" + productName + ", productquantity="
				+ productquantity + ", productPrice=" + productPrice + ", productVendor=" + productVendor + "]";
	}
	


}
