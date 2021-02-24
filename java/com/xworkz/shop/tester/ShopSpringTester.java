package com.xworkz.shop.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shop.entity.ShopEntity;
import com.xworkz.shop.service.ShopService;

public class ShopSpringTester {
	public static void main(String[] args){
		ApplicationContext contaner=new ClassPathXmlApplicationContext("spring.xml");
		ShopService service=contaner.getBean(ShopService.class);
		service.validateShopData(new ShopEntity("provision","hoskote","Shetty",1));
		
	}

}
