package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리 시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		//		 String클래스에 제공하는 split 메소드 이용
		//		  문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
		// 다른 간단한 방법
		for(String s : arr) { // arr 각각 인덱스를 s에 담을거다
			System.out.println(s);
		}
		
		// 'n번째 인덱스'도 추가하고싶다면
		int i = 0;
		for(String s : arr) {
			System.out.println(i++ + "번째 인덱스 : " + s); // 후위 연산자 사용
		}
		
		
		// 방법2. 분리된 문자열들을 각각 토큰으로 관리하고자 할 때
		//		 java.util.StringTokenizer
		//		 StringTokenizer stn = new StringTokenizer(분리시키고자하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countToken()); // 0
		
		// System.out.println(stn.nextToken()); // NoSuchElementException 발생 (더 이상의 요소가 없습니다)
		// 토큰은 일회성이라 한번 쓰이면 끝남
		*/
		
		
		/* 잘못된 방법
		for(int j=0; j<stn.countTokens(); j++) {
			System.out.println(stn.nextToken());
		} 
		// ** Java, Oracle, JDBC 출력이 세개만 되는 이유?
		// j=0 j<6 true => 출력("Java")   j++
		// j=1 j<5 true => 출력("Oracle") j++
		// j=2 j<4 ture => 출력("JDBE")   j++
		// j=e j<3 false => 반복문 빠져나옴
		// ** j<6이 고정되지 않은 이유 : 출력될 때마다 토큰수가 줄어듦
		*/
		
		
		/*
		// 해결방법 1.
		int count = stn.countTokens(); // count = 6;
		
		for(int j=0; j<count; j++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		
		// 해결방법 2.
		while(stn.hasMoreTokens()) { //반복이 수행 될 조건 (토큰이 남아있냐? true=>수행)
			System.out.println(stn.nextToken());
		} // 토큰이 남아있냐? false=>break;
		
	}

}
