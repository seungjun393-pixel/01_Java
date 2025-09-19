package edu.kh.array.ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 배열(Array)
	 *
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 묶여진 변수들은 하나의 배열명으로 불려지고
	 * 구분은 index를 이용함 (index는 0부터 시작하는 정수)
	 * 
	 * 
	 * */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 (4byte)을 할당하고
		// 그 공간에 num이라는 이름을 부여 ( int num;의 뜻)
		
		// 변수 대입
		num = 10;
		// 생성된 num이라는 변수공간에 10 이라는 정수값 대입
		
		// 변수 사용
		System.out.println("num에 저장된 값 : "+ num);
		
		// ===========================
		
		// 배열 선언
		int[] arr;
		// int arr[]; 
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다.
		
		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고하며
		//      Heap 메모리 영역에 새로운 공간(배열, 객체등)을 할당하는 것이 new 연산자
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
	
		// new int[3] " Heap 영역에 int 형 변수 3칸짜리 int[]을 생성(할당) 한다는 뜻
		
		// Heap 영역 설명
		// Heap 영역에 할당된 공간은 *절대* 비어있을 수 없음
		// -> 최초 할당 시 JVM 기본값이 자동 저장됨
		// 기본값 : boolean은 false, 나머지는 0, 참조형(String)은 null
		
		// 즉 new int[3]은 Heap 영역에 [0][0][0] 0값인 공간 3개가 생성된것
		
		System.out.println("arr : "+arr); // 주소값 출력
		System.out.println("arr[0] : "+arr[0]); //arr[0]의 값 출력
		System.out.println("arr[1] : "+arr[1]); //arr[1]의 값 출력
		System.out.println("arr[2] : "+arr[2]); //arr[2]의 값 출력
		// -> Heap영역 비어잇을수 없음, JVM 기본값0이 자동으로 저장된것
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		//arr[3] = 500; : 문법오류(컴파일 에러)는 나지않으나, 실행시킬시(런타임 에러)발생
		// 배열 범위(3칸)을 벗어나, 예외 발생
		
		System.out.println("arr[0] : "+arr[0]); 
		System.out.println("arr[1] : "+arr[1]); 
		System.out.println("arr[2] : "+arr[2]); 
		//System.out.println("arr[3] : "+arr[3]); : 마찬가지
		
		// [10,50,100] 출력하고 싶을 때
		// 실제로 배열이 가진 모든 요소의 값을 알고 싶을 때
		// Arrays.toString(배열명); -> String 형
		Arrays.toString(arr); // "[10, 50, 100]"
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];
		//arr : 참조변수(Heap 영역의 배열의 주소를 참조하는 변수이기때문)
		
		//arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		// 배열과 for문
		// 배열의 길이(몇칸인가) : 배열명.length
		System.out.println("배열의 길이 : "+arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i*100; // for문을 이용한 초기화 방법
			// i -> 0 1 2 3
			
			// for문을 이용한 배열 요소 출력 방법
			System.out.printf("arr[%d]에 저장된 값: %d\n", i,arr[i]);
		}
		
		// 선언과 동시에 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2 라는 이름 부여
		// Heap 메모리 영역에 int 5칸 짜리 배열을 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 정수값을 대입함
		// int[] 주소값을 arr2 참조변수가 참조함.
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		// 1번 키 입력 : 
		// 2번 키 입력 :
		// ..
		// 5번 키 입력 :
		// 평균 : 
		
		double[] height = new double[5];
		double sum = 0;
		
		for(int i = 0; i<height.length; i++) {
			System.out.print((i+1)+"번 키 입력 : ");
			height[i] = sc.nextDouble();
			 sum += height[i];
		}
		System.out.printf("평균 키 : %.2f cm",sum/height.length);
	}
	
	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계. 평균 출력
		
		//ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// ..
		// 4번 점수 입력 : 74
		
		// 합계 : 340
		// 평균 : 77.5
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1)+"번 점수 입력 :");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f",(double)sum/arr.length);
		
	}
	
	public void ex5() {
		//점심 메뉴 뽑기 프로그램
		String[] arr = {"김밥", "서브웨이", "햄버거", "백반", "국밥", "짜장면"};
		
		System.out.println("오늘 점심 메뉴 : " + arr[ (int)(Math.random()*6)]);
		//
	}
	
	public void ex6() {
		// 배열을 이용한 검색
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 : 5
		// 존재하지 않음
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//찾음 여부를 표시하기 위한 (신호를 나타내기 위한) 변수
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			
			if(input == arr[i]) {
				System.out.println(i+" 번째 인덱스에 존재");
				flag = true; // 일치하는 값을 찾았으므로 true로 변경
			}
		}
		if(!flag) { // for문 못들어가서 flag = false임, 근데 false면 실행불가, 
			//!부정해서 true로해서 if(true), 실행되게변경
			System.out.println("존재하지 않음");
		}
	 
	}
	
	public void ex7() {
		// 입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 존재하지 않음 출력
		
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		//과일입력 : 아보카도
		//5번 인덱스에 존재
		
		//과일입력 : 수박
		//존재하지 않음
		
		System.out.print("과일입력 : ");
		String input = sc.next();
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(input.equals(arr[i])) {
				System.out.println(i+"번 인덱스에 존재");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
		
		
		
		
		
	}
	
	public void ex8() {
		// ex)
		// 문자열 입력 : hello
		// [h, e, l, l, o]
		// 검색할 문자 입력 : l or u
		// 2개있음 / 존재하지 않음
		
		// 문자열 길이 구하기 : String.length() 
		// ex ) hello.lenght()
		
		// String.charAt(index) : 문자열에서 특정 인덱스에 위치한 문자 하나를 얻어옴
		// ex ) hello.charAt(1) -> e
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		int count = 0;
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
 			
		}
		System.out.print(Arrays.toString(arr));
		
		System.out.print("\n검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		// 검색할문자 하나입력 -> "e" 문자열, 근데 .charAt(0)사용하면 e됨
		// -> Scanner 에는 Char 형태를 입력받을 수 있는 메서드가 없다
		// ->String으로 우선 입력받고, String에서 charAt(index) 메서드 이용해서 index번째 존재하는 문제를 떼어
		// char 자료형으로 변환함
		
		// arr이라는 배열에 입력한 문자가 몇개 존재하는지 
		// 0번 index 부터 마지막 index까지 순회하며 검색하기 위함
 		for(int tryon = 0; tryon<arr.length; tryon++) {
 			if(ch == arr[tryon]) {
			count++;
		}
 			
	} if(count > 0) {
		System.out.println(count+"개 있음");
	}else {
		System.out.println("존재하지 않음");
	}
	}

}
