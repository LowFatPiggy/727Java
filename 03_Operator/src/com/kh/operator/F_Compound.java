package com.kh.operator;

public class F_Compound {
	
	/* 
	 * 복합대입연산자
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("최초 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num += 3;
		System.out.println("또 3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("최종 num : " + num);
		
		String str = "Hello";
		// str = str + "World"; // "HelloWorld"
		str += "World";
		System.out.println(str);
		
		
	}

}
