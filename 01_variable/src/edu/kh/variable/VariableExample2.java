package edu.kh.variable;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/* 자바의 기본 자료형 8가지
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte(1byte), short(2byte),int(4byte),long(8byte)
		 * 실수형 : float(4byte),double(8byte) 
		 * 문자형 : char(2byte)
		 * 
		 * 참조형 - 문자열 String
		 */
		
		// 변수의 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.(== 초기화)
		
		boolean booleanData; // -> 변수의 선언
		
		booleanData = true; // -> booleanData 변수에 true 논리값 대입
		// 값을 변수에 최초로 대입 -> 초기화
		
		System.out.println("booleanData : " + booleanData);
		
		byte byteData;
		
		byte byteNumber = 127; // 변수의 선선과 동시에 대입(초기화)
		
		short shortNumber = 32767;
		
		int intNumber = 2147483647;
		
		long longNumber = 10000000000L; // 리터럴 : 변수에 대입되거나 작성되어지는 값, 자료형에따라 표기법이 다름
		
		float floatNumber = 1.2345F; // 1.2345만 쓰면 double 자료형으로 인식, 변수타입 float과 일치하지않아 오류발생해서 F붙여 float으로 나타냄
		
		double doubleNumber = 3.141592;
		
		char ch = 'A';   // 문자형(char) 리터럴 표기법 : '' -> 문자 하나만 대입가능
		char ch2 = 66;
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		/* char 자료형에 숫자가 대입 가능한 이유
		 * 숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 * 'B' 문자 그대로 대입하면, 변수에 숫자 66으로 변한되어 저장
		 * ->반대로 생각하면 변수에 66을 지정하는것도 가능함
		 * */
		
		//------------------------------------------------------------------------------
		
		//변수 명명 규칙
		
		//1.대소문자 구문, 길이제한X
		int abcdefg123456789;
		int abcdefG123456789; // G가 달라, 다른 변수임
		
		//2.예약어 사용X
		// double final;
		
		//3.숫자 시작X
		//char 1abc;
		char abc1; // -> 끝은 괜찮음
		
		//4.특수문자 $, _만 사용가능(하지만 쓰지않음)
		int $intNumber; //문제없음
		int int_Number; //자바는 카멜케이스 사용해야함,_표기법은 자바의 상수 or DB에서 사용 PIVALUE X -> PI_VALUE
		
		//5.카멜표기법(맨 처음 소문자 시작, 후속단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		//6.변수명은 언어를 가리지않는다.(하지만 쓰지않음)
		int 정수1번;
		double 실수2번 = 3.14; 
		System.out.println(실수2번); 
		
		//------------------------------------------------------------------------------
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 3.44423; 에러, 재대입 불가
		
		/* 상수(항상 같은 수)
		 * 변수의 한 종류
		 * 한번 값이 대입되면 다른 값을 재대입 할 수 없다
		 * 자료형 앞에 final 키워드 작성
		 * 상수 명명 규칙 : 모두 대문자, 단어 구분시 _사용
		 * 
		 * 상수를 사용하는 경우
		 * 1.변하면 안되는 고정된값을 저장할 때
		 * 2.특정한 값에 의미를 부여하는 경우
		 * */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int LEFT_MOVE = -1;
		final int LIGHT_MOVE = 1; 
		
		System.out.println(1+1.3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     }
}