package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * * ���� ������ (�׸� 3���� ������ �������ִ� ������)
	 * 
	 * 	[ǥ����]
	 * 	���ǽ� ? ���ǽ��� ���� ��� ������ ��� �� : ���ǽ��� �����ϰ�� ������ �����
	 * 	
	 * 	�� ��, ���ǽ��� �ݵ�� true �Ǵ� false�� �������� �ۼ�.
	 * 	�ַ� ��, �������ڸ� ���� �ۼ�
	 */
	
	public void method1() {
		// �Է¹��� �������� ������� �ƴ��� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		// String result = num > 0 ? "����̴�." : "�����̴�.";
		
		// xx�� xxxx.
		// System.out.println(num + "�� " + result);
		
		System.out.print(num + "��(��) " + (num <= 0 ? "�����̴�" : "����̴�"));
		
	}
	
	public void method2() {
		// �Է¹��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "¦���̴�" : "Ȧ���̴�";
		System.out.println(num + "��(��) " + result);
		
	}
	
	public void method3() {
		// ����ڿ��� �����ǻ翩�� �Է¹��� �� �Ǻ��ؼ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ÷��� y�� �Է����ּ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		// char result = ch == 'y' || ch == 'Y' ? '��' : '��';
		// "���α׷��� �����մϴ�", "��� �����մϴ�" String�� ���ϱ� ������ result ������ String
		
		String result = ch == 'y' || ch == 'Y' ? "���α׷��� �����մϴ�" : "��� �����մϴ�";
		
		
		System.out.println(result);
	}
	
	public void method4() {
		// �Է¹��� ���ڰ��� ����ҹ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch >= 'a' && ch <= 'z' ? "�ҹ����Դϴ�" : "�ҹ��ڰ� �ƴմϴ�";
		// ��ҹ��ڴ� ��Һ񱳿����ڿ� ������ ���ڷ� �νĵǾ� ����.
		System.out.println(result);
	}
	
	public void method5() {
		// ����ڰ� �Է��� �������� ���,����,0���� ��Ȯ�ϰ� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		// ��ø
		// String result = (num > 0 ? "����̴�" : (num < 0 ? "�����̴�" : "0�̴�"));
		String result = (num > 0 ? "����̴�" : (num == 0 ? "0�̴�" : "Ȧ���̴�"));
		System.out.println(result);
		
	}
	
	public void method6() {
		// ����ڿ��� �ΰ��� ������ �Է¹ް�
		// + �Ǵ� -�� �Է¹޾� �׿� �´� �������� ������ֱ�
		// ��, + �Ǵ� - ���� �ٸ� ���ڸ� �Է����� ��� "�߸� �Է��߽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // nextInt �ڿ� nextLine�� �� ��� ���ۿ� \n�� ��������ϱ� ���Կ� �߰�.
		
		System.out.print("������ �Է�(+ �Ǵ� -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? (num1 + num2+ "") : (op == '-' ? (num1 - num2 + "") : "�߸� �Է��߽��ϴ�"));
		//""�� �ִ� ���� : num1+(-)num2�� �������� int����. "" �߰������� ���ڿ��� �ν��ϵ��� �ϱ� ����.
		System.out.println("��� : " + result);
	}

}
