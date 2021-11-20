package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		// for each문 (향상된 / 개선된 for문)
		// 배열 또는 컬렉션과 함께 사용됨
		// 배열 또는 컬렉션의 0번인덱스부터 마지막인덱스까지 순차적으로 모두 접근할 목적일 때
		
		/*
		 * for(순차적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션) { 반복횟수 == 배열 또는 컬렉션
		 * 		// 반복적으로 실행할 내용
		 * }
		 */
		
		for(int value : arr) {
			System.out.println(value);
		}
		
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("갤럭시", "삼성", 1300000, "노트20");
		phones[1] = new Phone("아이폰", "애플", 1500000, "11프로");
		phones[2] = new Phone("벨벳폰", "LG", 900000, "없음");
		
		phones[2].setSeries("1");
		
		int total = 0;
		//            phone[]
		for(Phone p : phones) {
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("총 합계 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 : ");
		String buy = sc.nextLine();
		
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("가격 : " + p.getPrice() + "원");
			}
		}
		
		
	}

}
