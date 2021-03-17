package com.xworkz.xml;

import java.io.File;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XmltoJava {
	private static final String BOOKSTORE_XML= "bookstorejaxb.xml";
	public static void main(String[] args){
		convertXMLtoJava();
		
		
	}
	public static BookStore convertXMLtoJava(){
		try {
			JAXBContext context=JAXBContext.newInstance(BookStore.class);
			Unmarshaller unmarshall=context.createUnmarshaller();
			BookStore booksStore=(BookStore) unmarshall.unmarshal(new File(BOOKSTORE_XML));
			List<Book> bookList=booksStore.getBooklist();
			
			for(Book book:bookList){
				System.out.println("Book:"+book.getName()+" Author:"+book.getAuthor()+" publisher:"+book.getPublisher()+" bookprice:"+book.getPrice()+" Book storeName:"+booksStore.getName()+" storeLocation:"+booksStore.getLocation());
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}