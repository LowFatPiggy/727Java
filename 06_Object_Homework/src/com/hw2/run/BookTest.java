package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		System.out.println(b.information());
		
		Book b2 = new Book("���̾�", 11000, 0.1, "�츣�� �켼");
		System.out.println(b2.information());
		
		System.out.println("=================================");
		
		System.out.println("������ ��� Ȯ��");
		
		b.setTitle("�� ģ�� �̾߱�");
		b.setPrice(10800);
		b.setDiscountRate(0.1);
		b.setAuthor("���� ��긮��");
		
		System.out.println(b.information());
		
		System.out.println("=================================");
		
		System.out.println("������ = " + b.getTitle() + "\n���ε� ���� = " + b.getPrice() + "��");
		System.out.println("������ = " + b2.getTitle() + "\n���ε� ���� = " + b2.getPrice() + "��");
	}

}
