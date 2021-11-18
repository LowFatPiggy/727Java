package com.kh.chap04_field.model.vo;

public class run {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		
		/*
		// public : 어디서든 접근 가능
		System.out.println(f2.pub);
				
		// protected : 같은 패키지 접근 가능 , 다른 패키지라면 상속구조에서만 접근가능
		System.out.println(f2.pro);
				
		// default : 오직 같은 패키지내에서만 접근 가능
		System.out.println(f2.def);
				
		// private : 오직 해당 그 클래스만 접근 가능
		// System.out.println(f2.pri);
		*/
		
		
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		
		FieldTest3.sta = "zzz";
		System.out.println(FieldTest3.sta);
		
		// 변경이 절대 안되게 하되 누구나 가져다 쓰게 하려면 상수필드
		System.out.println(FieldTest3.STA_FIN);
		// FieldTest3.STA_FIN = "ggg"; // 변경 불가
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}

}
