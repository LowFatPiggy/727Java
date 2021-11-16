package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	// �迭 ����
	
	public void method1() {

		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("== ���� �迭 ��� ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// �ܼ��ϰ� copy�迭�� origin�� ����.
		int[] copy = origin;
		System.out.println("== ���纻 �迭 ��� ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99; // copy�迭���� 99�� �ٲ���!

		System.out.println("---------- ���纻 �迭 �� ���� �� ----------");
		System.out.println("== ���� �迭 ��� ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " "); // ��! �ٵ� ���� �迭���� 99��..?
		}
		System.out.println();
		System.out.println("== ���纻 �迭 ��� ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// copy���� ������ ������ �ص� origin���� ����Ǵ� ������?
		// origin�� copy�� ���� ���� �����ϰ� �ֱ� ���� (��, ���� �ּҰ�)
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		// �̷��� �ּҰ� ������ ���� '���� ����'��� ��
	}
	
	public void method2() {
		// ���� �����ϴ� ���
		// 1. for���� Ȱ���� ��� : ���ο� �迭�� ���� ���� �� for������ �����迭�� ������ ���� ���� �迭�� ����
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = origin; // ���� ����: �ּҰ� ����
		
		int[] copy = new int[5];
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		System.out.println("---- copy ���� �� ----");
		System.out.println("== ���� �迭 ��� ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("");
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
	}
	
	public void method3() {
		// ���� �����ϴ� ���
		// 2. �ƿ� ���ο� �迭 ���� �� System Ŭ���������� arraycopy() �޼ҵ� �̿��� ����
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ����
		
		// System.arraycopy(���� �迭��, ��������� �ε���, ���纻 �迭��, ���纻�迭�� ����� ���� �ε���, ������ ����);
		
		System.arraycopy(origin, 0, copy, 2, 5); // origin�� 0�� �ε������� 5���� �ε����� copy�迭�� 2�� �ε��� ���� ������ ��
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " "); // ��°� : 0 0 1 2 3 4 5 0 0 0
		}
		System.out.println();
		System.out.println("origin �ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
	}
	
	public void method4() {
		// ���� �����ϴ� ���
		// 3. ���ο� �迭 ���� ���� ArraysŬ�������� �����ϴ� copyOf() �޼ҵ� ���.
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(���� �迭��, ������ ����);
		int[] copy = Arrays.copyOf(origin, 5);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin �ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
	}
	
	public void method5() {
		// ���� �����ϴ� ���
		// 4. clone() �޼ҵ� �̿��� ���� : �ε���, ũ�� ���� �Ұ�. ���� �Ȱ��� ������ �� �̿�.
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = �����迭.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin �ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
	}
}
