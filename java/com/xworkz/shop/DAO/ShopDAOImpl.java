package com.xworkz.shop.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.shop.entity.ShopEntity;

public class ShopDAOImpl implements ShopDAO {

	private SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void saveShop(ShopEntity shopEntity) {
		System.out.println("invoked save shop data");
		Transaction transaction=null;
		try {
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(shopEntity);
			session.getTransaction().commit();
			System.out.println("done with save shop");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		

	}

}
