package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class AbstractiocRun {

	public static void main(String[] args) {
		
		// 클래스(=틀) 만든 후 학생객체 만들어보기 ([캡슐화 과정이 없는] 불완전한 클래스)
		
		// 자바에서의 객체로 만들기 위해서 new라는 키워드를 통해 Heap영역에 먼저 생성 (공간 할당)
		Student shin = new Student(); // 객체 생성 구문
		// 여기까지 Heap 영역에 할당된 공간에는 JVM의 초기값들이 세팅
		
		// 각 영역에 "직접 접근"해서 내가 원하는 값 대입
		shin.name = "신짱구";
		shin.age = 5;
		shin.height = 105.9;
		
		System.out.println(shin); //출력값 : @6d06d69c
		System.out.println(shin.name); // 원하는 값이 담긴 해당 필드로 들어가야 원하는 값 출력
		System.out.println(shin.name + "님의 나이는 " + shin.age + "이고, 키는 " + shin.height + "cm입니다.");
		// 직접 접근을 통해 값을 가져옴
		
		
		// 맹구 학생 객체 만들기
		Student maeng = new Student();
		
		maeng.name = "맹구";
		maeng.age = 5;
		maeng.height = 115.9;
		
		System.out.println(maeng.name +"님의 나이는 " + maeng.age + "이고, 키는 " + maeng.height + "cm입니다.");
		
		
		/*
		 * 해당 필드를 public 접근제한자로 작성  => 직접 접근해서 값 대입, 가져오기가 가능 
		 * But, 외부에서 값 변질, 조회권한이 없는 사람이 값을 쉽게 가져갈 수 있는 문제 발생
		 * 		>> 캡슐화 작업(정보 은닉 기술) 필요
		 */
		
	}

}
