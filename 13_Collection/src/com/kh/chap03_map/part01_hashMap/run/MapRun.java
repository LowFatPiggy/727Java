package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<String, Snack>();
		
		// List계열, Set계열 클래스들은 Collection구현한 클래스
		// => 객체를 추가하고자 할 때 공통적으로 add메소드 이용
		
		// Map계열은 Collection구현한 클래스x
		// => 추가하고자 할 때 put메소드 이용(이때, <K,V>)
		
		// 1. put(K key, V value) : 컬렉션에 키 밸류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("원통형 초코통밀비스킷", 1105));
		hm.put("빈츠", new Snack("초콜릿비스킷", 1080));
		hm.put("아몬드 빼빼로", new Snack("초콜릿막대과자", 205));
		hm.put("썬칩", new Snack("자연곡물스낵", 408));
		
		System.out.println(hm);
		// 저장되는 순서 유지x, value값이 중복되도 key값이 중복 안되면 출력o
		
		hm.put("썬칩", new Snack("자연곡물스낵-갈릭바게트", 403));
		
		System.out.println(hm);
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워져 (=중복된 key값 공존x == 식별자 같은 개념)
		
		
		// 2. get(Object Key) : V => 컬렉션에서 해당 키값을 가지는 Value값을 반환해주는 메소드
		Snack s = (Snack)hm.get("빈츠");
		System.out.println(s);
		
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 갯수 반환 
		System.out.println("객체 갯수 : " + hm.size());
		
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키값을 찾아서 다시 전달한 밸류값으로 수정해주는 메소드
		hm.replace("아몬드 빼빼로", new Snack("아몬드초콜릿막대과자", 205));
		System.out.println(hm);
		
		
		// 5. remove(Object key) => 컬렉션에서 해당 키값 찾아서 그 키밸류 세트를 삭제해주는 메소드
		hm.remove("썬칩");
		System.out.println(hm);
		System.out.println("객체 갯수 : " + hm.size());
		
		
		
		
		// *map 공간에 담긴 모든 키값과 밸류값 다 출력하고자 할 때
		// for each문,  ArrayList는 불가
		// iterator()은 List계열, Set계열에서만 쓸 수 있는 메소드
		
		// Map을 Set으로 바꿔주는 메소드 (2가지)
		// Map => Set계열 => Iterator
		
		// 1. KeySet() 이용하는 법
		// 1) hm에 있는 키들만 Set에 담기(키들의 집합 형태)
		Set<String> keySet = hm.keySet();
		
		// 2) 1번과정에서 작업된 KeySet을 Iterator에 담기
		//    KeySet.iterator() : Iterator
		Iterator<String> itkey = keySet.iterator();
		
		// 3) 반복문을 통해서 키값, 밸류값 출력
		while(itkey.hasNext()) {
			String key = (String) itkey.next();
			Snack value = (Snack) hm.get(key);
			System.out.println(key + "=" + value);
		}
		
		
		// 2. entrySet() 이용
		// 1) hm.entrySet() : Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // 키+밸류 세트의 집합
		// 제네릭 설정 = 제네릭 안에 제네릭
		
		// 2) entrySet.irerator() : Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 출력
		while(itEntry.hasNext()) {

			Entry<String, Snack> entry = /*(Entry)*/ itEntry.next();
			
			String key = /*(String)*/ entry.getKey();
			Snack value = /*(Snack)*/ entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		
		
		
	}

}
