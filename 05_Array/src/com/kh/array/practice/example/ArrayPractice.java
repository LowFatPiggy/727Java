package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; 
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=10; j<arr.length; j--) {
				arr[i] = j;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	} //출력값 : 0 0 0 0 0 0 0 0 0 0
	
	
	public void practice2_1() {
		
		int[] arr = new int[10];
		int sum = 11;
		
		for(int i=0; i<arr.length; i++) {
			sum -= 1;
			arr[i] = sum;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2_2() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=10; j<arr.length; j--) { //
				arr[i] = j;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2_3() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length; j<0; j--) {
				arr[i]=j;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.print(arr[1]);
	}
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] room = new char[str.length()]; // str길이만큼 방을 만들고
		
		for(int i=0; i<str.length(); i++) { // str방마다 문자 하나하나 넣어 줘
			room[i] = str.charAt(i);
		}

		int count = 0; // 일치하는 문자가 있을 경우 카운트할 변수 선언.
		for (int i = 0; i < str.length(); i++) {
			if (room[i] == ch) {
				count += 1;
			}
		}
		System.out.printf("%c의 갯수 : %d", ch, count);
	}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 : ");
		int length = sc.nextInt();
		
		int[] room = new int[length];
		int sum = 0;
		
		for(int i=0; i<room.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			room[i] = sc.nextInt();
		}
		for(int i=0; i<room.length; i++) {
			System.out.print(room[i] + " ");
			sum += room[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("3이상 홀수인 정수 입력 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {

				int[] arr = new int[num];

				int value = 1; // 무조건 결과값이 1부터 시작하니까
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < arr.length / 2) {
						value++;
					} else {
						value--;
					}
				}

				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}

				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void practice9() { 
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"후라이드", "양념", "간장", "파닭"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.nextLine();
		
		// 입력한 치킨메뉴가 주문이 가능한지 판별
		
		/*
		for(int i=0; i<chicken.length; i++) {
			if(input.equals(chicken[i])) { // String 판별은 equals메소드 사용.
				System.out.println(input + "치킨 배달 가능");
			} else {
				System.out.println(input + "치킨은 없는 메뉴입니다.");
			}
		}
		*/ 
		// for문 안에 if문을 넣으니까 네번의 결과가 출력값으로 나옴.
		
		
		// 그 점을 보완하기 위해 boolean 메소드 사용.
		boolean check = false; // 분별해줄 boolean을 false로 선언.
		for(int i=0; i<chicken.length; i++) {
			if(input.equals(chicken[i])) {
				check = true; // 배열 하나하나 for문으로 확인해보는데 일치하는 값이 있으면 true로 바꿔.
				break; // true가 있으면 다른거 볼 거 없이 빠져나오셈
			}
		}
		
		// check가 true냐 false냐에 따라 결과값 출력
		if(check == true) {
			System.out.println(input + "치킨 배달 가능");
		} else {
			System.out.println(input + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
	
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String number = sc.nextLine();

		char[] num = new char[number.length()];

		for (int i = 0; i < number.length(); i++) {
			num[i] = number.charAt(i); // 방 하나하나에 주민번호 하나하나 넣어
		}
		char[] num2 = num.clone(); // 그리고 복사본 하나 만들어
		
		for(int i=8; i<number.length(); i++) {
			num2[i] = '*'; // 주민 복사본의 성별 뒷자리(인덱스 8번째자리)부터는 *로 만들거야
		}
		System.out.println(num2);
	}
}
