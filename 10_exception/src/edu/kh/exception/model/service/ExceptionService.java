package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스코드의 수정으로 해결가능한 오류를 뜻한다
	
	// 예외는 두 종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외 처리 (ex. RuntimeException)
	// 2) Checked Exception : 필수적으로 예외 처리 (ex. IOException, 나머지...)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("정수 1 입력");
		int input1 = sc.nextInt(); // 정수말고
		// java.util.InputMismatchException
		// int형이 아닌 다른 자료형을 대입했을때
		
		System.out.print("정수 2 입력");
		int input2 = sc.nextInt(); // 0입력시
		// ava.lang.ArithmeticException
		// input2에 0이 들어왔을때(0으로 나눌떄) 발생하는 산술적 예외
		// System.out.println("결과 : "+input1 / input2);
		
		if( input2 != 0) {
			System.out.println("결과 : "+input1/input2);
		}else {
			System.out.println("0으로 나눌 수 없음");
		}
		
		// --------------------------------
		try { // 예외가 발생할 것 같은 코드
			System.out.println("결과 : "+input1/input2);
			
		}catch(ArithmeticException e) {
			// try 에서 던져진 예외를 catcg문의 ㅁ매개변수 e로 잡음
			// e를 사용하여 예외 추척 코드를 작성할 수도 있음
			// -> 이 예외를 어떻게 해결할지 작성하는 구문
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점 추적 메서드
		}
		
		// 발생하는 예외중 일부 예외 try-catch 사용 안해도
		// if-else 예왜ㅣ 상황 방지 기능
		// 일부 예외 = 대부분 UncheckedException
		
		
	}
	
	public void ex2() {
		
		// 여러가지 예외에 대한 처리 방법
		try {
			System.out.print("정수 1 입력");
			int input1 = sc.nextInt(); // 정수말고
			
			System.out.print("정수 2 입력");
			int input2 = sc.nextInt(); // 정수말고

			System.out.println("결과 : "+input1 /input2);
			
			String str =null;
			System.out.println(str.charAt(0));
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(RuntimeException e) {
			System.out.println("잡았다");
		}catch(Exception e) {
			// 다형성 - 업 캐스팅 : 부모타입 참조변수로 자식객체 참조
			// -> 상위 타입의 예외 클래스를 catch문에 작성하면 
			// 다형성 업 캐스팅에 의해 모든 후손 예외 클래스를 잡아서 한번에 처리가능
			
			System.out.println("뭔지 모르나 예외가 발생해서 처리함");
			e.printStackTrace();
		}
	}

	public void ex3() {
		// try - catch - finally
		// finally : try 구문에서 예외 발생 유무 상관없이 무조건 마지막에 수행
		
		try{
			System.out.println("정수 1 입력 : ");
			int input1 = sc.nextInt();
			
			System.out.println("정수 2 입력 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 :  "+input1/input2);
		
		}catch(Exception e) {
			
			// 매개변수 e : 예외관련 정보 + 예외 관련 기능
			System.out.println( getClass() ); // 어떤 예외 클래스인가?
			// class java.lang.Ari....

			System.out.println( e.getMessage() ); // 예외 발생시 출력된 내용
			// /by zero
			
			System.out.println( e ); // e.toString()
			
			e.printStackTrace(); // 상세히 예외 추적해주는 메서드

		
		}finally {
			
			System.out.println("무조건 수행됨");
			sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
		}
		
		// try - with -resources ; finally에서 일일이 close() 호출하지 않아도
		// 자동으로 리소르를 닫아주는 방식
	}
	
	public void ex4() {
		
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("methodC부터 발생한 예외를 ex4에서 잡아 처리함");
			e.printStackTrace();
		}
		
		
	}
	
	public void methodA() throws Exception{
		
		methodB();
	}
	public void methodB() throws IOException{
		
		methodC();
	}
	public void methodC() throws FileNotFoundException{
		// throw : 예외 강제발생 구문
		
		// throws : 호출한 메서드에게 예외를 던짐
		// -> 호출한 메서드에게 예외처리를 하라고 위임하는 행위
		
		throw new FileNotFoundException();
	}
	
	public void ex5() throws UserException{
		// 어떠한 상황이 발생함...
		// -> 이 상황에 맞추서 특별한 예외를 발생시키고 싶음
		// 자바가 미리 만들어둔 예외 클래스중 마땅한게 없을 때
		// 사용자가 원하는 모양새의 예외 클래스를 만들어 쓸 수 있다
		// -> 사용자 정의 예외 클래스
		// UserException 사용하여 강제 예외 발생시키기
		
		throw new UserException("내가 만든 예외 처리해라");
		
		
	}
	

	
}