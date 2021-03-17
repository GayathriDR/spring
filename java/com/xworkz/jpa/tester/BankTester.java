package com.xworkz.jpa.tester;

import com.xworkz.jpa.dao.BankDAO;
import com.xworkz.jpa.dao.BankDAOImpl;
import com.xworkz.jpa.dto.BankEntity;

public class BankTester {
	public static void main(String[] args) {
		BankEntity bank=new BankEntity("axis", "ax567", "124");
		BankDAO daoImpl=new BankDAOImpl();
//		daoImpl.save(bank);
		daoImpl.fetchall();
		System.out.println("done with testing and save"); 
		
		
		
	}

}
