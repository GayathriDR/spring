package com.xwrokz.crop;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CropsDAOImpl implements CropsDAO {
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void saveCrop(CropsEntity cropEntity) {
		System.out.println("invoked savecrop");
		Transaction transaction=null;
		try {
//			Configuration con=new Configuration();
//			con.configure();
//			SessionFactory sessionFactory=con.buildSessionFactory();
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(cropEntity);
			session.getTransaction().commit();
			System.out.println("done with save crop entity ");
		
			 
		}catch(HibernateException e)
		{
			e.printStackTrace();
		}
//		finally{
//			if(session!=null){
//				session.close();
//				System.out.println("session closed");
//			}
//			else{
//				System.out.println("session not closed");
//			}
//			
//		}

	}

}
