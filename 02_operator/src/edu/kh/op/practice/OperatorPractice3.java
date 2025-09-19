package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	Scanner sc = new Scanner(System.in);//계속쓰는거, 클래스에 선언
	
	public void practice1() {
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("멤버쉽 있으세요?(있으면 true / 없으면 false 입력):");
		String membership = sc.nextLine();
		double salePrice1 = price*0.9;
		double salePrice2 = price*0.95;
		System.out.println(membership.trim().equalsIgnoreCase("true") ? "할인을 포함한 최종금액 :"+salePrice1 : "할인을 포함한 최종금액 :" +salePrice2);
		
	}
	
	public void practice2() {
		System.out.print("출금할 금액 입력 : ");
		int money = sc.nextInt();
		int money2 = money/50000;
		money %= 50000;
		System.out.printf("50000원 : %d\n",money2);
		int money3 = money/10000;
		money %= 10000;
		System.out.printf("10000원 : %d\n",money3);
		int money4 = money/5000;
		System.out.printf("5000원 : %d\n",money4);
		money %= 5000;
		int money5 = money/1000;
		System.out.printf("1000원 : %d",money5);
		
	}
	
	public void practice3() {
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		String result = num1 % num2 == 0 ? "배수입니다" : "배수가 아닙니다.";
		System.out.println(result);
	}

}
