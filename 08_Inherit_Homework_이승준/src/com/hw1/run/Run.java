package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	
	
	/*
	 * 향상된 for 문
	 * 
	 * for(자료형 변수명 : 배열 또는 컬렉션){
	 *  // 반복해서 실행할 코드
	 *  }
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[3];
		
		arr[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		arr[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		arr[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(Student std : arr) {
			System.out.println( std.information() );
		}
		System.out.println("===============================");
		
		System.out.println(arr[0].information());
		System.out.println(arr[1].information());
		System.out.println(arr[2].information());
		System.out.println("======================================");
		
		Employee[] arr2 = new Employee[10];
		
	
		int count = 0;
		
		while(true) {
			if(count >= 10) {
				System.out.println("최대 사원수를 초과하였습니다");
				}
			
			System.out.print("이름을 입력하세요 : ");
			String inputName = sc.next();
			
			System.out.print("나이을 입력하세요 : ");
			int inputAge = sc.nextInt();
			
			System.out.print("신장을 입력하세요 : ");
			double inputHeight = sc.nextDouble();
			
			System.out.print("몸무게를 입력하세요 : ");
			double inputWeight = sc.nextDouble();
			
			System.out.print("급여를 입력하세요 : ");
			int inputSalary = sc.nextInt();
			
			System.out.print("부서를 입력하세요 : ");
			String inputDept = sc.next();
			
			Employee emp = new Employee();
			
			emp.setName(inputName);
			emp.setAge(inputAge);
			emp.setHeight(inputHeight);
			emp.setWeight(inputWeight);
			emp.setSalary(inputSalary);
			emp.setDept(inputDept);
			
			arr2[count] = emp;
			count++;
			
			System.out.println("추가한 사원들의 정보를 확인하겠습니까?(Y/N) : ");
			char inputChoice2 = sc.next().charAt(0);
			
			if(inputChoice2 == 'y' || inputChoice2 == 'Y') {
				for(int i = 0; i<count; i++) {
					System.out.println(arr2[i].information());
				}
			}

			
			
			System.out.print("계속 추가하시겠습니까?(Y/N) : ");
			char inputChoice = sc.next().charAt(0);
				
			if(inputChoice == 'y' || inputChoice == 'Y') {
				continue;
			}else {
				System.out.println("사원 정보추가를 종료합니다...");
				break;
			}
			// 소문자 -> 대문자 : sc.next().toUpperCase();
			// 대문자 -> 소문자 : sc.next().toLowerCase();
			// 대소문자 구분않고, 문자열만 비교 : equalsIgnoreCase()
		}
	}
		

}


