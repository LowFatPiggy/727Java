package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
	/*
	 * �÷���
	 * : �ڷ� ���� ������ ����Ǿ��ִ� Ŭ����
	 * : �ڹٿ��� �����ϴ� '�ڷᱸ��'�� ����ϴ� '�����ӿ�ũ'
	 * 
	 * - �ڷᱸ�� : ����� �����͸� ���� ȿ�������� (��ȸ, ����, �߰�, ����, ����) ���� �� �� �ֵ��� ����
	 * - �����ӿ�ũ : �̹� ��������ִ� Ʋ(����)
	 * 
	 *    �迭�� ����               vs     �÷����� ����
	 *  ũ�⸦ �����ؾ���                         ũ�� ���� �ʿ�x
	 * �߰� ��ġ�� ������ ���                   ������ �˰���x
	 *  ������ �˰��� ���                       �˾Ƽ� �ذ�o
	 * �� ������ �� Ÿ�Ը� ����              �� ������ ����Ÿ�� ���� 
	 *                       >>���� �� �� ����
	 *                       
	 *                       
	 * ����� �����͵��� ���� ���� �ϰ� ��ȸ => �迭
	 * ����� �����͵��� ����, �߰�, ���� ��� ����� ��� => �÷��� 
	 * 
	 * 
	 * 						               ���� ������ ������                ���� ���� ����             �ߺ� �� ��� ����
	 * * Collection - List �迭   ������(value)�� ������ ok       O              O
	 * 			    - Set �迭                      �� ��                                   X              X
	 * ----------------------------------------------------------------------------
	 * * Map �迭                                     Key+������ ��Ʈ�� ��ƾ�                  X  �����Ͱ� �ߺ��̾ key���� �ߺ� �ƴϸ� ���
	 */
	

	public static void main(String[] args) {
		
		// ������ ���׸� ������ ���� ������ <Object> == E
		ArrayList list = new ArrayList(3); // ������ ũ�� ���� ���ص� ������ �ص� ��
		
		System.out.println(list); // ����ִ� ����
		
		// Element : ����Ʈ�� ��� �����͵�(���)
		
		
		
		// 1. add(E e) : ����Ʈ ���� ���� ���޵� �����͸� �߰������ִ� �޼ҵ�
		list.add(new Music("�հ� ��������", "DAY6(Even of Day)"));
		list.add(new Music("���� ���", "��ȿ��"));
		list.add(new Music("��ġ��", "���ؼ�"));
		list.add("��");
		
		// ������ ũ�⺸�� �� ���� �־ ���� x => ����1. ũ�⿡ ���� x
		// �پ��� Ÿ���� ������ ��� ���� => ����2. ���� Ÿ�� ���� ����
		
		System.out.println(list); // list Ư¡ : ��������
		
		
		
		// 2. add(int index, E e) : �ε����� �����ؼ� �ش� �ε�����ġ�� ������ �߰��ϴ� �޼ҵ�
		list.add(1, new Music("The Reason", "SHINee(���̴�)"));
		
		// �ش� �ε��� ��ġ�� ������ �߰� �� ������ �˰��� �ʿ�x => ����3. �߰��Ǹ鼭 �ٸ� ������ ��ĭ�� �̷� ��
		
		System.out.println(list);
		
		
		
		// 3. remove(int index) : �ش� �ε��� ��ġ�� ������ �����ϴ� �޼ҵ�
		list.remove(2);
		
		// �ش� �ε��� ���� �� ������ �˰��� �ʿ�x => ����4. �����ϸ鼭 �ٸ� �����͵� ��ĭ�� ���� ��
		
		System.out.println(list);
		
		
		
		// 4. set(int index, E e) : �ش� �ε��� ��ġ�� �����͸� ���� ���޵� e�� �������ִ� �޼ҵ�
		list.set(2, new Music("Tonight", "����ű�"));
		
		System.out.println(list);
		
		
		
		// 5. size() : ����Ʈ�� ������ ��ȯ���ִ� �޼ҵ� (��, �� ���� �����Ͱ� ����ִ���)
		System.out.println("����Ʈ�� ������ : " + list.size());
		System.out.println("����Ʈ�� ������ �ε��� �� : " + (list.size() -1));
		
		
		
		// 6. get(int index) : �ش� �ε��� ��ġ�� ��ü�� ��ȯ���ִ� �޼ҵ�
		Music m = (Music) list.get(1);
		String s = (String) list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(((Music) list.get(2)).getTitle());
		
		
		
		// 7. subList(int index1, int index2) : List => �����ؼ� ���ο� List�� ��ȯ
		List sub = list.subList(0, 2); // <2 ���� ��ȯ
		System.out.println(sub);
		
		
		
		// 8. addAll(collection c) : c �÷����� ����Ʈ �ڿ� �߰������ִ� �޼ҵ�
		list.addAll(sub);
		System.out.println(list);
		
		
		
		// 9. isEmpty() : boolean => �÷����� �������
		System.out.println(list.isEmpty());
		
		
		/*
		// 10. clear() : ����Ʈ�� ����ִ� �÷��� ����ִ� �޼ҵ�
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		*/
		
		
		
		// �ݺ����� ���� ���������� ���
		System.out.println("--------for loop��--------");
		
		// 1) for loop��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------for each��--------");
		// 2) for each��
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
