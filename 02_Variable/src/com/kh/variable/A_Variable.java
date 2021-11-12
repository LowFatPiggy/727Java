package com.kh.variable;

public class A_Variable {
	
	// �ñް� �ٹ��ð��� �ٹ��ϼ��� ���� ������ ����ϴ� �޼ҵ�
	
	public void printVariable() {
		
		System.out.println("----- ���� ��� �� -----");
		
		System.out.println("�ñ� : 12000��");
		System.out.println("�ٹ��ð� : 6�ð� ");
		System.out.println("�ٹ��ϼ� : 8��");
		
		// ���� = �ñ� X �ٹ��ð� X �ٹ��ϼ�
		// �̸� : ����+�� �������� ���
		System.out.println("¯�� : " + (9450 * 6 * 8) + "��");
		System.out.println("�ͱ� : " + (9450 * 6 * 8) + "��");
		System.out.println("ö�� : " + (9450 * 6 * 8) + "��");
		System.out.println("���� : " + (9450 * 6 * 8) + "��");
		System.out.println("���� : " + (94500 * 6 * 8) + "��");
		
		
		
		System.out.println("----- ���� ��� ��-----");
		
		int pay = 15000; // �ڹٿ��� '='��ȣ�� '�����ϴ�'�� �ƴ� 15000�̶�� ���� pay��� ������ '����'
		int time = 6;
		int day = 8;
		
		System.out.println("¯�� : " + pay * time * day + "��");
		System.out.println("�ͱ� : " + pay * time * day + "��");
		System.out.println("ö�� : " + pay * time * day + "��");
		System.out.println("���� : " + pay * time * day + "��");
		System.out.println("���� : " + pay * time * day + "��");
		
		/*
		 * ������ ����ϴ� ����
		 * 1. ������ �켱������ ���� �ǹ̸� �ο��� �������� ����. (�������� ��������)
		 * 2. �� �ѹ� ���� ����ϰ� �ʿ��� ������ ������ ���� �������� ����. (���뼺�� ��������)
		 * 3. ���������� ���� ������ �� �ִ�.
		 */
		
		
	}
	
	
	public void declareVariable() {
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ��, �Ҵ��Ѵ�.
		 * 
		 * [ǥ����]
		 * 
		 * �ڷ��� : ������ ũ�� �� ����� �������ִ� �κ�
		 * �����̸� : ������ �̸��� �ٿ��ִ� �κ� (�ǹ̺ο�)
		 * 
		 * ���� ���� �� ������ ��
		 * 1. �����̸��� �ҹ��ڷ� ���� / ��, ��Ÿ�� ǥ����� ��ų �� / ������ �Ұ�
		 * 2. ���� ���� �� ({}) ������ ������ ���������� ���� �Ұ� => ��, �ߺ��� �Ұ���
		 * 3. �ش� ���� �� ({}) ���� ����� ������ �� ���� �ȿ����� ��� ����
		 *  => �ٸ� �޼ҵ忡���� ����� �Ұ��ϴ�
		 */
		
		
		// ----- �ڷ����� ���� ���� -----
		// 1. ���� (���� = true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte , ��������� ���ÿ� ���� ����(=), �� ����
		System.out.println("isFalse ���ο� ���� ���� �� : " + isFalse);
		
		isTrue = true; // 3 + 1 > 1 => 4�� 1���� Ů�ϱ�? �� (true)
		isFalse = false; // 4 + 2 < 1 => 6�� 1���� Ů�ϱ�? ���� (false)
		
		// 2. ������
		// 2_1. ������ (�Ҽ���X)
		byte bNum; // 1byte (-128 ~ 127)
		bNum = -128;
		
		short sNum = 1000; // 2byte 
		
		int iNum = 10000; // 4byte, �������� �⺻ �ڷ���
		
		long lNum = 100000; // 8byte
		
		// 2_2. �Ǽ��� (�Ҽ���O)
		float fNum = 0.0f; // 4byte => �Ҽ��� 7�ڸ����� ǥ�� ����
						   // float�� ��� double�� ���� �����ϱ� ���� �� �ڿ� f�� �ٿ��ش�.
		
		double dNum = 0; // 8byte => �Ҽ��� 15�ڸ����� ǥ�� ����, �Ǽ����� �⺻ �ڷ���
		
		// 3. ������
		// 3_1. ����
		char ch = 'a'; // 2byte
		char kim = '��';
		
		// 3_2. ���ڿ�
		String str; // �����ڷ���
		str = "abc";
		
		// ����ִ� �� Ȯ��
		System.out.println(isTrue);
		System.out.println("isFalse�� ���ο� ���� ���� �� : " + isFalse);
		System.out.println(bNum);
		// System.out.println(-128);
		
		
		// �����̸� : ���� ���·� ���
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("char ch : " + ch);
		System.out.println("char kim : " + kim);
		System.out.println("str : " + str);
		
		// ����� ����
		// [ǥ����] final �ڷ��� ����̸�;
		final int AGE; // ��� �̸��� ��� �빮�ڷ� �ۼ�
		AGE = 10; // �ʱ�ȭ
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 11; ����� ���� ������ �Ұ�
		
		System.out.println("AGE : " + AGE);
		
		// ��ǥ���� ����� �� : 3.14 (����, ������)
		System.out.println("���� : " + Math.PI);
		
		// ���� (�������� ���� '_' ��� ����)
		int etc = 999_999_999; // ���ڸ����� ����ٸ� �̿��� �� ����. ����ٴ� ��¾ȵ�
		
		System.out.println("etc : " + etc);
		
		// * ��������Ģ
		int number;
		
		// 1) ���� �������� �ߺ��� �̸� �ۼ��Ұ�
		// int number;
		// ��ҹ��ڴ� ����
		int numBer;
		
		// 2) ����� (�̹� �ڹٿ��� ���ǰ� �ִ� Ű����) ���x
		// int true, abstract, class, static, public ���
		
		// 3) ���� ��밡�� �ϳ� (��, ���ڷ� �����ϴ� �� �� ��)
		int number1, num1ber;
		// int 1number; 
		
		// 4) Ư������ ��밡�� �ϳ� ( ��, _ $ ���� Ư�����ڴ� �Ұ���)
		int number_1, _number, number$1;
		
		// �������: ������ ������ �����ڰ��� ��Ģ(�ų�)
		// 1) ��Ÿǥ��� (�ι�° �ܾ���� ù���ڸ� �빮�ڷ� �ۼ�)
		String username; // ���ʻ� Ʋ��
		String userName; // ���ʻ� �´� ǥ��
		String userNameTest;
		
		// 2) �ѱ� ��밡���ϳ� ������ ��������
		int ����; // �ѱ��� ������� �ʴ� ȯ�濡�� ���� �߻�
		int userAge;
		
		
	}
	
	/*
	 * ** ���� **
	 * - ��(���ͷ�) : ���α׷��� �ʿ��� ������� ��
	 * 			        �Ǵ� ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
	 * - ���� : ���� �����ϱ� ���� ���� (�޸𸮿� ���� ����ϱ� ���� ����) 
	 */
	

}