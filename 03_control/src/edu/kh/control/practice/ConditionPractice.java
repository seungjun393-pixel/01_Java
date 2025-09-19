package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("숫자를 한개 입력하세요: ");
		int num = sc.nextInt();
		
		String result;
		if(num < 0) {
			result = "양수만 입력해주세요";
		}else if(num == 0 || num % 2 == 0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		System.out.println(result);
	}	
	
	
	public void practice2() {
		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();
		int total = kor+math+eng;
		double avg = total/3.0;
		
		String result;
	
		if(kor<40 || math<40 || eng<40) {
			result = "불합격입니다.";
		}else if(avg >= 60) {
			result = "축하합니다. 합격입니다!";
	}else {
		result = "불합격입니다.";
	}
		System.out.println(result);
    }
	
	public void practice3() {
		System.out.print("1~12사이의 정수 입력: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 : System.out.println(month+"월은 31일까지 있습니다.");
		break;
		case 4,6,9,11 : System.out.println(month+"월은 30일까지 있습니다.");
		break;
		case 2 : System.out.println(month+"월은 28일까지 있습니다.");
		break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해주세요: ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요: ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (height*height);
		
		String result;
		if(bmi >= 30) {
			result = "고도비만";
		}else if(bmi > 25) {
			result = "비만";
		}else if(bmi > 23) {
			result = "과체중";
		}else if(bmi > 18.5) {
			result = "정상체중";
		}else {
			result = "저체중";
		}
		System.out.println(result);
	}
	
	public void practice5() {
		System.out.print("중간고사 점수를 입력하시오: ");
		double score1 = sc.nextDouble();
		System.out.print("기말고사 점수를 입력하시오: ");
		double score2 = sc.nextDouble();
		System.out.print("과제 점수를 입력하시오: ");
		double score3 = sc.nextDouble();
		System.out.print("출석 횟수를 입력하시오: ");
		double score4 = sc.nextInt();
		
		double totalScore1 = score1*0.2;
		double totalScore2 = score2*0.3;
		double totalScore3 = score3*0.3;
		
		double avg = totalScore1+totalScore2+totalScore3+score4;
		String result;
		if(score4 <=14) {
			result = "Fail [출석 횟수 부족 ("+score4+"/20)]";
			System.out.println("=======================결과====================");
			System.out.println(result);
		}else {
			
		if(avg >=70) {
			result = "PASS";
		}else{
			result = "Fail [점수미달]";
		}
		System.out.println("=======================결과====================");
		System.out.println("중간 고사 점수(20) : " +totalScore1);
		System.out.println("기말 고사 점수(30) : " +totalScore2);
		System.out.println("과제 점수(30) : " +totalScore3);
		System.out.println("출석 횟수(20) : " +score4);
		System.out.println("총점: "+avg);
		System.out.println(result);
		}
		
	}
}