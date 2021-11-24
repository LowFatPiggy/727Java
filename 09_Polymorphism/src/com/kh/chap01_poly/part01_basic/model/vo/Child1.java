package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{
	
	private int z;
	
	public Child1() {
		// super(); 생략되어있지만 JVM이 부모 클래스를 호출해줌. 
	}
	
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("i'm first child");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫번째 자식");
	}
}
