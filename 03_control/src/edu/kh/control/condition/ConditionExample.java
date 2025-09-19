package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in); // 필드
	
	//메서드 (+생성자)
	public void ex1() {
		
		//if 문
		//조건식이 true 일때만 내부코드 수행
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수 입니다" 출력
		System.out.print("정수입력:");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("양수입니다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	public void ex2() {
		//if - else 문
		//조건식 결과가 true면 if문 수행
		//조건식 결과가 false면 else 구문이 수행
		
		//홀짝 검사
		//입력받은 정수값이 홀수이면 "홀수입니다" 출력
		//짝수이면 "짝수입니다" 출력
		//0이면 "0입니다" 출력
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		if( input % 2 != 0) {
			System.out.println("홀수입니다.");			
		}
		else{
		
			if(input==0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("짝수입니다.");
			}
		}	
		
	}
	
	public void ex3() {
		//if(조건식) - else if(조건식) - else
		
		//양수 , 음수 , 0 판별
		System.out.print("정수 입력:");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다.");
		}else if(input <0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
	}
	
	public void ex4() {
		// 달(month) 을 입력받아 해당 달에 맞는 계절을 출력하라
		// 겨울/여름에는 온도(temperature) 입력받기
		// 1,2,12 겨울 (-15도 이하 : "겨울 한파 경보" / -12도 이하 : "겨울 한파 주의보")
		// 3~5 봄
		// 6~8 여름 ( 35도 이상 : "여름 폭염 경보" / 33도 이상 : "여름 폭염 주의보"
		// 9~11 가을
		// 1~12 사이가 아닐땐 "해당하는 계절이 없습니다" 출력
		// 
		
		
		System.out.print("달을 입력하세요:");
		int month = sc.nextInt();
		String season;
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			System.out.print("온도를 입력하세요:");
			int temperature = sc.nextInt();
			
			if(temperature <= -15) {
				season += " 한파 경보";
			}else if(temperature <= -12) {
				season += " 한파 주의보";
			}
			
		}else if(month>=3 && month <= 5) {
			season = "봄";
		}else if(month >=6 && month <=8) {
			season = "여름";
			System.out.println("온도를 입력하세요:");
			int temperature = sc.nextInt();
			
			if(temperature >= 35) {
				season += " 폭염 경보";
			}else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
		}else if(month >=9 && month >=11) {
			season = "가을";
		}else {
			season = "해당 하는 계절이 없습니다.";
		}
		System.out.println(season);
		
	}
	
	public void ex5() {
		
		//나이를 입력받아 
		//13세 이하면 "어린이 입니다"
		//13세 초과 19세이하면 "청소년 입니다"
		//19세 초과시 "성인입니다" 출력
		
		System.out.print("나이를 입력하시오:");
		int input = sc.nextInt();
		
		if(input <=13) {
			System.out.println("어린이 입니다.");
		}else if(input <=19) {
			System.out.println("청소년 입니다.");
			//input >=13 안해도 됨 ->이미 위에서 했기때문
		}else {
			System.out.println("성인 입니다.");
		}

    }
	
	public void ex6() {
		//점수(100점만점)입력받는다
		//90점이상 : A
		//90점미만 80점이상 : B
		//80점미만 70점이상 : C
		//70점미만 60점이상 : D
		//60점 미만 : F
		//0점미만,100점초과 : " 잘못 입력 하셧씁니다" 출력
		
		//[실행화면]
		//점수입력 : 60
		//D
		//점수입력 : 120
		//잘못 입력하셨습니다
		
		System.out.print("점수를 입력하시오:");
		int input = sc.nextInt();
		
		String score;
		
		if(input >=90 && input <=100) {
			score = "A"; 
		}else if(input >=80 && input <90) {
			score = "B";
		}else if(input >=70 && input <80) {
			score = "C";
		}else if(input >=60 && input <70) {
			score = "D";
		}else if(input >=0 && input <60) {
			score = "F";
		}else{
			score = "잘못 입력하셨습니다";
		}
		System.out.println(score);
		//잘못 입력부터 if로 하는게 순서상 맞음 마지막에 내리지말고
	}
	
	public void ex7() {
		System.out.print("나이를 입력하시오:");
		int input = sc.nextInt();
		String age;
		
		if(input > 100 || input < 0 ) {
			age = "잘못 입력하셨습니다"; 
		}else if(input >= 12) {
			age = "탑승 가능";
			System.out.print("키를 입력하시오:");
			double tall = sc.nextDouble();
			if(tall > 140) {
				
			}else {
				age = "적정 키가 아닙니다.";
			}
		}else {
			age = "적정 연령이 아닙니다.";
			
		}
		System.out.println(age);
	}
	
	public void ex8() {
		System.out.print("나이를 입력하시오:");
		int input = sc.nextInt();
		String age;
		
		if(input > 100 || input < 0 ) {
			age = "나이를 잘못 입력하셨습니다";
		}else if(input >= 12) {
			System.out.print("키를 입력하시오:");
			double tall = sc.nextDouble();
			if(tall < 0 || tall > 250) {
				age = "키를 잘못 입력하셨습니다.";
			}else if(tall >140){
				age = "탑승 가능";
			}else {
				age = "나이는 적절하나, 키는 적절하지 않음";
			}
		}else {
			System.out.print("키를 입력하시오:");
			double tall = sc.nextDouble();
			if(tall < 0 || tall > 250) {
				age = "키를 잘못 입력하셨습니다.";
			}else if(tall >140){
				age = "키는 적절하나, 나이는 적절하지 않음.";
			}else {
				age = "나이와 키 모두 적절하지 않음.";
			}
		}
		System.out.println(age);
	}
	
	public void exr1() {
		System.out.print("무게(정수)를 입력하시오 :");
		int kg = sc.nextInt();
		
		String box;
		
		if(kg > 100 || kg <0) {
			box = "무게 입력 오류입니다.";
		}else if(kg >= 30) {
			System.out.print("부피(정수)를 입력하시오 :");
			int vol = sc.nextInt();
			if(vol >50000 ) {
				box = "무게 및 부피 초과로 특수 배송 불가";
			}else {
				box = "무게 초과로 특수 배송 필요";
			}
		}else {
			System.out.print("부피(정수)를 입력하시오 :");
			int vol = sc.nextInt();
			if(vol >50000 ) {
				box = "부피 초과로 특수 배송 필요";
			}else {
				box = "일반 배송 가능";
				}
		}
		System.out.println(box);
		
	}
	
	public void ex9() {
		// switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		//요일 번호 입력 (1~7) : 3
		//수요일
		
		System.out.print("요일 번호 입력(1~7): ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("월요일");
		break;
		case 2 : System.out.println("화요일");
		break;
		case 3 : System.out.println("수요일");
		break;
		case 4 : System.out.println("목요일");
		break;
		case 5 : System.out.println("금요일");
		break;
		case 6 : System.out.println("토요일");
		break;
		case 7 : System.out.println("일요일");
		break;
		default : System.out.println("잘못된 입력입니다.");
		

		}
		
		
		
		
		
		
		
		
	}
	
	public void ex10() {
		// 0~100 사이 점수를 입력받아
		// 10으로 나눈 몫이
		// 10,9 라면 A
		// 8이면 B , 7이면 C, 6이면 D. 그외(5~0) F 출력
		
		//[실행화면]]
		//점수 입력(0~100) : 85
		// 학점 B
		
		System.out.print("점수를 입력 하시오(0~100): ");
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10,9  : System.out.println("학점 A");
		break;
		case 8 : System.out.println("학점 B");
		break;
		case 7 : System.out.println("학점 C");
		break;
		case 6 : System.out.println("학점 D");
		break;
		case 5,4,3,2,1,0 : System.out.println("학점 F");
		break;
		default : System.out.println("잘못된 점수 입력 입니다.");
		
		
		}
	
	}
}
