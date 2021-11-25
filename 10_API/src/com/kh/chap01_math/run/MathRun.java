package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {

		// ����ʵ�
		System.out.println("���� : " + Math.PI);
		
		// ���밪�� �˰��� �� ��
		int num = -10;
		System.out.println("���밪 : " + Math.abs(num));
		
		// �ø� : ceil
		double num2 = 4.1489;
		System.out.println("�ø� : " + Math.ceil(num2));
		
		// �ݿø� : round
		System.out.println("�ݿø� : " + Math.round(num2));
		
		// ���� : floor
		System.out.println("���� : " + Math.floor(num2));
		
		// ���� ����� ���� ���� �˾� �� �� �Ǽ������� ��ȯ : rint
		System.out.println("����� ������ �Ǽ������� ��ȯ : " + Math.rint(num2));
		
		// ������(��Ʈ) : sqrt
		int num3 = 9;
		System.out.printf("%d�� ������ : %s\n", num3, Math.sqrt(num3));
		
		// ���� : pow
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
		
		// Math m = new Math(); // private�� ȣ�� �ȵ�
		
		/*
		 * Math Ư¡
		 * ��� �ʵ� ����ʵ�, ��� static �޼ҵ�
		 * �����ڴ� private
		 * �̱��� ���� ���� (�޸� ������ �ѹ� �÷����� �������� �����ϴ� ����)
		 */
		
	}

}
