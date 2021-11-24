package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		
		Person mom = new Mother("봉미선", 53.5, 70, "출산");	
		Person baby = new Baby("신짱아", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		mom.eat(); // 몸무게+10 건강-10
		baby.eat(); // 몸무게+3 건강+1
		
		mom.sleep(); // 건강+20
		baby.sleep(); // 건강+3
		*/ //Person 클래스의 abstract eat, sleep 없앴기 때문에 주석처리
		
		System.out.println("----- 다음 날 -----");
		
		System.out.println(mom);
		System.out.println(baby);
		
		System.out.println("==== Basic 인터페이스 만든 후 적용 방법====");
		
		// Basic b = new Basic(); // 레퍼런스 사용 가능, 객체 생성은 x
		
		Basic mom1 = new Mother("봉미선", 53.5, 70, "출산"); // Basic 인터페이스 구현
		Basic baby1 = new Baby("신짱아", 3.5, 70); // 마찬가지
		
		System.out.println(mom1);
		System.out.println(baby1);
		
		mom1.eat(); // 몸무게+10 건강-10
		baby1.eat(); // 몸무게+3 건강+1
		
		mom1.sleep(); // 건강+20
		baby1.sleep(); // 건강+3
		
		System.out.println("----- 다음 날 -----");
		
		System.out.println(mom1);
		System.out.println(baby1);
		
		/*
		 * 클래스에서 클래스를 상속받을 때 : 클래스 extends 클래스 (단일상속만 가능)                    : 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때  : 클래스 implements 인터페이스, 인터페이스 , .. (다중상속 가능): 화살표 점선
		 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스, 인터페이스, .. (다중상속 가능)  : 화살표 실선
		 *
		 * extends 일반 클래스 --> extends 추상클래스 --> implements 인터페이스
		 * ------------------------------------------------------->
		 *					강제성이 더 짙어짐 (규약이 더 쎄짐)
		 *
		 */
	}

}
