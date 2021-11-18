package com.kh.chap03_class.model.vo;

public class Product {
	
	// Ŭ���� ���� ������ �ۼ������� ���������� (public, default)
	// default�� ����Ϸ��� �ۼ��� �ƴ϶� �� �κ��� ���ָ� �� ex) class Product
	// default��� ���������ڴ� ���� ��Ű�������� ����� ����. �ٸ� ��Ű������ ���Ұ���.
	
	
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
	
	
	// ----- �Ű����� ������ ����غ��� -----
	
	public Product() {
		
	} // �⺻ �����ڴ� ����Ƶ� �� �ۼ��ϱ�
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	

}
