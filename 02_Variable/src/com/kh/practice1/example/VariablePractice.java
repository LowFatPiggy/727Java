package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		float height = sc.nextFloat();
		
		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int integer1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int integer2 = sc.nextInt();
		
		int plus = integer1 + integer2; 
		System.out.println("더하기 결과 : " + plus);
		
		int minus = integer1 - integer2; 
		System.out.println("빼기 결과 : " + minus);
		
		int multiplication = integer1 * integer2;
		System.out.println("곱하기 결과 : " + multiplication);
		
		int division = integer1 / integer2;
		System.out.println("나누기 몫 결과 : " + division);
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		System.out.println("면적 : " + area);
		double perimeter = (width + height) * 2;
		System.out.println("둘레 : " + perimeter);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + third);
	}

}