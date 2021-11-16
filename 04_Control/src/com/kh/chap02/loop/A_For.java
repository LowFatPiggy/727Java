package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 ( for문, while문(do-while문) )
	 * 
	 * * for문
	 * 	
	 * for(초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행. false일 경우 반복을 멈추고 빠져나옴.
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용)
	 * 
	 * * 알아둘 것
	 * 	 for문 안에 초기식, 조건식, 증감식 각각 생략가능하나 ;은 반드시 필수
	 */
	
	public void method1() {
		
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<=4; i++) {
			System.out.println("반갑습니다");
		}
		
		for(int i=11; i<16; i++) {
			System.out.println("저리가세요");
		}
		
		for(int i=1; i<=9; i+=2) { // i값이 1에서부터 9까지 2씩 증가하는 동안 반복수행 (1,3,5,7,9)=5회
			System.out.println("Hello");
		}
	}
	
	public void method2() {
		//1\n2\n3\n4\n5
		for(int i=1; i<6; i++) {
			System.out.println(i);
		}
		//1 2 3 4 5
		for(int i=1; i<6; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		//5 4 3 2 1
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		//1부터 10사이의 홀수만을 출력
		for(int i=1; i<11; i+=2) {
			System.out.print(i + " ");
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method5() {
		for(int i=0; i<=9; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	// 1~10까지 총 합계
	public void method6() {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1에서부터 10까지의 총 합계 : " + sum);
	
	}
	
	public void method7() {
		//1에서부터 입력하는 값까지 총 합계
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		
		}
		System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
		
	}
	
	public void method8() {
		//1에서부터 어떤 랜덤값까지(1~10사이의 랜덤값)의 총 합계
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출
		 * 
		 * Math.random() 호출 시 ==> 0.0 이상 1.0미만 사이의 랜덤 값 발생
		 */
		
		// int random = Math.random() * 10; // 0.0이상 ~ 10.0미만 사이의 랜덤 값 발생
		
		// int random = Math.random() * (10 + 1); // 1.0이상 ~ 11.0미만 사이의 랜덤 값 발생
												  // => 1.0 ~ 10.99999999... (소수점을 버리면 1~10)
		int random = (int)(Math.random() * (10 + 1)); // int형으로 바꿔서 소수점을 버려.
		// 간단하게 얘기하면 *10은 몇가지를 말하는 것. 1~10 총 10가지. // +1은 몇에서부터 시작하냐? 1~10 1부터 시작. 
		System.out.println("1~10사이의 랜덤값 : " + random);
		
		int sum = 0;
		for (int i=1; i<=random; i++) {
			sum +=i;
		}
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		for(int i=0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		// 사용자한테 문자열 입력받아서 (str변수에 대입) 각 인덱스별 문자를 뽑아서 출력
		// apple 길이 : 5
		// 01234
		// kiwi 길이 : 4
		// 0123
		
		// 마지막 인덱스는 항상 '문자열의 길이 -1' 이구나
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이: " + str.length()); //str.length() 문자열의 길이를 알려주는 메소드
		
		for(int i=0; i<str.length(); i++) { // < str.length(); '<' 이 기호가 -1이 자동으로.
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method11() {
		// 2단 출력하기
		
		for(int su=1; su<=9; su++) {
			// System.out.println("2 X " + su + " = " + 2 * su);
			System.out.printf("%d X %d = %d\n", 2, su, 2*su);
		}
		
	}
	
	public void method12() {
		// 사용자가 입력한 단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9)를 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >=2 && dan <=9) {
			for(int i=1; i <=9; i++) {
				// System.out.println(dan + " X " + i + " = " + (dan*i));
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method13() {
		// 2~9단 랜덤으로 출력.
		int dan = (int)(Math.random() * 8 + 2); //*8은 2~9단 즉, 8가지 //+2는 시작점. 2~9
		// (int)(Math...) 괄호 꼭 두개여야 함. 실행해보니 random값이 안나오고 계속 2단만 나옴.
		System.out.println("=== " + dan + "단 ===");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		
	}
	
	// 중첩 for문
	public void method14() {
		
		for(int j=1; j<=3; j++) {
		
			for(int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println(); //개행
		}
	}

	public void method15() {
		
		for (int j=1; j<=4; j++) {
			for (int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void method16() {
		// 1*** => i행도 1, j행도 1. i==j
		// *2** => i행도 2, j행도 2. i==j
		// **3*    1행 1열, 2행 2열, 3행 3열, 4행 4열
		// ***4	       행과 열이 일치할 때 숫자를 출력
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if (i == j) {
					System.out.print(j); // i든 j든 숫자 출력.
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method17() {
		// 2단부터 9단까지 출력.
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
			}
		System.out.println();
		}
	}
	
	public void method18() {
		for(;;) { // 무한반복. 조건식 자리 생략하면 무조건 true.
			System.out.println("안녕");
		}
	}
	
	
}
