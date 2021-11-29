package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part01_basic.model.vo.Music;
import com.kh.chap01_list.part02_mvc.controller.MusicController;

// view : 화면 담당(출력, 입력문)
public class MusicMenu {
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 메인화면 : 프로그램 실행 시 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n=== Welcome kiss the Music ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 곡 삭제");
			System.out.println("4. 곡 검색");
			System.out.println("5. 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 이용할 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectMusic(); break;
			case 3: deleteMusic(); break;
			case 4: searchMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("프로그램 종료합니다."); return;
			default : System.out.println("잘못 선택했습니다. 다시 선택해");
			}
		}
		
	}
	



	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("추가할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("추가할 곡 가수명 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청보내기(사용자가 입력한 곡명, 가수명 넘기면서)
		// 즉, Controller 메소드 호출
		mc.insertMusic(title, artist);
		System.out.println("곡 추가 성공");
		
	}
	
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		
		System.out.println("\n=== 전체 곡 리스트 ===");
		
		// 전체 곡 조회요청(Controller메소드 호출)
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) { // 리스트가 비어있을 경우
			System.out.println("존재하는 곡이 없습니다");
			
		} else { // 리스트가 비어있지 않을 경우
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
	
	/**
	 * 3. 특정 곡 삭제 서브화면
	 */
	public void deleteMusic() {
		
		System.out.println("\n=== 곡 삭제 ===");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		
		// 삭제 요청 (Controller메소드 호출)
		int result = mc.deleteMusic(title);
		
		if(result > 0) { // 삭제한 곡 o
			System.out.println("삭제 성공");
		} else { // 삭제한 곡 x
			System.out.println("삭제 실패");
		}
	}
	
	
	/**
	 * 4. 특정 곡 검색 서브화면
	 */
	public void searchMusic() {
		
		System.out.println("\n=== 곡 검색 ===");
		
		/* 간단 버전
		System.out.print("곡명 검색(키워드도 가능) : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);
		*/
		
		
		// 심화 버전
		System.out.println("1) 곡명으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.print(">> 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu, keyword);
		
		
		System.out.println("\n=== 검색 결과 ===");
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다");
		} else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	
	public void updateMusic() {
		System.out.println("\n=== 곡 수정 ===");
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정 내용 (곡 명) : ");
		String upTitle = sc.nextLine();
		System.out.print("수정 내용 (가수명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
	}

}
