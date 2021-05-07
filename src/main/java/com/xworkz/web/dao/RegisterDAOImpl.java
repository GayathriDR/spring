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

import com.xworkz.web.component.ForgotPasswordController;
import com.xworkz.web.dto.RegisterDTO;
import com.xworkz.web.dto.ResetPasswordDTO;
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

	@Override
	public long findByEmailId(String email,String newPassword) {
		System.out.println("invoked findBymailid");

		Session session=null;
		List list=null;
		Transaction transaction=null;
		Long count=0l;
		RegisterDTO registerDTO=null;
		try
		{
			session=factory.openSession();
			System.out.println("created session");
			transaction=session.beginTransaction();
			Query<Long> qry=session.getNamedQuery("getmail");
			qry.setParameter("mailid", email);
			count=qry.uniqueResult();
			System.out.println(count);
			if(count!=null) {
				Query qry2=session.getNamedQuery("updateRandomPassword");
				qry2.setParameter("randomPassword", newPassword);
				qry2.setParameter("mail", email);
				int nor=qry2.executeUpdate();
				transaction.commit();
				System.out.println("done with randompassword send");
				
//				String hq1="update RegisterDTO set password=:pwd where email=:mail";
//				Query qry2=session.createQuery(hq1);
//				qry2.setParameter("mail", email);
//				qry2.setParameter("pwd", newPassword);
//				Integer record=qry2.executeUpdate();
//				System.out.println("updated row is :"+record);
				
				
			}
			System.out.println("done with findbyemailid");
			
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

	@Override
	public void resetPassword(String email,String password,String confirmpassword) {
		System.out.println("invoked resetpassword DAOImpl");
		
		Session session=null;
		Transaction transaction=null;
		int nor=0;
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
			Query qry=session.createNamedQuery("update");
			qry.setParameter("emailId",email);
			qry.setParameter("newpassword",password);
			qry.setParameter("confirmPassword",confirmpassword);
			nor=qry.executeUpdate();
			transaction.commit();
			System.out.println("done with changepasswordDAOIMPL");
				
			}
			
		
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("could not able to update the password");
		}
		finally {
			System.out.println("closing resources");
			session.close();
		}
	}

	@Override
	public RegisterDTO updateInfo(String email) {
		System.out.println("invoked updateInfo DAOImpl");
		Session session=null;
		Transaction transaction=null;
		RegisterDTO updateDTO=null;
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
			updateDTO=session.get(RegisterDTO.class, email);
			System.out.println(updateDTO);
			System.out.println("fetched the requested email data");
			
//			if(updateDTO!=null) {
//				Query qry1=session.getNamedQuery("updateInfo");
//				qry1.setParameter("userName",userName);
//				qry1.setParameter("newPassword",password);
//				qry1.setParameter("emailId",email);
//				int nor=qry1.executeUpdate();
//				transaction.commit();
//				System.out.println("done with updateInfo DAOImpl");
//			}
			
		}
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("could not able to update the password");
		}
		finally {
			System.out.println("closing resources");
			session.close();
		}
		return updateDTO;
	}

	@Override
	public void updateForExsisting(String email,String userName,String password) {
		System.out.println("invoked updateForExsisting DAOImpl");
		Session session=null;
		Transaction transaction=null;
		RegisterDTO updateDTO=null;
		try {
			session=factory.openSession();
			transaction=session.beginTransaction();
//			updateDTO=session.get(RegisterDTO.class,email);
//			System.out.println(updateDTO); 
			Query qry1=session.getNamedQuery("updateInfo");
			qry1.setParameter("emailId",email);
			qry1.setParameter("userName",userName);
			qry1.setParameter("newPassword",password);
			System.out.println(email);
			int nor=qry1.executeUpdate();
			System.out.println(nor);
			transaction.commit();
			System.out.println("done with updateForExsisting DAOImpl");
			
			}
		catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("could not able to update the password");
		}
		finally {
			System.out.println("closing resources");
			session.close();
		}

	
	

	
	}
}
