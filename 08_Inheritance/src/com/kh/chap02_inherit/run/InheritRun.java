package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun /* extends Object */ { // ��� Ŭ������ Object�� �ڽ�

	public static void main(String[] args) {
		
		Car c = new Car("�ѽ����̽�", 12.5, "SUV", 4);
		
		Ship s = new Ship("�źϼ�", 4.8, "������", 20);
		
		Airplane a = new Airplane("������", 40.9, "�ΰ��� �װ���", 18, 2);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		System.out.println("------------------");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("�ѽ����̽�", 12.5, "SUV", 4));
		list.add(new Ship("�źϼ�", 4.8, "������", 20));
		list.add(new Airplane("������", 40.9, "�ΰ��� �װ���", 18, 2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information()); // �������ε�
		}
		
		
		/*
		 *  * ����� ����
		 *  - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 *  - �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 *    => ���α׷��� ���꼺�� ���������� ũ�� �⿩
		 *    
		 * 
		 *  * ����� Ư¡
		 *  - Ŭ�������� ��ӿ� �־�� ���߻���� �Ұ�(���� ��Ӹ� ����)
		 *  - �θ�Ŭ������ ���ǵǾ��ִ� protected�ʵ�� �ڽ�Ŭ�������� ���� ���� ����
		 *  - �ڽİ�ü�� �θ�Ŭ������ �ִ� �޼ҵ带 ��ġ ����ó�� ȣ�� ����
		 *    + �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ�������� ������ �������ϴ� �������̵� ����
		 *    
		 *  - ��õǾ����� ������ ��� Ŭ����(�ڹ� ����, ����� ����)�� Object Ŭ������ �ڽ�
		 *    => ��, Object Ŭ������ �ִ� �޼ҵ带 ������� ȣ�� ����
		 *    => �������̵��� ���ؼ� �����ǵ� ����
		 */
		
	}

}
