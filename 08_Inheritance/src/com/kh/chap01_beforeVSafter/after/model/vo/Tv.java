package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {
	
	private int inch; // product에 없는 변수만 생성
	
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	// 오버라이딩
	public String information() {
		return super.information() + ", " + inch;
	}

}
