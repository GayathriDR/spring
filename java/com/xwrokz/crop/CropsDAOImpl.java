package com.xwrokz.crop;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CropsDAOImpl implements CropsDAO {

	public void saveCrop(CropsEntity cropEntity) {
		Session session=null;
		try {
			Configuration con=new Configuration();
			con.configure();
			SessionFactory sessionFactory=con.buildSessionFactory();
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(cropEntity);
			session.getTransaction().commit();
			System.out.println("done with save cropentity ");
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			if(session!=null){
				session.close();
				System.out.println("session closed");
			}
			else{
				System.out.println("session not closed");
			}
			
		}

	}

}
