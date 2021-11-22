package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		
		s[0] = new Student("��¯��", 5, 105.9, 22.8, 1, "���ٸ��������");
		s[1] = new Student("������", 5, 104.2, 14, 1, "���ٸ��������");
		s[2] = new Student("������", 5, 106.2, 20, 1, "���ٸ��������");
		
		for(int i=0; i<3; i++) {
			System.out.println(s[i].toString());
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] e = new Employee[10];
		
		int count = 0;
		
		while(true) {
			
			for(int i=0; i<e.length; i++) {
				
				System.out.print("��� �̸� : ");
				String name = sc.nextLine();
				System.out.print("��� ���� : ");
				int age = sc.nextInt();
				System.out.print("��� ���� : ");
				double height = sc.nextDouble();
				System.out.print("��� ������ : ");
				double weight = sc.nextDouble();
				System.out.print("��� �޿� : ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("��� �μ� : ");
				String dept = sc.nextLine();
				
				e[i] = new Employee(name, age, height, weight, salary, dept);
				count += 1;
				
				System.out.print("����� ��� �߰��ϰڽ��ϱ�? (Y/N) : ");
				char answer = sc.nextLine().charAt(0);
				if(answer == 'n' || answer == 'N') {
					break;
				}
			}
			for(int i=0; i<count; i++) {
				System.out.println(e[i].toString());
			}
			break;
		}
		
	}

}
