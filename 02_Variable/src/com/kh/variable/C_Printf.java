package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		// System.out.printf("출력하고자 하는 형식(포맷), 출력하고자하는값, 값, ...");
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 * %f : 실수
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20%"을 출력해보자
		System.out.println(iNum1 + " " + iNum2 + "%");
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println(); //printf는 줄바꿈이 안되기 때문에 추가
		
		// 오른쪽 정렬시키고 싶으면 printf 사용
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽정렬 (음수면 왼쪽정렬)
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
		
		System.out.printf("%C %S", ch, str); // 대문자로도 출력 가능
		
		
	}

}