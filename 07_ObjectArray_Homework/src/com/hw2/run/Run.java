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
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("���� ���� : ");
				int kor = sc.nextInt();
				System.out.print("���� ���� : ");
				int eng = sc.nextInt();
				System.out.print("���� ���� : ");
				int math = sc.nextInt();
				sc.nextLine();

				count += 1;

				st[i] = new Student(grade, classroom, name, kor, eng, math);

				System.out.print("�л� ������ ��� �߰��ϰڽ��ϱ�?(y/n) : ");
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
