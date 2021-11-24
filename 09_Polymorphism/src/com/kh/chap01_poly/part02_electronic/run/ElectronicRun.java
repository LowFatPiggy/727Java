package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// 전자상가 납품업체라고 가정
		
		/*
		// 1. 다형성 적용 전 (ElectronicShop1) -----
		ElectronicShop1 es = new ElectronicShop1();
		// 객체 생성하는 순간 해당 클래스에 제시된 세 필드가 메모리상에 할당
		
		
		// 납품
		es.insert(new Desktop("SAMSUNG", "데스크탑", 1200000, "Geforce"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 조회
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		
		
		// 2. 다형성 적용 후 (ElectronicShop2) -----
		
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop("SAMSUNG", "데스크탑", 1200000, "Geforce"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		/*
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		*/
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		System.out.println(d/*toString*/);
		System.out.println(n);
		System.out.println(t);
		
		System.out.println(((Desktop)d).getGraphic());
		
		/*
		 * * 다형성을 사용하는 이유
		 * 1. 부모타입의 배열로 다양한 자식객체들을 받을 수 있음
		 * 2. 메소드 정의 시 매개변수로 다형성을 적용하게 되면 메소드 갯수를 줄일 수 있다.
		 */
		
	}

}
