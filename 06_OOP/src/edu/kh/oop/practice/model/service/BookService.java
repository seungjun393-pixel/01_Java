package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		Book book = new Book();
		
		Book book2 = new Book("자바의 정석",30000,0.2,"남궁성");
		
		System.out.println(book.toString());
		System.out.println(book2.toString());
		
		System.out.println("=======================");
		
		book.setBookAuthor("홍길동");
		book.setBookTitle("C언어");
		book.setBookprice(30000);
		book.setBookDiscountRate(0.1);
		System.out.println("수정된 결과 확인");
		System.out.println(book.toString());
		
		System.out.printf("도서명 = %s\n할인된 가격 = %.0f원",
				book.getBookTitle(),book.getBookprice()-(book.getBookprice()*book.getBookDiscountRate()));
		System.out.printf("\n도서명 = %s\n할인된 가격 = %.0f원",
				book2.getBookTitle(),book2.getBookprice()-(book2.getBookprice()*book2.getBookDiscountRate()));
		
	}

}
