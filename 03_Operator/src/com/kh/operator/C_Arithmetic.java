package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * * ��������� (���� ������ == �ΰ��� ���� ������ ����)
	 * + - * / %
	 * 
	 * *  / % > + -
	 * 
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1 + num2); // ���ڿ�+num1 ����. �׷��� ���ڿ��������� ����.
		System.out.println("num1 + num2 = " + (num1 + num2)); // ���� �����Ű���� �ϴ� ����� ��ȣó��
		// System.out.println("num1 - num2 = " + num1 - num2); // ���ڿ��� int�� -������ �����Ƿ� ����. ��ȣó���� �ذ�o
		
		System.out.println("num1 * num2 = " + num1 * num2); // ����, �������� ��������� ���� ������ ��ȣ�ʿ�x
		System.out.println("num1 / num2 = " + num1 / num2); // ���������� �� ��
		System.out.println("num1 % num2 = " + num1 % num2); // ���������� �� ������
		
		// �� % 2 == 0  : ¦��
		// �� % 2 == 1  : Ȧ��
		
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println("a : " + a); //5 6 7
		System.out.println("b : " + b); //10 9
		System.out.println("c : " + c); //16 15
		System.out.println("d : " + d); //2 1
		System.out.println("e : " + e); //4 5 6
		System.out.println("f : " + f); //4
		System.out.println("g : " + g); //9+2=11 10
		System.out.println("h : " + h); //2
		System.out.println("i : " + i); //6+9/(15/4)*(11-1)%(6+2) =6+9/3*10%8 =6+30%8 =6+6 =12
		
	}

}
