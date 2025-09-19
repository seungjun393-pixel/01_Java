package edu.kh.variable.practice2;

public class CastingPracitce {
	
	public static void main(String[] args) {
		
		int age = 24;
		System.out.println("나는 "+age+"살입니다.");
		
		int score = 90;
		int result = score + 10;
		System.out.println("최종점수:"+result);
		
		int a = 10;
		double b = a;
		System.out.println(b);
		
		double pi = 3.14159;
		int pi2 = (int)pi;
		System.out.println(pi2);
		System.out.printf("%.2f\n", pi);
		
		char ch = 'A';
		int ch2 = (int)ch;
		System.out.println("문자:"+ch+",코드값:"+ch2+"");		
		
		final int PRICE = 5000;
		int count = 3;
		System.out.println("물건 가격:"+PRICE+"원, 개수:"+count+"개, 총액:"+PRICE*count+"원");
		
		int math = 90;
		int korean = 95;
		int eng = 87;
		int total = korean+math+eng;
		
		System.out.printf("국어:%d, 영어:%d,수학:%d\n", korean,eng,math);
		System.out.printf("총점:%d, 평균:%.2f\n", total,total/3.0);
		
		String young = "영숙";
		int age2 = 28;
		double height = 165.7;
		
		System.out.printf("출연자 이름:%s\n",young);
		System.out.printf("나이:%d\n",age2);
		System.out.printf("키:%.1fcm\n", height);
		
		double age3 = age2;
		System.out.println(age3);
		
		int height2 = (int)height;
		System.out.println(height2);
		
		int score2 = 87;
		int score3 = 92;
		double total2 = (score2+score3)/2.0;
		System.out.println("영숙님의 매칭 점수 평균은"+total2+"점입니다!");
		
		
		
		
		
				
				
		
	}

}
