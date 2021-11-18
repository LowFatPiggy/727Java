package com.kh.chap03_class.model.vo;

public class Product {
	
	// 클래스 선언 구문에 작성가능한 접근제한자 (public, default)
	// default를 사용하려면 작성이 아니라 그 부분을 없애면 돼 ex) class Product
	// default라는 접근제한자는 같은 패키지에서만 사용이 가능. 다른 패키지에서 사용불가능.
	
	
	private String pName;
	private int price;
	private String brand;
	
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return "pName : " + pName + ", price : " + price + ", brand : " + brand;
	}
	
	
	// ----- 매개변수 생성자 사용해보기 -----
	
	public Product() {
		
	} // 기본 생성자는 어찌됐든 꼭 작성하기
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	

}
