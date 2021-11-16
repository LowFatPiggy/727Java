package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * while��
	 * 
	 *  [�ʱ��;] // ��������
	 *  while() {
	 *  	�ݺ������� ������ �ڵ�;
	 * 		[������;] //��������
	 *  }
	 *  
	 *  ���ǽ��� true�� ��� �ش� �ڵ� ����
	 *  
	 *  ���ǽ� �˻� --> true�� ��� �����ڵ� ����
	 *  �ٽ� ���ǽ� �˻� --> true�� ��� �����ڵ� ����
	 *  �ٽ� ���ǽ� �˻� --> false�� ��� �����ڵ� ����x --> �ݺ��� ��������
	 */
	
	public void method1() {
		
		int i = 1;
		while(i <= 5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
	}
	
	public void method2() {
		
		int i = 1;
		while (i <=5) {
			// System.out.print(i + " ");
			// i++;
			// �� ������ �Ʒ� ���ٷ� ���̴� �� ����.
			System.out.print(i++ + " ");
		}
	}
	
	public void method3() {
		// 1 3 5 7 9
		
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i+=2;
		}
		System.out.println(i); // false�� �������� ���� while���ȿ� ���� ���� 11
	}
	
	public void method4() {
		// 1���� ������(1~100����)������ �հ�
		
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0; // �ʱ�ȭ
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1�������� " + random + "������ �� �հ�� " + sum);
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		int i = 0; 
		while (i < str.length()) { // '<=' �ƴ�����: �ε��� 0���ʹϱ�.
			System.out.println(str.charAt(i));
			i++;
		}
	}
}
