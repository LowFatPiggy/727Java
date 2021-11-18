package com.kh.chap05_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 *  * 생성자
	 *  public 클래스명([매개변수, 매개변수, ..) {
	 *  
	 *  }
	 *  
	 *  * 생성자를 사용하는 목적
	 *  1. 객체를 생성하기 위해
	 *  2. 객체 생성과 동시에 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적(매개변수 생성자)
	 *  
	 *  * 생성자 작성 시 주의사항
	 *  1. 반드시 생성자명은 클래스명과 동일해야함 (대/소문자 구분)
	 *  2. 반환형이 존재하지 않음 (만일 반환형을 쓰게 되면 메소드로 인식하게 됨)
	 *  3. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않음
	 *  	=> 어찌됐던 간에 기본생성자는 항상 작성하는 습관을 들이기로
	 */
	
	public User() {
		// 기본 생성자 (매개변수가 없는 생성자)
		// 단지 객체 생성만 해줌
		System.out.println("매개변수가 없을 때는 어떻게 실행될까요?");
		// 기본 생성자를 생략했을 경우 => JVM이 자동으로 만들어주기 때문에 항상 객체 생성 가능
	}
	
	// User u3를 받기위한 매개변수 생성자
	// 매개변수 생성자 : 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		this(userId, userPwd, userName);
		/*
		 * 위와 같이 중복되는 동일한 초기화할 내용의 생성자가 이미 존재할 경우
		 * this() 생성자 활용가능
		 * => 같은 클래스 내에 생성자에서 또 다른 생성자 호출하고자 할 때 사용됨
		 * **유의사항 : 반드시 첫줄에 작성해야됨
		 */
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "Id : " + userId + ", Pwd : " + userPwd + ", Name : " + userName + 
				", Age : " + age + ", Gender : " + gender;
	}
}
