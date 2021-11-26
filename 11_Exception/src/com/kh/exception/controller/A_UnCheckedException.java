package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException {
	
	/*
	 * ** RuntimeException
	 *  - ���α׷� ���� �� �߻��Ǵ� ���ܵ�
	 * 
	 * ** RuntimeException
	 *  - IndexOutOfBoundsException : �������� �ε����� ���� �� �߻��Ǵ� ����
	 *  - NullPointerException : ���� ������ null���� ��Ȳ���� �������� �� �߻��Ǵ� ����
	 *  - ArithmeticException : ������ ���� �� 0���� �������� �� �߻��Ǵ� ����
	 *  - ClassCastException : ����� �� ���� ����ȯ �����Ϸ��� ��� �߻��Ǵ� ����
	 *  - NegativeArrays 
	 * 
	 *  => RuntimeException ���õ� ���ܴ� ����� ���������� ��Ȳ�� ����
	 *     ���ʿ� ������ü�� �߻��� �ȵǰԲ� if�� ����ó�� ����
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : ������ ���� �� 0���� �������� �� �߻��ϴ� ����
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2; // ����ڰ� �ι�° ������ 0���� �Է��ϴ� ���� ���� �߻� => ������������ ���α׷� ����
		
		/*
		// �ذ� ��� 1. ���ʿ� ���� ��ü �߻��� �ȵǰԲ� if������ ���ǰ˻� => ����ó��x
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("result : " + result);
		*/
		
		
		// ����ó�� : ���ܰ� "�߻����� ��" ������ ������ �̸� �ۼ��س��� ���
		
		/*
		 * try catch ���
		 * 
		 * try {
		 *    ���ܰ� �߻��� �� �ִ� ����;
		 * } catch(�߻��� ����Ŭ���� �Ű�����) {
		 *    �ش� ���ܰ� �߻����� ��� ������ ����;
		 * }
		 */
		
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace(); // ���� �̷��� ������ �� �� �����ϴ� ����
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException : �迭 �Ҵ� �������� �迭�� ũ�⸦ ������ �����ϴ� ��� �߻��ϴ� ����
		// ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �����ϸ鼭 �������� �� �߻��ϴ� ����
		
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		
		/* if������ ���ʿ� ���� �߻��� �ȵǵ��� ���� ó���ϴ� ��� => ����ó��x
		if(size >= 101) {
			int[] arr = new int[size];			
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}
		// ���� catch�� �ۼ� ����
		
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	
	public void method3() {
		System.out.print("�迭�� ũ�� : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
			
		} catch (InputMismatchException e) {
			System.out.println("�������� �Է��ؾ��մϴ�.");
			
		}
		*/
		
		
		/*
		// ���� catch���� �����ϰ� �ϴ� �� but � ���ܰ� �߻��ߴ��� �˷��ֱ� ����
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
		} catch (RuntimeException e) { // ������ �����ؼ� �θ�Ÿ�Կ��� Ŭ���� �ۼ�����
									   // ��� �ڽ� ���ܹ߻� �� ����ó���� �� ����
			System.out.println("���ܹ߻� : �迭�� ũ�� or �������� �ε��� ���� or ������ 0���� ���� ���..");
			// ���� �߻� �� ������ ������ ������ ��� ����ȭ�ؼ� ���� catch������ ��� ex) method2
		}
		*/
		
		
		
		// InputMismatchException ���ܸ� ����ȭ�ϰ�ʹٸ�
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
			
			
		} catch (InputMismatchException e) {
			System.out.println("������ �ƴ� ���� �Է��ϼ̽��ϴ�.");
			
		} catch (RuntimeException e) { 
			System.out.println("���ܹ߻� : �迭�� ũ�� or �������� �ε��� ���� ���..");
		}
		
		// �θ𿹿�Ŭ������ �ڽĿ���Ŭ������ catch������ ����ϰ��� �� ��
		// �ڽĿ���Ŭ���� catch���� ���ʿ� �־�߸� �� (unreachable catch block ����)
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	

}
