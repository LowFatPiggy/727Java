package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		System.out.print("1. 입력\n2. 수정 \n3. 조회\n4. 삭제\n9. 종료\n");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :	
			System.out.println("수정 메뉴입니다.");
			break;
		case 3 :	
			System.out.println("조회 메뉴입니다.");
			break;
		case 4 :	
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9 :	
			System.out.println("종료합니다.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor + math + eng);
		float average = (kor + math + eng)/3;
		
		if(average > 60) {
			if(kor >= 40 && math >= 40 && eng >=40) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n", kor, math, eng, sum, average);
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			}
		}  else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.printf("%d월은 봄입니다.", month);
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.printf("%d월은 여름입니다.", month);
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.printf("%d월은 가을입니다.", month);
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.printf("%d월은 겨울입니다.", month);
			break;
		default : 
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		int password = sc.nextInt();
		
		if (id.equals("gayeon")) { //변수 String 일치할 땐 id.equals("") , 일치하지않을 땐 !id.equals("")
			if (password == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else if (password == 1234){
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디, 비밀번호 모두 틀렸습니다.");
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch (level) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리");
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원" :
			System.out.println("게시글 조회");
			return;
		default :
			System.out.println("잘못 입력했습니다.");
			
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("비만");
		} else {
			System.out.println("BMI 지수 : " + bmi);
			System.out.println("고도비만");
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int operand1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int operand2 = sc.nextInt();
		sc.nextLine(); // int다음에 버퍼에 있는 \n을 빼주기 위해 삽입.
		System.out.print("연산자를 입력 (+,-,*,/,%) : ");
		char operator = sc.nextLine().charAt(0);		
		
		/*
		int sum = operand1 + operand2;
		int minus = operand1 - operand2;
		int multiplication = operand1 * operand2;
		int division = operand1 / operand2;
		int remainder = operand1 % operand2;
		
		switch (operator) {
		case '+' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, sum);
			break;
		case '-' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, minus);
			break;
		case '*' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, multiplication);
			break;
		case '/' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, division);
			break;
		case '%' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, remainder);
			break;
		default : 
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}*/
		
		if(operand1 > 0 && operand2 > 0) { //둘다 양수를 입력해야 해
			int result = 0;
			switch(operator) {
			case '+' : result = operand1 + operand2; break;
			case '-' : result = operand1 - operand2; break;
			case '*' : result = operand1 * operand2; break;
			case '/' : result = operand1 / operand2; break;
			case '%' : result = operand1 % operand2; break;
			default : System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return; // 연산자를 잘못 입력했을 때
			}
			System.out.printf("%d %c %d = %d", operand1, operator, operand2, result);
		} else { // 양수 아닌 값을 입력했을 때
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
		case 8 :
			practice8();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			
		}
	}
	
	
	

}
