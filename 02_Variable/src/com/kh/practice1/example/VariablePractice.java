package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		float height = sc.nextFloat();
		
		System.out.printf("Ű %.1f�� %d�� %c�� %s�� �ݰ����ϴ�^^", height, age, gender, name);
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int integer1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int integer2 = sc.nextInt();
		
		int plus = integer1 + integer2; 
		System.out.println("���ϱ� ��� : " + plus);
		
		int minus = integer1 - integer2; 
		System.out.println("���� ��� : " + minus);
		
		int multiplication = integer1 * integer2;
		System.out.println("���ϱ� ��� : " + multiplication);
		
		int division = integer1 / integer2;
		System.out.println("������ �� ��� : " + division);
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		System.out.println("���� : " + area);
		double perimeter = (width + height) * 2;
		System.out.println("�ѷ� : " + perimeter);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		System.out.println("ù ��° ���� : " + first);
		System.out.println("�� ��° ���� : " + second);
		System.out.println("�� ��° ���� : " + third);
	}

}