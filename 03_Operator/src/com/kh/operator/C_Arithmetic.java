package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * * 산술연산자 (이항 연사자 == 두개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * *  / % > + -
	 * 
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1 + num2); // 문자열+num1 먼저. 그래서 문자열계산법으로 진행.
		System.out.println("num1 + num2 = " + (num1 + num2)); // 먼저 수행시키고자 하는 계산을 괄호처리
		// System.out.println("num1 - num2 = " + num1 - num2); // 문자열과 int와 -연산은 없으므로 오류. 괄호처리로 해결o
		
		System.out.println("num1 * num2 = " + num1 * num2); // 곱셈, 나눗셈은 연산순위가 높기 때문에 괄호필요x
		System.out.println("num1 / num2 = " + num1 / num2); // 나누기했을 때 몫
		System.out.println("num1 % num2 = " + num1 % num2); // 나누기했을 때 나머지
		
		// 값 % 2 == 0  : 짝수
		// 값 % 2 == 1  : 홀수
		
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println("a : " + a); //5 6 7
		System.out.println("b : " + b); //10 9
		System.out.println("c : " + c); //16 15
		System.out.println("d : " + d); //2 1
		System.out.println("e : " + e); //4 5 6
		System.out.println("f : " + f); //4
		System.out.println("g : " + g); //9+2=11 10
		System.out.println("h : " + h); //2
		System.out.println("i : " + i); //6+9/(15/4)*(11-1)%(6+2) =6+9/3*10%8 =6+30%8 =6+6 =12
		
	}

}
