package com.xworkz.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.xml.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbExample {
	private static final String BOOKSTORE_XML= "bookstorejaxb.xml";
	public static void main(String[] args) throws JAXBException,IOException {
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book();
		b1.setName("java");
		b1.setAuthor("james");
		b1.setPublisher("mc");
		b1.setPrice(500.00);
		list.add(b1);
		
		Book b2=new Book();
		b2.setName("spring");
		b2.setAuthor("mykong");
		b2.setPublisher("kong");
		b2.setPrice(800.00);
		list.add(b2);
		
		BookStore store=new BookStore();
		store.setName("Swapna");
		store.setLocation("bangalore");
		store.setBooklist(list);
		convertObjectToXml(store);
		
		
		
		
	}
	private static void convertObjectToXml(BookStore store) throws JAXBException,FileNotFoundException {
			JAXBContext context=JAXBContext.newInstance(BookStore.class);
			Marshaller m=context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			//write to a system.out
			m.marshal(store, System.out);
			//write to a file
			m.marshal(store,new File(BOOKSTORE_XML));
			
			
			
	}
	

}
