package com.kh.first;

public class PrintTest {
	
	// 출력문 실습
	public static void main(String[] args) {
		
		System.out.println("println은 줄바꿈");
		
		System.out.print("print는 줄바꿈X"); // 문자열(문장)의 경우는 쌍따옴표로 묶는다
		
		System.out.print(12345); // 숫자의 경우는 그냥 적어준다
		
		System.out.print('A' + "\n"); // 문자의 곁우는 홑따옴표로 묶는다
		
		// 줄바꿈을 하고싶지만 print문을 써야하는 경우에는?
		System.out.print("줄바꿈 하고 싶을 때는\n");
		System.out.print("개행문자를 사용한다\n");
		
		// \n : 개행문자, 줄 바꿈 시켜주는 역할, 즉 엔터 키를 누른 것과 같다.
		// => 문자+숫자, 문자+문자열, 숫자+문자열 과 같이 서로 다른 형태를 붙여서 나타내주는 기호는 +
		
		System.out.print("Hi\n"+"Everyone!!\n");
		System.out.println("\\n"); // \n 자체로도 출력이 된다.
		
		// 역슬래시 그 자체만으로 문자로 인식이 되지 않기 때문에 문자로 인식하고 싶을 경우에는 역슬래시를 한번 더 붙여준다
		System.out.println("\\개행문자"); // 출력: \개행문자
	}

}
