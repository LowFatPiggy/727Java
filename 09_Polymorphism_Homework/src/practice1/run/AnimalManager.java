package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		
		a[0] = new Dog("�����", "��Ƽ��� �ͽ�", 4);
		a[1] = new Cat("��ӽ� Ĺ", "��Ʈ ���", "������ ���س�", "ûȸ��");
		a[2] = new Dog("Ÿ��ũ", "�ҵ�", 2);
		a[3] = new Dog("������", "���", 3);
		a[4] = new Cat("����", "��Ű�� �Ӱ��", "�Ƶ����̵��", "�Ͼ��");
		
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}
		
	}

}
