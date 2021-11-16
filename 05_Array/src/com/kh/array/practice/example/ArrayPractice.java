package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=10; j<arr.length; j--) {
				arr[i] = j;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	} //��°� : 0 0 0 0 0 0 0 0 0 0
	
	
	public void practice2_1() {
		
		int[] arr = new int[10];
		int sum = 11;
		
		for(int i=0; i<arr.length; i++) {
			sum -= 1;
			arr[i] = sum;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2_2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=10; j<arr.length; j--) { //
				arr[i] = j;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2_3() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length; j<0; j--) {
				arr[i]=j;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.print(arr[1]);
	}
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] room = new char[str.length()]; // str���̸�ŭ ���� �����
		
		for(int i=0; i<str.length(); i++) { // str�渶�� ���� �ϳ��ϳ� �־� ��
			room[i] = str.charAt(i);
		}

		int count = 0; // ��ġ�ϴ� ���ڰ� ���� ��� ī��Ʈ�� ���� ����.
		for (int i = 0; i < str.length(); i++) {
			if (room[i] == ch) {
				count += 1;
			}
		}
		System.out.printf("%c�� ���� : %d", ch, count);
	}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);

		String[] arr = { "��", "ȭ", "��", "��", "��", "��", "��" };

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ���� : ");
		int length = sc.nextInt();
		
		int[] room = new int[length];
		int sum = 0;
		
		for(int i=0; i<room.length; i++) {
			System.out.printf("�迭 %d��° �ε����� ���� �� : ", i);
			room[i] = sc.nextInt();
		}
		for(int i=0; i<room.length; i++) {
			System.out.print(room[i] + " ");
			sum += room[i];
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("3�̻� Ȧ���� ���� �Է� : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {

				int[] arr = new int[num];

				int value = 1; // ������ ������� 1���� �����ϴϱ�
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
				}

				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}

				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

	public void practice9() { 
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"�Ķ��̵�", "���", "����", "�Ĵ�"};
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		// �Է��� ġŲ�޴��� �ֹ��� �������� �Ǻ�
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(input.equals(chicken[i])) { // String �Ǻ��� equals�޼ҵ� ���.
				System.out.println(input + "ġŲ ��� ����");
			} else {
				System.out.println(input + "ġŲ�� ���� �޴��Դϴ�.");
			}
		}
		*/ 
		// for�� �ȿ� if���� �����ϱ� �׹��� ����� ��°����� ����.
		
		
		// �� ���� �����ϱ� ���� boolean �޼ҵ� ���.
		boolean check = false; // �к����� boolean�� false�� ����.
		for(int i=0; i<chicken.length; i++) {
			if(input.equals(chicken[i])) {
				check = true; // �迭 �ϳ��ϳ� for������ Ȯ���غ��µ� ��ġ�ϴ� ���� ������ true�� �ٲ�.
				break; // true�� ������ �ٸ��� �� �� ���� ����������
			}
		}
		
		// check�� true�� false�Ŀ� ���� ����� ���
		if(check == true) {
			System.out.println(input + "ġŲ ��� ����");
		} else {
			System.out.println(input + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public void practice10() {
	
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String number = sc.nextLine();

		char[] num = new char[number.length()];

		for (int i = 0; i < number.length(); i++) {
			num[i] = number.charAt(i); // �� �ϳ��ϳ��� �ֹι�ȣ �ϳ��ϳ� �־�
		}
		char[] num2 = num.clone(); // �׸��� ���纻 �ϳ� �����
		
		for(int i=8; i<number.length(); i++) {
			num2[i] = '*'; // �ֹ� ���纻�� ���� ���ڸ�(�ε��� 8��°�ڸ�)���ʹ� *�� ����ž�
		}
		System.out.println(num2);
	}
}
