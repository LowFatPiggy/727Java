package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// 객체 배열 활용해서 해보기
		// 세 개의 Book객체를 관리한다면?
		Book[] books = new Book[3]; // Book 클래스 3개

		// 세 도서에 대한 정보를 반복적으로 입력받아 각 인덱스에 객체 생성
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < books.length; i++) {

			System.out.println((i + 1) + "번째 도서 정보 입력");

			System.out.print("도서명 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			System.out.println();

			// 각각의 인덱스에 객체 생성
			books[i] = new Book(title, author, price, publisher);

		}

		// 전체 도서 정보들 조회하기
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle())) {
				System.out.println(books[i].information());
			}
		}
	}
}
