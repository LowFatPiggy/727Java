package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public String toString() {
		return "people : " + people;
	}
	
	// 추상메소드 (미완성된 메소드) 만들기
	public abstract void rule(); // 예약어 : abstract

}
