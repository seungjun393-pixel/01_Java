package edu.kh.basic;


public class JavaTest {
	
	// main 메서드 : 자바 프로그램을 실행하기 위해서 반드시 필요한 구문
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		// syso 작성후 crtl + space 입력시 자동완성
		System.out.println(442);
		System.out.println(); // 개행 역할
		System.out.println("442");
		
		System.out.println("1+2"); //""안에 작성된 코드, 문자열로 인식, 1+2
		System.out.println(1+2); // ""안에 작성되지않은 코드, 숫자,변수로 인식, 3
		
		System.out.println("14*19 = " + 14*19);
		
		// 자바는 사칙연산 우선순위 그대로 따름
		
		System.out.println("90 + 75 + 65 =" + (90 + 70 + 65));
		// 집 수행
	}


}