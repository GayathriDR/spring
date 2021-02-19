package com.xwrokz.crop.service;

import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;
import com.xwrokz.crop.CropsDAO;
import com.xwrokz.crop.CropsDAOImpl;
import com.xwrokz.crop.CropsEntity;
import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

public class CropServiceImpl implements CropService {
	private CropsDAO cropDAO;
	public CropServiceImpl(CropsDAO cropDAO) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.cropDAO=cropDAO;
	}

	@Override
	public boolean validateAndsave(CropsEntity cropEntity) {
		System.out.println("invoked validateandsave");
		System.out.println("cropentity:"+cropEntity);
		String cropName=cropEntity.getCropName();
		double cropPrice=cropEntity.getCropPrice();
		boolean cropOrganic=cropEntity.isOrganic();
		int cropLife=cropEntity.getLife();
		CropSeason cropSeason=cropEntity.getSeason();
		CropType cropType=cropEntity.getType();
		boolean valid=false;
		if(cropEntity!=null){
			if(cropName!=null && ! cropName.isEmpty() && cropName.length()>=3 && cropName.length()<=15){
				System.out.println("crop name is valid");
				valid=true;

			}else{
				System.out.println("crop name is invalid, provide minimum 3 charecters or maximum 15 charecters and it should not be empty");
				valid=false;
			}

			if(valid){
				if(cropPrice>=20 && cropPrice<=1500){
					System.out.println("crop price is valid");
					valid=true;
				}
				else{
					System.out.println("should set the price between 20 to 1500");
					valid=false;
				}

			}
			if(valid){
				if(cropLife>=(int)(0.5*12)&& cropLife<=(int)(12*4)){
					System.out.println("crop life is valid");
					valid=true;
				}
				else{
					System.out.println("crop life is invalid , the crop life should be minimum 6 months to 48 months ");
					valid=false;
				}

			}
			//			if(valid){
			//				if(cropLife>=(int)0.5 && cropLife<=4){
			//					System.out.println("crop life is valid");
			//					valid=true;
			//				}
			//				else{
			//					System.out.println("crop life is invalid , the crop life should be minimum 0.5 years and maximum 4 years");
			//					valid=false;
			//				}
			//				
			//			}
			if(valid){
				if(cropSeason!=null){
					System.out.println("cropseason is valid");
					valid=true;
				}
				else{
					System.out.println(" cropseason is invalid, cropseason should not be null");
					valid=false;
				}
			}
			if(valid){
				if(cropType!=null){
					System.out.println("croptype is valid");
					valid=true;
				}
				else{
					System.out.println("croptype is invalid , it should not be null");
					valid=false;
				}
				//				
				cropDAO.saveCrop(cropEntity);

			}


			else{
				System.out.println( "create a cropentity");
			}

			//		return false;
		} 
		return valid;

	}}

