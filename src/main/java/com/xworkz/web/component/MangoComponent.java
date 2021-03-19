package com.xworkz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MangoComponent {
	public MangoComponent() {
		System.out.println("mango component created "+getClass().getSimpleName());
	}
	@RequestMapping("/clickme.odc")
	public String onClick(@RequestParam("price") double price,@RequestParam("city") String location) {
		System.out.println("invoked on click");
		System.out.println("price:"+price);
		System.out.println("location:"+location);
		return "/index.jsp";
	}

}
