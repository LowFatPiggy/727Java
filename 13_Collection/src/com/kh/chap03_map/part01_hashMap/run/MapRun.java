package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<String, Snack>();
		
		// List�迭, Set�迭 Ŭ�������� Collection������ Ŭ����
		// => ��ü�� �߰��ϰ��� �� �� ���������� add�޼ҵ� �̿�
		
		// Map�迭�� Collection������ Ŭ����x
		// => �߰��ϰ��� �� �� put�޼ҵ� �̿�(�̶�, <K,V>)
		
		// 1. put(K key, V value) : �÷��ǿ� Ű ��� ��Ʈ�� �߰������ִ� �޼ҵ�
		hm.put("������", new Snack("������ ������к�Ŷ", 1105));
		hm.put("����", new Snack("���ݸ���Ŷ", 1080));
		hm.put("�Ƹ�� ������", new Snack("���ݸ��������", 205));
		hm.put("��Ĩ", new Snack("�ڿ������", 408));
		
		System.out.println(hm);
		// ����Ǵ� ���� ����x, value���� �ߺ��ǵ� key���� �ߺ� �ȵǸ� ���o
		
		hm.put("��Ĩ", new Snack("�ڿ������-�����ٰ�Ʈ", 403));
		
		System.out.println(hm);
		// ������ Ű������ �ٽ� �߰��ϴ� ��� value���� ������� (=�ߺ��� key�� ����x == �ĺ��� ���� ����)
		
		
		// 2. get(Object Key) : V => �÷��ǿ��� �ش� Ű���� ������ Value���� ��ȯ���ִ� �޼ҵ�
		Snack s = (Snack)hm.get("����");
		System.out.println(s);
		
		
		// 3. size() : �÷��ǿ� ����ִ� ��ü���� ���� ��ȯ 
		System.out.println("��ü ���� : " + hm.size());
		
		
		// 4. replace(K key, V value) => �÷��ǿ��� �ش� Ű���� ã�Ƽ� �ٽ� ������ ��������� �������ִ� �޼ҵ�
		hm.replace("�Ƹ�� ������", new Snack("�Ƹ�����ݸ��������", 205));
		System.out.println(hm);
		
		
		// 5. remove(Object key) => �÷��ǿ��� �ش� Ű�� ã�Ƽ� �� Ű��� ��Ʈ�� �������ִ� �޼ҵ�
		hm.remove("��Ĩ");
		System.out.println(hm);
		System.out.println("��ü ���� : " + hm.size());
		
		
		
		
		// *map ������ ��� ��� Ű���� ����� �� ����ϰ��� �� ��
		// for each��,  ArrayList�� �Ұ�
		// iterator()�� List�迭, Set�迭������ �� �� �ִ� �޼ҵ�
		
		// Map�� Set���� �ٲ��ִ� �޼ҵ� (2����)
		// Map => Set�迭 => Iterator
		
		// 1. KeySet() �̿��ϴ� ��
		// 1) hm�� �ִ� Ű�鸸 Set�� ���(Ű���� ���� ����)
		Set<String> keySet = hm.keySet();
		
		// 2) 1���������� �۾��� KeySet�� Iterator�� ���
		//    KeySet.iterator() : Iterator
		Iterator<String> itkey = keySet.iterator();
		
		// 3) �ݺ����� ���ؼ� Ű��, ����� ���
		while(itkey.hasNext()) {
			String key = (String) itkey.next();
			Snack value = (Snack) hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		// 2. entrySet() �̿�
		// 1) hm.entrySet() : Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // Ű+��� ��Ʈ�� ����
		// ���׸� ���� = ���׸� �ȿ� ���׸�
		
		// 2) entrySet.irerator() : Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� ���� ���
		while(itEntry.hasNext()) {

			Entry<String, Snack> entry = /*(Entry)*/ itEntry.next();
			
			String key = /*(String)*/ entry.getKey();
			Snack value = /*(Snack)*/ entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		
		
		
	}

}
