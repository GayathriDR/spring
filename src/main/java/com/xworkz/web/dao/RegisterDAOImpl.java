package com.xworkz.web.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.RegisterDTO;
@Component
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void saveForm(RegisterDTO registerDTO) {
		System.out.println("invoked save saveForm");
		
		Session session=null;
		Transaction transaction=null;
		
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
			session.save(registerDTO);
			session.getTransaction().commit();
			System.out.println("done with save register form");
			
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}


	}

	public List<RegisterDTO> getData() {
		System.out.println("invoked getdata method");
		Session session=null;
		List list=null;
		try {
			session=factory.openSession();
			Query qry=session.getNamedQuery("fetchall");
			 list=qry.list();
			 
			 System.out.println(list);
			
			System.out.println("done with extracting the data");
			
		} catch (HibernateException e) {
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
	public long getMail(String mailId,String password) {
		System.out.println("invoked fetchmail");

		Session session=null;
		Long count=0l;
		RegisterDTO registerDTO=null;
		try
		{
			session=factory.openSession();
			System.out.println("created session");
			Query<Long> qry=session.getNamedQuery("getMailId");
			System.out.println("created namedquery");
			qry.setParameter("mailId",mailId);
			qry.setParameter("pwd",password);
			System.out.println("sent mailid");
			count=qry.uniqueResult();
			System.out.println("done with email verification");
		
			
		}
				catch (HibernateException e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null) {;
				session.close();
			}
		}
		return count;
		
	}

	

}
