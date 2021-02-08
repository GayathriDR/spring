package com.xworkz.inbuiltclass;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args){
		Thread t=new Thread();
		ApplicationContext springContext=new ClassPathXmlApplicationContext("spring.xml");
		Thread t1=springContext.getBean(Thread.class);
		System.out.println(t1.getClass());
		System.out.println(t1);
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		JavaCollection collectionEle=springContext.getBean("javacollection",JavaCollection.class);
		collectionEle.getArrayListEle();
		System.out.println(collectionEle.getClass());
		JavaCollection javaMap=springContext.getBean("java", JavaCollection.class);
		javaMap.getMapEle();
		JavaCollection setValue=springContext.getBean("hashset",JavaCollection.class);
		setValue.getLinkedHashEle();
		JavaCollection propValue=springContext.getBean("property", JavaCollection.class);
		propValue.getPropertyEle();
		
	}

}
