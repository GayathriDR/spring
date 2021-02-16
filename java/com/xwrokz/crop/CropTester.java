package com.xwrokz.crop;


import com.xwrokz.crop.constants.CropSeason;
import com.xwrokz.crop.constants.CropType;

public class CropTester  {
	public static void main(String[] args){
		CropsEntity crop=new CropsEntity("Paddy",50.0,false,2,CropSeason.RAINY,CropType.RABI);
		CropsDAO cropImpl=new CropsDAOImpl();
		cropImpl.saveCrop(crop);
		
	}

}
