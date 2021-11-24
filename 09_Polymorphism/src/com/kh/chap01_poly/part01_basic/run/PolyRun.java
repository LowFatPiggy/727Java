package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// '=' 기준으로 양쪽의 자료형(타입)은 같아야 하는 것을 기억!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // ((Parents)c1.printParent(); 자식이 부모로 자동형변환
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		// => Parent 접근 시 자동으로 형변환 된 채로 진행
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (=다형성)");
		Parent p2 = /*(Parent)*/ new Child1(); // 자동형변환
		p2.printParent();
		// p2.printChild1(); 자식객체 호출불가
		((Child1)p2).printChild1(); // 부모가 자식으로 강제형변환해야 호출가능
		
		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting
		 *    자식 타입 -> 부모 타입으로 형변환(자동)
		 *    ex) 자식.부모메소드();
		 *        부모 = 자식객체;
		 * 
		 * 2. DownCasting
		 * 	    부모 타입 -> 자식 타입으로 형변환(강제)
		 *    ex) ((자식)부모).자식메소드();
		 */
		
		// String str = (String)new Child1();
		
		// * 다형성 정의
		// - 부모 타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로 다룰 수 있는 기술
		
		// * 다형성을 쓰는 목적 (장점)
		
		// 다형성 사용 전 ----
		// Child1 객체 2개와 Child2 객체 2개를 관리해야
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// 다형성 적용 후 ----
		Parent[] arr = new Parent[4];
	  //Parent타입
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모타입으로 여러 자식객체들을 받을 수 있음 => 편리, 코드 길이 감소
		
		System.out.println("======================");
		// arr[0].printChild1(); // arr[0] Parent 타입이기 때문에 강제형변환해야.
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		// ((Child1)arr[2]).printChild1(); // ClassCastExcpetion 적절하지 못한 형변환 오류.
		// arr[2]는 Child2 객체인데 Child1으로 형변환하려하니 오류.
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("=====반복문 이용해서 출력=====");
		for(int i=0; i<arr.length; i++) {
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
		}
		
		// 여기서 간단하게 instanceof 연산자를 사용 => 결과는 true/false로 반환
		// 현재 레퍼런스가 실질적으로 어떤 클래스타입을 참조하는지 확인 할 때 사용
		
		System.out.println("=====instanceof 출력=====");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Child1) { // 해당 레퍼런스가 실제 Child1 참조하고 있다면 true or false
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
		}
		
		// 오버라이딩 개념이 적용되었을 때는 더 간단해짐
		
		System.out.println("====");
		
		Parent pp = new Child1();
		pp.print(); // Parent가 아닌 Child1에 있는 print 실행
		
		/*
		 * 동적 바인딩 : 프로그램 실행되기 전에 컴파일 되면서 정적바인딩 됨 (레퍼런스타입의 메소드를 가리킴)
		 * 			 단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어있으면
		 * 			 프로그램 실행 시 동적으로 그 자식들의 오버라이딩 된 메소드를 찾아서 실행
		 */
		
		for(int i=0; i < arr.length; i++) {
			arr[i].print();
		}
		
	}

}
