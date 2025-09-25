package edu.kh.oop.practice.snack.view;

import java.util.Scanner;

import edu.kh.oop.practice.snack.controller.SnackController;

public class SnackMenu {
	
	 Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		
		    scr.saveData(); 
		System.out.print("저장된 정보를 확인하시겠습니까? y/n : ");
		char ch = sc.next().charAt(0);
		if( ch == 'y') {
			scr.confirmData();
		}
		
	}

	

}
