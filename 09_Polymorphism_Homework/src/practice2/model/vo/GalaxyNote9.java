package practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		
	}
	
	public void makeaCall() {
		System.out.println("��ȣ �Է� �� ��ȭ��ư");
	}
	
	public void takeaCall() {
		System.out.println("���� ��ư");
	}
	
	public void picture() {
		System.out.println("1200�� ���");
	}
	
	public void charge() {
		System.out.println("��� [����] ����");
	}
	
	public void touch() {
		System.out.println("������, ������ ����");
	}
	@Override
	public void printMaker() {
		System.out.println("SAMSUNG");
	}

}
