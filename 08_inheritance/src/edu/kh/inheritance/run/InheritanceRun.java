package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.Student;
import edu.kh.inheritance.model.service.InheritanceService;

public class InheritanceRun {

	public static void main(String[] args) {
		InheritanceService service = new InheritanceService();
		
		service.ex1();
		
		Student std = new Student();
		// Person 클래스로부터 상속받은 멤버메서드
		// 사용 가능
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		// Student 만의 고유한 멤버 사용가능
		std.setGrade(1);
		std.setClassroom(3);
		
	

	}

}
