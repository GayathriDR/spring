package com.xwrokz.crop;

import java.util.Arrays;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

public class SpringTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring/spring.xml");
		SessionFactory factory=container.getBean(SessionFactory.class);
		System.out.println(factory);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		CropsEntity entity=new CropsEntity("tomato",20.0,true,4,CropSeason.SUMMER,CropType.KHARIF);
		CropsDAO daoImpl=container.getBean(CropsDAO.class);
		daoImpl.saveCrop(entity); 
	}

}
