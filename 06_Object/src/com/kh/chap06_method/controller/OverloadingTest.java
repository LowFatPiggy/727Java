package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test() {
		
	}
	
	/*
	public void test() {
		
	}
	*/ //동일한 메소드명을 사용하려면 매개 변수의 개수나 자료형을 다르게 해야.
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		// 위의 메소드의 매개변수 순서만 바껴있는 것도 별개의 메소드
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) {
	
	}
	*/ // 매개변수명이 다른 것과는 상관없이 "매개변수의 자료형의 갯수와 순서가 다르게 작성해야"
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
		
	}
	*/ // 반환형이 다른 것과는 상관없이 "매개변수를 다르게 작성해야"
	
	/*
	private void test(String str) {
		
	}
	*/ // 접근제한자도 달라도 상관없다
	
	/*
	 * * 결론
	 * 	  오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 * 			  단, 매개변수명, 접근제한자, 반환형을 다 떠나서
	 * 			  매개변수와 자료형과 갯수, 순서가 다르게 작성되어있어야 한다
	 */
}
