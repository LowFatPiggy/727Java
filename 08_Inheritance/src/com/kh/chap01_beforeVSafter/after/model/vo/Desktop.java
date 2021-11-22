package com.kh.chap01_beforeVSafter.after.model.vo;

		//   자식클래스  ------> 부모클래스
		//	  this			  super
public class Desktop extends Product{
	
	private boolean allInone; // product에 없는 변수만 생성
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		// brand~price 네 개의 값들은 부모클래스(Product)의 필드로부터 대입
		// super. 으로 부모에 접근 가능 (단, private는 접근 불가)
		// super.brand = brand; // private라 접근 불가
		// 해결방법 1. 부모클래스에 있는 필드를 protected 접근제한자로 수정
		
		// 해결방법 2. 부모클래스에 있는 setter메소드를 활용 (public이기 때문에 접근 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법 3. 부모 생성자 호출하기
		super(brand, pCode, pName, price); // 부모클래스에 호출하는 방법 super();
										   // public Product 매개변수와 연결
		
		this.allInone = allInone; // 이 변수는 자식클래스에 있기 때문에 this.
	}
	
	public boolean isAllInone() {
		return allInone;
	}
	
	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는 것. (≠오버로딩)
	public String information() {
		return super.information() + ", " + allInone;
	}

}
