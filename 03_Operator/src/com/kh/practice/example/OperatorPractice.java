package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : "����� �ƴϴ�";
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println(result);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		int share = candy / person;
		System.out.println("1�δ� ���� ���� : " + share);
		int the_rest = candy % person;
		System.out.println("���� ���� ���� : " + the_rest);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int c_lass = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		// char g = gender == 'f' || gender == 'F' ? '��' : (gender == 'm' || gender == 'M' ? '��' : 'X');
		String student = (gender == 'M') ? "���л�" : "���л�";
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		float score = sc.nextFloat();
		
		
		// System.out.printf("%d�г� %d�� %d�� %s %c�л��� ������ %.2f�̴�.", grade, c_lass, number, name, g, score);
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", grade, c_lass, number, name, student, score);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		String result = age <= 13 ? "���" : (age > 13 && age <= 19) ? "û�ҳ�" : "����";
		System.out.println(result);
	}
	
	public void practive7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int language = sc.nextInt();
		System.out.print("���� : ");
		int english = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		System.out.println("�հ� : " + (language + english + math));
		float average = (float) ((language + english + math)/3.0);
		System.out.println("��� : " + average);
		String result = language >= 40 && english >= 40 && math >= 40 && average >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
		
	}

	public void practice8() { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String num = sc.nextLine();
		
		String gender = num.charAt(7) == '1' ? "����" : num.charAt(7) == '2' ? "����" : "erorr";
		System.out.println(gender);
	}
	
}
