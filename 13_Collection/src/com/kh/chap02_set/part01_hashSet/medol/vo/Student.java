package com.kh.chap02_set.part01_hashSet.medol.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ����ü�� �񱳴��ü�� �ּҰ��� ��ġ�� ���(=���� ���� ������ ��� == �ʵ尪��ġ)
			return true; // �� �ʵ�� ������ ���� �ʿ���� true ��ȯ
		if (obj == null) // �񱳴���� null(����x)�� ���
			return false; // ���� ��ġ�� ���� false ��ȯ
		if (/*this*/getClass() != obj.getClass()) // ����ü�� �񱳴��ü�� �� Ŭ����Ÿ���� �ٸ����
			return false; // ���� ��ġ�� ���� false ��ȯ
		// �� ��ü �� �ٸ���, �񱳴��ü null�� �ƴϰ�(�������� ��ü), �� ��ü�� Ŭ����Ÿ���� ��ġ�� ��� 
		// => ���������� �Ʒ� �ڵ�ó�� '�ʵ尪 ��' ����
		
		Student other = (Student) obj;
		if (age != other.age) // age�ʵ� ��
			return false;
		if (name == null) { // ����ü name�ʵ尡 null�� ���
			if (other.name != null) // �񱳴�� name�ʵ尡 null�� �ƴ� ��� false ��ȯ
				return false; 
		} else if (!name.equals(other.name)) // ����ü name�ʵ尡 null�� �ƴϸ鼭 �� ���ڿ��� ���޹��� name�ʵ幮�ڿ��� ��ġ���� ���� ���
			return false;
		
		if (score != other.score) // ������ score�ʵ�� ���޹��� score�ʵ尡 �ٸ� ��� false ��ȯ
			return false;
		return true;
	}
	
	// Student��ü.equals(Student��ü) �������� ȣ��
	/*
	@Override
	public boolean equals(Object obj) { // �ּҰ� �񱳰� �ƴ϶� ���簴ü�� ���޹��� ��ü�� �� �ʵ尪�� ���ؼ� true/false��ȯ
		
		//     this(����ü)    vs    obj(���޹��� ��ü)
		//     StudentŸ��                            ObjectŸ��
		
		Student other = (Student)obj;
		
		//  this.name�� other.name�� ��ġ�ϴ���
		//  this.age �� other.age�� ��ġ�ϴ���
		//  this.score�� other.score�� ��ġ�ϴ���
		
		if(name.equals(other.name) && age == other && score == other.score) {
			return true;
		} else {
			return false;
		}
		*/
	
	// Student��ü.equals(Student��ü) �������� ȣ�� (���ܹ�� Alt+Shift+S)
	

}
