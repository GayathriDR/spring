package com.xworkz.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.jpa.dto.BankEntity;

public class BankDAOImpl implements BankDAO {

	@Override
	public void save(BankEntity bankEntity) {
		System.out.println("invoked saving the bank details");
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("bank_details");
	System.out.println(factory);
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	manager.persist(bankEntity);
	manager.getTransaction().commit();
	System.out.println("done with saving");
	manager.close();
	factory.close();
		

	}

	@Override
	public void fetchall() {
		System.out.println("invoked fetchall method");
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("bank_details");
		EntityManager manager=factory.createEntityManager();
		Query qry=manager.createNamedQuery("fetchall");
		List<BankEntity> list=qry.getResultList();
		System.out.println(list.toString());
		for(BankEntity entity:list) {
		 System.out.println(entity.toString());
	 }
//		System.out.println(this.bankName);
		System.out.println("done with fetchall");
		
		
	}

}
