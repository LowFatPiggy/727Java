package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "신짱구", 4, 'M', "010-123-4567", "떡잎마을");
		emp[2] = new Employee(2, "한유리", "영업부", "부장", 4, 'F', 6000000, 0.05, "010-456-7890", "떡잎마을");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].information());
		}
		
		System.out.println("===============================================================");
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		emp[0].setempName("김철수");
		emp[0].setDept("영업부");
		emp[0].setJob("차장");
		emp[0].setAge(4);
		emp[0].setGender('M');
		emp[0].setSalary(5000000);
		emp[0].setBounsPoint(0.05);
		emp[0].setPhone("010-987-6543");
		emp[0].setAddress("떡잎마을");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(6000000);
		emp[1].setBounsPoint(0.05);
		
		System.out.println(emp[0].information());
		System.out.println(emp[1].information());
		
		System.out.println("===============================================================");
		
		int yearSalary = 0;
		int sum = 0;
		for(int i=0; i<emp.length; i++) {
			yearSalary = (int) ((emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBounsPoint())) * 12);
			System.out.println(emp[i].getempName() + "의 연봉 : " + yearSalary + "원");
			sum += yearSalary;
		}
		
		System.out.println("===============================================================");
		
		System.out.print("직원들의 연봉의 평균 : " + sum / emp.length + "원");

	}

}
