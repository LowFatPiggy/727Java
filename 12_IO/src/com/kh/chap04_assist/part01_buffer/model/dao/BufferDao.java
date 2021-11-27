package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 *          기반스트림에서 제공하지 않는 추가적인 메소드 제공 ex) 데이터 전송 속도 향상 등등
	 *    >> 외부 매체와 직접적으로 연결되는 스트림x
	 *       단독 사용 불가 (반드시 기반스트림과 함께 사용)       
	 */
	
	public void fileSave() {
		
		// FileWriter : 2byte 출력용 기반스트림
		// BufferedWriter : 버퍼 공간 제공하는 보조스트림
		//                  버퍼 공간에 쌓아둬서 한번에 출력가능 => 속도 향상
		
		
		/*
		// 1. 기반 스트림 먼저 생성
		FileWriter fw = new FileWriter("buffer.txt");
		
		// 2. 보조 스트림 생성 시 기반스트림 객체를 전달하면서 생성
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		
		/*
		// 위의 두 줄을 한 줄로
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("하이\n");
			bw.write("방가");
			bw.newLine(); // 추가적인 메소드 활용 가능
			bw.write("바이");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 반납
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		// try~with~resource구문 (간단 버전 + 스트림반납) *JDK7버전 이상부터 가능
		
		/*
		 * try(try블럭 내에서 사용할 스트림객체 생성 구문){ // try 다 끝나면 스트림 자동반납
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))) {
			
			bw.write("하이");
			bw.write("방가");
			bw.newLine();
			bw.write("바이");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 스트림 반납 구문 생략 = 자동반납
		
		
	}
	
	public void fileRead() {
		
		// FileReader : 2바이트 단위로 파일을 입력받는 기반스트림
		try(BufferedReader br = new BufferedReader(new FileReader("buffer.txt"))) {
			
			/*
			// readLine() 메소드를 이용해서 한줄씩 읽어들이기
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // 파일 끝 -> null 반환
			*/
			
			String value = null;
			while((value = br.readLine()) != null) {
				// 문자열과 문자열 동등비교는 equals, 그 외엔 != 사용
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
