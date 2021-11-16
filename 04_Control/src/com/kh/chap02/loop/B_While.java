package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * while문
	 * 
	 *  [초기식;] // 생략가능
	 *  while() {
	 *  	반복적으로 실행할 코드;
	 * 		[증감식;] //생략가능
	 *  }
	 *  
	 *  조건식이 true일 경우 해당 코드 실행
	 *  
	 *  조건식 검사 --> true일 경우 실행코드 실행
	 *  다시 조건식 검사 --> true일 경우 실행코드 실행
	 *  다시 조건식 검사 --> false일 경우 실행코드 실행x --> 반복문 빠져나옴
	 */
	
	public void method1() {
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
	}
	
	public void method2() {
		
		int i = 1;
		while (i <=5) {
			// System.out.print(i + " ");
			// i++;
			// 위 두줄을 아래 한줄로 줄이는 것 가능.
			System.out.print(i++ + " ");
		}
	}
	
	public void method3() {
		// 1 3 5 7 9
		
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println(i); // false로 빠져나온 값은 while문안에 들지 못한 11
	}
	
	public void method4() {
		// 1부터 랜덤값(1~100사이)까지의 합계
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0; // 초기화
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계는 " + sum);
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0; 
		while (i < str.length()) { // '<=' 아닌이유: 인덱스 0부터니까.
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
