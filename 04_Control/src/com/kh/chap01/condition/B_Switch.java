package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 *  * switch문도 if문과 동일하게 조건문.
	 *  
	 *  	다만, if문과의 차이점?
	 *  	if문은 조건식을 자유롭게 기술가능
	 *  	switch문은 동등비교로 밖에 수행되지 않음
	 *  
	 *  	switch(이제부터 동등비교할 대상자) {
	 *  	case 값1 : 실행코드 1;
	 *  	case 값2 : 실행코드 2;
	 *  	...
	 *		[default : 위의 값들과 모두 일치하지 않을 경우 실행할 코드;]
	 *  	}
	 */
	
	public void method1() {
		
		/*
		 * 정수를 입력받아 1일 경우 "빨간색", 2일 경우 "파란색", 3일 경우 "초록색"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("빨간색");
			break;
		case 2 :
			System.out.println("파란색");
			break;
		case 3 :
			System.out.println("초록색");
			break;
		case 4 : 
			System.out.println("잘못 입력하였습니다");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 과일 (사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0; //초기화 
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			return; // 다른 과일의 가격은 알려줄 필요없이 이 메소드 자체를 나가버려.
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
	}
	
	public void method3() {
		// break; 필요 없는 예시
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 :
			System.out.println("나 관리권한 있어");
		case 2 :
			System.out.println("나 글쓰기권한 있어");
		case 3 :
			System.out.println("나 읽기권한 있어");
		}
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달(1~12월) 입력:");
		int month = sc.nextInt();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 월은 31일까지입니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 월은 30일까지입니다.");
			break;
		case 2 :
			System.out.println("입력하신 월은 28일 또는 29일까지입니다.");
		default : 
			System.out.println("반드시 1~12월까지를 입력해야 합니다.");
		}
		
	}
	
	

}
