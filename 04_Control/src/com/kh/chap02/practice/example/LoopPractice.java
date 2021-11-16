package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				} break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice3() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			} 
		} else {
				System.out.println("잘못 입력하셨습니다.");
			}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			System.out.printf("%d + ",i);
		}
		System.out.printf("= %d",sum);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0) {
			if(num2 > 0) {
				if (num1 >= num2) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} 
				} else {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}
			}  else {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
			}
		} else {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}
	}
	
	/*
	 * *Math 메소드를 이용해서 간단하게 해결 방법*
	 * Math.min(); //그냥 호출이 불가.
	 * 최소값을 알아내기위해서, 두 개의 정수값을 전달해줘야함. Math.min(num1, num2); 
	 * Math라는 클래스의 min메소드 내에서 비교 후 최소값을 되돌려줌. 그러면 변수에 담으면 돼.
	 * int min = Math.min(num1, num2);
	 * int max = Math.max(num1, num2); // Math.max 메소드도 마찬가지.
	 * 
	 * for(int i=min; i<=max; i++)
	 */
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 > 0) {
				if(num2 > 0) {
					if(num1 >= num2) {
						for(int i=num2; i<=num1; i++) {
							System.out.print(i + " ");
							
						}break;
					} else {
						for(int i=num1; i<=num2; i++) {
							System.out.print(i + " ");
						}break;
					}
				} else {
					System.out.println("1 이상의 숫자를 입력해주세요.");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("==== %d단 ====\n", num);
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >=2 && num <=9) {
			for(int i =num; i<=9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for ( int j = 1; j <=9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j );
				}
				
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <=9) {
				for(int i=num; i<=9; i++) {
					System.out.printf("===== %d단 =====\n", i);
					for(int j=1; j<=9; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i*j);
					}
				} break;
			} else {
				System.out.println("2~9사이의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice11() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start =sc.nextInt();
		System.out.print("공차 : ");
		int common_difference = sc.nextInt();
		
		for(int i=1; i<=10; i++) { // 단지 출력되는 '10회' 반복을 위해서. for문을 횟수로도 사용 가능.
			System.out.print(start + " ");
			start += common_difference;
		}
		
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) { // 프로그램 종료하기 전 코드는 입력받는 곳 바로 뒤에 작성.
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1: ");
			int num1 = sc.nextInt();
			System.out.print("정수2: ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			

			int result = 0;

			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					System.out.println();
					continue;
				} else {
					result = num1 / num2;
					break;
				}
			case "%":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					System.out.println();
					continue;
				} else {
					result = num1 % num2;
					break;
				}
			/*case "exit":
				System.out.println("프로그램을 종료합니다.");
				return; 
				*/
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;

			}

			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			System.out.println();
		}

	}

}
