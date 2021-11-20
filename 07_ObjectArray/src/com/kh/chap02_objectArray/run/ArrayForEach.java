package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		// for each�� (���� / ������ for��)
		// �迭 �Ǵ� �÷��ǰ� �Բ� ����
		// �迭 �Ǵ� �÷����� 0���ε������� �������ε������� ���������� ��� ������ ������ ��
		
		/*
		 * for(���������� ������ ���� ���� ���� ���� : ���������� ������ �迭 �Ǵ� �÷���) { �ݺ�Ƚ�� == �迭 �Ǵ� �÷���
		 * 		// �ݺ������� ������ ����
		 * }
		 */
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("������", "�Ｚ", 1300000, "��Ʈ20");
		phones[1] = new Phone("������", "����", 1500000, "11����");
		phones[2] = new Phone("������", "LG", 900000, "����");
		
		phones[2].setSeries("1");
		
		int total = 0;
		//            phone[]
		for(Phone p : phones) {
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("�� �հ� : " + total + "��");
		System.out.println("��հ� : " + total / phones.length + "��");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ��� �ϴ� �޴��� : ");
		String buy = sc.nextLine();
		
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("���� : " + p.getPrice() + "��");
			}
		}
		
		
	}

}
