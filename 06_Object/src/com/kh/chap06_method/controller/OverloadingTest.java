package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	// �����ε� : �� Ŭ���� ���� ���� �޼ҵ������ ������ �� �ִ� ��
	
	public void test() {
		
	}
	
	/*
	public void test() {
		
	}
	*/ //������ �޼ҵ���� ����Ϸ��� �Ű� ������ ������ �ڷ����� �ٸ��� �ؾ�.
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		// ���� �޼ҵ��� �Ű����� ������ �ٲ��ִ� �͵� ������ �޼ҵ�
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) {
	
	}
	*/ // �Ű��������� �ٸ� �Ͱ��� ������� "�Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��ؾ�"
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
		
	}
	*/ // ��ȯ���� �ٸ� �Ͱ��� ������� "�Ű������� �ٸ��� �ۼ��ؾ�"
	
	/*
	private void test(String str) {
		
	}
	*/ // ���������ڵ� �޶� �������
	
	/*
	 * * ���
	 * 	  �����ε� : �� Ŭ���� ���� ������ �̸��� �޼ҵ��
	 * 			  ��, �Ű�������, ����������, ��ȯ���� �� ������
	 * 			  �Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ��־�� �Ѵ�
	 */
}
