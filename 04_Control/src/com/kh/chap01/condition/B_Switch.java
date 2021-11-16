package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 *  * switch���� if���� �����ϰ� ���ǹ�.
	 *  
	 *  	�ٸ�, if������ ������?
	 *  	if���� ���ǽ��� �����Ӱ� �������
	 *  	switch���� ����񱳷� �ۿ� ������� ����
	 *  
	 *  	switch(�������� ������� �����) {
	 *  	case ��1 : �����ڵ� 1;
	 *  	case ��2 : �����ڵ� 2;
	 *  	...
	 *		[default : ���� ����� ��� ��ġ���� ���� ��� ������ �ڵ�;]
	 *  	}
	 */
	
	public void method1() {
		
		/*
		 * ������ �Է¹޾� 1�� ��� "������", 2�� ��� "�Ķ���", 3�� ��� "�ʷϻ�"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�(1~3) : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("������");
			break;
		case 2 :
			System.out.println("�Ķ���");
			break;
		case 3 :
			System.out.println("�ʷϻ�");
			break;
		case 4 : 
			System.out.println("�߸� �Է��Ͽ����ϴ�");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ��� �ϴ� ���� (���, �ٳ���, ������) �Է� : ");
		String fruit = sc.nextLine();
		
		int price = 0; //�ʱ�ȭ 
		
		switch(fruit) {
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 2000;
			break;
		case "������" :
			price = 3000;
			break;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return; // �ٸ� ������ ������ �˷��� �ʿ���� �� �޼ҵ� ��ü�� ��������.
		}
		
		System.out.println(fruit + "�� ������ " + price + "���Դϴ�.");
	}
	
	public void method3() {
		// break; �ʿ� ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���(����) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 :
			System.out.println("�� �������� �־�");
		case 2 :
			System.out.println("�� �۾������ �־�");
		case 3 :
			System.out.println("�� �б���� �־�");
		}
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(1~12��) �Է�:");
		int month = sc.nextInt();
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 2 :
			System.out.println("�Է��Ͻ� ���� 28�� �Ǵ� 29�ϱ����Դϴ�.");
		default : 
			System.out.println("�ݵ�� 1~12�������� �Է��ؾ� �մϴ�.");
		}
		
	}
	
	

}
