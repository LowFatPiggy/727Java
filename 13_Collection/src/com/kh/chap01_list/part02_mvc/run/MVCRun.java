package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		/*
		 * MVC패턴 : 각 클래스마다 역할(데이터, 화면, 요청처리)을 부여해서 작업
		 *         => 유지보수 용이
		 *         
		 * M(Model) : 데이터를 담당 (데이터 저장, 비즈니스 로직 처리, 데이터 보관함과 연결하여 입출력하는 클래스)
		 * V(View) : 화면을 담당, 사용자에게 보여지는 시각적인 요소(출력문(print문), 입력문(Scanner))
		 * C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 리턴 (출력문 사용x)
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
	}
	

}
