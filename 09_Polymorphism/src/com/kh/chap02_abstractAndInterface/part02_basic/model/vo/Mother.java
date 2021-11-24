package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic {
	
	private String babyBirth;
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public String toString() {
		return "Mother : " + super.toString() + ", " + babyBirth;
	}

	@Override
	public void eat() {
		// 밥 먹으면 몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		// getWeight() 현재 몸무게 호출 => +10 => setWeight에 세팅
		
		//건강도 10 감소
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 20 증가
		super.setHealth(super.getHealth() + 20);
		
	}

}
