package edu.kh.oop.practice.model.vo;

public class Book {
	
	private String bookTitle;
	private int bookPrice;
	private double bookDiscountRate;
	private String bookAuthor;
	
	public Book(String bookTitle, int bookPrice, double bookDiscountRate, String bookAuthor) {
		//super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
		this.bookAuthor = bookAuthor;
	}

	public Book() {
		
	};
	
	
	@Override
	public String toString() {
		
		return bookTitle+" / "+bookPrice+" / "+bookDiscountRate+" / "+bookAuthor;
	}
	
	
	
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookprice() {
		return bookPrice;
	}
	public void setBookprice(int bookprice) {
		this.bookPrice = bookprice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	

}
