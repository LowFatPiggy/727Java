package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// 복습시간
		// 방법1. 기본생성자로 생성 후 setter메소드를 통해서 값 초기화
		
		/*
		Book bk = new Book();
		bk.setTitle("자바의 정석");
		bk.setAuthor("남궁성");
		bk.setPrice(25000);
		bk.setPublisher("도우출판");
		*/
		
		
		
		// 방법2. 매개변수생성자를 통해서 생성과 동시에 값 초기화
		// Book bk = new Book("자바의 정석", "남궁성", 25000, "도우출판");
		
		// [응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		
		// 세 개의 Book 객체를 관리해야한다면?
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 세 도서에 대한 정보를 반복적으로 사용자에게 입력받은 후 각 객체 생성과 동시에 초기화
		
		
		for(int i=0; i<3; i++) {
			
			System.out.println((i+1) + "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 매번 조건검사 후 각각의 객체 생성해야함
			if(i==0) { // 첫번째 반복문 진행 시
				bk1 = new Book(title, author, price, publisher);
			} else if(i==1) { // 두번째 반복문 진행 시
				bk2 = new Book(title, author, price, publisher);
			} else {
				bk3 = new Book(title, author, price, publisher);
			}
		} 
		
		// 전체 도서 정보들 조회하기
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		/*
		if(search.equals(bk1)) { // tc : if(bk1.getTitle().equals(search))
			System.out.println(bk1.information());
		} else if(search.equals(bk2)) {
			System.out.println(bk2.information());
		} else {
			System.out.println(bk3.information());
		}
		*/
		
		// 책 제목이 같은 책들이 있을 수 있으니 모두 출력하기 위해 if문으로만 사용
		
		if(search.equals(bk1.getTitle())) {
			System.out.println(bk1.information());
		}
		
		if(search.equals(bk2.getTitle())) {
			System.out.println(bk2.information());
		}
		
		if(search.equals(bk3.getTitle())) {
			System.out.println(bk3.information());
		}
		
		// 더 간결하게 만들 수 있는 방법
		// ObjectArrayRun.class 참고
	}

}
