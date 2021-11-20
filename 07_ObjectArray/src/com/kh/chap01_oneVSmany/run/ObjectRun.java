package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// �����ð�
		// ���1. �⺻�����ڷ� ���� �� setter�޼ҵ带 ���ؼ� �� �ʱ�ȭ
		
		/*
		Book bk = new Book();
		bk.setTitle("�ڹ��� ����");
		bk.setAuthor("���ü�");
		bk.setPrice(25000);
		bk.setPublisher("��������");
		*/
		
		
		
		// ���2. �Ű����������ڸ� ���ؼ� ������ ���ÿ� �� �ʱ�ȭ
		// Book bk = new Book("�ڹ��� ����", "���ü�", 25000, "��������");
		
		// [����] ����ڿ��� �Է¹��� ������ ��ü ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("������ : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		String author = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���ǻ� : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		
		// �� ���� Book ��ü�� �����ؾ��Ѵٸ�?
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// �� ������ ���� ������ �ݺ������� ����ڿ��� �Է¹��� �� �� ��ü ������ ���ÿ� �ʱ�ȭ
		
		
		for(int i=0; i<3; i++) {
			
			System.out.println((i+1) + "��° ���� ���� �Է�");
			
			System.out.print("������ : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			// �Ź� ���ǰ˻� �� ������ ��ü �����ؾ���
			if(i==0) { // ù��° �ݺ��� ���� ��
				bk1 = new Book(title, author, price, publisher);
			} else if(i==1) { // �ι�° �ݺ��� ���� ��
				bk2 = new Book(title, author, price, publisher);
			} else {
				bk3 = new Book(title, author, price, publisher);
			}
		} 
		
		// ��ü ���� ������ ��ȸ�ϱ�
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// ���� �������� �˻��ϴ� ����
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		/*
		if(search.equals(bk1)) { // tc : if(bk1.getTitle().equals(search))
			System.out.println(bk1.information());
		} else if(search.equals(bk2)) {
			System.out.println(bk2.information());
		} else {
			System.out.println(bk3.information());
		}
		*/
		
		// å ������ ���� å���� ���� �� ������ ��� ����ϱ� ���� if�����θ� ���
		
		if(search.equals(bk1.getTitle())) {
			System.out.println(bk1.information());
		}
		
		if(search.equals(bk2.getTitle())) {
			System.out.println(bk2.information());
		}
		
		if(search.equals(bk3.getTitle())) {
			System.out.println(bk3.information());
		}
		
		// �� �����ϰ� ���� �� �ִ� ���
		// ObjectArrayRun.class ����
	}

}
