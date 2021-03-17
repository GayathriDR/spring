package com.xworkz.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@XmlRootElement(name="book")
@XmlType(propOrder = {"name","author","publisher","price"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
	 @XmlElement(name="name")
	private String name;
	 @XmlElement(name="author")
	private String author;
	 @XmlElement(name="publisher")
	private String publisher;
	 @XmlElement(name="price")
	private double price;
	

}
