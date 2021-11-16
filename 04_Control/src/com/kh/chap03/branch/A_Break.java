package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 *  break;		: �ݺ��� �ȿ� ���Ǵ� �б⹮
	 *  			  break;�� ����Ǵ� ���� ���� �����ִ� �ݺ����� ������ ��������
	 *  
	 *  	*���ǻ��� : switch�� ���� break; �� ���� switch���� ���������� ����
	 */
	
	public void method1() {
		
		// ������(1~100) �߻���Ű�� �� �������� ���. (�� ���� �Ź� �ݺ�)
		// ��, �߻��� �������� 3�� ����� ��� (3���� ������ �� ������ 0) �ݺ��� ��������.
		
		while(true) { // ���ѹݺ� ��������
		
			int random = (int)(Math.random() * 100 + 1);
			
			if(random % 3 == 0) {
				break;
			} else {
			System.out.println("������ : " + random);
			}
		}
	}
	
	public void method2() {
		
		// ���ڿ� �Է¹ް� �ش� ���ڿ��� ���� ��� (�� ���� �Ź� �ݺ�)
		// ��, �Է��� ���ڿ��� "exit"��� �ݺ��� ��������.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println("���ڿ� ���� : " + str.length());
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void method3() {
		// ��(2~9)�� �Է¹ް� �ش� ���� ���
		// �߸��� ���� �Է����� ��� �ٽ� ���� �Է¹޵��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.print("��(2~9) �Է�:");
			int num = sc.nextInt();
			
			if(num >= 2 && num <=9) {
				System.out.println("=== " + num + "�� ===");
					for(int i=1; i<=9; i++) {
						System.out.printf("%d X %d = %d\n", num, i, num*i);
					} 
					break;
				} else {
					System.out.println("�߸� �Է��߽��ϴ�. 2~9������ �Է����ּ���.");
				}
		}
		
	}
	
	public void method4() {
		//1�������� �Է��ϴ� ������ �� �հ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
		
			int sum = 0;
			for(int i=1; i<=num; i++) {
				sum += i;
			}
			System.out.println("1�������� " + num + "������ �� �հ� : " + sum);
			break;
			}
			else {
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
}
