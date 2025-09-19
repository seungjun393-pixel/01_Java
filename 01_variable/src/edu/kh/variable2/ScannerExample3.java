package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		//문자열(String) 입력
		//문자열을 3번 입력받아 한줄로 출력하기
		
		//ex)
		//입력1: 안녕?
		//입력2: 반가워
		//입력3: 점심뭐먹지?
		//안녕? 반가워 점심뭐먹지?
		
		//sc.next() : 다음 입력된 한 단어를 읽어옴, 공백(스페이스,탭등)만나면 입력을 중단
		//sc.nextLine() : 다음 입력된 한 줄을 읽어옴, 공백과 함께 입력된 모든 내용을 입력받음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력:");
		String str1 = sc.nextLine();
		System.out.print("문자열 입력:");
		String str2 = sc.nextLine();
		System.out.print("문자열 입력:");
		String str3 = sc.nextLine();
		
		System.out.printf("%s %s %s", str1,str2,str3);

	
	
	
	}
}
