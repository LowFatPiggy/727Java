package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "��¯��", 4, 'M', "010-123-4567", "���ٸ���");
		emp[2] = new Employee(2, "������", "������", "����", 4, 'F', 6000000, 0.05, "010-456-7890", "���ٸ���");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].information());
		}
		
		System.out.println("===============================================================");
		
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� �ٽ� ���
		emp[0].setempName("��ö��");
		emp[0].setDept("������");
		emp[0].setJob("����");
		emp[0].setAge(4);
		emp[0].setGender('M');
		emp[0].setSalary(5000000);
		emp[0].setBounsPoint(0.05);
		emp[0].setPhone("010-987-6543");
		emp[0].setAddress("���ٸ���");
		
		emp[1].setDept("��ȹ��");
		emp[1].setJob("����");
		emp[1].setSalary(6000000);
		emp[1].setBounsPoint(0.05);
		
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		
		System.out.println("===============================================================");
		
		int yearSalary = 0;
		int sum = 0;
		for(int i=0; i<emp.length; i++) {
			yearSalary = (int) ((emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBounsPoint())) * 12);
			System.out.println(emp[i].getempName() + "�� ���� : " + yearSalary + "��");
			sum += yearSalary;
		}
		
		System.out.println("===============================================================");
		
		System.out.print("�������� ������ ��� : " + sum / emp.length + "��");

	}

}
