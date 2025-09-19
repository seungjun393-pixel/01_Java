package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수:");
		int input1 = sc.nextInt();
		System.out.println("사탕 개수:");
		int input2 = sc.nextInt();
		System.out.printf("1인당 사탕 개수%d, 남은 사탕 개수 %d", input2/input1, input2 % input1);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("학년(정수만) :");
		int grade = sc.nextInt();
		System.out.print("반(정수만) :");
		int classRoom = sc.nextInt();
		System.out.print("번호(정수만) :");
		int classNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(남학생/여학생) :");
		String gender = sc.nextLine();
		System.out.printf("성적(소수점 둘째 자리 까지)");
		double score = sc.nextDouble();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f",
				grade,classRoom,classNumber,name,gender,score);
				
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		int korean = sc.nextInt();
		System.out.print("영어 :");
		int eng = sc.nextInt();
		System.out.print("수학 :");
		int math = sc.nextInt();
		
		int total = korean+eng+math;
		double avg = total/3.0;
		System.out.println("합계 :"+ total);
		System.out.println("평균 :"+ avg);
		
	}
	
	

	
}
