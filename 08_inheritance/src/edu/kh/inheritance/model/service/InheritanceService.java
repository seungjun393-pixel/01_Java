package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Person;

public class InheritanceService {
	
	// 상속 확인 예제
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.toString());
	}

}
