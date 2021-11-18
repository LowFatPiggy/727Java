package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p = new Product("ssgnote9", "�����ó�Ʈ9", "��⵵ ����", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG����Ʈ��5", "��⵵ ����", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT����Ʈ��3", "����� ����", 250000, 0.3);

		System.out.println(p.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("=======================================================");
		
		p.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		
		p.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		System.out.println(p.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("=======================================================");
		
		System.out.println("��ǰ�� = " + p.getProductName() + "\n" + "�ΰ��� ���� ���� = " + p.getPrice() +"��");
		System.out.println("��ǰ�� = " + p2.getProductName() + "\n" + "�ΰ��� ���� ���� = " + p2.getPrice()+"��");
		System.out.println("��ǰ�� = " + p3.getProductName() + "\n" + "�ΰ��� ���� ���� = " + p3.getPrice()+"��");

	}

}
