package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 기본 생성자
		User u1 = new User();
	
		System.out.println(u1.information());
		// 각 필드에 JVM의 초기값들 담겨있음
		
		User u2 = new User();
		
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("한유리");
		System.out.println(u2.information());
		
		
		// 매개변수 생성자
		// 매개변수 3개를 생성자로 객체 생성 후 정보 출력
		User u3 = new User("user03", "pass03", "김철수");
		
		System.out.println(u3.information());
		
		// 개명 후
		u3.setUserName("김짱구");
		System.out.println(u3.information());

	}

}
