package com.hw2.model.dto;

public class Prisoner extends Person{
	
	private String crime;

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	
	public Prisoner() {}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		return String.format("죄수가 추가되었습니다 - ID : %s , 이름 : %s , 죄목 : %s", 
				              getId(),getName(),crime);
	}

	
    
}
