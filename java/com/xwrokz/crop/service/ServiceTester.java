package com.xwrokz.crop.service;

import com.xwrokz.crop.CropsEntity;
import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

public class ServiceTester {

	public static void main(String[] args) {
		CropsEntity entity=new CropsEntity();
		entity.setCropName("capsicum");
		entity.setCropPrice(30);
		entity.setLife((int)(1.2*12));
		entity.setOrganic(true);
		entity.setSeason(CropSeason.SUMMER);
		entity.setType(CropType.RABI);
		CropService serviceTester=new CropServiceImpl();
		boolean result=serviceTester.validateAndsave(entity);
		System.out.println(result);
		System.out.println((int)(0.5*12));
		

	}

}
