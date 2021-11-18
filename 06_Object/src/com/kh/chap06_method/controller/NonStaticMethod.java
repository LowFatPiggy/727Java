package com.kh.chap06_method.controller;

public class NonStaticMethod {
	
	/*
	 *  * 메소드
	 *    한 기능을 처리하기 위한 용도
	 *    
	 *  * [표현법]
	 *    접근제한자 [예약어] 반환할값의자료형 메소드([매개변수, 매개변수, ..]) {
	 *    	수행 내용;
	 *    	[return 결과값;] // 반환할 값 없으면 자료형 자리에 void 작성
	 *    }
	 */
	
	// 1. 매개변수 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘다 없는 메소드입니다.");
	}
	
	// 2. 매개변수 없고 반환값은 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		return "안녕하세요"; // 이 문자열을 반환하게끔
	}
	
	// 3. 매개변수 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고 반환값은 없는 메소드입니다.");
		
		if(num2 != 0) {
			System.out.println("나눗셈결과 : " + num1 / num2);			
		} else {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	//	     문자열과 정수값을 전달 받아서 해당 문자열의 해당 정수 인덱스의 문자값을 뽑아 반환
	public char method4(String str, int index) {
		
		System.out.println("매개변수와 반환값 둘다 있는 메소드입니다.");
		
		if(index >= 0 && index < str.length()) {
			return str.charAt(index);
		}
		return 0;
	}
	

}
