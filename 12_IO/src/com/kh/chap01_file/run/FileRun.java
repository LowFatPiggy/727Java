package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단한 파일 만들어지는 과정
		// java.io.File 클래스
		
		
		try {
			// 1. 경로지정을 하지 않은 상태로 파일 생성 => 작업중인 프로젝트(12_IO) 폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐
			
			
			// 2. 존재하는 폴더로 경로를 지정해서 파일 새성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile(); // 존재하지 않는 경로를 제시하면 IOException 발생
			
			
			// 3. 폴더 만들고 파일까지 생성
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // 폴더 생성 메소드
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			
			System.out.println(f1.exists()); // f1파일 있는가?
			System.out.println(new File("ttt.txt").exists()); // 생성(createNewFile)하지도 않은 ttt파일 있는가?
			
			System.out.println(f1.isFile()); // f1 파일인가?
			System.out.println(tempFolder.isFile()); // tempFolder 파일인가?
			
			
			// -----------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsoluteFile());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다");
	}
	
	/*
	 * 프로그램 상의 데이터를 외부매체로 출력을 한다거나 또는 외부매체로부터 입력을 받는 법
	 * 반드시 그 외부매체와 통로를 만들어야 함 => 통로 = 스트림
	 * 
	 * * 스트림(통로)의 특징
	 *  - 단방향 : 입력하면 입력 / 출력이면 출력만 가능
	 *          => 입력과 출력을 동시다발적으로 하고 싶다면 입력용/출력용스트림 따로 열어야
	 *  - 선입선출(FIFO) : 통로가 파이프같은 개념이기 때문에 먼저 보낸 값이 먼저 나옴
	 *  - 시간지연(delay)이라는 문제가 생길 수 있음
	 *  
	 * * 스트림의 구분
	 * > 통로의 사이즈 (1byte / 2byte)
	 *  - 바이트 스트림 : 1byte만 오갈 수 있는 정도의 사이즈 (좁은통로) => 입력(InputStream) / 출력(OutputStream)
	 *  - 문자 스트림 : 2byte도 오갈 수 있는 정도의 사이즈 (넓은통로) => 입력(Reader) / 출력(writer)
	 * 
	 * > 외부매체와 직접 연결하는 유무
	 *  - 기반 스트림 : 외부 매체와 직접적으로 연결하는 통로(필수)
	 *  - 보조 스트림 : 보조역할만 하는 통로(속도를 빠르게 한다거나, 그외에 유용한 기능들 제공)
	 *  			보조스트림 단독으로 사용 불가 (기반 스트림 필수)
	 */

}
