package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "홍성대", 16000);
		Book bk2 = new Book("그러라 그래", "양희은", 14500);
		
		System.out.println(bk1.toString());
		System.out.println(bk2/*.toString()*/);

		// 레퍼런스를 출력하고자 할 때 .toString()을 굳이 작성하지 않아도 JVM이 알아서 호출
		// Object 클래스의 toString() 실행 => 풀클래스명 + @ + 객체의 해쉬코드의 16진수값 리턴
		
		// 이때, Book클래스에 Object의 toString을 출력메소드로 오버라이딩
	}

}
