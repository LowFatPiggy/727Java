package com.kh.chap04_field.model.vo;

public class run {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		
		/*
		// public : ��𼭵� ���� ����
		System.out.println(f2.pub);
				
		// protected : ���� ��Ű�� ���� ���� , �ٸ� ��Ű����� ��ӱ��������� ���ٰ���
		System.out.println(f2.pro);
				
		// default : ���� ���� ��Ű���������� ���� ����
		System.out.println(f2.def);
				
		// private : ���� �ش� �� Ŭ������ ���� ����
		// System.out.println(f2.pri);
		*/
		
		
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		
		FieldTest3.sta = "zzz";
		System.out.println(FieldTest3.sta);
		
		// ������ ���� �ȵǰ� �ϵ� ������ ������ ���� �Ϸ��� ����ʵ�
		System.out.println(FieldTest3.STA_FIN);
		// FieldTest3.STA_FIN = "ggg"; // ���� �Ұ�
		System.out.println(Math.PI);
		System.out.println(Math.random());
	}

}
