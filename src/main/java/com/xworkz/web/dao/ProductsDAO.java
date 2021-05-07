package com.xworkz.web.dao;

import java.util.List;

import com.xworkz.web.dto.ProductsDTO;
import com.xworkz.web.dto.RegisterDTO;

public interface ProductsDAO {
	public void saveProducts(ProductsDTO productsDTO);
	public List<ProductsDTO> getProducts();
	public List<ProductsDTO> getProducts(int page_id,int total);

}
