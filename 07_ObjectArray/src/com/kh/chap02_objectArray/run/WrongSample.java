package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];
		
		// --- 1��° ������ ��ġ���� ---
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		// -----------------------
		
		for(int i=0; i</*=*/arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		// �߸��� �κ�
		// 1. NullPointerException : ��ü�迭�� �� �ε����� ��� ���� null�� ���¿���
		//							  �޼ҵ带 ȣ���Ϸ��� �߱� ���� => ��ü �迭 ���� �� �� �ε������� ��ü ���� ����
		// 2. ArrayIndexOutOfBoundsException : �迭�� ������ �ε��� ������ ���
		//									       ��ġ ���� => ���ǽ� ����(i<�迭�Ǳ���)
	}

}
