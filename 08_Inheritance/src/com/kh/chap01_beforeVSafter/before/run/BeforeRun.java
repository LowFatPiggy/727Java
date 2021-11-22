package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		// Desktop 객체 생성
		
		Desktop d = new Desktop("삼성", "dt-01", "S북", 1500000, true);
		
		
		// Tv 객체 생성
		
		Tv t = new Tv("엘지", "tv-01", "엘지티비", 3000000, 65);
		
		// SmartPhone 객체 생성
		
		SmartPhone s = new SmartPhone("애플", "sp-01", "아이폰", 1200000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * 세 클래스에 공통적인 필드와 메소드들이 존재.
		 * 이런 중복된 코드들을 부모클래스에 따로 한번만 정의해두면 중복된 코드들을 줄일 수 있다.
		 * => 수정과 같은 유지보수 요청이 들어왔을 때 일일히 찾아서 수정할 필요 없이
		 * 	    한번만 정의해 둔 부모클래스만 수정하면 전체적으로 반영.
		 * 
		 * 세 클레스가 공통적으로 가지고 있는 것
		 * => brand, pCode, pName, price 필드들, setter/getter메소드, information 메소드
		 * ==> product 클래스 미리 정의해볼 것!
		 */
		
	}

}
