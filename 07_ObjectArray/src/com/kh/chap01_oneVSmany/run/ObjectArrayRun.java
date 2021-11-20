package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// ��ü �迭 Ȱ���ؼ� �غ���
		// �� ���� Book��ü�� �����Ѵٸ�?
		Book[] books = new Book[3]; // Book Ŭ���� 3��

		// �� ������ ���� ������ �ݺ������� �Է¹޾� �� �ε����� ��ü ����
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {

			System.out.println((i + 1) + "��° ���� ���� �Է�");

			System.out.print("������ : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			System.out.println();

			// ������ �ε����� ��ü ����
			books[i] = new Book(title, author, price, publisher);

		}

		// ��ü ���� ������ ��ȸ�ϱ�
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

		// ���� �������� �˻��ϴ� ����
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle())) {
				System.out.println(books[i].information());
			}
		}
	}
}
