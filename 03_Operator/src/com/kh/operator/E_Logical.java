package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * * �������� (���׿�����)
	 *   �ΰ��� ������ �������ִ� ������
	 *   �������� ��������� ����
	 *   
	 *   ���� && ���� : ����, ������ �� �� true�� ��� ������� true
	 *   ���� || ���� : ����, ������ �� �߿� �ϳ��� true�� ��� ������� true
	 */
	
	public void method1() {
		
		// ����ڰ� �Է��� �������� 1���� 100������ ������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100); �� ť�� �ȵ�x �ΰ��� ����
		boolean result = (num >= 1) && (num <= 100); // num���� 1�̻�"�̰�" "�׸���" num���� 100������ ���
		// && �ǹ� : ~�̰�, �׸���, ~�ϸ鼭
		
		System.out.println("����ڰ� �Է��� ���� 1�̻� 100�����Դϱ�? : " + result );
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� ���ڰ��� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// boolean result = (65 <= ch <= 90); �ȵ�x
		boolean result = (ch >= 65) && (ch <= 90);
		
		System.out.println("����ڰ� �Է��� ���� �빮���Դϱ�: " + result);
	}
	
	public void method3() {
		// ����ڿ��� ������ �Է¹��� �� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || �ǹ� : ~�̰ų�, �Ǵ�
		
		System.out.println("����ڰ� �����Դϱ� : " + result);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ÷��� y�� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'Y') || (ch == 'y');
				
		System.out.println("����ڰ� �Է��� ���� Y �Ǵ�  y�Դϱ�  : " + result);
	}	
	
	public void method5() {
		
		// && �����ڸ� �������� �տ� ����� false�� ��� ���� ������ ����x
		int num = 10;
		
		boolean result1 = (num < 5) && (++num > 0); // ++num�� ���� �ݿ�x
		
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num : " + num);
		
		// || �����ڸ� �������� �տ� ����� true�� ��� �ڿ� ���ǵ� ����x
		int num2 = 10;
		
		boolean result2 = true || (++num2 > 0); // �ڰ� Dead Code
		System.out.println("|| ���� ���� num" + num2);
		
	}

	
	
	
	
	
}
