package com.kh.chap04_field.model.vo;

/*
 *  >> 변수 구분
 *  
 *  - 전역 변수 : 클래스 영역에 바로 선언한 변수 --> 클래스 내에서면 어디서든 전역으로 사용 가능.
 *  - 지역 변수 : 클래스 영역 내의 어떤 특정한 구역({})에 선언한 변수 --> 선언된 특정 구역에서만 사용 가능.
 * 				*특정한 구역 : 메소드{}, 제어문(if, for){} 등등
 * 
 *	1. 전역 변수
 *		static이 붙으면 클래스 변수,
 *		생성 시점: (해당 객체 생성이 안되도) 프로그램 실행과 동시에 무조건 메모리 영역(static)에 할당
 *		소멸 시점:	프로그램 종료될 때 소멸
 * 
 *		static 안 붙었으면 멤버 변수 ==인스턴스 변수 ==필드
 *		생성 시점: new 연산자 통해 객체 생성 시
 *		소멸 시점: 객체 소멸 시 같이 소멸
 *
 *	2. 지역 변수
 *		생성 시점: 지역변수가 속해있는 특정한 구역({}) 실행(호출)시 메모리영역에 할당
 *		소멸 시점: 특정한 구역 ({}) 종료시 소멸
 * 
 */

//변수 선언 위치에 따른 구분을 보기 위한 클래스(전역, 지역, 매개)
public class FieldTest1 { // 클래스영역 시작

	// 멤버 변수(인스턴스 변수)
	private int global;
	
	public void test(int num) { // test 메소드 시작 
		// 매개변수 (일종의 지역변수 즉, 메소드 영역 내에서만 쓸 수 있음)
		
		// 지역변수 (메소드 영역내에 선언) => 지역변수에는 접근제한자를 붙이지 않음
		int local = 10;
		
		// 멤버변수 출력 => 해당 이 객체 생성시 JVM이 기본값으로라도 초기화
		System.out.println(global); 
		
		// 매개변수 출력 => 해당 이 메소드 호출 시 반드시 값이 전달되어 올 것이기 때문에 초기화되어있음
		System.out.println(num);
		
		// 지역변수 출력
		System.out.println(local);
		
		
	} // test 메소드 끝
	
	
	
} // 클래스 영역 끝
