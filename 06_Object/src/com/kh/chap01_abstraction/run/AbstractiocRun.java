package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class AbstractiocRun {

	public static void main(String[] args) {
		
		// Ŭ����(=Ʋ) ���� �� �л���ü ������ ([ĸ��ȭ ������ ����] �ҿ����� Ŭ����)
		
		// �ڹٿ����� ��ü�� ����� ���ؼ� new��� Ű���带 ���� Heap������ ���� ���� (���� �Ҵ�)
		Student shin = new Student(); // ��ü ���� ����
		// ������� Heap ������ �Ҵ�� �������� JVM�� �ʱⰪ���� ����
		
		// �� ������ "���� ����"�ؼ� ���� ���ϴ� �� ����
		shin.name = "��¯��";
		shin.age = 5;
		shin.height = 105.9;
		
		System.out.println(shin); //��°� : @6d06d69c
		System.out.println(shin.name); // ���ϴ� ���� ��� �ش� �ʵ�� ���� ���ϴ� �� ���
		System.out.println(shin.name + "���� ���̴� " + shin.age + "�̰�, Ű�� " + shin.height + "cm�Դϴ�.");
		// ���� ������ ���� ���� ������
		
		
		// �ͱ� �л� ��ü �����
		Student maeng = new Student();
		
		maeng.name = "�ͱ�";
		maeng.age = 5;
		maeng.height = 115.9;
		
		System.out.println(maeng.name +"���� ���̴� " + maeng.age + "�̰�, Ű�� " + maeng.height + "cm�Դϴ�.");
		
		
		/*
		 * �ش� �ʵ带 public ���������ڷ� �ۼ�  => ���� �����ؼ� �� ����, �������Ⱑ ���� 
		 * But, �ܺο��� �� ����, ��ȸ������ ���� ����� ���� ���� ������ �� �ִ� ���� �߻�
		 * 		>> ĸ��ȭ �۾�(���� ���� ���) �ʿ�
		 */
		
	}

}
