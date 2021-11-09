package com.kh.first.run;

import com.kh.first.MethodTest;

public class Run {

	public static void main(String[] args) {
		/*
		 * 같은 클래스의 메소드를 호출할 때는 단순히 호출만 해도 가능
		 * 호출할 메소드명();
		 * 
		 * 그런데 다른 클래스의 메소드를 호출할 경우에는?
		 * 
		 */
		
		System.out.println("메인메소드 실행 시작!!");
		
		//1.호출할 메소드가 있는 클래스(틀)을 가진 녀석을 생성(복사와 비슷한 맥락)
		// [표현법]
		// 클래스명 생성할녀석이름 = new 클래스명();
		MethodTest mt = new MethodTest(); // 생성할 때 new 사용 
		
		// => 기본적으로 현재 com.kh.first.run 패키지 안에 MethodTest 라는 클래스가 존재하지 않아서
		//    import 문장으로 MethodTest 클래스의 위치를 찾아준 것!
		
		// 위에 import문을 쓰지 않고 아래처럼 작성해도 되지만 잘 쓰지 않는다
		// com.kh.first.MethodTest mt = new com.kh.first.MethodTest();
		
		// 2. 생성 후 이제 해당 클래스에 있는 메소드를 호출하면 된다.
		// [표현법]
		// 생성한녀석의이름.호출할메소드이름();
		mt.testPrint();

	}

}
