package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;

public class FieldRun {

	public static void main(String[] args) {
		
		// ----- FieldTest2 -----
		/*
		FieldTest1 f1 = new FieldTest1();
		
		f1.test(5);
		*/
		
		// ----- FieldTest2 -----
		FieldTest2 f2 = new FieldTest2();
		
		// public : ��𼭵� ���� ����
		System.out.println(f2.pub);
		
		// protected : ���� ��Ű�� ���� ���� , �ٸ� ��Ű����� ��ӱ��������� ���ٰ���
		// System.out.println(f2.pro);
		
		// default : ���� ���� ��Ű���������� ���� ����
		// System.out.println(f2.def);
		
		// private : ���� �ش� �� Ŭ������ ���� ����
		// System.out.println(f2.pri);

	}

}
