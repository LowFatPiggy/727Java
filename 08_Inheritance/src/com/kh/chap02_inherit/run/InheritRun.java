package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun /* extends Object */ { // 모든 클래스는 Object의 자식

	public static void main(String[] args) {
		
		Car c = new Car("롤스로이스", 12.5, "SUV", 4);
		
		Ship s = new Ship("거북선", 4.8, "전투선", 20);
		
		Airplane a = new Airplane("여객기", 40.9, "민간용 항공기", 18, 2);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		System.out.println("------------------");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("롤스로이스", 12.5, "SUV", 4));
		list.add(new Ship("거북선", 4.8, "전투선", 20));
		list.add(new Airplane("여객기", 40.9, "민간용 항공기", 18, 2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information()); // 동적바인딩
		}
		
		
		/*
		 *  * 상속의 장점
		 *  - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 *  - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
		 *    => 프로그램의 생산성과 유지보수에 크게 기여
		 *    
		 * 
		 *  * 상속의 특징
		 *  - 클래스간의 상속에 있어서는 다중상속이 불가(단일 상속만 가능)
		 *  - 부모클래스에 정의되어있는 protected필드는 자식클래스에서 직접 접근 가능
		 *  - 자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 *    + 부모클래스에 있는 메소드를 자식클래스에서 내용을 재정의하는 오버라이딩 가능
		 *    
		 *  - 명시되어있진 않지만 모든 클래스(자바 제공, 사용자 생성)는 Object 클래스의 자식
		 *    => 즉, Object 클래스에 있는 메소드를 마음대로 호출 가능
		 *    => 오버라이딩을 통해서 재정의도 가능
		 */
		
	}

}
