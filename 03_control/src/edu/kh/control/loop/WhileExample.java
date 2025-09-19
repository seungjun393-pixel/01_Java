package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	
	/*
	 * for문 : 반복 횟수가 정해진 반복일때 주로 사용
	 * -반복 여부를 결정짓는 조건식이 처음에 제시,한번도 실행이 안될수있음
	 * 
	 * while문 : 반복 횟수가 정해지지 않은 반복일때 주로 사용
	 *  -반복 여부를 결정짓는 조건식이 처음에 제시,한번도 실행이 안될수있음
	 *  
	 * do white문 : white문과 동일
	 *  -반복 여부를 결정짓는 조건식이 마지막(끝)에 제시, 무조건 한번은 실행이 됨
	 * 
	 * */
	
	
	/*w while 문
	 * 
	 * 별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 *  **확실히 얼마만큼 반복한 후에 끝날지는 모르지만
	 *   언젠가 반복조건이 false가 되는 경우 반복을 종료함.
	 *   
	 *   
	 * */

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input = 9;
		
		while(input != 0) { //input이 0이 아니면 반복, 0이면 멈춤
			System.out.println("=========메뉴선택=========");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("4. 종료");
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			case 1: System.out.println("떡볶이를 주문했다");
			break;
			case 2: System.out.println("쫄면을 주문했다.");
			break;
			case 3: System.out.println("김밥을 주문했다");
			break;
			case 0: System.out.println("프로그램을 종료합니다");
			default: System.out.println("잘못된 메뉴입니다.");
			}
		}
	}
	
	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료후 결과 출력
		// ->0 이 입력되지 않으면 계속 반복
		
		/*
		 * do{
		 * 반복 수행할 코드;
		 * ->무조건 한번은 수행
		 * }while(조건식);
		 * 
		 * */
		
		int input = 0; //입력값 저장
		int sum = 0; //입력값 합
		
		do {
			System.out.print("입력한 값: ");
			input = sc.nextInt();
			sum += input;
		}while(input !=0);
		System.out.println("합계 : "+sum);
	}
}
