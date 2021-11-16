package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 	�⺻������ ���α׷��� ������ ���������� ����
	 * 	��, �� �������� �帧�� �ٲٰ����� �� ����̶�� �� �̿��ؼ� ���� �����
	 * 
	 * 	���������� �����Ű���� �� �� => ���ǹ�
	 * 	�ݺ������� �����Ű���� �� �� => �ݺ���
	 * 	�� ���� �帧 ���� => �б⹮
	 * 
	 * 	* ���ǹ�
	 *		"���ǽ�"�� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� ���� ��� �׿� �ش��ϴ� �ڵ� ����
	 *
	 *		���ǽ��� ��� true/false������
	 *		���� ���ǽĿ����� �񱳿�����(���,����), ��������(&&,||)�� �ַ� ���.
	 *
	 *	* ���ǹ��� ũ�� if���� switch������ ����
	 *
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		/*
		 * * �ܵ� if��
		 * 
		 * 	 if(���ǽ�) {
		 *     .. �����Ű���� �ϴ� �ڵ� ..
		 *   }
		 */
		
		if(num > 0) {
			System.out.println("�����.");
		}
		
		if(num <= 0) {
			System.out.println("����� �ƴϴ�.");
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� :");
		int num = sc.nextInt();
		
		/*
		 * * if-else��
		 * 
		 * 	 if(���ǽ�) {
		 * 		.. ���� �ڵ� 1 ..
		 *   }
		 *   else {
		 *   	.. ���� �ڵ� 2 ..
		 *   }
		 * 
		 */
		
		if(num > 0 ) {
			System.out.println("�����.");
		}
		else {
			System.out.println("����� �ƴϴ�.");
		}
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		/*
		 * * if-else��
		 *   ���� �񱳴������ �������� ������ �����ؾ� �� ���
		 *   
		 *   if(���ǽ�1) {
		 *   	���� �ڵ� 1;
		 *   } else if (���ǽ�2) {
		 *   	���� �ڵ� 2;
		 *   } else if (���ǽ�3) {
		 *   	���� �ڵ� 3;
		 *   } else {
		 *   	���� ���ǵ��� �� false�� ��� ������ �ڵ�
		 *   }
		 */
		
		if (num > 0) {
			System.out.println("�����.");
		} else if (num == 0) {
			System.out.println("0�̴�.");
		} else /* if(num < 0)*/ {
			System.out.println("������.");
		}
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(������) : ");
		int age = sc.nextInt();
		
		/* 
		if (age <= 13) {
			System.out.println("���");
		} else if (age > 13 && age <=19  ) {
			System.out.println("û�ҳ�");
		} else {
			System.out.println("����");
		} 
		*/
		
		
		String result; // ������� ����� �ڽ� result�� ��������
		
		if (age <= 13) {
			result = "���"; // [String] result = "���" �ȵ�x �̹� ���� �����ڽ� ������� ������ �����̸��� ����������.
		} else if (age <= 19) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		/*
		if(gender == 'M' || gender == 'm') {
			System.out.println(name + "���� ���л��̴�.");
		} else if (gender == 'F' || gender == 'f') {
			System.out.println(name + "���� ���л��̴�.");
		}
		*/
		
		String result =""; 
		// ���� ������ �ٸ��� =""; �־��� ������ if, else if�� ���  false�� �� ����� �� �ִ� ���� ���� ������ �ʱ�ȭ������.
		// �ʱ�ȭ�� �ȵ� ������ ��¹��� ���ؼ� ��� �Ұ�.
		// ������ �̸� �����ص� �� �ݵ�� �ʱ�ȭ �س��� ������ ������!!
		
		if(gender == 'M' || gender == 'm') {
			result = "���л�";
		} else if (gender == 'F' || gender == 'f') {
			result = "���л�";
		} else { // else�� �ִٸ� String ������ =""; �ʱ�ȭ �����൵ �� 
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			return; // �ش� �� �޼ҵ� ��ü�� ���������� ���� (�� �޼ҵ带 ȣ���ߴ� ������ ��������)
			// �ڿ� �ִ� � �ڵ嵵 �����Ű�� �ʰ� ��������.
		}
		
		System.out.println(name + "���� " + result + "�̴�.");
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		/*
		if(name == "ȫ�浿") {
			System.out.println("ȫ�浿�� �ݰ����ϴ�");
		} else {
			System.out.println("ȫ�浿���� �ƴϽó׿�. �ȳ��� ������.");
		} 
		// ȫ�浿�� �ۼ��ص� ȫ�浿�� �ƴ϶�� ���.
		*/
		
		/*
		 *			   1	   1	 2	   4	 8	   4	  8		 2		   
		 * �⺻�ڷ��� : boolean, byte, short, int, long, float, double, char (8��)
		 * �����ڷ��� : String
		 * 
		 * �⺻�ڷ����鳢�� ����񱳽ÿ��� ==, != ��밡�� (���������� �񱳵�)
		 * ��, �����ڷ����� ���� �񱳽� ==, != ���� ���������� �񱳰� �� ��
		 * 		=> equals() �޼ҵ带 �̿��ؼ� ���ؾ� ��.
		 * 			���ڿ�.equals(���ڿ�)
		 */
		
		if(name.equals("ȫ�浿")) {
			System.out.println("ȫ�浿�� �ݰ����ϴ�");
		} else {
			System.out.println("ȫ�浿���� �ƴϽó׿�. �ȳ���������.");
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(���) �Է�: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 2 == 0) {
				System.out.println("¦����.");
			} else {
				System.out.println("Ȧ����.");
			}
			
		} else {
			System.out.println("����� �ƴմϴ�. �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	

}
