package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		
	
		

		// ----- NonStaticMethod -----
		NonStaticMethod test = new NonStaticMethod();
		
		
		// 1. �Ű����� ���� ��ȯ���� ���� �޼ҵ�
		test.method1();
		
		// 2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
		String str = test.method2(); // ��ȯ�� '�ȳ��ϼ���' ���ڿ��� str�� ����
		System.out.println(str);
		
		// System.out.println(test.method2()); // ���ٷ� ����
		
		// 3. �Ű����� �ְ� ��ȯ���� ���� �޼ҵ�
		test.method3(4, 2);
		
		// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
		// ��ĳ�� �޼ҵ�� �Է¹޾� ����غ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str1 = sc.nextLine();
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		System.out.println("��� : "+ test.method4(str1, num));
		
		
		
		
		// ----- StaticMethod -----
		
		
		// 1. �Ű� ���� ���� ��ȯ���� ���� �޼ҵ�
		StaticMethod.method1();
		
		// 2. �Ű� ���� ���� ��ȯ���� �ִ� �޼ҵ�
		// ��ȯ���� Ȯ��
		System.out.println(StaticMethod.method2());
		
		// 3. �Ű� ���� �ְ� ��ȯ���� ���� �޼ҵ�
		StaticMethod.method3("¯��");
		
		// 4. �Ű� ���� �ְ� ��ȯ���� �ִ� �޼ҵ�
		System.out.println(StaticMethod.method4("apple", "apple"));
		
		
		// ----- Overloading -----
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "ggg");
		ot.test("ggg", 10);
		ot.test(50, 60);
		
		// �����ε��� ��ǥ���� �� => ��¹�print()
		
	}

}
