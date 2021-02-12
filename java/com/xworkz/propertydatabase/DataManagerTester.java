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
		DriverManagerDataSource driverConnection=container.getBean(DriverManagerDataSource.class);
		try {
			Connection con=driverConnection.getConnection();
			Statement stmt=con.createStatement();
			String qry="insert into book values('web design',11,'500.00') ";
			String qry1="select * from book";
//			int record=stmt.executeUpdate(qry);
//			System.out.println(record+"this many records got updated");
		ResultSet rs=	stmt.executeQuery(qry1);
		while(rs.next()){
			System.out.println(rs.toString());
			
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
//		System.out.println(driverConnection.getPassword());
	}

}
