package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
	// 오브젝트 클래스엔 메소드만 있음. 
	// 오브젝트의 메소드 호출가능한 이유: 모든 클래스의 부모이기 때문
	
	private String title;
	private String author;
	private int price;
	
	public Book(){
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	/*
	 * * 오버라이딩
	 * - 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의하는 것
	 *   =>부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식객체를 통해 실행 시 자식메소드가 우선권을 가짐
	 * 
	 * * 오버라이딩 성립 조건
	 * - 부모 메소드명 동일
	 * - 매개변수 갯수, 자료형, 순서 동일 (매개변수명은 상관없음)
	 * - 부모메소드의 반환형 동일 (jdk 버전업글 되면서 부모메소드의 반환형의 자식 자료형들로는 가능)
	 * - 부모메소드의 접근제한자보다 범위가 같거나 커야한다.
	 * 	 ex) 부모 메소드의 접근제한자가 protected일 경우 
	 * 		  오버라이딩하는 메소드의 접근제한자는 protected, public으로 사용
	 *   
	 * * @Override 어노테이션
	 * - 생략 가능, 명시하지 않아도 오버라이딩 된 상태
	 * - 어노테이션 붙이는 이유
	 *   >> 부모 메소드명이나 매개변수가 수정 될 경우 => 찾아보기 쉽다
	 *      자식메소드 기술 시 오타가 있을 경우 => 찾아보기 쉽다
	 *   
	 */
	
	@Override
	public String toString() { // Object클래스의 toString메소드를 오버라이딩
		return title + ", " + author + ", " + price;
	}
	

}
