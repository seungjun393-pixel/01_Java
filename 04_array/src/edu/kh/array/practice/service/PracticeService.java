package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
			if(i % 2 ==0 ) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수번째 인덱스 합 : "+sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i]+" ");
			if(i % 2 ==1 ) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수번째 인덱스 합 : "+sum);
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i<input; i++) {
			System.out.print((i+1)+" ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("입력 "+i+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == input) {
				System.out.print("인덱스 값 "+i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<ch.length; i++) {
			ch[i] = str.charAt(i);
			
		}
		System.out.print("문자 : ");
		char ch2 = sc.next().charAt(0);
		
		String sum = "";
		int count = 0;
		
		for(int i = 0; i<ch.length; i++) {
			
			if(ch[i] == ch2) {
				sum += i+" ";
				count++;
			}
			
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %s\n",str,ch2,sum);
		System.out.println(ch2+"의 개수 : "+count);
		
	}
	
	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		int sum = 0;
		String sum2 = "";
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			sum2 += arr[i]+" ";
		}
		System.out.println(sum2);
		System.out.println("총 합 : "+sum);
		
	}
	
	public void practice7() {
		System.out.println("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		char arr[] = input.toCharArray();
		
		for (int i = 8; i < arr.length; i++) {
			arr[i] = '*';
		}

		System.out.println(new String(arr));
				
		
	}
	
	public void practice8() {
			int input = 0;
			
		while(true) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			if(input >= 3 && input % 2 == 1) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int arr[] = new int[input*2-1];
		
		for(int i =0; i<input; i++) {
			arr[i] = i+1;
			arr[(arr.length-1)-i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void practice9() {
		int[] arr = new int[10];
		String sum = "";
	
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			sum += arr[i]+" ";
		}
		System.out.println("발생한 난수 : "+sum);
	}
	
	public void practice10() {
		
	}

}
