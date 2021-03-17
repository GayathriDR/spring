package com.xworkz.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@XmlRootElement(namespace="com.xworkz.xml")
//@XmlRootElement(name="booklist")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookStore {
	@XmlElementWrapper(name= "booklist")
	@XmlElement(name="book")
	private List<Book> booklist;
	@XmlElement(name="name")
	private String name;
	@XmlElement(name="location")
	private String location;

}
