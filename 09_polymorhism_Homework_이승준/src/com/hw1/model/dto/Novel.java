package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	
	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	@Override
	public void displayInfo() {
		System.out.println("[소설] 제목 : "+getTitle()+" / 저자 : "+getAuthor()+" / 장르 : "+getGenre());
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	 

}
