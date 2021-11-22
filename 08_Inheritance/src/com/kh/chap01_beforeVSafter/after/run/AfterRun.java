package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		/*
		 * * ����� ����
		 * - ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * - �ߺ��� �ڵ带 ������ �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 * 	(���α׷� ���꼺�� ��������)
		 */
		
		// Desktop ��ü ����
		// brand, pCode, pName, price, allInone
		Desktop d = new Desktop("SAMSUNG", "d-01", "S��", 1500000, true);
		
		
		// Tv ��ü ����
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "tv-01", "LGƼ��", 3000000, 65);
		
		// SmartPhone ��ü ����
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("APPLE", "sp-01", "������", 1200000, "KT");
		
		
		// �������̵� ���
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1200000); // Product Ŭ����(�θ�)���� �޼ҵ� ȣ��
		s.setMobileAgency("SKT"); // SmartPhone Ŭ����(�ڽ�)���� ȣ��
		System.out.println(s.information());
		
		/*
		 * * ����� Ư¡
		 * - �ڽ� ��ü�� ������ �θ� Ŭ������ �ִ� �޼ҵ带 ��ġ ����ó�� ȣ�� ����
		 * - �θ�Ŭ������ �ִ� �޼ҵ带 �������̵��� ���� �ڽ�Ŭ������ ������ ����
		 * 	=> �������̵��� �ϴ� ���� �ڽ�Ŭ������ �ִ� �޼ҵ� �켱���� ����
		 * - Ŭ�������� ����� ���� ����� �Ұ��� (���� ��Ӹ� ����)
		 */

	}

}
