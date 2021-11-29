package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GeneticListRun {

	public static void main(String[] args) {
		
		// <Music>으로 제네릭 설정 => E == Music
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("You make Me", "DAY6"));
		list.add(new Music("화살(Quasimodo)", "샤이니"));
		// list.add("끝"); // 뮤직 타입만 가능
		
		System.out.println(list);
		
		
		// 추가
		list.add(1, new Music("I'll Be There", "동방신기"));
		System.out.println(list);
		
		
		// 수정
		list.set(0, new Music("둘도 아닌 하나", "DAY6"));
		System.out.println(list);
		
		
		// 추출
		List<Music> sub = list.subList(0, 2);
		list.addAll(sub);
		System.out.println(list);
		
		
		Music m = list.get(0);
		System.out.println(m);
		
		
		System.out.println(list.get(1).getTitle());
		
		
		for(Music o : list) {
			System.out.println(o);
		}
	}
	
	/*
	 * 제네릭<>을 사용하는 이유
	 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있다
	 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때마다 매번 형변환하는 절차를 없애기 위해
	 */
	

}
