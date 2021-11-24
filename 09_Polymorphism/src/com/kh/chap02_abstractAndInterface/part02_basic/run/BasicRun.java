package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		
		Person mom = new Mother("���̼�", 53.5, 70, "���");	
		Person baby = new Baby("��¯��", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		mom.eat(); // ������+10 �ǰ�-10
		baby.eat(); // ������+3 �ǰ�+1
		
		mom.sleep(); // �ǰ�+20
		baby.sleep(); // �ǰ�+3
		*/ //Person Ŭ������ abstract eat, sleep ���ݱ� ������ �ּ�ó��
		
		System.out.println("----- ���� �� -----");
		
		System.out.println(mom);
		System.out.println(baby);
		
		System.out.println("==== Basic �������̽� ���� �� ���� ���====");
		
		// Basic b = new Basic(); // ���۷��� ��� ����, ��ü ������ x
		
		Basic mom1 = new Mother("���̼�", 53.5, 70, "���"); // Basic �������̽� ����
		Basic baby1 = new Baby("��¯��", 3.5, 70); // ��������
		
		System.out.println(mom1);
		System.out.println(baby1);
		
		mom1.eat(); // ������+10 �ǰ�-10
		baby1.eat(); // ������+3 �ǰ�+1
		
		mom1.sleep(); // �ǰ�+20
		baby1.sleep(); // �ǰ�+3
		
		System.out.println("----- ���� �� -----");
		
		System.out.println(mom1);
		System.out.println(baby1);
		
		/*
		 * Ŭ�������� Ŭ������ ��ӹ��� �� : Ŭ���� extends Ŭ���� (���ϻ�Ӹ� ����)                    : ȭ��ǥ �Ǽ�
		 * Ŭ�������� �������̽��� ������ ��  : Ŭ���� implements �������̽�, �������̽� , .. (���߻�� ����): ȭ��ǥ ����
		 * �������̽����� �������̽��� ��� : �������̽� extends �������̽�, �������̽�, .. (���߻�� ����)  : ȭ��ǥ �Ǽ�
		 *
		 * extends �Ϲ� Ŭ���� --> extends �߻�Ŭ���� --> implements �������̽�
		 * ------------------------------------------------------->
		 *					�������� �� £���� (�Ծ��� �� ����)
		 *
		 */
	}

}
