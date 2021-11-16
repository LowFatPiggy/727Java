package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 *  break;		: 반복문 안에 사용되는 분기문
	 *  			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 *  
	 *  	*유의사항 : switch문 안의 break; 는 단지 switch문을 빠져나가는 구문
	 */
	
	public void method1() {
		
		// 랜덤값(1~100) 발생시키고 그 랜덤값을 출력. (이 과정 매번 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 (3으로 나눴을 때 나머지 0) 반복문 빠져나와.
		
		while(true) { // 무한반복 돌려놓고
		
			int random = (int)(Math.random() * 100 + 1);
			
			if(random % 3 == 0) {
				break;
			} else {
			System.out.println("랜덤값 : " + random);
			}
		}
	}
	
	public void method2() {
		
		// 문자열 입력받고 해당 문자열의 길이 출력 (이 과정 매번 반복)
		// 단, 입력한 문자열이 "exit"라면 반복문 빠져나감.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println("문자열 길이 : " + str.length());
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method3() {
		// 단(2~9)을 입력받고 해당 단을 출력
		// 잘못된 단을 입력했을 경우 다시 단을 입력받도록 유도
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.print("단(2~9) 입력:");
			int num = sc.nextInt();
			
			if(num >= 2 && num <=9) {
				System.out.println("=== " + num + "단 ===");
					for(int i=1; i<=9; i++) {
						System.out.printf("%d X %d = %d\n", num, i, num*i);
					} 
					break;
				} else {
					System.out.println("잘못 입력했습니다. 2~9까지만 입력해주세요.");
				}
		}
		
	}
	
	public void method4() {
		//1에서부터 입력하는 값까지 총 합계
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
		
			int sum = 0;
			for(int i=1; i<=num; i++) {
				sum += i;
			}
			System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
			break;
			}
			else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
}
