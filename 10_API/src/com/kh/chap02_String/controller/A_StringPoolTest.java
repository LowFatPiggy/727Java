package com.kh.chap02_String.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. 생성자를 통한 문자열 생성
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String 클래스에 toString메소드가 실제 담긴 문자열을 반환하도록 이미 오버라이딩 되어있다
		
		System.out.println(str1 == str2); // 주소값 비교. false
		System.out.println(str1.equals(str2)); // 문자열간 비교. true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode메소드 이미 오버라이딩 되어있다 => 주소값이 아닌 실제 담긴 문자열 비교
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 진짜 주소값에 대해 알고 싶다면 System.identityHashCode(레퍼런스)
		
	}
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		// 리터럴 제시 시 상수풀(String Pool)영역에 올라감
		// String Pool 특징 : 동일한 문자열을 가질 수 없음 = 주소값이 같아짐
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// str1과 str2는 주소값이 다른가?
		System.out.println(str1 == str2); // true (주소값 일치)
		
		// 진짜 같은가?
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// yes 찐주소값까지 일치함
		
		// new 연산자를 통해 만든 str은 어떤가? 
		System.out.println(System.identityHashCode(str)); // 다른 주소값
		
		// 대입한 문자열을 변경한다면 주소값은 어떻게?
		// String 클래스 == 불변 클래스(값이 변하지 않는 클래스)
		// => 값 변경이 가능하나, 그 주소에서 수정 되는 개념이 x
		String str3 = "hi";
		System.out.println(System.identityHashCode(str3));
		// ----- 문자열 변경 후 -----
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 문자열을 변경하는 순간 새로운 주소로 참조하도록.(새로운 주소값이 부여)
		
		str3 = "hello";
		// 기존에 있던 문자열로 변경하면 그 문자열이 담긴 주소값으로 변경됨
		System.out.println(System.identityHashCode(str3));
	}
	

}
