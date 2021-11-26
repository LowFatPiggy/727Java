package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * ���� ����
		 * - �ý��� ���� : ��ǻ���� ���۵����� �߻��ϴ� ���� => �ҽ��ڵ�� �ذ�x => �ɰ��� ����
		 * - ������ ���� : �ҽ��ڵ� ������ ���� => ���ʿ� �����ٷ� ������ �˷��� (�������� �Ǽ�)
		 * - ��Ÿ�� ���� : �ڵ� ������ ������ ���µ� ���α׷� ���� �߿� �߻��ϴ� ����
		 *            (������� �Ǽ� or �����ڰ� ���������� ��츦 ����� ó���� �� ���)
		 * 
		 * - �� ���� : ���������ε� ���� ���� �������� ���� ������ ������ ���α׷� �ǵ��� ���� �ʴ� ��
		 * 
		 * �ý��� ������ ������ ������ ����, ��Ÿ�ӿ���, �������� ���� ���� �� �ɰ��� �͵��� ������ �۾� => ����(Exception)
		 * 
		 * �̷� '����'�� �߻����� ��� 'ó��'�ϴ� ����� "����ó��"
		 * 
		 * ** ���� ó�� �ϴ� ����
		 *  - ���α׷��� ������������ ����� �� ����
		 *  
		 * ** ���� ó�� ���
		 *  1. try~catch�� �̿� (try~with~resource)
		 *  2. throws �̿� (���ѱ�� == ����)
		 */
		
		A_UnCheckedException a = new A_UnCheckedException();
		// a.method1();
		// a.method2();
		// a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
		
	}

}
