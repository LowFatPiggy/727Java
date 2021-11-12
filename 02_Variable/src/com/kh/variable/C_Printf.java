package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		// System.out.printf("����ϰ��� �ϴ� ����(����), ����ϰ����ϴ°�, ��, ...");
		// ����ϰ��� �ϴ� ������ ������ ���Ŀ� ���缭 ��¸� ���� 
		
		/*
		 * ���� �ȿ��� ���� �� �ִ� Ű����
		 * %d : ����
		 * %c : ����
		 * %s : ���ڿ� (���ڵ� ����)
		 * %f : �Ǽ�
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20%"�� ����غ���
		System.out.println(iNum1 + " " + iNum2 + "%");
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println(); //printf�� �ٹٲ��� �ȵǱ� ������ �߰�
		
		// ������ ���Ľ�Ű�� ������ printf ���
		System.out.printf("%5d\n", iNum1); // 5ĭ�� ���� Ȯ�� �� ���������� (������ ��������)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2);
		System.out.printf("%.2f %.1f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s\n", ch, str, ch);
		
		System.out.printf("%C %S", ch, str); // �빮�ڷε� ��� ����
		
		
	}

}