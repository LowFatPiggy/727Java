package com.kh.chap01_beforeVSafter.after.model.vo;

		//   �ڽ�Ŭ����  ------> �θ�Ŭ����
		//	  this			  super
public class Desktop extends Product{
	
	private boolean allInone; // product�� ���� ������ ����
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		// brand~price �� ���� ������ �θ�Ŭ����(Product)�� �ʵ�κ��� ����
		// super. ���� �θ� ���� ���� (��, private�� ���� �Ұ�)
		// super.brand = brand; // private�� ���� �Ұ�
		// �ذ��� 1. �θ�Ŭ������ �ִ� �ʵ带 protected ���������ڷ� ����
		
		// �ذ��� 2. �θ�Ŭ������ �ִ� setter�޼ҵ带 Ȱ�� (public�̱� ������ ���� ����)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ��� 3. �θ� ������ ȣ���ϱ�
		super(brand, pCode, pName, price); // �θ�Ŭ������ ȣ���ϴ� ��� super();
										   // public Product �Ű������� ����
		
		this.allInone = allInone; // �� ������ �ڽ�Ŭ������ �ֱ� ������ this.
	}
	
	public boolean isAllInone() {
		return allInone;
	}
	
	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	
	// �������̵� : �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ�Ŭ�������� �������ϴ� ��. (�������ε�)
	public String information() {
		return super.information() + ", " + allInone;
	}

}
