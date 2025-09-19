package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 1 ~ 10 까지 콘솔에 출력
		
		
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void ext1() {
		
		int i;
		
		for(i = 1; i<=100; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
	}
	
	public void ex2() {
		for(int i = 'A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println("\n===============================");
		
		for(char i ='A'; i<='Z'; i++) {
			System.out.print(i);
		}
	}
	
	public void ex3() {
		//1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("번호를 입력하시오: ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		//정수 5개를 입력받아서 합계 구하기
		
		//[실행화면]
		//입력1 : 10
		//입력2 : 20
		//입력3 : 30
		//입력4 : 40
		//입력5 : 50
		//합계 : 150
		int sum = 0;
		for(int i = 1; i<=5; i++) {
			System.out.print("입력"+i+" :");
			int input =sc.nextInt();
			sum += input;
		}
		System.out.println("합계: "+sum);
	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		//단, 입력받은 수의 배수는 양쪽에 ()표시
		
		//[실행화면]
		//괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ....20
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=20; i++) {
			if(i % num == 0) {
				System.out.print("("+i+") ");
			}else {
				System.out.print(i+" ");
			}
			
		}
	}
	
	public void ex6() {
		//구구단 출력
		//2~9 사이 수를 하나 입력받아
		//해당 단을 출력하라
		//단, 입력받은 수가 2~9사이가 아니라면
		//"잘못 입력하셨습니다" 출력
		
		System.out.print("단 입력: ");
		int input = sc.nextInt();
		if( !(input >=2 && input <=9 )) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 1; i<=9; i++) {
				System.out.println(input+" X "+ i+" = "+input*i);
			}
		}
	}
	
	public void ex7() {
		// 숫자 세기 count
		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		System.out.print("배수 입력: ");
		int input = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		for(int i = 1; i<=20; i++) {
			if(i % input == 0) {
				System.out.print(i+" "); //result += i+" "; 로 스트링으로 처리하는것도 가능 
				sum += i;
				sum2 = i / input; //sum2++; 로 처리하는게더 효율
			}
		}
		System.out.print(" : "+sum2+" 개"); 
		System.out.printf("\n%d의 배수 합계 : %d",input,sum);
	}
	
	public void ex8() {
		//구구단 모두 출력하기
		
		for(int dan = 2; dan<=9; dan++) {
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d X %d = %2d  ",dan,i,dan*i);
			}
			System.out.println();
		}
	}

}
