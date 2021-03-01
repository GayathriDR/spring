package com.xworkz.hikaricp.service;

import com.xworkz.hikaricp.dao.HikariDAO;
import com.xworkz.hikaricp.entity.LaptopEntity;

public class LaptopServiceImpl implements LaptopService {
	private HikariDAO hikariDAO;
	
	public LaptopServiceImpl( HikariDAO hikariDAO) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.hikariDAO=hikariDAO;
	}

	@Override
	public boolean validateLaptop(LaptopEntity laptopEntity) {
		System.out.println("invoked validateandsave");
		System.out.println("laptopEntity:"+laptopEntity);
		String brand=laptopEntity.getLaptopBrand();
		boolean valid=false;
		if(laptopEntity!=null){
			if(brand!=null&& brand.length()>=3 && brand.length()<=20){
				System.out.println("brand is valid");
				valid=true;
				
			}
			else{
				System.out.println("brand is invalid, provide minimum 3 charecters or maximum 12 charecters and it should not be empty,cant save the data");
				valid=false;
			}
		}
		else{
			System.out.println( "create a laptopentity");
		}
		if(valid==true){
			hikariDAO.saveLaptop(laptopEntity);
		}
		return valid;
	}

}
