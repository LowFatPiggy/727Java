package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException은 반드시 예외처리를 해야하는 예외
	 * => 조건문 미리 제시할 수 없음 ( 예측이 불가한 곳에서 문제가 발생하기 때문)
	 * => 외부 매개체와 입출력이 일어날 때 발생 (IOException) 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로 읽어들여짐)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력하세요 : ");
		
		
		/*
		// 1. try~catch문
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		*/
		
		
		// 2. throws : 예외처리 않고 이 메소드를 호출하는 곳으로 예외처리를 위임하겠다
		String str = br.readLine(); // 애초부터 readLine() 메소드에서 throws IOException하고 있었다
		System.out.println(str);
		
	}
	
	/*
	 *                           예외클래스                       예외발생시점                 예외처리
	 * UnCheckedException    RuntimeException      런타임에러                   필수x(if문or예외처리구문)
	 *   CheckedException   RuntimeException 외      컴파일에러(빨간줄)    필수o(무조건 예외처리구문)
	 */
}
