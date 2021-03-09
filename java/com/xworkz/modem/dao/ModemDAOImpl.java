package com.xworkz.modem.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.modem.entity.ModemEntity;
@Component
public class ModemDAOImpl implements modemDAO
{
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void saveModem(ModemEntity modemEntity) {
		System.out.println("invoked savemodementity");
		Transaction transaction=null;
		
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(modemEntity);
			session.getTransaction().commit();
			System.out.println("done with save modem");
			
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		}

	}

}
