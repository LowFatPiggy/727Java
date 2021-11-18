package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		
	
		

		// ----- NonStaticMethod -----
		NonStaticMethod test = new NonStaticMethod();
		
		
		// 1. 매개변수 없고 반환값도 없는 메소드
		test.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드
		String str = test.method2(); // 반환값 '안녕하세요' 문자열을 str에 대입
		System.out.println(str);
		
		// System.out.println(test.method2()); // 한줄로 가능
		
		// 3. 매개변수 있고 반환값은 없는 메소드
		test.method3(4, 2);
		
		// 4. 매개변수도 있고 반환값도 있는 메소드
		// 스캐너 메소드로 입력받아 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str1 = sc.nextLine();
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		System.out.println("결과 : "+ test.method4(str1, num));
		
		
		
		
		// ----- StaticMethod -----
		
		
		// 1. 매개 변수 없고 반환값도 없는 메소드
		StaticMethod.method1();
		
		// 2. 매개 변수 없고 반환값은 있는 메소드
		// 반환값을 확인
		System.out.println(StaticMethod.method2());
		
		// 3. 매개 변수 있고 반환값은 없는 메소드
		StaticMethod.method3("짱구");
		
		// 4. 매개 변수 있고 반환값도 있는 메소드
		System.out.println(StaticMethod.method4("apple", "apple"));
		
		
		// ----- Overloading -----
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "ggg");
		ot.test("ggg", 10);
		ot.test(50, 60);
		
		// 오버로딩의 대표적인 예 => 출력문print()
		
	}

}
