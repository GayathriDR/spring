package com.xworkz.web.component;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.web.dto.ProductsDTO;
import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.service.ProductsService;


@Component
@RequestMapping("/")
public class ViewProductsController {
	@Autowired
	private ProductsService productsService;

	public ProductsService getProductsService() {
		return productsService;
	}

	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}
	
//	@RequestMapping(value="/viewProducts.odc")
//	public String  paginate_productsList(HttpServletRequest request, HttpServletResponse response, Model model,@ModelAttribute ProductsDTO productsDTO) {
//		System.out.println("invoked getProducts");
//		System.out.println(productsDTO);
//		List<ProductsDTO> dtoProductsList=productsService.getProducts();
//		PagedListHolder<ProductsDTO > pagedListHolder=new PagedListHolder<ProductsDTO>(dtoProductsList);
//		int page=ServletRequestUtils.getIntParameter(request, "p", 0);
//		pagedListHolder.setPage(page);
//		int pageSize=10;
//		pagedListHolder.setPageSize(pageSize);
//		model.addAttribute("pagedListHolder", pagedListHolder);
//		return "viewProducts";
//		model.addAttribute("listProducts",dtoList);
//		PagedListHolder<ProductsDTO> pageListHolder=new PagedListHolder<ProductsDTO>(dtoList);
//		int page = ServletRequestUtils.getIntParameter(request, "p", 0);
//		pageListHolder.setPage(page);
//		pageListHolder.setPageSize(3);
//		modelMap.put("pageListHolder",pageListHolder);
//		System.out.println("done with getProducts ");
		
		
		
//	}
//	@RequestMapping("/viewProducts.odc")
//	public String getProductsList(@ModelAttribute ProductsDTO productsDTO,Model model) {
//		System.out.println("invoked getProductslist");
//		System.out.println(productsDTO);
//		List<ProductsDTO> dtoList=productsService.getProducts();
//		System.out.println(dtoList);
//		model.addAttribute("list", dtoList);
//		System.out.println("done with getProductsList");
//		
//		
//		return "viewProducts";
//		
//	}
//	

	@RequestMapping("/viewProducts.odc")
	public String getProducts(HttpServletRequest request,ModelMap modelMap) {
		System.out.println("invoked getProducts");
		List<ProductsDTO> products=productsService.getProducts();
		PagedListHolder<ProductsDTO> pagedListHolder=new PagedListHolder<ProductsDTO>(products);
		int page= ServletRequestUtils.getIntParameter(request, "p", 0);
		pagedListHolder.setPage(page);
		pagedListHolder.setPageSize(3);
		modelMap.put("pagedListHolder", pagedListHolder);
		
		return "viewProductspagination";
		
	}
}
