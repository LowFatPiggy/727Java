package com.kh.variable;

public class D_Cast {
	
	/*
	 * * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 * 1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야.
	 * 	=> 즉, 같은 자료형에 해당하는 값만 대입 가능
	 * 	=> 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
	 * 
	 *	자료형 변수명 = (자료형) 값;
	 *
	 * 2. 같은 자료형끼리만 연산이 가능
	 * 
	 *		값 + 값  => 계산 결과도 같은 자료형으로 나옴
	 *
	 * * 형변환 종류
	 * 1. 자동형변환 => 자동으로 형변환이 이뤄짐
	 * 2. 강제(명시적)형변환 => 자동형변환이 안되서 직접 형변환을 해주어야.
	 * 
	 * 		[표현법] (바꿀자료형)값
	 * *주의사항
	 * boolean은 형변환이 불가함.
	 */
	
	public void autoCasting() {
		/*
		 * * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형 간의 연산 할 시,
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리
		 */
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1; // 12가 더블형변환 12.0
		
		System.out.println("d1 :" + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		System.out.println("result : " + result);
		
		// 2. int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/f4;
		
		// ==== 특이케이스 ====
		// 4. long(8byte) => float(4byte)
		//	  float가 실수형이기 때문에 long형보다 표현 가능한 수의 범위가 더 커서 자동형변환 가능
		long l5 = 100000000000L; // L을 붙이지 않으면 int형으로 인식
		float f5 = /*(float)*/l5;
		
		// 5. char(2byte) <=> int(4byte)
		int num = /*(int)*/'A';
		System.out.println("num : " + num);
		
		char ch = 91;
		System.out.println("ch : " + ch);
		
		// 각 문자들마다 고유한 숫자가 지정되어있기 때문에 쌍방향으로 형변환 가능
		// char는 음수값 저장 불가 => 값의 범위가 0~65535
		
		// 6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2; // 에러 발생 => byte나 short는 연산시 무조건 int형으로 처리.
							  //          연산 결과가 범위가 더 큰 int형 => byte형에 대입 불가
				
		byte b3 = (byte)(b1 + b2);
		System.out.println("byte : " + b3);
		 
	}
	
	public void forceCasting() { 
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 거
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		
		// double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; // 10.0 + 5.89 = 15.89(double)
								   // 연산결과인 double형인 int형에 대입 불가 =>에러발생
		
		// 에러 해결 방법
		// 방법1. 연산 결과를 int형으로 강제형변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1);
		
		// 방법2. double형 값만을 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		// 실수값을 정수값으로 강제형변환시 소수점 아래 부분은 버려짐 (*데이터 손실)
		
		// 방법3. 연산 결과를 double변수에 대입
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		// ** 데이터 손실 테스트 **
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		// -128 ~ 127
		System.out.println("bNum2 : " + bNum2);
		
	}

}