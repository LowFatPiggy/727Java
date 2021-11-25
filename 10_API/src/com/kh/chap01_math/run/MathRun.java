package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {

		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때
		int num = -10;
		System.out.println("절대값 : " + Math.abs(num));
		
		// 올림 : ceil
		double num2 = 4.1489;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림 : floor
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수 값을 알아 낸 후 실수형으로 반환 : rint
		System.out.println("가까운 정수값 실수형으로 반환 : " + Math.rint(num2));
		
		// 제곱근(루트) : sqrt
		int num3 = 9;
		System.out.printf("%d의 제곱근 : %s\n", num3, Math.sqrt(num3));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		// Math m = new Math(); // private라서 호출 안돼
		
		/*
		 * Math 특징
		 * 모든 필드 상수필드, 모두 static 메소드
		 * 생성자는 private
		 * 싱글톤 패턴 적용 (메모리 영역에 한번 올려놓고 여기저기 재사용하는 개념)
		 */
		
	}

}
