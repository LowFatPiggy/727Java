package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		System.out.print("1. �Է�\n2. ���� \n3. ��ȸ\n4. ����\n9. ����\n");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2 :	
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3 :	
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4 :	
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 9 :	
			System.out.println("�����մϴ�.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		int sum = (kor + math + eng);
		float average = (kor + math + eng)/3;
		
		if(average > 60) {
			if(kor >= 40 && math >= 40 && eng >=40) {
				System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n��� : %.1f\n", kor, math, eng, sum, average);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}  else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.printf("%d���� ���Դϴ�.", month);
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.printf("%d���� �����Դϴ�.", month);
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.printf("%d���� �����Դϴ�.", month);
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.printf("%d���� �ܿ��Դϴ�.", month);
			break;
		default : 
			System.out.printf("%d���� �߸� �Էµ� ���Դϴ�.", month);
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		int password = sc.nextInt();
		
		if (id.equals("gayeon")) { //���� String ��ġ�� �� id.equals("") , ��ġ�������� �� !id.equals("")
			if (password == 1234) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else if (password == 1234){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("���̵�, ��й�ȣ ��� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String level = sc.nextLine();
		
		switch (level) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			return;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("BMI ���� : " + bmi);
			System.out.println("��ü��");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("BMI ���� : " + bmi);
			System.out.println("����ü��");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("BMI ���� : " + bmi);
			System.out.println("��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("BMI ���� : " + bmi);
			System.out.println("��");
		} else {
			System.out.println("BMI ���� : " + bmi);
			System.out.println("����");
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int operand1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int operand2 = sc.nextInt();
		sc.nextLine(); // int������ ���ۿ� �ִ� \n�� ���ֱ� ���� ����.
		System.out.print("�����ڸ� �Է� (+,-,*,/,%) : ");
		char operator = sc.nextLine().charAt(0);		
		
		/*
		int sum = operand1 + operand2;
		int minus = operand1 - operand2;
		int multiplication = operand1 * operand2;
		int division = operand1 / operand2;
		int remainder = operand1 % operand2;
		
		switch (operator) {
		case '+' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, sum);
			break;
		case '-' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, minus);
			break;
		case '*' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, multiplication);
			break;
		case '/' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, division);
			break;
		case '%' :
			System.out.printf("%d %s %d = %d", operand1, operator, operand2, remainder);
			break;
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}*/
		
		if(operand1 > 0 && operand2 > 0) { //�Ѵ� ����� �Է��ؾ� ��
			int result = 0;
			switch(operator) {
			case '+' : result = operand1 + operand2; break;
			case '-' : result = operand1 - operand2; break;
			case '*' : result = operand1 * operand2; break;
			case '/' : result = operand1 / operand2; break;
			case '%' : result = operand1 % operand2; break;
			default : System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return; // �����ڸ� �߸� �Է����� ��
			}
			System.out.printf("%d %c %d = %d", operand1, operator, operand2, result);
		} else { // ��� �ƴ� ���� �Է����� ��
			System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
		case 8 :
			practice8();
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		}
	}
	
	
	

}
