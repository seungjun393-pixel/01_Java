package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void Practice1() {
		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input <1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		}else {
		for(int i = 1; i<=input; i++) {
			System.out.print(i+" ");
		}
		}		
	}
	
	public void Practice2() {
		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input <1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		}else {
		for(int i=0; i<input; i++) {
			System.out.print(input-i+" ");
		}
		}
	}
	
	public void Practice3() {
		System.out.print("정수를 하나 입력하시오 : ");
		int input = sc.nextInt();
		String num = "";
		int sum = 0;
		
		for(int i = 1; i<=input; i++) {
			num += (i == input) ? i : i+" + ";  
			sum +=i;
		}
		System.out.println(num+" = "+sum);
	
	}
	
	public void Practice4() {
		System.out.print("숫자를 입력하시오 : ");
		int input1 = sc.nextInt();
		System.out.print("숫자를 입력하시오 : ");
		int input2 = sc.nextInt();
		String num = "";
		
		if(input1 <1 || input2<1) {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		}else {
			int start = Math.min(input1, input2);
			int end = Math.max(input1, input2);
			
			for(int i = start; i<=end; i++) {
				num += i + " ";
			}
			System.out.println(num);
		}
		
	}
	
	public void Practice5() {
		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		System.out.println("===== "+ input +"단" + " ======");
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n",input,i,input*i);
		}
	}
	
	public void Practice6() {
		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input <=1 || input >=10) {
			System.out.println("2~9 사이 숫자만 입력해 주세요.");
		}else {
			for(int i = input; i<=9; i++) {
				System.out.println("===== "+ i +"단" + " ======");
				for(int dan = 1; dan<=9; dan++) {
					System.out.printf("%d X %d = %d\n",i,dan,dan*i);
				}
			}		
		}			
					
					
	}
	
	public void Practice7() {
		System.out.print("자연수 하나를 입력하시오 : ");
		int input = sc.nextInt();
		String num = "";
		int count = 0;
		
		for(int i = 1; i<=input; i++) {
			if(i % 2 ==0 || i % 3 == 0) {
				num += i+ " ";
			}else {
			}
		}
		for(int i = 1; i<=input; i++) {
			if(i %2 ==0 && i %3 ==0) {
				count++;
			}
		}
		System.out.println(num);
		System.out.println("count : "+count);
	}
}