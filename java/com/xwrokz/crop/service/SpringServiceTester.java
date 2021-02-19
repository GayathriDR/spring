package com.xwrokz.crop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xwrokz.crop.CropsEntity;
import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

public class SpringServiceTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring/spring.xml");
		CropService service=container.getBean(CropService.class);
		service.validateAndsave(new CropsEntity("tomato",40,true,(int)(1*12),CropSeason.SUMMER,CropType.ZAID));

	}

}
