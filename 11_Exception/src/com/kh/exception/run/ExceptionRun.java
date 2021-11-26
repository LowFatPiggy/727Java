package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 에러 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결x => 심각한 에러
		 * - 컴파일 에러 : 소스코드 문법상 오류 => 애초에 빨간줄로 오류를 알려줌 (개발자의 실수)
		 * - 런타임 에러 : 코드 상으로 문제가 없는데 프로그램 실행 중에 발생하는 에러
		 *            (사용자의 실수 or 개발자가 예측가능한 경우를 제대로 처리안 한 경우)
		 * 
		 * - 논리 에러 : 문법적으로도 문제 없고 실행했을 때도 문제는 없지만 프로그램 의도상 맞지 않는 것
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업 => 예외(Exception)
		 * 
		 * 이런 '예외'가 발생했을 경우 '처리'하는 방법을 "예외처리"
		 * 
		 * ** 예외 처리 하는 목적
		 *  - 프로그램이 비정상적으로 종료될 수 있음
		 *  
		 * ** 예외 처리 방법
		 *  1. try~catch문 이용 (try~with~resource)
		 *  2. throws 이용 (떠넘기기 == 위임)
		 */
		
		A_UnCheckedException a = new A_UnCheckedException();
		// a.method1();
		// a.method2();
		// a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
		
	}

}
