package com.xworkz.hikaricp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hikaricp.entity.LaptopEntity;

public class HikariDAOImpl implements HikariDAO {
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void saveLaptop(LaptopEntity laptopEntity) {
		System.out.println("invoked savelaptop");
		Transaction transaction=null;
		try {Session session=factory.openSession();
		transaction=session.beginTransaction();
		session.save(laptopEntity);
		session.getTransaction().commit();
		System.out.println("done with save shop");
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
