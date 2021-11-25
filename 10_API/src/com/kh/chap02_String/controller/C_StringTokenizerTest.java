package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "java,Oracle,JDBC,HTML,CSS,Spring";
		
		// �����ڸ� �������� �ؼ� ���ڿ��� �и� ��Ű�� ���
		
		// ���1. �и��� ���ڿ����� String[] �迭�� �������� ����� �� ��
		//		 StringŬ������ �����ϴ� split �޼ҵ� �̿�
		//		  ���ڿ�.split(������) : String[]
		
		String[] arr = str.split(",");
		System.out.println("�迭�� ���� : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° �ε��� : " + arr[i]);
		}
		
		// �ٸ� ������ ���
		for(String s : arr) { // arr ���� �ε����� s�� �����Ŵ�
			System.out.println(s);
		}
		
		// 'n��° �ε���'�� �߰��ϰ�ʹٸ�
		int i = 0;
		for(String s : arr) {
			System.out.println(i++ + "��° �ε��� : " + s); // ���� ������ ���
		}
		
		
		// ���2. �и��� ���ڿ����� ���� ��ū���� �����ϰ��� �� ��
		//		 java.util.StringTokenizer
		//		 StringTokenizer stn = new StringTokenizer(�и���Ű�����ϴ� ���ڿ�, ������);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countToken()); // 0
		
		// System.out.println(stn.nextToken()); // NoSuchElementException �߻� (�� �̻��� ��Ұ� �����ϴ�)
		// ��ū�� ��ȸ���̶� �ѹ� ���̸� ����
		*/
		
		
		/* �߸��� ���
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		} 
		// ** Java, Oracle, JDBC ����� ������ �Ǵ� ����?
		// j=0 j<6 true => ���("Java")   j++
		// j=1 j<5 true => ���("Oracle") j++
		// j=2 j<4 ture => ���("JDBE")   j++
		// j=e j<3 false => �ݺ��� ��������
		// ** j<6�� �������� ���� ���� : ��µ� ������ ��ū���� �پ��
		*/
		
		
		/*
		// �ذ��� 1.
		int count = stn.countTokens(); // count = 6;
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		
		// �ذ��� 2.
		while(stn.hasMoreTokens()) { //�ݺ��� ���� �� ���� (��ū�� �����ֳ�? true=>����)
			System.out.println(stn.nextToken());
		} // ��ū�� �����ֳ�? false=>break;
		
	}

}
