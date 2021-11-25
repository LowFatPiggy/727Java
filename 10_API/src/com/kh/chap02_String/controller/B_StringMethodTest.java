package com.kh.chap02_String.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형
		
		
		// 1. 문자열.charAt(int index) : char
		//	     문자열에서 전달받은 index위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!"); // str1 뒤에 !!!가 합쳐짐
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// str2와 str3에 담긴 문자열은 일치하나 실제 담겨있는 주소값은 다름
		System.out.println("str2와 str3의 주소값 일치 : " + (str2 == str3));
		
		
		// 3. 문자열.equals(Object obj) : boolean
		//    문자열값을 가지고 동등비교 
		System.out.println("str2와 str3가 문자열 일치 : " + str2.equals(str3));
		
		
		// 4. 문자열.contains(CharSequence s) : boolean
		//    특정 문자열에 포함 되어있는지 ex)키워드 검색
		System.out.println("str1에 World문자열이 포함되어있는가? : " + str1.contains("World"));
		System.out.println("str1에 hell문자열이 포함되어있는가? : " + str1.contains("hell"));
		
		
		// 5. 문자열.length() : int
		//    문자열이 몇 자인지
		System.out.println("str1의 길이 : " + str1.length()); // 공백 포함 11개
		
		
		// 6. 문자열.substring(int beginIndex) : String
		//    문자열의 beginIndex위치부터 문자열 추출해서 리턴    
		System.out.println(str1.substring(2));
		//    문자열.substring(int beginIndex, int endIndex) : String => begin~end-1 위치까지 추출
		System.out.println(str1.substring(0, 5)); // 0~4위치까지 추출해서 리턴
		
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		//    문자열에서의 oldChar를 newChar로 변환한 문자열을 리턴
		String str4 = str1.replace('l', 'i'); // l들을 i로 바꾼 문자열 리턴
		System.out.println("replace : " + str4); // Heiio Worid
		System.out.println(str1); // str1은 기존 그대로.
		
		
		// 8. 문자열.toUpperCase() : String => 해당 문자열을 모두 '대문자'로 변경 후 리턴
		//    문자열.toLowercase() : String => 해당 문자열을 모두 '소문자'로 변경 후 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
		
		/*
		 * System.out.print("계속 하시겠습니까 (y/n) : ");
		 * char ch = sc.nextLine().charAt(0);
		 * 
		 * if(ch == 'n' || ch == 'N'){
		 *   // break;
		 * }
		 * 
		 * ----- 소문자,대문자 구별없이 받아들이는 법 -----
		 * 
		 * char ch = sc.nextLine().toUpperCase().charAt(0);
		 * char ch = sc.nextLine().toLowerCase().charAt(0);
		 * 			// 메소드 연이어서 호출 => 메소드 체이닝
		 */
		
		
		// 9. 문자열.trim() : String
		//    문자열의 앞 뒤 공백을 제거시킨 문자열 리턴
		String str6 = "   H  i   ";
		System.out.println("trim : " + str6.trim());
		
		
		// 10. 문자열.toCharArray() : char[]
		//     문자열의 문자들을 각 배열에 넣어 리턴
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]); // 0번 인덱스 위치 : H
		
		
		// 11. static valueOf(char[] data) : String
		//     각각의 인덱스에 있는 배열들을 합쳐서 문자열로 반환
		System.out.println("valueOf(char[] data) : " + String.valueOf(arr));
	}
	
	

}
