package com.xworkz.modem.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.modem.entity.ModemEntity;
import com.xworkz.modem.service.ModemService;

public class ModemTester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ModemService modem=context.getBean(ModemService.class);
		modem.validateModem(new ModemEntity("reliane", "300kbps", "jio", 80, 234.00));
		

	}

}
