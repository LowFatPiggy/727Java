package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		// ObjectArrayRun�� ���׸�����Ʈ�� �ٲٱ�
		
		ArrayList<Phone> list = new ArrayList<>();
		
		list.add(new Phone());
		list.add(new Phone("������", "����", 1300000, "11pro"));
		list.add(new Phone("������", "�Ｚ", 1200000, "S20"));
		
		list.get(0).setName("������");
		list.get(0).setBrand("LG");
		list.get(0).setPrice(1000000);
		list.get(0).setSeries("1");
		
		int total = 0;
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
			total += list.get(i).getPrice();
		}
		*/
		
		for(Phone p : list) {
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("�� ���� : " + total + "��");
		System.out.println("��հ� : " + total / list.size() + "��");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ��� �ϴ� �ڵ��� : ");
		String buy = sc.nextLine();
		
		/*
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(buy)) {
				System.out.println(list.get(i).getPrice() + "�� �Դϴ�.");
			}
		}
		*/
		
		
		for(Phone p : list) {
			if(p.getName().equals(buy)) {
				System.out.println(p.getPrice() + "�� �Դϴ�");
			}
		}
		
	}

}
