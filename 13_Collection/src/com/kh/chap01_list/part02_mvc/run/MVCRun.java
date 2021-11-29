package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		/*
		 * MVC���� : �� Ŭ�������� ����(������, ȭ��, ��ûó��)�� �ο��ؼ� �۾�
		 *         => �������� ����
		 *         
		 * M(Model) : �����͸� ��� (������ ����, ����Ͻ� ���� ó��, ������ �����԰� �����Ͽ� ������ϴ� Ŭ����)
		 * V(View) : ȭ���� ���, ����ڿ��� �������� �ð����� ���(��¹�(print��), �Է¹�(Scanner))
		 * C(Controller) : ����ڰ� ��û�� ������ ó���� �� �� ����� ���� (��¹� ���x)
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
	}
	

}
