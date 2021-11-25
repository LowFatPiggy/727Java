package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		
		// �߻�Ŭ������ ��ü ���� �Ұ� (�̿ϼ��� Ŭ������)
		// Sports s = new Sports();
		// Sports s; // ��ü ������ �Ұ��ϰ� ���۷����δ� ��� ����
		Sports s = new BasketBall(); // ������ ������Ѽ� �θ�Ÿ������ �ڽİ�ü�� �޾��ִ� ���´� ����
		// ���۷��� : �Ϲ� ���� �̿ܿ� �ڷ����� ���۷������ϰ� �ּҰ��� ���� �����ڷ���.
		
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule(); // �������̵� �� �޼ҵ� ����
		}
		
		System.out.println("--������ �������� �ٸ� �������--");
		
		for(Sports a : arr) { // ����: ���� = arr[0] => ���� = arr[1] �ݺ� ���� 
			// ������ arr�� ������ ������ ����ؾ� ��.
			a.rule();
		}
		/*
		 * �������ε� : �����Ͻ��������� �������ε����� ���� ���۷����� �ڷ����� Ŭ������ �ִ� �޼ҵ带 ������.
		 * 			��Ÿ�ӽ������� �������ε����� ������ �ڽ�Ŭ������ �������̵� �� �޼ҵ尡 ���� ��� �ش� �޼ҵ� ����.
		 */
		
		/*
		 * �߻� �޼ҵ� : �̿ϼ��� �޼ҵ�� �����({})�� �����Ǿ����� ���� �޼ҵ�
		 * �߻� Ŭ���� : �̿ϼ��� Ŭ������ �߻�޼ҵ带 �ۼ��ϸ� �ݵ�� �ش�Ŭ������ �߻�Ŭ������ ����. 
		 * 			- ��ü ���� �Ұ� (��, ���۷��� �����δ� ���� ����)
		 * 			�߻�޼ҵ� ��� �߻�Ŭ������ ���� ����. ���� ���?
		 * 			> ������ �ð� : �ش� Ŭ������ �̿ϼ��� Ŭ������� ���� �ο��� ����
		 * 			> ���α׷��� �ð� : ��ü ������ �Ұ��ϵ��� �ϰԲ�
		 * 
		 * �߻� �޼ҵ尡 �����ϴ� �߻� Ŭ������ ����ϴ� ����
		 * : �θ� Ŭ������ �߻�޼ҵ尡 ������ ��� => �ڽ�Ŭ���������� ������ �������̵��ؼ� ������ ������ �޼ҵ带 ������ �ȴ�.
		 * 	  �� �ڽ� Ŭ�������� �����ų ������ �ٸ����� ������ ������ �޼ҵ�� ���������� �� �� ���.
		 * 	=> �޼ҵ� ���ϼ� Ȯ�� ����, ǥ��ȭ�� Ʋ�� ������ ���� 
		 * 
		 */
	}

}