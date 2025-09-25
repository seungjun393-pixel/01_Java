package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		Hero hero = new Hero();
		hero.setNickname("이구역짱");
		hero.setJob("전사");
		hero.setHp(200);
		hero.setMp(20);
		hero.setLevel(1);
		hero.setExp(0.0);
		
		Hero hero2 = new Hero("Zi존위자드","마법사",100,100,1,0);
		
		System.out.println("========캐릭터 생성===========");
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다",hero.getJob(),hero.getNickname());
		System.out.printf("\n현재 레벨 : %d\n현재 hp : %d\n현재 mp : %d\n현재 경험치 %.1f",
				hero.getLevel(),hero.getHp(),hero.getMp(),hero.getExp());
		
		System.out.println("========캐릭터 생성===========");
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다",hero2.getJob(),hero2.getNickname());
		System.out.printf("\n현재 레벨 : %d\n현재 hp : %d\n현재 mp : %d\n현재 경험치 %.1f",
				hero2.getLevel(),hero2.getHp(),hero2.getMp(),hero2.getExp());
		
		System.out.println("=========이구역짱 시점===========");
		
		hero.attack(100);
		hero.attack(50.5);
		hero.attack(50);
		System.out.println(hero.dash());
		System.out.println(hero.dash());
		System.out.println(hero.dash());
		System.out.println("=========='이구역짱'님의 정보==========");
		System.out.println( hero.toString());
		
		System.out.println("==========Zi존위자드 시점================");
		hero2.attack(300);
		System.out.println(hero2.dash());
		hero2.attack(300);
		hero2.attack(300);
		System.out.println("============='Zi존위자드'님의 정보============");
		System.out.println( hero2.toString());
	}


}
