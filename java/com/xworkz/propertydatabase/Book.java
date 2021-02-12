package com.xworkz.propertydatabase;

public class Book {
	private String bookName;
	private int bookId;
	private double bookPrice;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", bookPrice=" + bookPrice + "]";
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

}
