package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// controller : 사용자의 요청 처리
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	
	// 실행시키고자 하는 출력문 곧바로 작성x => 중괄호 블럭 안에 작성
	{ // 초기화 블럭
		list.add(new Music("안녕 (You & I", "샤이니"));
		list.add(new Music("everyday we fight", "데이식스"));
		list.add(new Music("바보", "동방신기"));
	}

	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}

	public ArrayList<Music> selectMusic() {
		return list;
	}

	public int deleteMusic(String title) {
		
		int result = 0;
		
		// 리스트 공간에 순차적으로 접근하여 일치하는 곡명을 찾아 삭제
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
			 // 뮤직객체덩어리.  타이틀만
				list.remove(i);
				
				result = 1; // 삭제가 되면 result는 1
				break;
			}
		}
		return result;	
		// result = 0 or 1
	}
	
	// 1. 검색 간단버전
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		// 검색된 Music객체를 차곡차곡 담을 list
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				// System.out.println(list.get(i)); // 출력문 불가
				searchList.add(list.get(i));				
			}
		}
		return searchList;
		// 비어있거나 검색된 Music 객체들이 담긴 리스트를 리턴
	}
	
	// 2. 검색 심화버전
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); // 검색결과 보관 리스트
		
		if(menu == 1) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
		
		
		
	}

	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
	}
	
	
	
}
