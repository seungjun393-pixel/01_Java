package edu.kh.oop.practice.snack.controller;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Snack;

public class SnackController {
	
	 Scanner sc = new Scanner(System.in); 
	 Snack s = new Snack();
	 
	 private String information;
	 public SnackController() {
		 
	 }
	 
	 public String saveData() {
		 System.out.print("종류 : ");
		 String kind = sc.next();
		 s.setKind(kind);
		 System.out.print("이름 : ");
		 String name = sc.next();
		 s.setName(name);
		 System.out.print("맛 : ");
		 String flavor = sc.next();
		 s.setFlavor(flavor);
		 System.out.print("개수 : ");
		 int numOf = sc.nextInt();
		 s.setNumOf(numOf);
		 System.out.print("가격 : ");
		 int price = sc.nextInt();
		 s.setPrice(price);
		 information = kind+"("+name+" - "+flavor+") "+numOf+"개 "+price+"원";
		 System.out.print("저장 완료 되었습니다");
		 return information;
		 
	 }
	 
	 public void confirmData() {
		System.out.println(information);
		 
	 }

}
