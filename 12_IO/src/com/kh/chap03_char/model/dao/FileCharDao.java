package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * "문자 기반 스트림" 데이터 입출력
	 * 
	 * - 문자 스트림 : 데이터를 2바이트 단위로 전송하는 통로(넓은 통로)
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * XXXReader : 입력용 스트림
	 * XXXWriter : 출력용 스트림
	 */
	
	// 프로그램 --> 파일 내보내기 (출력)
	public void fileSave() {
		
		// FileWriter : 2바이트 데이터 단위로 파일을 출력하는 스트림
		
		FileWriter fw = null;
		try {
			// 1. FileWriter 객체 생성
			fw = new FileWriter("char.txt");
			
			// 2. write 메소드를 이용해서 2byte단위로 데이터 출력
			fw.write("IO 참 재밌다~~..ㅎ");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 사용 다 한 스트림 반납
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		
		// FileReader : 파일을 2byte단위로 입력받을 수 있는 스트림
		
		FileReader fr = null;
		try {
			// 1. FileReader 객체 생성
			fr = new FileReader("char.txt");
			
			// 2. read 메소드 이용해서 정수값으로 읽어들이는데 파일의 끝(-1)을 만나면 반환
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
