package com.kh.first.run;

import com.kh.first.MethodTest;

public class Run {

	public static void main(String[] args) {
		/*
		 * ���� Ŭ������ �޼ҵ带 ȣ���� ���� �ܼ��� ȣ�⸸ �ص� ����
		 * ȣ���� �޼ҵ��();
		 * 
		 * �׷��� �ٸ� Ŭ������ �޼ҵ带 ȣ���� ��쿡��?
		 * 
		 */
		
		System.out.println("���θ޼ҵ� ���� ����!!");
		
		//1.ȣ���� �޼ҵ尡 �ִ� Ŭ����(Ʋ)�� ���� �༮�� ����(����� ����� �ƶ�)
		// [ǥ����]
		// Ŭ������ �����ҳ༮�̸� = new Ŭ������();
		MethodTest mt = new MethodTest(); // ������ �� new ��� 
		
		// => �⺻������ ���� com.kh.first.run ��Ű�� �ȿ� MethodTest ��� Ŭ������ �������� �ʾƼ�
		//    import �������� MethodTest Ŭ������ ��ġ�� ã���� ��!
		
		// ���� import���� ���� �ʰ� �Ʒ�ó�� �ۼ��ص� ������ �� ���� �ʴ´�
		// com.kh.first.MethodTest mt = new com.kh.first.MethodTest();
		
		// 2. ���� �� ���� �ش� Ŭ������ �ִ� �޼ҵ带 ȣ���ϸ� �ȴ�.
		// [ǥ����]
		// �����ѳ༮���̸�.ȣ���Ҹ޼ҵ��̸�();
		mt.testPrint();

	}

}
