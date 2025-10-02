package edu.kh.collection.miniproject.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.miniproject.model.dto.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);
	
	 private Map<Integer, String> ma = new HashMap<>();
	 private Set<Toy> toy = new HashSet<>();
	 
	public ToyFactory(){
		ma.put(1, "면직물");
	    ma.put(2, "플라스틱");
	    ma.put(3, "유리");
	    ma.put(4, "고무");
	    
		toy.add(new Toy("마미롱레그",8,36000,"분홍색",19950805, addMaterials(1, 4) ));
		toy.add(new Toy("허기워기",5,12000,"파란색",19940312, addMaterials(1, 2) ));
		toy.add(new Toy("키시미시",5,15000,"분홍색",1994050, addMaterials(1, 2) ));
		toy.add(new Toy("캣냅",8,27000,"보라색",19960128,addMaterials(1, 2) ));
		toy.add(new Toy("파피",12,57000,"빨간색",19931225,addMaterials(1, 2, 4) ));
		
	}
		
	private Set<String> addMaterials(int...materialNums) {
		// [1, 4]
		// [1, 2, 4]
		Set<String> str = new HashSet<String>();
		
		for(int num : materialNums) {
			str.add(ma.get(num)); // ["면직물", "고무"]
		}
		return str; 
	}

	public void displayMenu() {
		
		int choice = 0;
		
		do{
			try{
				System.out.println("<< 플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 프로그램 종료");
				System.out.print("선택 : ");
				choice = sc.nextInt();
				
				System.out.println();
				
				switch(choice) {
				case 1 : toyJoin();
				break;
				case 2 : toyMake();
				break;
				case 3 :
				break;
				case 4 : 
				break;
				case 5 : 
				break;
				case 6 :
				break;
				case 7 : 
				break;
				case 0 :
				break;
				default : 
				
				}
				
			}catch(Exception e) {
				
			}
			
		}while(choice != 0);
	}
	
	public void toyJoin() {
		
		System.out.println("<< 전체 장난감 목록 >>");
		
	int sum = 1;
	for(Toy temp : toy) {
		System.out.print(sum);
		System.out.print(".");
		System.out.println(temp);
		sum++;
	}
	System.out.println();
		
	}
	
	public void toyMake() {
		System.out.println("< 새로운 장난감 추가 >");
		
		System.out.print("장난감 이름 : ");
		String inputName = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int inputUseAge = sc.nextInt();
		
		System.out.print("가격 : ");
		int inputPrice = sc.nextInt();
		
		System.out.print("색상 : ");
		String inputColor = sc.next();
		
		System.out.print("제조일(YYYY/MMMM 형식으로 입력) : ");
		int inputMade = sc.nextInt();
		
		String material = "";
		
		for(int i = 0; i < 3; i++) {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요 : ");
			String inputMaterial = sc.next();
			if(inputMaterial.equals("q")) {
				break;
			}
			material += inputMaterial+",";
		}
		
     	toy.add(new Toy(inputName,inputUseAge,inputPrice,inputColor,inputMade, addMaterials(1, 4) ));
		System.out.println("새로운 장난감이 추가되었습니다");
		
	}
	
	public void toyRemove() {
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String inputRemoveToy = sc.next();
		
		for(Toy temp : toy) {
//			if()
		}

		
	}

}
