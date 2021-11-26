package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException�� �ݵ�� ����ó���� �ؾ��ϴ� ����
	 * => ���ǹ� �̸� ������ �� ���� ( ������ �Ұ��� ������ ������ �߻��ϱ� ����)
	 * => �ܺ� �Ű�ü�� ������� �Ͼ �� �߻� (IOException) 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(��, ���ڿ��� �о�鿩��)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ƹ��ų� �Է��ϼ��� : ");
		
		
		/*
		// 1. try~catch��
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		*/
		
		
		// 2. throws : ����ó�� �ʰ� �� �޼ҵ带 ȣ���ϴ� ������ ����ó���� �����ϰڴ�
		String str = br.readLine(); // ���ʺ��� readLine() �޼ҵ忡�� throws IOException�ϰ� �־���
		System.out.println(str);
		
	}
	
	/*
	 *                           ����Ŭ����                       ���ܹ߻�����                 ����ó��
	 * UnCheckedException    RuntimeException      ��Ÿ�ӿ���                   �ʼ�x(if��or����ó������)
	 *   CheckedException   RuntimeException ��      �����Ͽ���(������)    �ʼ�o(������ ����ó������)
	 */
}
