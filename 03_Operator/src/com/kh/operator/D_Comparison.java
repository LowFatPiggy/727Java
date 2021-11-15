package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	
	/*
	 * * 비교연산자/관계연산자 (이항연산자)
	 * 	  두 값을 비교하는 연산자
	 * 	  비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반환
	 * 	  즉, 비교연산 결과는 논리값
	 * 
	 * 	대소비교연산자 : < > <= >=
	 * 	동등비교연산자 : == !=
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); //비교연산자가 먼저 계산되도록 괄호처리.
		System.out.println("a <= b : " + (a <= b));
		
		boolean result = (a > b);
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		System.out.println((a * 2) > (b / 5));
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 != 1));
		System.out.println("a가 홀수인가 : " + !(a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 == 1));
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("첫 번째가 두 번째보다 큽니까 : " + (num1 > num2));
		System.out.println("첫 번째 정수가 짝수입니까 : " + (num1 % 2 == 0));
		
		// 특이케이스 (문자와 숫자간의 대소비교 가능)
		System.out.println((num2 < 'A'));
	}

}
