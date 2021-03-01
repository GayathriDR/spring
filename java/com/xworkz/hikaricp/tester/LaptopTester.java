package com.xworkz.hikaricp.tester;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.xworkz.hikaricp.entity.LaptopEntity;
import com.xworkz.hikaricp.service.LaptopService;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class LaptopTester {

	public static void main(String[] args) {
	ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
	LaptopService service=container.getBean(LaptopService.class);
	service.validateLaptop(new LaptopEntity("sony"));
	
	
	

	}

}
