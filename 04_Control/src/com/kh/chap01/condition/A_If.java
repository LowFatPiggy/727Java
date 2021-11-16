package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 	기본적으로 프로그램의 진행은 순차적으로 진행
	 * 	단, 이 순차적인 흐름을 바꾸고자할 때 제어문이라는 걸 이용해서 직접 제어가능
	 * 
	 * 	선택적으로 실행시키고자 할 때 => 조건문
	 * 	반복적으로 실행시키고자 할 때 => 반복문
	 * 	그 외의 흐름 제어 => 분기문
	 * 
	 * 	* 조건문
	 *		"조건식"을 통해 참이냐 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행
	 *
	 *		조건식의 결과 true/false여야함
	 *		보통 조건식에서는 비교연산자(대소,동등), 논리연산자(&&,||)를 주로 사용.
	 *
	 *	* 조건문은 크게 if문과 switch문으로 나뉨
	 *
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		/*
		 * * 단독 if문
		 * 
		 * 	 if(조건식) {
		 *     .. 실행시키고자 하는 코드 ..
		 *   }
		 */
		
		if(num > 0) {
			System.out.println("양수다.");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		/*
		 * * if-else문
		 * 
		 * 	 if(조건식) {
		 * 		.. 실행 코드 1 ..
		 *   }
		 *   else {
		 *   	.. 실행 코드 2 ..
		 *   }
		 * 
		 */
		
		if(num > 0 ) {
			System.out.println("양수다.");
		}
		else {
			System.out.println("양수가 아니다.");
		}
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * * if-else문
		 *   같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 *   
		 *   if(조건식1) {
		 *   	실행 코드 1;
		 *   } else if (조건식2) {
		 *   	실행 코드 2;
		 *   } else if (조건식3) {
		 *   	실행 코드 3;
		 *   } else {
		 *   	위의 조건들이 다 false일 경우 실행할 코드
		 *   }
		 */
		
		if (num > 0) {
			System.out.println("양수다.");
		} else if (num == 0) {
			System.out.println("0이다.");
		} else /* if(num < 0)*/ {
			System.out.println("음수다.");
		}
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이(정수만) : ");
		int age = sc.nextInt();
		
		/* 
		if (age <= 13) {
			System.out.println("어린이");
		} else if (age > 13 && age <=19  ) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		} 
		*/
		
		
		String result; // 결과값을 출력할 박스 result를 만들어놓고
		
		if (age <= 13) {
			result = "어린이"; // [String] result = "어린이" 안돼x 이미 위에 변수박스 만들었기 때문에 변수이름만 가져오도록.
		} else if (age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		/*
		if(gender == 'M' || gender == 'm') {
			System.out.println(name + "님은 남학생이다.");
		} else if (gender == 'F' || gender == 'f') {
			System.out.println(name + "님은 여학생이다.");
		}
		*/
		
		String result =""; 
		// 위의 예제와 다르게 =""; 넣어준 이유는 if, else if가 모두  false일 때 출력할 수 있는 것이 없기 때문에 초기화시켜줌.
		// 초기화가 안된 변수는 출력문을 통해서 출력 불가.
		// 변수를 미리 세팅해둘 때 반드시 초기화 해놓는 습관을 들이자!!
		
		if(gender == 'M' || gender == 'm') {
			result = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			result = "여학생";
		} else { // else가 있다면 String 변수에 =""; 초기화 안해줘도 됨 
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; // 해당 이 메소드 자체를 빠져나가는 구문 (이 메소드를 호출했던 곳으로 빠져나감)
			// 뒤에 있는 어떤 코드도 실행시키지 않고 빠져나감.
		}
		
		System.out.println(name + "님은 " + result + "이다.");
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "홍길동") {
			System.out.println("홍길동님 반갑습니다");
		} else {
			System.out.println("홍길동님이 아니시네요. 안녕히 가세요.");
		} 
		// 홍길동을 작성해도 홍길동이 아니라는 결과.
		*/
		
		/*
		 *			   1	   1	 2	   4	 8	   4	  8		 2		   
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 * 참조자료형 : String
		 * 
		 * 기본자료형들끼리 동등비교시에는 ==, != 사용가능 (정상적으로 비교됨)
		 * 단, 참조자료형은 동등 비교시 ==, != 사용시 정상적으로 비교가 안 됨
		 * 		=> equals() 메소드를 이용해서 비교해야 됨.
		 * 			문자열.equals(문자열)
		 */
		
		if(name.equals("홍길동")) {
			System.out.println("홍길동님 반갑습니다");
		} else {
			System.out.println("홍길동님이 아니시네요. 안녕히가세요.");
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(양수) 입력: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
			
		} else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
		}
	}
	
	

}
