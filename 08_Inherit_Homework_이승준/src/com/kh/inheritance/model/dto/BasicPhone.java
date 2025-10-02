package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {
		
	}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	public void checkKeyboard() {
		System.out.println("Brnad : "+getBrand());
		System.out.println("Model : "+getModel());
		System.out.println("Year : "+getYear());
		System.out.println("Price : "+getPrice()+"원");
		if(hasPhysicalKeyboard == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다");
		}else {
			System.out.println("이 휴대폰은 물리적 키보드가 없습니다");
		}
		
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	

}
