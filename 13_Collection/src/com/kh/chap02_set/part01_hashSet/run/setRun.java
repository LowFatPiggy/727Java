package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.medol.vo.Student;

public class setRun {

	public static void main(String[] args) {
		
		// Object�� equals() => �� ��ü�� "�ּҰ�"�� ���ؼ� true/false ��ȯ
		// Object�� hashCode() => �ش� ��ü�� "�ּҰ�"�� ������ 10������ ���·� �ٲ� ��ȯ
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("�� ���� ���� ���� �ְ�!");
		hs1.add(new String("����! ������ִ�~"));
		hs1.add(new String("���� ������"));
		hs1.add(new String("���� ���� ����;�~"));
		hs1.add(new String("(�������~)"));
		hs1.add(new String("���� ��������"));
		hs1.add(new String("���� ��������"));
		
		
		// String�� equals() �������̵� => "���� ��� ���ڿ�"�� ���ؼ� true/false ��ȯ
		// String�� hashCode() �������̵� => "���� ��� ���ڿ�"�� ������ 10������ ���·� �ٲ� ��ȯ
		
		System.out.println(hs1);
		// ���� ���� ����x(�ε��� ����x), �ߺ��� ������(���ϰ�ü) ���� �Ұ�
		
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("��¯��", 5, 40));
		hs2.add(new Student("��ö��", 5, 100));
		hs2.add(new Student("������", 5, 70));
		hs2.add(new Student("��ö��", 5, 100));
		
		System.out.println(hs2);
		// ���� ���� ����x(�ε��� ����x), �ߺ��� ������ ��� => ��? ���ϰ�ü�� �Ǵ��� ���ؼ�
		
		// HashSet�̶�� ������ ��ü�� �߰��� ������ ���� ��ü���� ��
		// ���ϰ�ü : �� ��ü���� hashCode ����� ��ġ�ϰ�, equals�޼ҵ�� �񱳽� true�� ���
		
		
		// Student�� equals() �������̵� => "���� �� �ʵ忡 ��� ������"���� ���ؼ� true/false ��ȯ
		// Student�� hashCode() �������̵� => "���� �� �ʵ忡 ��� ������"���� ��ġ�ϸ� 10������ ���·� �ٲ� ��ȯ
		
		/*
		System.out.println(new Student("��ö��", 5, 100).hashCode());
		System.out.println(new Student("��ö��", 5, 100).hashCode());
		System.out.println(new Student("��ö��", 5, 100).equals(new Student("��ö��", 5, 100)));
		*/
		
		
		// hs2.get(1); // HashSet������ �ε��� ����x, get�޼ҵ� ��ü�� ����x (=�� ��ü�� ����x)
		// But, HashSet�� ��� ��� ��ü�鿡 ���������� ���� ����
		// 1. for������ (��, for each������)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
		
		// 2. ArrayList�� ���� �� �� ArrayList�� �ݺ��� �������� ����
		
		// ArrayList�� ��� ��� 
		// 1) ArrayList ���� �� addAll�޼ҵ带 �̿��ؼ� �߰�
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2); // ����Ʈ�� hs2�� �� 3���� Student��ü �߰�
		
		// 2) ArrayList ������ ���ÿ� �߰�
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("-----------------");
		
		// 3) Iterator��� �ݺ��ڸ� �̿��� ���������� ����
		Iterator<Student> it = hs2.iterator(); // hs2�� ��ü���� Iterator�� ����
		
		while(it.hasNext()) { // it�� ��� ������� ���������� ���ѹݺ�
			Student s = /*(Student)*/ it.next();
			System.out.println(s);
		} 
		// StringTokenizer�� ����� ���� ; ��ȸ��

	}

}
