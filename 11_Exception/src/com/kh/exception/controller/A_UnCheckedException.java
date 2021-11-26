package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException {
	
	/*
	 * ** RuntimeException
	 *  - 프로그램 실행 시 발생되는 예외들
	 * 
	 * ** RuntimeException
	 *  - IndexOutOfBoundsException : 부적절한 인덱스에 접근 시 발생되는 예외
	 *  - NullPointerException : 참조 변수가 null값인 상황에서 접근했을 때 발생되는 예외
	 *  - ArithmeticException : 나누기 연산 시 0으로 나누려할 때 발생되는 예외
	 *  - ClassCastException : 허용할 수 없는 형변환 진행하려할 경우 발생되는 예외
	 *  - NegativeArrays 
	 * 
	 *  => RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있음
	 *     애초에 예외자체가 발생이 안되게끔 if문 조건처리 가능
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : 나누기 연산 시 0으로 나누려할 때 발생하는 예외
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2; // 사용자가 두번째 정수를 0으로 입력하는 순간 예외 발생 => 비정상적으로 프로그램 종료
		
		/*
		// 해결 방법 1. 애초에 예외 자체 발생이 안되게끔 if문으로 조건검사 => 예외처리x
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("result : " + result);
		*/
		
		
		// 예외처리 : 예외가 "발생했을 때" 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * try catch 방법
		 * 
		 * try {
		 *    예외가 발생할 수 있는 구문;
		 * } catch(발생될 예외클래스 매개변수) {
		 *    해당 예외가 발생했을 경우 실행할 구문;
		 * }
		 */
		
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 오류 이력을 보고자 할 때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생하는 예외
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스로 제시하면서 접근했을 때 발생하는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/* if문으로 애초에 예외 발생이 안되도록 먼저 처리하는 방법 => 예외처리x
		if(size >= 101) {
			int[] arr = new int[size];			
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스에 접근했습니다.");
		}
		// 다중 catch블럭 작성 가능
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	public void method3() {
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스에 접근했습니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("정수만을 입력해야합니다.");
			
		}
		*/
		
		
		/*
		// 다중 catch블럭을 간결하게 하는 법 but 어떤 예외가 발생했는지 알려주기 힘듦
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
		} catch (RuntimeException e) { // 다형성 적용해서 부모타입예외 클래스 작성가능
									   // 모든 자식 예외발생 시 예외처리할 수 있음
			System.out.println("예외발생 : 배열의 크기 or 부적절한 인덱스 제시 or 음수나 0으로 제시 등등..");
			// 예외 발생 시 실행할 내용이 별개일 경우 세분화해서 다중 catch블럭으로 기술 ex) method2
		}
		*/
		
		
		
		// InputMismatchException 예외만 세분화하고싶다면
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
			
			
		} catch (InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
			
		} catch (RuntimeException e) { 
			System.out.println("예외발생 : 배열의 크기 or 부적절한 인덱스 제시 등등..");
		}
		
		// 부모예외클래스와 자식예외클래스를 catch블럭으로 기술하고자 할 때
		// 자식예외클래스 catch블럭이 위쪽에 있어야만 함 (unreachable catch block 오류)
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	

}
