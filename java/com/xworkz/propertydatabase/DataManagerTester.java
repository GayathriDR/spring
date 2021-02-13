package com.xworkz.propertydatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataManagerTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("util.xml");
		Book bb=container.getBean(Book.class);
		String bName=bb.getBookName();
		int bId=bb.getBookId();
		double bPrice=bb.getBookPrice();
		System.out.println(bId);
		System.out.println(bb.getBookName());
		DriverManagerDataSource driverConnection=container.getBean(DriverManagerDataSource.class);
		try {
			
			Connection con=driverConnection.getConnection();
			Statement stmt=con.createStatement();
			String qry="insert into book values('web design',11,'500.00') ";
			String qry1="select * from book";
			String qry2="insert into book values('"+bName+"',"+bId+",'"+bPrice+"')";
			int record=stmt.executeUpdate(qry2);
			System.out.println(record+" this many records got updated");
		ResultSet rs=	stmt.executeQuery(qry1);
		while(rs.next()){
//			System.out.println(rs.toString());
			String bookName=rs.getString(1);
			int bookId=rs.getInt(2);
			double bookPrice=rs.getDouble(3);
			System.out.println("book name:"+bookName+"   book id:"+bookId+"   book price:"+bookPrice);;
			
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//lombok tool
		Book b=new Book();
		b.setBookName("bootstrap");
		b.setBookId(12);
		b.setBookPrice(300.00);
		b.getBookName();

		
	}

}
