package com.xworkz.web.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.ProductsDTO;
import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.ProductsService;

@Component
@RequestMapping("/")
public class ProductsController {
	@Autowired
	private ProductsService productService;

	public ProductsService getProductService() {
		return productService;
	}

	public void setProductService(ProductsService productService) {
		this.productService = productService;
	}
	public ProductsController() {
		System.out.println("product details"+getClass().getSimpleName());
		
	}
	@RequestMapping("/add.odc")
	public String addItems(@ModelAttribute ProductsDTO productsDTO,Model model) {
		System.out.println("invoked addItems ");
		System.out.println(productsDTO);
		try {
			boolean addItem=productService.validateSaveProducts(productsDTO);
			if(addItem) {
				System.out.println("done with addItems controller");
				return "addItemSuccess";
			}
			else {
				return "add";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("cant add the items");
			return "add";
		}
		
		
		
	}

}
