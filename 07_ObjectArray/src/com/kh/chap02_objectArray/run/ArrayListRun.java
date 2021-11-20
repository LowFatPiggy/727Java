package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		// ObjectArrayRun을 제네릭리스트로 바꾸기
		
		ArrayList<Phone> list = new ArrayList<>();
		
		list.add(new Phone());
		list.add(new Phone("아이폰", "애플", 1300000, "11pro"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "S20"));
		
		list.get(0).setName("벨벳폰");
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
		
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / list.size() + "원");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		/*
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(buy)) {
				System.out.println(list.get(i).getPrice() + "원 입니다.");
			}
		}
		*/
		
		
		for(Phone p : list) {
			if(p.getName().equals(buy)) {
				System.out.println(p.getPrice() + "원 입니다");
			}
		}
		
	}

}
