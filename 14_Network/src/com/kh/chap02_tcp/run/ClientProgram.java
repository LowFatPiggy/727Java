package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket = null;
		
		int port = 3000;
		String serverIP;
		
		
		try {
			
		    serverIP = "222.120.120.27";
			
			// 1) ������ ���� ��û ������ ���� (��û�ϰ��� �ϴ� ������ IP�ּҿ� ������ ��Ʈ��ȣ�� �����ϸ鼭 ���� ��ü ����)
			socket = new Socket(serverIP, port);
			// ���� ��ſ� ���еǸ� null���� socket�� ���
			
			if(socket != null) {
				System.out.println("������ ���� ����");
				
				// 2) ������ ����� ��ݽ�Ʈ�� ����
				// 3) ������Ʈ���� ���ؼ� ���� ����
				// �Է¿� ��Ʈ��
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// ��¿� ��Ʈ��
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					
					// 4) ��Ʈ���� ���� �а� ����
					System.out.print("�������� ���� ���� : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("�����κ��� ���޹��� �޼��� : " + message);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// 5) ��� ����
				pw.close();
				br.close();
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
