package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];
		
		// --- 1번째 문제의 조치내용 ---
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		// -----------------------
		
		for(int i=0; i</*=*/arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		// 잘못된 부분
		// 1. NullPointerException : 객체배열의 각 인덱스에 담긴 값이 null인 상태에서
		//							  메소드를 호출하려고 했기 때문 => 객체 배열 만든 후 각 인덱스별로 객체 생성 진행
		// 2. ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어남
		//									       조치 내용 => 조건식 수정(i<배열의길이)
	}

}
