package com.xworkz.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dao.ProductsDAO;
import com.xworkz.web.dao.RegisterDAO;
import com.xworkz.web.dto.ProductsDTO;
import com.xworkz.web.dto.RegisterDTO;
@Component
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	private ProductsDAO productsDAO;

	
	public ProductsDAO getProductsDAO() {
		return productsDAO;
	}


	public void setProductsDAO(ProductsDAO productsDAO) {
		this.productsDAO = productsDAO;
	}


	@Override
	public boolean validateSaveProducts(ProductsDTO productsDTO) {
		System.out.println("invoked validateSaveProducts");
		System.out.println("ProductsDTO:"+productsDTO);
		boolean valid=false;
		String productName=productsDTO.getProductName();
		int productQuantity=productsDTO.getProductquantity();
		double productPrice=productsDTO.getProductPrice();
		String productVendor=productsDTO.getProductVendor();
		if(productsDTO!=null) {
			
			if(productName!="" &&productName.length()>=2&&productName.length()<=25) {
				System.out.println("productname is valid you can save");
				valid=true;
			}
			else {
				System.out.println("provide proper product name");
				valid=false;
			}
			if(valid) {
				if(productQuantity!=0) {
					System.out.println("productQuantity is valid can save");
					valid=true;
					
				}
				else {
					System.out.println("provide productquantity minimum 1 ");
					valid=false;
					
				}
				
			}
			if(valid) {
				if(productPrice!=0.0 && productPrice>=10 &&productPrice<=1000) {
					System.out.println("productprice is valid can save");
					valid=true;
				}
				else {
					System.out.println("productprice should be minimum 10 and maximun 1000");
					valid=false;
				}
			}
			if(valid) {
				if(productVendor!=null&&productVendor.length()>=2&& productVendor.length()<=25) {
					System.out.println("product vendor is valid can save");
					valid=true;
				}
				else {
					System.out.println("product vendor is invalid select atleast one product vendor");
					valid=false;
				}
			}
			
		}
		
		else {
			System.out.println("provide properproductDTO");
		}
		if(valid==true) {
			productsDAO.saveProducts(productsDTO);
		}
		return valid;
	}


	@Override
	public List<ProductsDTO> getProducts() {
		System.out.println("invoked with getProducts");
		return productsDAO.getProducts();
	}


	@Override
	public List<ProductsDTO> getProducts(int page_id, int total) {
		
		return productsDAO.getProducts(page_id,total);
	}

}
