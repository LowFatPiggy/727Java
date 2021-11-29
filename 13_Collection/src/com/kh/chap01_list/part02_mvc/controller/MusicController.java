package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

// controller : ������� ��û ó��
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	
	// �����Ű���� �ϴ� ��¹� ��ٷ� �ۼ�x => �߰�ȣ �� �ȿ� �ۼ�
	{ // �ʱ�ȭ ��
		list.add(new Music("�ȳ� (You & I", "���̴�"));
		list.add(new Music("everyday we fight", "���̽Ľ�"));
		list.add(new Music("�ٺ�", "����ű�"));
	}

	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}

	public ArrayList<Music> selectMusic() {
		return list;
	}

	public int deleteMusic(String title) {
		
		int result = 0;
		
		// ����Ʈ ������ ���������� �����Ͽ� ��ġ�ϴ� ����� ã�� ����
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
			 // ������ü���.  Ÿ��Ʋ��
				list.remove(i);
				
				result = 1; // ������ �Ǹ� result�� 1
				break;
			}
		}
		return result;	
		// result = 0 or 1
	}
	
	// 1. �˻� ���ܹ���
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		// �˻��� Music��ü�� �������� ���� list
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				// System.out.println(list.get(i)); // ��¹� �Ұ�
				searchList.add(list.get(i));				
			}
		}
		return searchList;
		// ����ְų� �˻��� Music ��ü���� ��� ����Ʈ�� ����
	}
	
	// 2. �˻� ��ȭ����
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); // �˻���� ���� ����Ʈ
		
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
