package com.kh.chap02_String.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hello World";
		
		// �޼ҵ��(�Ű�����) : ��ȯ��
		
		
		// 1. ���ڿ�.charAt(int index) : char
		//	     ���ڿ����� ���޹��� index��ġ�� ���ڸ��� �����ؼ� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. ���ڿ�.concat(String str) : String
		//    ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ���ο� ���ڿ��� ����
		String str2 = str1.concat("!!!"); // str1 �ڿ� !!!�� ������
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// str2�� str3�� ��� ���ڿ��� ��ġ�ϳ� ���� ����ִ� �ּҰ��� �ٸ�
		System.out.println("str2�� str3�� �ּҰ� ��ġ : " + (str2 == str3));
		
		
		// 3. ���ڿ�.equals(Object obj) : boolean
		//    ���ڿ����� ������ ����� 
		System.out.println("str2�� str3�� ���ڿ� ��ġ : " + str2.equals(str3));
		
		
		// 4. ���ڿ�.contains(CharSequence s) : boolean
		//    Ư�� ���ڿ��� ���� �Ǿ��ִ��� ex)Ű���� �˻�
		System.out.println("str1�� World���ڿ��� ���ԵǾ��ִ°�? : " + str1.contains("World"));
		System.out.println("str1�� hell���ڿ��� ���ԵǾ��ִ°�? : " + str1.contains("hell"));
		
		
		// 5. ���ڿ�.length() : int
		//    ���ڿ��� �� ������
		System.out.println("str1�� ���� : " + str1.length()); // ���� ���� 11��
		
		
		// 6. ���ڿ�.substring(int beginIndex) : String
		//    ���ڿ��� beginIndex��ġ���� ���ڿ� �����ؼ� ����    
		System.out.println(str1.substring(2));
		//    ���ڿ�.substring(int beginIndex, int endIndex) : String => begin~end-1 ��ġ���� ����
		System.out.println(str1.substring(0, 5)); // 0~4��ġ���� �����ؼ� ����
		
		
		// 7. ���ڿ�.replace(char oldChar, char newChar) : String
		//    ���ڿ������� oldChar�� newChar�� ��ȯ�� ���ڿ��� ����
		String str4 = str1.replace('l', 'i'); // l���� i�� �ٲ� ���ڿ� ����
		System.out.println("replace : " + str4); // Heiio Worid
		System.out.println(str1); // str1�� ���� �״��.
		
		
		// 8. ���ڿ�.toUpperCase() : String => �ش� ���ڿ��� ��� '�빮��'�� ���� �� ����
		//    ���ڿ�.toLowercase() : String => �ش� ���ڿ��� ��� '�ҹ���'�� ���� �� ����
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
		
		/*
		 * System.out.print("��� �Ͻðڽ��ϱ� (y/n) : ");
		 * char ch = sc.nextLine().charAt(0);
		 * 
		 * if(ch == 'n' || ch == 'N'){
		 *   // break;
		 * }
		 * 
		 * ----- �ҹ���,�빮�� �������� �޾Ƶ��̴� �� -----
		 * 
		 * char ch = sc.nextLine().toUpperCase().charAt(0);
		 * char ch = sc.nextLine().toLowerCase().charAt(0);
		 * 			// �޼ҵ� ���̾ ȣ�� => �޼ҵ� ü�̴�
		 */
		
		
		// 9. ���ڿ�.trim() : String
		//    ���ڿ��� �� �� ������ ���Ž�Ų ���ڿ� ����
		String str6 = "   H  i   ";
		System.out.println("trim : " + str6.trim());
		
		
		// 10. ���ڿ�.toCharArray() : char[]
		//     ���ڿ��� ���ڵ��� �� �迭�� �־� ����
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]); // 0�� �ε��� ��ġ : H
		
		
		// 11. static valueOf(char[] data) : String
		//     ������ �ε����� �ִ� �迭���� ���ļ� ���ڿ��� ��ȯ
		System.out.println("valueOf(char[] data) : " + String.valueOf(arr));
	}
	
	

}
