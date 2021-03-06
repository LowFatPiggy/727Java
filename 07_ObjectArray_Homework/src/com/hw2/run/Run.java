package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] st = new Student[10];

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while (true) {

			for (int i = 0; i < st.length; i++) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				System.out.print("수학 점수 : ");
				int math = sc.nextInt();
				sc.nextLine();

				count += 1;

				st[i] = new Student(grade, classroom, name, kor, eng, math);

				System.out.print("학생 점수를 계속 추가하겠습니까?(y/n) : ");
				char answer = sc.nextLine().charAt(0);
				if (answer == 'n') {
					break;
				}
			}
			for (int i = 0; i < count; i++) {
				System.out.println(st[i].information());
			}
			break;
		}
	}

}
