package com.xworkz.web.service;

import java.util.List;

import com.xworkz.web.dto.ProductsDTO;
import com.xworkz.web.dto.RegisterDTO;

public interface ProductsService {
	public boolean validateSaveProducts(ProductsDTO productsDTO);
	public List<ProductsDTO> getProducts();
	public List<ProductsDTO> getProducts(int page_id,int total);

}
