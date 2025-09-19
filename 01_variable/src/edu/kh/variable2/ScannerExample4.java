package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//nextInt(), nextDouble(), next() : 공백은 수집하지 않음
		//-> 위 기능을 사용한 후 nextLine 사용시 문제발생
		
		System.out.print("nextInt() 입력:");
		int intNum = sc.nextInt(); // 123입력시 ,123 + \n을 치는것인데, 공백수집안해서 \n은남음
		
		//입력 버퍼에 남은 \n을 제거해야함
		sc.nextLine();
		
		System.out.print("nextLine() 입력:");
		String word = sc.nextLine(); // \n 제거하지않고, 같이 입력시 남아있던 \n을 수집후, 할일끝냄

	}

}
