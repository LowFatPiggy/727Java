package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("������ ����", "ȫ����", 16000);
		Book bk2 = new Book("�׷��� �׷�", "������", 14500);
		
		System.out.println(bk1.toString());
		System.out.println(bk2/*.toString()*/);

		// ���۷����� ����ϰ��� �� �� .toString()�� ���� �ۼ����� �ʾƵ� JVM�� �˾Ƽ� ȣ��
		// Object Ŭ������ toString() ���� => ǮŬ������ + @ + ��ü�� �ؽ��ڵ��� 16������ ����
		
		// �̶�, BookŬ������ Object�� toString�� ��¸޼ҵ�� �������̵�
	}

}
