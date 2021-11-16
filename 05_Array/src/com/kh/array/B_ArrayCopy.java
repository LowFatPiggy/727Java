package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	// 배열 복사
	
	public void method1() {

		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		// 단순하게 copy배열에 origin을 복사.
		int[] copy = origin;
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 99; // copy배열에만 99로 바껴라!

		System.out.println("---------- 복사본 배열 값 변경 후 ----------");
		System.out.println("== 원본 배열 출력 ==");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " "); // 헉! 근데 원본 배열에도 99로..?
		}
		System.out.println();
		System.out.println("== 복사본 배열 출력 ==");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// copy만을 가지고 수정을 해도 origin까지 변경되는 이유는?
		// origin과 copy가 같은 곳을 참조하고 있기 때문 (즉, 같은 주소값)
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		// 이렇게 주소값 복사한 것을 '얕은 복사'라고 함
	}
	
	public void method2() {
		// 깊은 복사하는 방법
		// 1. for문을 활용한 방법 : 새로운 배열을 새로 생성 후 for문으로 원본배열의 값들을 새로 만든 배열에 대입
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = origin; // 얕은 복사: 주소값 대입
		
		int[] copy = new int[5];
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		System.out.println("---- copy 수정 후 ----");
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("");
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	public void method3() {
		// 깊은 복사하는 방법
		// 2. 아예 새로운 배열 생성 후 System 클래스에서의 arraycopy() 메소드 이용한 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // 넉넉하게 크기 생성
		
		// System.arraycopy(원본 배열명, 복사시작할 인덱스, 복사본 배열명, 복사본배열의 복사될 시작 인덱스, 복사할 갯수);
		
		System.arraycopy(origin, 0, copy, 2, 5); // origin의 0번 인덱스부터 5개의 인덱스를 copy배열에 2번 인덱스 부터 복사해 줘
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " "); // 출력값 : 0 0 1 2 3 4 5 0 0 0
		}
		System.out.println();
		System.out.println("origin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
	}
	
	public void method4() {
		// 깊은 복사하는 방법
		// 3. 새로운 배열 생성 없이 Arrays클래스에서 제공하는 copyOf() 메소드 사용.
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본 배열명, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 5);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
	}
	
	public void method5() {
		// 깊은 복사하는 방법
		// 4. clone() 메소드 이용한 복사 : 인덱스, 크기 지정 불가. 완전 똑같이 복사할 때 이용.
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
	}
}
