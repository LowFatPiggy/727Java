package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// �⺻ ������
		User u1 = new User();
	
		System.out.println(u1.information());
		// �� �ʵ忡 JVM�� �ʱⰪ�� �������
		
		User u2 = new User();
		
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("������");
		System.out.println(u2.information());
		
		
		// �Ű����� ������
		// �Ű����� 3���� �����ڷ� ��ü ���� �� ���� ���
		User u3 = new User("user03", "pass03", "��ö��");
		
		System.out.println(u3.information());
		
		// ���� ��
		u3.setUserName("��¯��");
		System.out.println(u3.information());

	}

}
