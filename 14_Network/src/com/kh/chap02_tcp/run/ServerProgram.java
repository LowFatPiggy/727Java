package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	
	/*
	 *  TCP(Transmission Control Protocol)
	 * - 서버, 클라이언트 간의 1:1 소켓 통신
	 * - 데이터를 교환하기에 앞서서 서버, 클라이언트 연결되어있어야 (서버가 먼저 실행되어 클라이언트의 요청 대기)
	 * - 신뢰성 있는 데이터 전달 가능
	 * 
	 *  Socket
	 * - 프로세스 간의 통신을 담당
	 * - Input / OutputStream을 통해 입출력
	 * 
	 *  ServerSocket
	 * - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 들어오면 수락해 줄 용도
	 * - 수락 => 통신할 수 있는 Socket 생성
	 */
	
	// 서버용 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) 포트 번호 지정 (서버측에서 몇 번 포트로 통로를 열 것인지)
		int port = 3000;
		
		ServerSocket server = null;
		try {
			// 2) ServerSocket 객체 생성 시 포트 결합(Bind)
			//    ServerSocket: 클라이언트의 연결요청을 받아줄 용도의 소켓
			server = new ServerSocket(port);
			
			// 3) 클라이언트로부터 접속 요청이 올 때까지 대기 상태
			System.out.println("..클라이언트의 요청 대기 중..");
			
			// 4) 연결 요청이 오면 수락 후, 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept(); // socket == 클라이언트와 통신할 수 있는 소켓 객체
			System.out.println(".." + socket.getInetAddress().getHostAddress() + "가 연결을 요청함..");
			
			// 5) 클라이언트와 입출력 스트림 생성 (only 바이트 스트림)
			// 6) 보조스트림을 통해서 성능 개선
			
			// 입력용 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter : 데이터 출력시 print(), println() 메소드를 가지고 있는 보조스트림
			
			while(true) {
				// 7) 스트림을 통해 읽고 쓰기
				// 클라이언트로부터 전달된 메세지가 있을 경우 서버측에서 읽어들임 (입력)
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
				
				// 반대로 클라이언트에게 데이터 전달 (출력)
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내는 메소드 (close메소드 호출되면 자동으로 flush)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 5) 통신 종료
				pw.close();
				br.close();
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
