package com.xworkz.shop.service;

import com.xworkz.shop.DAO.ShopDAO;
import com.xworkz.shop.entity.ShopEntity;

public class ShopServiceImpl implements ShopService {
	private ShopDAO shopDAO;
	
	public ShopServiceImpl( ShopDAO shopDAO) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.shopDAO=shopDAO;
	}

	@Override
	public boolean validateShopData(ShopEntity shopEntity) {
		System.out.println("invoked validateandsave");
		System.out.println("ShopEntity:"+shopEntity);
		String name=shopEntity.getShopName();
		String location=shopEntity.getShopLoction();
		String owner=shopEntity.getOwenerName();
		int open=shopEntity.getShopOpen();
		boolean valid=false;
		if(shopEntity!=null){
			if(name!=null && name.length()>2 && name.length()<13){
				System.out.println("shop name is valid");
				valid=true;
				
			}
			else{
				System.out.println("shop name is invalid, provide minimum 3 charecters or maximum 12 charecters and it should not be empty");
				valid=false;
			}
			if(valid){
				if(location!=null && location.length()>=3 && location.length()<=30){
					System.out.println("shoplocation is valid");
					valid=true;
				}
				else{
					System.out.println("provide proper shop location , location should be minimum 3 charecters and maximum 30 charecters");
					valid=false;
				}
			}
			if(valid){
				if(owner.length()>=4 && owner.length()<=12){
					System.out.println("owner is valid");
					valid=true;
				}
				else{
					System.out.println("owner name should be minimum of 4 charecters and maximum 12 charecters");
					valid=false;
				}
			}
			if(valid){
				if(open==1 || open==0){
					System.out.println("open is valid");
					valid=true;
					
				}
				else{
					System.out.println("open value either be 1 or 0");
					valid=false;
				}
			}
		}
		
		else{
			System.out.println( "create a shopentity");
		}
		shopDAO.saveShop(shopEntity);
		return valid;
	}

}
