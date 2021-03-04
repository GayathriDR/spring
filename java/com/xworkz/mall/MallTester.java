package com.xworkz.mall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MallTester {

	public static void main(String[] args) {
		ApplicationContext container=new  ClassPathXmlApplicationContext("spring.xml");
		Mall m1=(Mall) container.getBean("mall");
		System.out.println(m1);
		m1.parking();

	}

}
