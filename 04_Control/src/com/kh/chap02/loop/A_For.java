package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * <�ݺ���>
	 * ���α׷� �帧�� �����ϴ� ��� �� �ϳ�
	 * � �����ڵ带 �ݺ������� ���������
	 * 
	 * ũ�� �� ������ ���� ( for��, while��(do-while��) )
	 * 
	 * * for��
	 * 	
	 * for(�ʱ��; ���ǽ�; ������) { // �ݺ� Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		�ݺ������� �����Ű�����ϴ� ����;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "ó���� �� �ѹ��� ����Ǵ� ����"
	 * 			(���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ�ϴ� ����)
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ش� ������ ����. false�� ��� �ݺ��� ���߰� ��������.
	 * 			(���� �ʱ�Ŀ� ���õ� ������ ������ ���ǽ� �ۼ�)
	 * 
	 * - ������ : �ݺ����� �����ϴ� ���� ���� ������Ű�� ����
	 * 			(���� �ʱ�Ŀ� ���õ� ������ ������ ����������(++, --)�� ���)
	 * 
	 * * �˾Ƶ� ��
	 * 	 for�� �ȿ� �ʱ��, ���ǽ�, ������ ���� ���������ϳ� ;�� �ݵ�� �ʼ�
	 */
	
	public void method1() {
		
		for(int i=1; i<=5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		
		for(int i=0; i<=4; i++) {
			System.out.println("�ݰ����ϴ�");
		}
		
		for(int i=11; i<16; i++) {
			System.out.println("����������");
		}
		
		for(int i=1; i<=9; i+=2) { // i���� 1�������� 9���� 2�� �����ϴ� ���� �ݺ����� (1,3,5,7,9)=5ȸ
			System.out.println("Hello");
		}
	}
	
	public void method2() {
		//1\n2\n3\n4\n5
		for(int i=1; i<6; i++) {
			System.out.println(i);
		}
		//1 2 3 4 5
		for(int i=1; i<6; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		//5 4 3 2 1
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		//1���� 10������ Ȧ������ ���
		for(int i=1; i<11; i+=2) {
			System.out.print(i + " ");
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method5() {
		for(int i=0; i<=9; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	// 1~10���� �� �հ�
	public void method6() {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1�������� 10������ �� �հ� : " + sum);
	
	}
	
	public void method7() {
		//1�������� �Է��ϴ� ������ �� �հ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		
		}
		System.out.println("1�������� " + num + "������ �� �հ� : " + sum);
		
	}
	
	public void method8() {
		//1�������� � ����������(1~10������ ������)�� �� �հ�
		
		/*
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ� ȣ��
		 * 
		 * Math.random() ȣ�� �� ==> 0.0 �̻� 1.0�̸� ������ ���� �� �߻�
		 */
		
		// int random = Math.random() * 10; // 0.0�̻� ~ 10.0�̸� ������ ���� �� �߻�
		
		// int random = Math.random() * (10 + 1); // 1.0�̻� ~ 11.0�̸� ������ ���� �� �߻�
												  // => 1.0 ~ 10.99999999... (�Ҽ����� ������ 1~10)
		int random = (int)(Math.random() * (10 + 1)); // int������ �ٲ㼭 �Ҽ����� ����.
		// �����ϰ� ����ϸ� *10�� ����� ���ϴ� ��. 1~10 �� 10����. // +1�� ������� �����ϳ�? 1~10 1���� ����. 
		System.out.println("1~10������ ������ : " + random);
		
		int sum = 0;
		for (int i=1; i<=random; i++) {
			sum +=i;
		}
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
	}
	
	public void method9() {
		
		String str = "Hello";
		
		for(int i=0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		// ��������� ���ڿ� �Է¹޾Ƽ� (str������ ����) �� �ε����� ���ڸ� �̾Ƽ� ���
		// apple ���� : 5
		// 01234
		// kiwi ���� : 4
		// 0123
		
		// ������ �ε����� �׻� '���ڿ��� ���� -1' �̱���
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		System.out.println("���ڿ��� ����: " + str.length()); //str.length() ���ڿ��� ���̸� �˷��ִ� �޼ҵ�
		
		for(int i=0; i<str.length(); i++) { // < str.length(); '<' �� ��ȣ�� -1�� �ڵ�����.
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method11() {
		// 2�� ����ϱ�
		
		for(int su=1; su<=9; su++) {
			// System.out.println("2 X " + su + " = " + 2 * su);
			System.out.printf("%d X %d = %d\n", 2, su, 2*su);
		}
		
	}
	
	public void method12() {
		// ����ڰ� �Է��� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��(2~9)�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >=2 && dan <=9) {
			for(int i=1; i <=9; i++) {
				// System.out.println(dan + " X " + i + " = " + (dan*i));
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void method13() {
		// 2~9�� �������� ���.
		int dan = (int)(Math.random() * 8 + 2); //*8�� 2~9�� ��, 8���� //+2�� ������. 2~9
		// (int)(Math...) ��ȣ �� �ΰ����� ��. �����غ��� random���� �ȳ����� ��� 2�ܸ� ����.
		System.out.println("=== " + dan + "�� ===");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		
	}
	
	// ��ø for��
	public void method14() {
		
		for(int j=1; j<=3; j++) {
		
			for(int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println(); //����
		}
	}

	public void method15() {
		
		for (int j=1; j<=4; j++) {
			for (int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void method16() {
		// 1*** => i�൵ 1, j�൵ 1. i==j
		// *2** => i�൵ 2, j�൵ 2. i==j
		// **3*    1�� 1��, 2�� 2��, 3�� 3��, 4�� 4��
		// ***4	       ��� ���� ��ġ�� �� ���ڸ� ���
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if (i == j) {
					System.out.print(j); // i�� j�� ���� ���.
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void method17() {
		// 2�ܺ��� 9�ܱ��� ���.
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("=== " + dan + "�� ===");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
			}
		System.out.println();
		}
	}
	
	public void method18() {
		for(;;) { // ���ѹݺ�. ���ǽ� �ڸ� �����ϸ� ������ true.
			System.out.println("�ȳ�");
		}
	}
	
	
}
