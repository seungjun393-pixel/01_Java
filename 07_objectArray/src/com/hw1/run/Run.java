package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee();
		arr[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		arr[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		
		
		/*System.out.printf("emp[0] : %d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s\n",
		arr[0].getEmpNo(),arr[0].getEmpName(),arr[0].getDept(),arr[0].getJob(),
				arr[0].getAge(),arr[0].getGender(),arr[0].getSalary(),arr[0].getBonusPoint()
				,arr[0].getPhone(),arr[0].getAddress());
		System.out.printf("emp[1] : %d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s\n",
				arr[1].getEmpNo(),arr[1].getEmpName(),arr[1].getDept(),arr[1].getJob(),
						arr[1].getAge(),arr[1].getGender(),arr[1].getSalary(),arr[1].getBonusPoint()
						,arr[1].getPhone(),arr[1].getAddress());
		System.out.printf("emp[2] : %d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s",
				arr[2].getEmpNo(),arr[2].getEmpName(),arr[2].getDept(),arr[2].getJob(),
						arr[2].getAge(),arr[2].getGender(),arr[2].getSalary(),arr[2].getBonusPoint()
						,arr[2].getPhone(),arr[2].getAddress());
		*/
		for(int i = 0; i < arr.length; i++ ) {
			System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s\n",i,
					arr[i].getEmpNo(),arr[i].getEmpName(),arr[i].getDept(),arr[i].getJob(),
					arr[i].getAge(),arr[i].getGender(),arr[i].getSalary(),arr[i].getBonusPoint()
					,arr[i].getPhone(),arr[i].getAddress());
		}
		System.out.println("=======================================================================");
		
		arr[0].setEmpNo(0);
		arr[0].setEmpName("김말똥");
		arr[0].setDept("영업부");
		arr[0].setJob("팀장");
		arr[0].setAge(30);
		arr[0].setGender('M');
		arr[0].setSalary(3000000);
		arr[0].setBonusPoint(0.2);
		arr[0].setPhone("01055559999");
		arr[0].setAddress("서울 마곡");
		
		arr[1].setEmpNo(1);
		arr[1].setEmpName("홍길동");
		arr[1].setDept("기획부");
		arr[1].setJob("부장");
		arr[1].setAge(19);
		arr[1].setGender('M');
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		arr[1].setPhone("01022223333");
		arr[1].setAddress("서울 잠실");

		for(int i = 0; i < (arr.length-1); i++ ) {
			System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.2f, %s, %s\n",i,
					arr[i].getEmpNo(),arr[i].getEmpName(),arr[i].getDept(),arr[i].getJob(),
					arr[i].getAge(),arr[i].getGender(),arr[i].getSalary(),arr[i].getBonusPoint()
					,arr[i].getPhone(),arr[i].getAddress());
		}
		
		System.out.println("=======================================================================");
		
		for(int i = 0 ; i<arr.length; i++) {
			double sum = ( arr[i].getSalary() + (arr[i].getSalary()*arr[i].getBonusPoint()))*12;
			System.out.printf("%s의 연봉 : %.0f원\n",arr[i].getEmpName(),sum);
		}
		
		System.out.println("=======================================================================");
		
		int sum2 = 0;
		for(int i = 0 ; i<arr.length; i++) {
			double sum = ( ( arr[i].getSalary() + (arr[i].getSalary()*arr[i].getBonusPoint()))*12 )/3;
			sum2 += sum;
		}
		
		System.out.println("직원들의 연봉 평균 "+sum2+"원");
	}

}
