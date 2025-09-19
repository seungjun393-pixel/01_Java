package edu.kh.variable;

public class VariableExample3 {

	public static void main(String[] args) {
		
		// 형변환 (Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외)
		/* 형변환은 왜 필요한가
		 * 컴퓨터는 같은 자료형끼리만 연산가능
		 * 다른 자료형과 연산시 오류발생
		 * -->이런 상황 해결하기위해 형변환이 필요함
		 * 
		 * 자동 형변환 / 강제 형변환 존재
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2)); // 13.5 -> 오류안남 ( 자동 형변환 때문)
		
		// int -> long 형변환
		int i2 = 2100000000;
		long l2 = 10000000000L;
		
		long result = i2 + l2; // i2(int -> long), long+long
		
		System.out.println(i2+l2);
		
		// char -> int 형변환
		
		char ch3 = 'V';
		System.out.println(ch3);
		int i3 = ch3;
		System.out.println(i3);
		
		char ch = '각';
		int str = ch;
		System.out.println(str);
		System.out.println(ch+1);
		
	}

}
