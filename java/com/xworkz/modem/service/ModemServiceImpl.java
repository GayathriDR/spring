package com.xworkz.modem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.modem.dao.modemDAO;
import com.xworkz.modem.entity.ModemEntity;
@Component
public class ModemServiceImpl implements ModemService {
	@Autowired
	private modemDAO modemDAO;

	public modemDAO getModemDAO() {
		return modemDAO;
	}

	public void setModemDAO(modemDAO modemDAO) {
		this.modemDAO = modemDAO;
	}

	@Override
	public boolean validateModem(ModemEntity modemEntity) {
		System.out.println("invoked validateandsavemodem");
		System.out.println("ModemEntity:"+modemEntity);
		String modemBrand=modemEntity.getBrand();
		String modemBandwidth=modemEntity.getBandwidth();
		String modemType=modemEntity.getType();
		int modemRange=modemEntity.getRange();
		double modemModelNo=modemEntity.getModelNo();
		boolean valid=false;
		if(modemEntity!=null){
			if(modemBrand!=null && modemBrand.length()>2 && modemBrand.length()<8){
				System.out.println("modem brand  is valid");
				valid=true;
				
			}
			else{
				System.out.println("modem brand is invalid, provide minimum 3 charecters or maximum 8 charecters and it should not be empty,cant save the data");
				valid=false;
			}
			if(valid){
				if(modemBandwidth!=null && modemBandwidth.length()>=1 && modemBandwidth.length()<300){
					System.out.println("modemBandwidth  is valid");
					valid=true;
					
				}
				else{
					System.out.println("modemBandwidth is invalid, provide minimum 3 charecters or maximum 8 charecters and it should not be empty,cant save the data");
					valid=false;
				}
			}
			if(valid){
				if(modemType!=null){
					System.out.println("modem type is valid");
					valid=true;
				}
				else{
					System.out.println("modem type should not be empty");
					valid=false;
					
				}
			}
			if(valid){
				if(modemRange>=10 && modemRange<=100){
					System.out.println("modem range is valid");
					valid=true;
				}
				else{
					System.out.println("modem range is invalid should be between 10 to 100");
					valid=false;
				}
			}
			if(valid){
				if(modemModelNo>0){
					System.out.println("modem modelnumber is valid");
					valid=true;
				}
				else{
					System.out.println("modelnumber is invalid and it should not be empty");
					valid=false;
				}
			}
			
			
		}
		else{
			System.out.println("create a modementity");
		}
		if(valid==true){
			modemDAO.saveModem(modemEntity);
		}
		return valid;
	}
	

}
