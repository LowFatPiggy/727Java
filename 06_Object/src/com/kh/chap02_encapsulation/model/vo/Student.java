package com.kh.chap02_encapsulation.model.vo; // vo = value object

public class Student {
	
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 *  * 메소드
	 *  <표현법>
	 *  접근제한자[예약어] 반환형 메소드명([매개 변수]) {
	 *  	// 기능 구현
	 *  }
	 */
	
	
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달받아 해당 필드에 대입시켜주는 기능
	
	/*
	public void setName(String newName) {
		// 매개 변수 : 해당 메소드 호출 시 전달값을 받아주기 위한 변수선언문 (이 메소드 내에서만 사용가능)
		name = newName;
	}
	*/
	
	public void setName(String name) {
		// 보통 필드명과 매개변수명을 똑같이 사용하는데 그렇게 하면
		// name = name; // 매개변수name = 매개변수name; 형식이 되어버림.
						// 왜? 필드명과 매개변수명이 동일한 시점에서 {} 내에 해당 변수명 제시시
						// 해당 영역에서 만들어진 변수가 우선순위가 높기 때문
		
		// 필드name = 매개변수name; 형식으로 보완하려면
		this.name = name; // this에는 해당 객체의 주소값이 담겨있음
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	
	// - getter 메소드 
	// 해당 필드에 담긴 값을 반환시켜는 역할을 수행 (setter 메소드 갯수와 똑같이 생성)
	
	public String getName() { // getter 메소드는 전달받을 것이 없기 때문에 괄호 안은 공란
		// void는 반환할 값이 없을 때만 사용
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	// 이 모든 것을 하나로 통합할 수 없는 이유 : return은 하나의 값만 반환 가능하기 때문

}
