package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setId("gayeon");
		p.setPwd("gy0000");
		p.setName("�谡��");
		p.setAge(27);
		p.setGender('F');
		p.setPhone("010-123-4567");
		p.setemail("gy@gy.com");
		
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		System.out.println("================");
		
		Product p1 = new Product();
		
		p1.setpName("������");
		p1.setPrice(850000);
		p1.setBrand("SAMSUNG");
		
		System.out.println(p1.getpName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
		
		System.out.println("================");
		
		Product p2 = new Product();
		
		p2.setpName("������");
		p2.setPrice(1000000);
		p2.setBrand("APPLE");
		
		System.out.println(p2.getpName());
		System.out.println(p2.getPrice());
		System.out.println(p2.getBrand());
		
		System.out.println(p2.information());
		

		System.out.println("----- �Ű����� ������ ��� -----");
		
		Product p3 = new Product("������", 850000, "�Ｚ");
		System.out.println(p3.information());
		
		Product p4 = new Product("������", 1000000, "����");
		System.out.println(p4.information());
	}

}
