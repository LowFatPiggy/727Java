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
	 * - ����, Ŭ���̾�Ʈ ���� 1:1 ���� ���
	 * - �����͸� ��ȯ�ϱ⿡ �ռ��� ����, Ŭ���̾�Ʈ ����Ǿ��־�� (������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û ���)
	 * - �ŷڼ� �ִ� ������ ���� ����
	 * 
	 *  Socket
	 * - ���μ��� ���� ����� ���
	 * - Input / OutputStream�� ���� �����
	 * 
	 *  ServerSocket
	 * - ��Ʈ�� ����(Bind)�Ǿ� �ܺ��� ���� ��û�� ��ٸ��� �����û�� ������ ������ �� �뵵
	 * - ���� => ����� �� �ִ� Socket ����
	 */
	
	// ������ ���α׷�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) ��Ʈ ��ȣ ���� (���������� �� �� ��Ʈ�� ��θ� �� ������)
		int port = 3000;
		
		ServerSocket server = null;
		try {
			// 2) ServerSocket ��ü ���� �� ��Ʈ ����(Bind)
			//    ServerSocket: Ŭ���̾�Ʈ�� �����û�� �޾��� �뵵�� ����
			server = new ServerSocket(port);
			
			// 3) Ŭ���̾�Ʈ�κ��� ���� ��û�� �� ������ ��� ����
			System.out.println("..Ŭ���̾�Ʈ�� ��û ��� ��..");
			
			// 4) ���� ��û�� ���� ���� ��, �ش� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ ���� ��ü ����
			Socket socket = server.accept(); // socket == Ŭ���̾�Ʈ�� ����� �� �ִ� ���� ��ü
			System.out.println(".." + socket.getInetAddress().getHostAddress() + "�� ������ ��û��..");
			
			// 5) Ŭ���̾�Ʈ�� ����� ��Ʈ�� ���� (only ����Ʈ ��Ʈ��)
			// 6) ������Ʈ���� ���ؼ� ���� ����
			
			// �Է¿� ��Ʈ��
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��¿� ��Ʈ��
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter : ������ ��½� print(), println() �޼ҵ带 ������ �ִ� ������Ʈ��
			
			while(true) {
				// 7) ��Ʈ���� ���� �а� ����
				// Ŭ���̾�Ʈ�κ��� ���޵� �޼����� ���� ��� ���������� �о���� (�Է�)
				String message = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�κ��� ���޹��� �޼��� : " + message);
				
				// �ݴ�� Ŭ���̾�Ʈ���� ������ ���� (���)
				System.out.print("Ŭ���̾�Ʈ���� ���� ���� : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // Ŭ���̾�Ʈ���� ���
				pw.flush(); // ���� ��Ʈ���� �ִ� �����͸� ������ �������� �޼ҵ� (close�޼ҵ� ȣ��Ǹ� �ڵ����� flush)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 5) ��� ����
				pw.close();
				br.close();
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
