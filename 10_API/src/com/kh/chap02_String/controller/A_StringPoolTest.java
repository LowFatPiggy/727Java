package com.kh.chap02_String.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		// 1. �����ڸ� ���� ���ڿ� ����
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String Ŭ������ toString�޼ҵ尡 ���� ��� ���ڿ��� ��ȯ�ϵ��� �̹� �������̵� �Ǿ��ִ�
		
		System.out.println(str1 == str2); // �ּҰ� ��. false
		System.out.println(str1.equals(str2)); // ���ڿ��� ��. true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String Ŭ������ hashCode�޼ҵ� �̹� �������̵� �Ǿ��ִ� => �ּҰ��� �ƴ� ���� ��� ���ڿ� ��
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ��¥ �ּҰ��� ���� �˰� �ʹٸ� System.identityHashCode(���۷���)
		
	}
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. ���ڿ��� ���ͷ������� ����
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		// ���ͷ� ���� �� ���Ǯ(String Pool)������ �ö�
		// String Pool Ư¡ : ������ ���ڿ��� ���� �� ���� = �ּҰ��� ������
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// str1�� str2�� �ּҰ��� �ٸ���?
		System.out.println(str1 == str2); // true (�ּҰ� ��ġ)
		
		// ��¥ ������?
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// yes ���ּҰ����� ��ġ��
		
		// new �����ڸ� ���� ���� str�� ���? 
		System.out.println(System.identityHashCode(str)); // �ٸ� �ּҰ�
		
		// ������ ���ڿ��� �����Ѵٸ� �ּҰ��� ���?
		// String Ŭ���� == �Һ� Ŭ����(���� ������ �ʴ� Ŭ����)
		// => �� ������ �����ϳ�, �� �ּҿ��� ���� �Ǵ� ������ x
		String str3 = "hi";
		System.out.println(System.identityHashCode(str3));
		// ----- ���ڿ� ���� �� -----
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// ���ڿ��� �����ϴ� ���� ���ο� �ּҷ� �����ϵ���.(���ο� �ּҰ��� �ο�)
		
		str3 = "hello";
		// ������ �ִ� ���ڿ��� �����ϸ� �� ���ڿ��� ��� �ּҰ����� �����
		System.out.println(System.identityHashCode(str3));
	}
	

}
