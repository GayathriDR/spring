package com.xworkz.web.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.query.Query;

import com.xworkz.web.dto.ProductsDTO;
@Component
public class ProductsDAOImpl implements ProductsDAO {
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}


	@Override
	public void saveProducts(ProductsDTO productsDTO) {
		System.out.println("invoked saveProducts");
		Session session=null;
		Transaction transaction=null;
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(productsDTO);
			session.getTransaction().commit();
			System.out.println("done with saveproducts");
			
			
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}

	}

	@Override
	public List<ProductsDTO> getProducts() {
		System.out.println("invoked getProducts");
		Session session=null;
		Transaction transaction=null;
		List list=null;
		try {
			session=factory.openSession();
			Query qry=session.getNamedQuery("Fetch");
			list=qry.list();
			System.out.println(list);
			System.out.println("done with getProducts");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		return list;
	}

	@Override
	public List<ProductsDTO> getProducts(int page_id, int total) {
 		return null;
	}

}
