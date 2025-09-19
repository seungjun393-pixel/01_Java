package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 바로 종료
		
			for(int i = 1;; i++) {
				System.out.print(i+" ");
				if(i == 5) {
					break;
				}
			}
	}
	
	public void ex2() {
		//입력 받은 모든 문자열을 누적
		//단. "exit@" 입력시 문자열 누적을 종료하고, 결과 출력
		
	    String str = "";
	    
	    while(true) {
	    	System.out.print("문자열 누적(exit@입력시 종료): ");
	        String input = sc.nextLine();
	        // next() : 다음 한 단어(공백 포함 X)
	        // nextLine() : 다음 한 줄(공백 포함 O)
	        
	        //자바에서 문자열(String) 비교는 == 연산자 사용 불가
	        //String은 기본 자료형이 아닌 참조형
	        
	        //equals() 메서드 사용법(문자열1,2가 있다고 가정)
	        //문자열1.equals(문자열2) : 문자열 1,2가 같은지 비교
	        // 같으면 true , 다르면 false 반환
	
	        if(input.equals("exit@")) {
	        	break;
	        }str += input;
	    }System.out.println(str);
	}
	
	public void ex3() {
		// continue : 다음 반복으로 넘어감
		// -> 아래있는 코드 수행 X, 
		
		// 1~10 까지 1씩 증가하며 출력
		//단,3의 배수 제외
		for(int i = 1; i<=10; i++) {
			if( i % 3 ==0) {
				continue;
			}System.out.print(i+" ");
		}
	}
	
	public void ex4() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을때 반복멈춤
		
		for(int i = 1; i<=100; i++) {
			
			if(i == 40) {
				break;
			}
			if(i % 5 == 0) {
				continue;
			}
			System.out.println(i+" ");
			
		}
	}
	
	public void RSPGame() {
		//가위바위보 게임
		//몇판할지 입력, 입력판수만큼 반복
		
		//컴퓨터 : Math.random() : 0.0~1.0 사이 난수 생성
		//1~3사이 난수 생성
		//1이면 가위, 2이면 바위, 3이면 보 지정
		//컴퓨터와 플레이어 가위바위보 판별
		//플레이어 승! / 졌습니다 ㅠㅠ / 비겼습니다
		//매판마다 - 현재기록 : 2승 1무 0패 
		
		System.out.println("[가위 바위 보 게임~!!!]");
		System.out.print("몇 판? : ");
		int round = sc.nextInt();
		
		//승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i<=round; i++) {
			System.out.println("\n"+i+"번째 게임");
			System.out.print("가위/바위/보 중 하나 입력 : ");
			String play = sc.next();
			
			int random = (int)(Math.random()*3+1);
			//Math.random() : 0.0~1.0사이
			// 0.0 <= x <1.0  <- *3하면
			//0.0 <= x*3 <3.0 <- +1하면
			//1.0<= x*3+1 <4.0 <- int 형변환쓰면
			//1이상 4미만 정수가 랜덤으로 출력 -> 1 2 3
			
			//switch 로 ramdom값 문자열로 바꾸기
			String com = null; 
			//String com = null : 아무것도 참조하고 있지 않음.
			//참조형 : 메모리 (Heap)공간에 있는 값의 주소를 참조하는 것.
			//null 값으로 초기화 한것.
			//System.out.println(com); : 에러발생 X null이라 콘솔에 출력됨
			
			//String com2 = "";
			//빈 문자열 객체로 초기화가 된 상태
			//com2 변수에 ""로 값이 실제로 들어간 상태
			//System.err.println(com2); 에러발생 X 콘솔창에 빈문자열로 출력
			
			//String com3; ->선언만 이루어짐, com3라는 이름의 상자만 메모리에 생성
			//값이 전혀 없음(초기화가 안된 상태
			//System.out.println(com3); : 컴파일 에러 발생
			
			switch(random) {
			case 1 : com = "가위";
			break;
			case 2 : com = "바위";
			break;
			case 3 : com = "보";
			break;
			}
			
			System.err.printf("컴퓨터는 [%s]를 선택했습니다.\n",com);
			
			//컴퓨터와 플레이어의 가위바위보 판별
			if(play.equals(com)) { //비긴 경우
				System.out.println("비겼습니다.");
				draw++;
			}else { // 이기거나 진 경우
				
				boolean win1 = play.equals("가위") && com.equals("보");
				boolean win2 = play.equals("바위") && com.equals("가위");
				boolean win3 = play.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				}else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			}System.out.printf("현재 기록은 %d승 %d무 %d패 입니다.\n",win,draw,lose);
			
		}
	}
	
	public void updownGame() {
		System.out.println("Up-Down Game");
		//플레이어의 숫자가 컴퓨터보다 높을지 낮을지 맞추면 승리
		System.out.print("몇 판 할지 입력하시오 : ");
		int round = sc.nextInt();
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		for(int i = 1; i<=round; i++) {
			System.out.printf("[%d번째 게임]\n",i);
			int player = (int)(Math.random()*100)+1;
			System.out.printf("플레이어의 숫자는 %d 입니다.: ",player);
			System.out.println("UP OR DOWN?(대문자로 UP/DOWN 중 하나 입력): ");
			String choice = sc.next();
			int com = (int)(Math.random()*100)+1;
			
			if(choice.equals("UP")) {
				if(player > com) {
					System.out.println("정답입니다!");
					win++;
				}else if(player < com) {
					System.out.println("오답입니다!");
					lose++;
				}else {
					System.out.println("무승부입니다!");
					draw++;
				}
			}else if(choice.equals("DOWN")) {
				if(player > com) {
					System.out.println("오답입니다!");
					lose++;
				}else if(player < com) {
					System.out.println("정답입니다!");
					win++;
				}else {
					System.out.println("무승부입니다!");
					draw++;
				}
			}else {
				System.out.println("잘못된 입력입니다. 대문자로 UP/DOWN 중 하나를 입력해주세요");
				continue;
			}
			System.out.printf("컴퓨터의 숫자는 %d 였습니다.",com);
			System.out.printf("현재 기록은 %d승 %d패 %d무 입니다.", win,lose,draw);
			
			
			
			
		}
	}
}
