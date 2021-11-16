package com.kh.chap03.branch;

public class B_Continue {
	
	/*
	 *  continue;	: 반복문 안에 기술되는 구문
	 *  			  continue; 구문 실행시 그 뒤의 구문들 실행되지 않고 곧바로 현재 속해있는 반복문 위로 올라감
	 */
	
	public void method1() {
		
		// 1부터 10까지 홀수 출력
		/*
		for (int i=1; i<=10; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		//continue를 사용해서 1부터 10까지 홀수 출력
		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) { // i값이 짝수일 경우
				continue; // 위에 있는 반복문으로 (for문으로) 다시 올라가면서 반복문 내의 뒤에 구문들도 실행안해.
			}
			System.out.print(i + " "); 
		}
		
	}
	
	public void method2() {

		// 1부터 100까지의 총 합계. 단, 6의 배수 값은 빼고 덧셈연산.

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

	}
	
	public void method3() {

		// 2~9단까지 출력. 단, 3의 배수단은 빼고

		for (int i = 2; i <= 9; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.printf("==== %d단 ====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

	}

}
