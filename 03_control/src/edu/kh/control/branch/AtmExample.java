package edu.kh.control.branch;

import java.util.Scanner;

public class AtmExample {
	Scanner sc = new Scanner(System.in);
	
	public void atm() {
		System.out.println("===ATM 프로그램 시작 ===");
		int money = 10000;
		System.out.println("현재 잔액 : "+money);
		
		while(true) {
			int deposit = 0; // 입금
			int withdraw = 0; // 출금
			
			System.out.println("메뉴를 선택하세요:");
			System.out.println("1. 입급하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");
			
			int input = sc.nextInt();
			System.out.println();
			switch(input) {
			case 1 : 
				System.out.print("입금할 금액을 입력하세요 : ");
			    deposit = sc.nextInt(); 
			    money += deposit;
			    System.out.println("입금 완료! 현재 잔액 : "+money + "원\n");
			break;
			case 2 : 
				System.out.print("출금할 금액을 입력하세요: ");
				withdraw = sc.nextInt();
				
				if(money > withdraw) {
					System.out.printf("출금 완료! 현재 잔액:%d원\n\n", money - withdraw);
					money -= withdraw;
				} else {
					System.out.printf("잔액 부족! 현재 잔액%d원 \n\n", money);
				}
				break;
			case 3:
				System.out.println("현재 잔액은 " + money + "원입니다.\n");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
					System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.\n");
					continue;
			}
			if(input == 4) {
				break;
			}
		}
		
	}
	
	public void dice22() {
		System.out.println("===주사위 맞히기 게임 시작===");
		System.out.println("1~6사이 숫자를 맞춰보세요.(종료를 원하면 \"종료\"입력)");
		
		int count = 0;
		int answer = 0;
		int win = 0;
		while(true) {
			
		answer = (int)(Math.random()*6)+1;
		while(true) {
			System.out.print("\n숫자입력>> ");
			String input = sc.next();
			boolean result = input.matches("[1-6]");
			if(input.equals("종료")) {
				if(count == 0) {
					System.out.println("\n=== 게임종료 ===");
					System.out.printf("총 시도 횟수:%d번\n정답 횟수:%d번\n게임을 플레이하지 않았습니다.",count,win);
					return;
				}else {
					System.out.println("게임을 종료합니다");
					System.out.printf("총 시도 횟수: %d번\n정답 횟수: %d번\n",count,win);
					System.out.println("정답률:"+(win*100)/count+"%");
					return;
				}
				
			}
			 if (!result) {
				 System.out.println("잘못된 입력입니다. 1~6 사이의 숫자를 입력해주세요.");
	                continue;
			 }  
				int num = Integer.parseInt(input);
				count++;
				if(num > answer) {
					System.out.println("틀렸습니다. 더 작은수를 입력하세요.");
				}else if(num < answer) {
					System.out.println("틀렸습니다. 더 큰수를 입력하세요.");
				}else {
					System.out.println("정답입니다!");
					win++;
					System.out.println("새로운 주사위 숫자가 생성 되었습니다!");
					break;
				}
			}
	     }
	}		
	public void dice() {
		System.out.println("===주사위 맞히기 게임 시작===");
		System.out.println("1~6 사이 숫자를 맞혀보세요.(종료를 원하면 \"종료\" 입력)\n");
		
		int count = 0;
		int win = 0;
		int num = 0;
		boolean flag = false;
		
		while(true) {
			int answer = (int)Math.random()*6+1;
			
			while(true) {
				System.out.print("숫자입력 >>");
				if(sc.hasNextInt()) {
					num = sc.nextInt();
					if(num < 1 || num > 6) {
						System.out.println("잘못된 입력입니다. 1~6사이 숫자를 입력하세요.\n");
						continue;
					}
				} else {
					// 종료
					String str = sc.next();
					flag = true;
					break;
				}
				if(num > answer) {
					System.out.println("틀렸습니다. 더 작은 수를 입력하세요.\n");
				}else if(num < answer){
					System.out.println("틀렸습니다. 더 큰 수를 입력하세요.\n");
				}else {
					System.out.println("정답입니다!\n");
					win++;
					System.out.println("새로운 주사위 숫자가 생성되었습니다.\n");
				}
				count++;
			}
			if(flag) {
				break;
			}
			
		}
		if(count == 0) {
		System.out.println("\n===게임 종료===");
		System.out.println("총 시도 횟수:" + count+"번");
		System.out.println("정답 횟수:" + win+"번");
		System.out.println("게임을 플레이하지 않았습니다.");
		}else {
			System.out.println("게임을 종료합니다.");
			System.out.println("총 시도 횟수:" + count+"번");
			System.out.println("정답 횟수:" + win+"번");
			System.out.println("정답률:" + (win * 100) / count + "%");
		}
	}

}
