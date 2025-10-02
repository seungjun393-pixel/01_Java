package com.hw2.model.dto;

public class Employee extends Person{
	
	private String position;
	
	public Employee() {}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getInfo() {
		return String.format("직원이 추가되었습니다 - ID : %s, 이름 : %s, 직책 : %s", 
				              getId(),getName(),position);

	}
}