package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// ���� : �� ������ �� ���� ���� �� ����
	// �迭 : �� ������ ���� ���� ���� �� �ִ� ����
	//		"���� �ڷ����� ��"���θ� ���� �� ����
	//		�迭�� �� �ε��� �ڸ��� ���� ���� ��� (�ε����� 0���� ����)
	
	/*
	 * *�迭 ���� (���� ���� ������ ������ �迭�� ����ڴ�)
	 * 	�ڷ��� �迭��[];
	 * 	�ڷ���[] �迭��;
	 * 
	 * *�迭 �Ҵ�
	 * 	�迭�� = new �ڷ���[�迭ũ��];
	 * 
	 *  �ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	 *  �ڷ���[] �迭�� = new �ڷ��� [�迭ũ��];
	 *  ex) int[] arr = new int[5]; // int���� ���� �� �ִ� 5ĭ ���� �������.
	 *  
	 * *�� ����
	 * 	�迭��[�ε���] = ��;		ex) arr[0] = 1; 	
	 *  
	 */
	
	public void method1() {
		
		int[] arr = new int[5]; 
		
		/* �迭 �ʱ�ȭ ���1) �ε����� �̿��� �ʱ�ȭ
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// �迭 �ʱ�ȭ ���2) for��
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		// �迭�� ��� ������ ���
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // [I@6d06d69c �� ���. '�ּҰ�'�� ��µ� ��.
	}
	
	public void method2() {
		
		int i = 10;
		int[] iArr = new int[5];
		
		System.out.println(iArr); // [I@6d06d69c [I�� �ڷ���. @�ڿ��� �ּҰ�
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * �⺻�ڷ��� (boolbea, char, byte, short, int, long, float, double) ���� ����� ����
		 * => ���� ���ͷ����� �ٷ� ��� ���� = �׳� '�Ϲ� ����'�� �Ҹ�
		 * 
		 * �� �� �ڷ��� (int[], double[], char[], short[], .. , String, Scanner, ..) ����� ����
		 * => �ּҰ��� ��� ���� = ���� ����(���۷��� ����)�� �Ҹ�
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2�� �ε���
		double[] dArr = new double[4]; // 0~3�� �ε���
		
		// ����'��' �� ������ iArr�迭 ���
		for(int i=0; i<=2; i++) {
			System.out.println(iArr[i]); //��� : 0 0 0
		}
		
		// ����'��' �� ������ dArr�迭 ���
		for(int i=0; i<=3; i++) {
			System.out.println(dArr[i]); //��� :0.0 0.0 0.0 0.0
		}
		
		// �ʱⰪ�� 0���� �Ǿ�����. Heap�̶� ������ ���� ������� ����x
		// => ���� ������ ������� �� JVM�� �⺻�����ζ� �ʱ�ȭ(����)�� ����.
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		System.out.println(arr); // [+�迭�ڷ���+@+�ּҰ���16��������
		System.out.println(arr.hashCode()); // hashcode() �޼ҵ�: �ּҰ��� 10��������
		System.out.println("�迭�� ���� : " + arr.length);
	}
	
	public void method5() {
		
		int result = 0;
		
		int[] arr = null; // null�ǹ� : �ƹ��͵� �����ϰ� ���� �ʴ�
		// �ּҰ��� ��� ������ �⺻���� null
		
		System.out.println(arr);
		
		// null������ �޼ҵ带 ȣ���Ѵٰų� Ư����򰡿� �����ϰ��� �Ѵٸ�
		// �׽� ���� �߻�!! => NullPointerException
		// System.out.println(arr.hashCode()); // �����߻�. null������ ȣ���Ϸ��ؼ�.
		// System.out.println(arr.length); // ���������� null������ �����Ϸ��߱� ������ ���� �߻�.
		
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		// int arr[i] = {2,4,6,8,10} ���
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2*(i+1);
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// �ι�° ���
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value +=2;
			System.out.println(arr[i]);
		}
		
		System.out.println("arr�� �ؽ��ڵ尪 : " + arr.hashCode());
		System.out.println("arr�� ���� : " + arr.length);
		
		/*
		 *  * �迭�� ���� ū ����
		 *    �ѹ� ������ �迭�� ũ��� ������ �Ұ� => �ٽ� ������ ��.
		 */
		
		arr = new int[7];
		
		System.out.println("���� ���� arr�� �ؽ��ڵ尪 : " + arr.hashCode());
		System.out.println("���� ���� arr ���� : " + arr.length);
		
		// �׷� ������ int[] arr = new int[5]; �� �迭�� ��� �Ǵ°�?
		// ������ ������ ���� �迭�� Heap ������ �ʿ���� ���簡 ��
		// => ���� �ð��� ������ "�������÷���(GC)"�� �˾Ƽ� ������
		// => �ڹٿ����� "�ڵ��޸� ����" Ư¡ == �����ڰ� �ڵ��ۼ����� �����ϵ���
		
		// �迭�� ������ ������Ű���� �Ѵٸ�? ==> ������� ������ �ȴ�.
		arr = null; // �ƹ��͵� �������� �ʰڴ�
		
		// null.xxxx() ==> nullpointerException ���� �߻�
	
	}
	
	public void method7() {
		
		// �迭 ����, �Ҵ�, �ʱ�ȭ ���ÿ� �ϱ�
		
		int[] arr1 = new int[] {1,2,3,4}; // ǥ����1
		int[] arr2 = {1,2,3,4}; // ǥ����2
		
		System.out.println(arr1 == arr2); // false. �ּҰ��� �ٸ���.
		
	}
	
	public void method8() {
		
		// �Ź� 1~100 ���̿� �߻��Ǵ� �������� ���Եǵ���
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1); // * 100���� + 1����
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void method9() {
		
		// �迭 ���� �Է¹��� �� �ش� �� ũ�⸸ŭ ���ڿ� �迭 ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ���� : ");
		int size = sc.nextInt();
		sc.nextLine(); // ���ۿ� \n�� ���� ����
		
		String[] fruit = new String[size];
		
		for(int i =0; i<fruit.length; i++) {
			System.out.print("���ϸ� : ");
			fruit[i] = sc.nextLine();
		}
		
		for(int i=0; i<fruit.length; i++) {
			System.out.printf("fruit[%d] : %s\n", i, fruit[i]);
		}
	}
	
	public void method10() {

		// ���ڿ� �Է¹��� ��, ������ �ε����� �ִ� ���ڵ��� char �迭�� �Űܴ��

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();

		char[] room = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			room[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			System.out.printf("room[%d] : %c\n", i, room[i]);
		}

		// �ݺ��� Ȱ���ؼ� �ش� �迭 �� ���ڸ� �Է��ϸ� ������ ã��.

		System.out.print("ã�� ���� �Է�: ");
		char ch = sc.nextLine().charAt(0);

		int count = 0; // ��ġ�ϴ� ���ڰ� ������ ��� �Ź� 1�� ����
		for (int i = 0; i < str.length(); i++) {
			if (ch == room[i]) {
				count++;
			}
		}

		System.out.println("ã���� ���� ���� : " + count);
	}
	
	public void method11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ���� : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("¦������ �� ��  : " + sum);
	}
	
	public void method12() {
		int[] ages = new int[5];
		
		ages[0] = 15;
		ages[1] = 23;
		ages[2] = 50;
		ages[3] = 34;
		ages[4] = 25;
		
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
			sum += ages[i]; //?
		}
		
	}

}

