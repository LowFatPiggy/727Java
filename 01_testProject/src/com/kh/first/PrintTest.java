package com.kh.first;

public class PrintTest {
	
	// ��¹� �ǽ�
	public static void main(String[] args) {
		
		System.out.println("println�� �ٹٲ�");
		
		System.out.print("print�� �ٹٲ�X"); // ���ڿ�(����)�� ���� �ֵ���ǥ�� ���´�
		
		System.out.print(12345); // ������ ���� �׳� �����ش�
		
		System.out.print('A' + "\n"); // ������ ���� Ȭ����ǥ�� ���´�
		
		// �ٹٲ��� �ϰ������ print���� ����ϴ� ��쿡��?
		System.out.print("�ٹٲ� �ϰ� ���� ����\n");
		System.out.print("���๮�ڸ� ����Ѵ�\n");
		
		// \n : ���๮��, �� �ٲ� �����ִ� ����, �� ���� Ű�� ���� �Ͱ� ����.
		// => ����+����, ����+���ڿ�, ����+���ڿ� �� ���� ���� �ٸ� ���¸� �ٿ��� ��Ÿ���ִ� ��ȣ�� +
		
		System.out.print("Hi\n"+"Everyone!!\n");
		System.out.println("\\n"); // \n ��ü�ε� ����� �ȴ�.
		
		// �������� �� ��ü������ ���ڷ� �ν��� ���� �ʱ� ������ ���ڷ� �ν��ϰ� ���� ��쿡�� �������ø� �ѹ� �� �ٿ��ش�
		System.out.println("\\���๮��"); // ���: \���๮��
	}

}
