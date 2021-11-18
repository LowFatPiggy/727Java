package com.kh.chap02_encapsulation.model.vo; // vo = value object

public class Student {
	
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 *  * �޼ҵ�
	 *  <ǥ����>
	 *  ����������[�����] ��ȯ�� �޼ҵ��([�Ű� ����]) {
	 *  	// ��� ����
	 *  }
	 */
	
	
	
	// - setter �޼ҵ�
	// �ش� �ʵ忡 ���Խ�Ű���� �ϴ� �� ���޹޾� �ش� �ʵ忡 ���Խ����ִ� ���
	
	/*
	public void setName(String newName) {
		// �Ű� ���� : �ش� �޼ҵ� ȣ�� �� ���ް��� �޾��ֱ� ���� �������� (�� �޼ҵ� �������� ��밡��)
		name = newName;
	}
	*/
	
	public void setName(String name) {
		// ���� �ʵ��� �Ű��������� �Ȱ��� ����ϴµ� �׷��� �ϸ�
		// name = name; // �Ű�����name = �Ű�����name; ������ �Ǿ����.
						// ��? �ʵ��� �Ű��������� ������ �������� {} ���� �ش� ������ ���ý�
						// �ش� �������� ������� ������ �켱������ ���� ����
		
		// �ʵ�name = �Ű�����name; �������� �����Ϸ���
		this.name = name; // this���� �ش� ��ü�� �ּҰ��� �������
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
	
	// - getter �޼ҵ� 
	// �ش� �ʵ忡 ��� ���� ��ȯ���Ѵ� ������ ���� (setter �޼ҵ� ������ �Ȱ��� ����)
	
	public String getName() { // getter �޼ҵ�� ���޹��� ���� ���� ������ ��ȣ ���� ����
		// void�� ��ȯ�� ���� ���� ���� ���
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	// �� ��� ���� �ϳ��� ������ �� ���� ���� : return�� �ϳ��� ���� ��ȯ �����ϱ� ����

}
