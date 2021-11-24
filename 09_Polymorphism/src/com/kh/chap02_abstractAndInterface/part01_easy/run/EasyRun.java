package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		
		// 추상클래스로 객체 생성 불가 (미완성된 클래스라서)
		// Sports s = new Sports();
		// Sports s; // 객체 생성은 불가하고 레퍼런스로는 사용 가능
		Sports s = new BasketBall(); // 다형성 적용시켜서 부모타입으로 자식객체를 받아주는 형태는 가능
		// 레퍼런스 : 일반 변수 이외에 자료형을 레퍼런스라하고 주소값을 가진 참조자료형.
		
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule(); // 오버라이딩 된 메소드 실행
		}
		
		System.out.println("--동일한 결과출력을 다른 방법으로--");
		
		for(Sports a : arr) { // 실행: 변수 = arr[0] => 변수 = arr[1] 반복 실행 
			// 변수는 arr과 동일한 변수를 사용해야 함.
			a.rule();
		}
		/*
		 * 동적바인딩 : 컴파일시점에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클레스에 있는 메소드를 가리켜.
		 * 			런타임시점에는 동적바인딩으로 각각의 자식클래스에 오버라이딩 된 메소드가 있을 경우 해당 메소드 실행.
		 */
		
		/*
		 * 추상 메소드 : 미완성된 메소드로 몸통부({})가 구현되어있지 않은 메소드
		 * 추상 클래스 : 미완성된 클래스로 추상메소드를 작성하면 반드시 해당클래스도 추상클래스로 명시. 
		 * 			- 객체 생성 불가 (단, 레퍼런스 변수로는 선언 가능)
		 * 			추상메소드 없어도 추상클래스로 선언 가능. 언제 사용?
		 * 			> 개념적 시각 : 해당 클래스가 미완성된 클래스라는 것을 부여할 목적
		 * 			> 프로그래밍 시각 : 객체 생성을 불가하도록 하게끔
		 * 
		 * 추상 메소드가 존재하는 추상 클래스를 사용하는 이유
		 * : 부모 클래스에 추상메소드가 존재할 경우 => 자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 된다.
		 * 	  각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때 사용.
		 * 	=> 메소드 통일성 확보 목적, 표준화된 틀을 제공할 목적 
		 * 
		 */
	}

}
