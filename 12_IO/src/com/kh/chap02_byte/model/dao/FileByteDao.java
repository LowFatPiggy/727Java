package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object)

public class FileByteDao {

	/*
	 * "바이트 기반 스트림" 데이터 입출력
	 * 
	 * - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로)
	 * - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로
	 * 
	 * XXXInputStream : XXX매체로부터 데이터를 입력받는 통로
	 * XXXOutputStream : XXX매체로 데이터를 출력하는 통로
	 */
	
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성 (통로 생성)
		// 2. 스트림으로부터 데이터를 출력(메소드 활용)
		// 3. 사용 후 스트림 반납
		
		
		FileOutputStream fout = null;
		// 1. FileOutputStram 객체 생성 => 해당 파일과의 연결통로 생성됨
		try {
			fout = new FileOutputStream("byte.txt"/*, true*/); // 해당 파일 없으면 새로 만들어주고 통로 연결
			// 기존 파일에 이어서 계속해서 작성하고 싶으면 매개변수에 ", true" 추가
			// true 미작성시 덮어씌워
			
			// 2. 파일에 데에터를 출력하고자 할 때  write 메소드 사용
			//    숫자를 출력하던 문자를 출력하든 실상 파일에 기록되는 건 문자로 기록 *아스키코드표(숫자 0~127)
			fout.write(97); // 'a'문자가 저장
			fout.write('b'); // 'b'문자가 저장
			fout.write('김'); // 한 글자는 2byte => 꾸겨져서 기록(깨짐) // '@'출력
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // 순차적으로 데이터 출력 'c''d''e'
			
			// write(byte[] b, int off, int len) : byte배열의 off인덱스부터 len갯수만큼 출력
			fout.write(arr, 1, 2); // 'd''e' 문자 저장
			
			
			// 3. 스트림 다 이용하면 반드시 반납
			// fout.close(); 
			// 위에서 IOException 발생하면 catch블럭 실행 후 break; => 반납코드 실행x
			// 해결방법 => finally(반드시 실행해야하는 구문 작성)
			
			
		} catch (FileNotFoundException e) { // 존재하지 않는 경로 제시시 발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생했던간에 무조건 실행하고 break;
		
			// 3. 스트림 다 이용하면 반드시 반납
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. 스트림 생성(통로 생성)
		// 2. 스트림 통해서 입력을 받아옴 (메소드 활용)
		// 3. 사용이 끝난 스트림 반납
		
		FileInputStream fin = null;
		try {
			// 1. FileInputStream 객체 생성 => 연결통로 생성
			fin = new FileInputStream("byte.txt");
			
			// 2. 파일로부터 데이터를 읽어들이고자 할 때 read 메소드 사용
			//    1byte단위로 하나씩 숫자로 읽어옴
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1을 읽어들임
			*/
			
			
			// fin.read() 간단하게 작성
			
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/ // 문제: 퐁당퐁당 읽어옴 (왜? read()를 두번씩 읽기때문)
			
			
			// read() 반복문 수행 시 매번 한번씩 실행되도록
			// 해결방법 1. 무한반복안에 매번 조건검사
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법 2. 권장 방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. 사용이 끝난 스트림 반납
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
