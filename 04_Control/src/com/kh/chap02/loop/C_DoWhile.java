package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	/*
	 * * do-while문
	 * 
	 * do {
	 * 		반복적으로 실행할 코드
	 * } while(조건식);
	 * 
	 * do-while문은 첫 실행이 조건검사 없이 무조건 실행.
	 * 
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println(num);
		} while(num == 1);
		// do는 조건식이 없기때문에 무조건 한번은 실행.
		
	}
	
	public void method2() {
		
		int i = 1;
		
		do {
			System.out.print(i++ + " ");
		} while(i<=5);
		
	}
	
	public void method3() {
		// 1부터 사용자가 입력한 수 총 합계
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i++;
		} while (i <= num);
		System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
	}

}
