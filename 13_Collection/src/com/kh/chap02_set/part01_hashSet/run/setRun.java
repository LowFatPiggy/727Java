package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.medol.vo.Student;

public class setRun {

	public static void main(String[] args) {
		
		// Object에 equals() => 두 객체의 "주소값"을 비교해서 true/false 반환
		// Object에 hashCode() => 해당 객체의 "주소값"을 가지고 10진수의 형태로 바꿔 변환
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("이 세상 위엔 내가 있고!");
		hs1.add(new String("나를! 사랑해주는~"));
		hs1.add(new String("나의 사람들과"));
		hs1.add(new String("나의 길을 가고싶어~"));
		hs1.add(new String("(가고시퍼~)"));
		hs1.add(new String("나는 문제없어"));
		hs1.add(new String("나는 문제없어"));
		
		
		// String에 equals() 오버라이딩 => "실제 담긴 문자열"을 비교해서 true/false 반환
		// String에 hashCode() 오버라이딩 => "실제 담긴 문자열"을 가지고 10진수의 형태로 바꿔 변환
		
		System.out.println(hs1);
		// 저장 순서 유지x(인덱스 개념x), 중복된 데이터(동일객체) 보관 불가
		
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("신짱구", 5, 40));
		hs2.add(new Student("김철수", 5, 100));
		hs2.add(new Student("한유리", 5, 70));
		hs2.add(new Student("김철수", 5, 100));
		
		System.out.println(hs2);
		// 저장 순서 유지x(인덱스 개념x), 중복된 데이터 출력 => 왜? 동일객체로 판단을 못해서
		
		// HashSet이라는 공간에 객체가 추가될 때마다 동일 객체인지 비교
		// 동일객체 : 각 객체마다 hashCode 결과가 일치하고, equals메소드로 비교시 true일 경우
		
		
		// Student에 equals() 오버라이딩 => "실제 각 필드에 담긴 데이터"들을 비교해서 true/false 반환
		// Student에 hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 일치하면 10진수의 형태로 바꿔 변환
		
		/*
		System.out.println(new Student("김철수", 5, 100).hashCode());
		System.out.println(new Student("김철수", 5, 100).hashCode());
		System.out.println(new Student("김철수", 5, 100).equals(new Student("김철수", 5, 100)));
		*/
		
		
		// hs2.get(1); // HashSet에서는 인덱스 개념x, get메소드 자체가 정의x (=한 객체만 추출x)
		// But, HashSet에 담긴 모든 객체들에 순차적으로 접근 가능
		// 1. for문으로 (단, for each문으로)
		for(Object s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("-----------------");
		
		// 2. ArrayList에 담은 후 그 ArrayList를 반복문 돌려가며 접근
		
		// ArrayList에 담는 방법 
		// 1) ArrayList 생성 후 addAll메소드를 이용해서 추가
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2); // 리스트에 hs2의 총 3개의 Student객체 추가
		
		// 2) ArrayList 생성과 동시에 추가
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("-----------------");
		
		// 3) Iterator라는 반복자를 이용해 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2의 객체들을 Iterator에 복사
		
		while(it.hasNext()) { // it에 담긴 내용들이 없을때까지 무한반복
			Student s = /*(Student)*/ it.next();
			System.out.println(s);
		} 
		// StringTokenizer과 비슷한 개념 ; 일회성

	}

}
