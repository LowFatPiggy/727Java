package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		System.out.println(b.information());
		
		Book b2 = new Book("데미안", 11000, 0.1, "헤르만 헤세");
		System.out.println(b2.information());
		
		System.out.println("=================================");
		
		System.out.println("수정된 결과 확인");
		
		b.setTitle("두 친구 이야기");
		b.setPrice(10800);
		b.setDiscountRate(0.1);
		b.setAuthor("안케 드브리스");
		
		System.out.println(b.information());
		
		System.out.println("=================================");
		
		System.out.println("도서명 = " + b.getTitle() + "\n할인된 가격 = " + b.getPrice() + "원");
		System.out.println("도서명 = " + b2.getTitle() + "\n할인된 가격 = " + b2.getPrice() + "원");
	}

}
