package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		// Desktop ��ü ����
		
		Desktop d = new Desktop("�Ｚ", "dt-01", "S��", 1500000, true);
		
		
		// Tv ��ü ����
		
		Tv t = new Tv("����", "tv-01", "����Ƽ��", 3000000, 65);
		
		// SmartPhone ��ü ����
		
		SmartPhone s = new SmartPhone("����", "sp-01", "������", 1200000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * �� Ŭ������ �������� �ʵ�� �޼ҵ���� ����.
		 * �̷� �ߺ��� �ڵ���� �θ�Ŭ������ ���� �ѹ��� �����صθ� �ߺ��� �ڵ���� ���� �� �ִ�.
		 * => ������ ���� �������� ��û�� ������ �� ������ ã�Ƽ� ������ �ʿ� ����
		 * 	    �ѹ��� ������ �� �θ�Ŭ������ �����ϸ� ��ü������ �ݿ�.
		 * 
		 * �� Ŭ������ ���������� ������ �ִ� ��
		 * => brand, pCode, pName, price �ʵ��, setter/getter�޼ҵ�, information �޼ҵ�
		 * ==> product Ŭ���� �̸� �����غ� ��!
		 */
		
	}

}
