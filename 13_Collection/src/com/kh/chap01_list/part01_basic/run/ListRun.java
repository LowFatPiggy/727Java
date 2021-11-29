package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
	/*
	 * 컬렉션
	 * : 자료 구조 개념이 내장되어있는 클래스
	 * : 자바에서 제공하는 '자료구조'를 담당하는 '프레임워크'
	 * 
	 * - 자료구조 : 방대한 데이터를 보다 효율적으로 (조회, 정렬, 추가, 수정, 삭제) 관리 할 수 있도록 도움
	 * - 프레임워크 : 이미 만들어져있는 틀(뼈대)
	 * 
	 *    배열의 단점               vs     컬렉션의 장점
	 *  크기를 지정해야함                         크기 지정 필요x
	 * 중간 위치를 수정할 경우                   복잡한 알고리즘x
	 *  복잡한 알고리즘 기술                       알아서 해결o
	 * 한 공간에 한 타입만 저장              한 공간에 여러타입 저장 
	 *                       >>제한 둘 수 있음
	 *                       
	 *                       
	 * 방대한 데이터들을 단지 보관 하고 조회 => 배열
	 * 방대한 데이터들을 보관, 추가, 삭제 등등 빈번한 경우 => 컬렉션 
	 * 
	 * 
	 * 						               저장 가능한 데이터                순서 유지 여부             중복 값 허용 여부
	 * * Collection - List 계열   데이터(value)만 담으면 ok       O              O
	 * 			    - Set 계열                      상 동                                   X              X
	 * ----------------------------------------------------------------------------
	 * * Map 계열                                     Key+데이터 세트로 담아야                  X  데이터가 중복이어도 key값이 중복 아니면 허용
	 */
	

	public static void main(String[] args) {
		
		// 별도로 제네릭 설정을 하지 않으면 <Object> == E
		ArrayList list = new ArrayList(3); // 별도로 크기 지정 안해도 되지만 해도 됨
		
		System.out.println(list); // 비어있는 상태
		
		// Element : 리스트에 담길 데이터들(요소)
		
		
		
		// 1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("뚫고 지나가요", "DAY6(Even of Day)"));
		list.add(new Music("좋은 사람", "박효신"));
		list.add(new Music("스치다", "김준수"));
		list.add("끝");
		
		// 지정된 크기보다 더 많이 넣어도 오류 x => 장점1. 크기에 제약 x
		// 다양한 타입의 데이터 담기 가능 => 장점2. 여러 타입 보관 가능
		
		System.out.println(list); // list 특징 : 순서유지
		
		
		
		// 2. add(int index, E e) : 인덱스를 지정해서 해당 인덱스위치에 데이터 추가하는 메소드
		list.add(1, new Music("The Reason", "SHINee(샤이니)"));
		
		// 해당 인덱스 위치에 데이터 추가 시 복잡한 알고리즘 필요x => 장점3. 추가되면서 다른 데이터 한칸씩 미뤄 줌
		
		System.out.println(list);
		
		
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터 삭제하는 메소드
		list.remove(2);
		
		// 해당 인덱스 삭제 시 복잡한 알고리즘 필요x => 장점4. 삭제하면서 다른 데이터들 한칸씩 땡겨 줌
		
		System.out.println(list);
		
		
		
		// 4. set(int index, E e) : 해당 인덱스 위치의 데이터를 새로 전달된 e로 수정해주는 메소드
		list.set(2, new Music("Tonight", "동방신기"));
		
		System.out.println(list);
		
		
		
		// 5. size() : 리스트의 사이즈 반환해주는 메소드 (즉, 몇 개의 데이터가 담겨있는지)
		System.out.println("리스트의 사이즈 : " + list.size());
		System.out.println("리스트의 마지막 인덱스 수 : " + (list.size() -1));
		
		
		
		// 6. get(int index) : 해당 인덱스 위치의 객체를 반환해주는 메소드
		Music m = (Music) list.get(1);
		String s = (String) list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		System.out.println(((Music) list.get(2)).getTitle());
		
		
		
		// 7. subList(int index1, int index2) : List => 추출해서 새로운 List로 반환
		List sub = list.subList(0, 2); // <2 까지 반환
		System.out.println(sub);
		
		
		
		// 8. addAll(collection c) : c 컬렉션을 리스트 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		
		
		// 9. isEmpty() : boolean => 컬렉션이 비었는지
		System.out.println(list.isEmpty());
		
		
		/*
		// 10. clear() : 리스트에 담겨있는 컬렉션 비워주는 메소드
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		*/
		
		
		
		// 반복문을 통해 순차적으로 출력
		System.out.println("--------for loop문--------");
		
		// 1) for loop문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------for each문--------");
		// 2) for each문
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
