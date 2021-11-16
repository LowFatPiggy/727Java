package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// 변수 : 한 공간에 한 값만 담을 수 있음
	// 배열 : 한 공간에 여러 값을 담을 수 있는 개념
	//		"같은 자료형의 값"으로만 담을 수 있음
	//		배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작)
	
	/*
	 * *배열 선언 (여러 개의 값들을 보관할 배열을 만들겠다)
	 * 	자료형 배열명[];
	 * 	자료형[] 배열명;
	 * 
	 * *배열 할당
	 * 	배열명 = new 자료형[배열크기];
	 * 
	 *  자료형 배열명[] = new 자료형[배열크기];
	 *  자료형[] 배열명 = new 자료형 [배열크기];
	 *  ex) int[] arr = new int[5]; // int값만 넣을 수 있는 5칸 방이 만들어짐.
	 *  
	 * *값 대입
	 * 	배열명[인덱스] = 값;		ex) arr[0] = 1; 	
	 *  
	 */
	
	public void method1() {
		
		int[] arr = new int[5]; 
		
		/* 배열 초기화 방법1) 인덱스를 이용한 초기화
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 초기화 방법2) for문
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		// 배열에 담긴 값들을 출력
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // [I@6d06d69c 로 출력. '주소값'이 출력된 것.
	}
	
	public void method2() {
		
		int i = 10;
		int[] iArr = new int[5];
		
		System.out.println(iArr); // [I@6d06d69c [I는 자료형. @뒤에가 주소값
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 기본자료형 (boolbea, char, byte, short, int, long, float, double) 으로 선언된 변수
		 * => 실제 리터럴값을 바로 담는 변수 = 그냥 '일반 변수'라 불림
		 * 
		 * 그 외 자료형 (int[], double[], char[], short[], .. , String, Scanner, ..) 선언된 변수
		 * => 주소값을 담는 변수 = 참조 변수(레퍼런스 변수)라 불림
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2번 인덱스
		double[] dArr = new double[4]; // 0~3번 인덱스
		
		// 선언'만' 한 상태의 iArr배열 출력
		for(int i=0; i<=2; i++) {
			System.out.println(iArr[i]); //결과 : 0 0 0
		}
		
		// 선언'만' 한 상태의 dArr배열 출력
		for(int i=0; i<=3; i++) {
			System.out.println(dArr[i]); //결과 :0.0 0.0 0.0 0.0
		}
		
		// 초기값이 0으로 되어있음. Heap이란 공간에 절대 빈공간이 존재x
		// => 따라서 공간이 만들어질 때 JVM이 기본값으로라도 초기화(대입)를 진행.
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		System.out.println(arr); // [+배열자료형+@+주소값의16진수형태
		System.out.println(arr.hashCode()); // hashcode() 메소드: 주소값의 10진수형태
		System.out.println("배열의 길이 : " + arr.length);
	}
	
	public void method5() {
		
		int result = 0;
		
		int[] arr = null; // null의미 : 아무것도 참조하고 있지 않다
		// 주소값을 담는 변수의 기본값은 null
		
		System.out.println(arr);
		
		// null가지고 메소드를 호출한다거나 특정어딘가에 접근하고자 한다면
		// 항시 오류 발생!! => NullPointerException
		// System.out.println(arr.hashCode()); // 오류발생. null가지고 호출하려해서.
		// System.out.println(arr.length); // 마찬가지로 null가지고 접근하려했기 때문에 오류 발생.
		
	}
	
	public void method6() {
		
		int[] arr = new int[5];
		
		// int arr[i] = {2,4,6,8,10} 출력
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2*(i+1);
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 두번째 방법
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value +=2;
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/*
		 *  * 배열의 가장 큰 단점
		 *    한번 지정된 배열의 크기는 변경이 불가 => 다시 만들어야 함.
		 */
		
		arr = new int[7];
		
		System.out.println("변경 후의 arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("변경 후의 arr 길이 : " + arr.length);
		
		// 그럼 그전에 int[] arr = new int[5]; 이 배열은 어떻게 되는가?
		// 연결이 끊어진 기존 배열은 Heap 영역의 필요없는 존재가 됨
		// => 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌
		// => 자바에서의 "자동메모리 관리" 특징 == 개발자가 코드작성에만 집중하도록
		
		// 배열을 강제로 삭제시키고자 한다면? ==> 연결고리를 끊으면 된다.
		arr = null; // 아무것도 참조하지 않겠다
		
		// null.xxxx() ==> nullpointerException 오류 발생
	
	}
	
	public void method7() {
		
		// 배열 선언, 할당, 초기화 동시에 하기
		
		int[] arr1 = new int[] {1,2,3,4}; // 표현법1
		int[] arr2 = {1,2,3,4}; // 표현법2
		
		System.out.println(arr1 == arr2); // false. 주소값이 다르다.
		
	}
	
	public void method8() {
		
		// 매번 1~100 사이에 발생되는 랜덤값이 대입되도록
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1); // * 100까지 + 1에서
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void method9() {
		
		// 배열 길이 입력받은 후 해당 그 크기만큼 문자열 배열 생성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 버퍼에 \n을 비우기 위함
		
		String[] fruit = new String[size];
		
		for(int i =0; i<fruit.length; i++) {
			System.out.print("과일명 : ");
			fruit[i] = sc.nextLine();
		}
		
		for(int i=0; i<fruit.length; i++) {
			System.out.printf("fruit[%d] : %s\n", i, fruit[i]);
		}
	}
	
	public void method10() {

		// 문자열 입력받은 후, 각각의 인덱스에 있는 문자들을 char 배열에 옮겨담기

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		char[] room = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			room[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			System.out.printf("room[%d] : %c\n", i, room[i]);
		}

		// 반복문 활용해서 해당 배열 중 문자를 입력하면 개수를 찾는.

		System.out.print("찾을 문자 입력: ");
		char ch = sc.nextLine().charAt(0);

		int count = 0; // 일치하는 문자가 존재할 경우 매번 1씩 증가
		for (int i = 0; i < str.length(); i++) {
			if (ch == room[i]) {
				count++;
			}
		}

		System.out.println("찾아진 문자 갯수 : " + count);
	}
	
	public void method11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수들의 총 합  : " + sum);
	}
	
	public void method12() {
		int[] ages = new int[5];
		
		ages[0] = 15;
		ages[1] = 23;
		ages[2] = 50;
		ages[3] = 34;
		ages[4] = 25;
		
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
			sum += ages[i]; //?
		}
		
	}

}

