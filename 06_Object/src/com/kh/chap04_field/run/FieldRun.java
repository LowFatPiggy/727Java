package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;

public class FieldRun {

	public static void main(String[] args) {
		
		// ----- FieldTest2 -----
		/*
		FieldTest1 f1 = new FieldTest1();
		
		f1.test(5);
		*/
		
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		// public : 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected : 같은 패키지 접근 가능 , 다른 패키지라면 상속구조에서만 접근가능
		// System.out.println(f2.pro);
		
		// default : 오직 같은 패키지내에서만 접근 가능
		// System.out.println(f2.def);
		
		// private : 오직 해당 그 클래스만 접근 가능
		// System.out.println(f2.pri);

	}

}
