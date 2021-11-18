package com.kh.chap05_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 *  * ������
	 *  public Ŭ������([�Ű�����, �Ű�����, ..) {
	 *  
	 *  }
	 *  
	 *  * �����ڸ� ����ϴ� ����
	 *  1. ��ü�� �����ϱ� ����
	 *  2. ��ü ������ ���ÿ� �Ű������� ���޹��� ������ �ʵ忡 �ٷ� �ʱ�ȭ�� ����(�Ű����� ������)
	 *  
	 *  * ������ �ۼ� �� ���ǻ���
	 *  1. �ݵ�� �����ڸ��� Ŭ������� �����ؾ��� (��/�ҹ��� ����)
	 *  2. ��ȯ���� �������� ���� (���� ��ȯ���� ���� �Ǹ� �޼ҵ�� �ν��ϰ� ��)
	 *  3. �Ű����� �����ڸ� ��������� �ۼ��ϰ� �Ǹ� �⺻�����ڸ� JVM�� �ڵ����� ��������� ����
	 *  	=> ����ƴ� ���� �⺻�����ڴ� �׻� �ۼ��ϴ� ������ ���̱��
	 */
	
	public User() {
		// �⺻ ������ (�Ű������� ���� ������)
		// ���� ��ü ������ ����
		System.out.println("�Ű������� ���� ���� ��� ����ɱ��?");
		// �⺻ �����ڸ� �������� ��� => JVM�� �ڵ����� ������ֱ� ������ �׻� ��ü ���� ����
	}
	
	// User u3�� �ޱ����� �Ű����� ������
	// �Ű����� ������ : ��ü ������ ���ÿ� ���ް����� �Ű������� �޾Ƽ� �ش� �� �ʵ忡 �ʱ�ȭ�� ����
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
		 * ���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ�� ������ �����ڰ� �̹� ������ ���
		 * this() ������ Ȱ�밡��
		 * => ���� Ŭ���� ���� �����ڿ��� �� �ٸ� ������ ȣ���ϰ��� �� �� ����
		 * **���ǻ��� : �ݵ�� ù�ٿ� �ۼ��ؾߵ�
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
