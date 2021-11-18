package com.method.hw1.controller;

public class NonStaticSample {
	
	
	public void printLottoNumbers() {
		
		int[] num = new int[6];
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
			System.out.print(num[i] + " ");
			
		}
	}
	
	
	public void outputChar(int num, char c) {
		
		char[] room = new char[num];
		System.out.printf("2. %c문자 %d개 출력 : ", c, num);
		for(int i=0; i<num; i++) {
			room[i] = c;
			System.out.print(room[i] + " ");
		}
		
	}

	
	public char alphabette() {
		System.out.print("3. 랜덤 영문자 출력 : ");

		int num = 0;
		while (true) {
			num = (int) (Math.random() * 58 + 65);
			if (num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') {
				break;
			}
		}
		return (char) num;
	}
	

	
	public String mySubstring(String str, int index1, int index2) {
		
		/*
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		if(!str.equals("")) {
			char index1_1 = ch[index1-1];
			char index2_1 = ch[index2-1];
			System.out.printf("4. %s의 %d번 %d번 인덱스 사이의 값 출력 : %c%c", str, index1, index2, index1_1, index2_1);
		} 
		return null;
		*/ // null도 같이 계속 출력
		
		String result = "";
		System.out.printf("4. %s의 %d번 %d번 인덱스 사이의 값 출력 : %s",str, index1, index2, result);
		for(int i=index1; i<index2; i++) {
			result += str.charAt(i);
		}
		return result;
	}
}
