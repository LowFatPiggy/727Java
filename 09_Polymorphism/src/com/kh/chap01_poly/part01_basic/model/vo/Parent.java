package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
	
	private int x;
	private int y;
	
	public Parent() {
		// 기본 생성자 없으면 상속이 x
	}
	
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void printParent() {
		System.out.println("i'm parent");
	}
	
	public void print() {
		System.out.println("나 부모");
	}

}
