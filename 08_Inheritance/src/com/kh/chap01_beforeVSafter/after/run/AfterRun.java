package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이
		 * 	(프로그램 생산성과 유지보수)
		 */
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInone
		Desktop d = new Desktop("SAMSUNG", "d-01", "S북", 1500000, true);
		
		
		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "tv-01", "LG티비", 3000000, 65);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("APPLE", "sp-01", "아이폰", 1200000, "KT");
		
		
		// 오버라이딩 출력
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1200000); // Product 클래스(부모)에서 메소드 호출
		s.setMobileAgency("SKT"); // SmartPhone 클래스(자식)에서 호출
		System.out.println(s.information());
		
		/*
		 * * 상속의 특징
		 * - 자식 객체를 가지고 부모 클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * - 부모클래스에 있는 메소드를 오버라이딩을 통해 자식클래에서 재정의 가능
		 * 	=> 오버라이딩을 하는 순간 자식클래스에 있는 메소드 우선권을 가짐
		 * - 클래스간의 상속은 다중 상속이 불가능 (단일 상속만 가능)
		 */

	}

}
