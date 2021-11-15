package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * * 논리연산자 (이항연산자)
	 *   두개의 논리값을 연산해주는 연산자
	 *   논리연산한 결과마저도 논리값
	 *   
	 *   논리값 && 논리값 : 왼쪽, 오른쪽 둘 다 true일 경우 결과값은 true
	 *   논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true일 경우 결과값은 true
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100); 한 큐에 안돼x 두개씩 끊어
		boolean result = (num >= 1) && (num <= 100); // num값이 1이상"이고" "그리고" num값이 100이하일 경우
		// && 의미 : ~이고, 그리고, ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까? : " + result );
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// boolean result = (65 <= ch <= 90); 안돼x
		boolean result = (ch >= 65) && (ch <= 90);
		
		System.out.println("사용자가 입력한 값이 대문자입니까: " + result);
	}
	
	public void method3() {
		// 사용자에게 성별을 입력받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || 의미 : ~이거나, 또는
		
		System.out.println("사용자가 여자입니까 : " + result);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'Y') || (ch == 'y');
				
		System.out.println("사용자가 입력한 값이 Y 또는  y입니까  : " + result);
	}	
	
	public void method5() {
		
		// && 연산자를 기준으로 앞에 결과가 false일 경우 뒤의 조건은 실행x
		int num = 10;
		
		boolean result1 = (num < 5) && (++num > 0); // ++num이 전혀 반영x
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num : " + num);
		
		// || 연산자를 기준으로 앞에 결과가 true일 경우 뒤에 조건도 실행x
		int num2 = 10;
		
		boolean result2 = true || (++num2 > 0); // 뒤가 Dead Code
		System.out.println("|| 연산 후의 num" + num2);
		
	}

	
	
	
	
	
}
