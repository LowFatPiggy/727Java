package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {
	
	// �߻�Ŭ����(abstract class) : �Ϲ��ʵ� + �Ϲݸ޼ҵ� + �߻�޼ҵ�
	// �������̽�(interface)      : ����ʵ� + �߻�޼ҵ�
	
	// private int a; // �������̽������� �ʵ�� ������ ����ʵ�
	
	/*public static final*/ int SANGSU = 10; // public static final ��������. ������ ����ʵ�� �޾Ƶ���.
	
	//�������̽������� �޼ҵ�� ������ �߻�޼ҵ�
	public abstract void eat();
	/*public abstract*/ void sleep(); // ��������. ������ �߻�޼ҵ�� �޾Ƶ���.

}
