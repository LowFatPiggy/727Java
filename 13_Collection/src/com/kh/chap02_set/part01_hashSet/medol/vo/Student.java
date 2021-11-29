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
		if (this == obj) // 현객체와 비교대상객체의 주소값이 일치할 경우(=같은 곳을 참조할 경우 == 필드값일치)
			return true; // 각 필드들 일일히 비교할 필요없이 true 반환
		if (obj == null) // 비교대상이 null(생성x)일 경우
			return false; // 비교할 가치도 없이 false 반환
		if (/*this*/getClass() != obj.getClass()) // 현객체와 비교대상객체의 각 클래스타입이 다를경우
			return false; // 비교할 가치도 없이 false 반환
		// 각 객체 값 다르고, 비교대상객체 null이 아니고(정상적인 객체), 두 객체의 클래스타입이 일치할 경우 
		// => 본격적으로 아래 코드처럼 '필드값 비교' 시작
		
		Student other = (Student) obj;
		if (age != other.age) // age필드 비교
			return false;
		if (name == null) { // 현객체 name필드가 null일 경우
			if (other.name != null) // 비교대상 name필드가 null이 아닐 경우 false 반환
				return false; 
		} else if (!name.equals(other.name)) // 현객체 name필드가 null이 아니면서 그 문자열과 전달받은 name필드문자열이 일치하지 않은 경우
			return false;
		
		if (score != other.score) // 나머지 score필드와 전달받은 score필드가 다를 경우 false 반환
			return false;
		return true;
	}
	
	// Student객체.equals(Student객체) 형식으로 호출
	/*
	@Override
	public boolean equals(Object obj) { // 주소값 비교가 아니라 현재객체와 전달받은 객체의 각 필드값을 비교해서 true/false반환
		
		//     this(현객체)    vs    obj(전달받은 객체)
		//     Student타입                            Object타입
		
		Student other = (Student)obj;
		
		//  this.name과 other.name과 일치하는지
		//  this.age 와 other.age가 일치하는지
		//  this.score과 other.score이 일치하는지
		
		if(name.equals(other.name) && age == other && score == other.score) {
			return true;
		} else {
			return false;
		}
		*/
	
	// Student객체.equals(Student객체) 형식으로 호출 (간단방법 Alt+Shift+S)
	

}
