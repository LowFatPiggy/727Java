package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	
	public static void main(String[] args) {
		
		/*
		 * * ��Ʈ��ũ(Network) : �������� ��ǻ�͵��� ����Ǿ��ִ� ��Ÿ�
		 *                   => ��Ʈ��ũ�� ���� ���ΰ��� ������ ��ȯ ����
		 *                   
		 * * IP �ּ� : ��Ʈ��ũ �� �� ��ǻ�͵��� �ĺ��� �� �� �ִ� ��ȣ (��ǻ���� �ֹι�ȣ)
		 * 
		 * * ������ Ŭ���̾�Ʈ
		 *   > ���� : Ŭ���̾�Ʈ(��)���� ���񽺸� �������ִ� ���α׷� (Ŭ���̾�Ʈ�� ��û�� ó���ؼ� ����)
		 *   > Ŭ���̾�Ʈ : ������ ��û�ϴ� ��ǻ�� (���񽺸� �����޴� ��)
		 * 
		 * - ������ ��û�ϱ� ���ؼ��� �� ��û�ϰ��� �ϴ� ������ IP�ּ�(�Ǵ� �����θ�), ��Ʈ��ȣ�� �˾ƾ�
		 */
		
		// InetAddress : ��Ʈ��ũ ����(ip�ּ� ����)�� Ȯ���� �� �ִ� Ŭ����
		
		
		try {
			InetAddress localhost = InetAddress.getLocalHost(); // ��PC(����ȣ��Ʈ)�� ���� ������ ��ȯ
			System.out.println(localhost); // �� pc�� + / + �� ip�ּ�
			
			System.out.println("�� pc�� : " + localhost.getHostName());
			System.out.println("�� ip�ּ� : " + localhost.getHostAddress());
			
			System.out.println("--------------------------");
			
			// �������� ���ؼ� �� �������õ� ���� ����
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // getByName : �����θ��� ���� �ش� ȣ��Ʈ�� ���� ���� ��ȯ
			System.out.println("���� ������ : " + googleHost.getHostName());
			System.out.println("���� ip�ּ� : " + googleHost.getHostAddress());
			
			System.out.println("--------------------------");
			
			// �������� ���ؼ� �� ���������� �͵��� �迭�� �޾�
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("���̹� ȣ��Ʈ ���� : " + naverHost.length);
			for(InetAddress n : naverHost) {
				System.out.println("���̹� ������ : " + n.getHostName());
				System.out.println("���̹� ip�ּ� : " + n.getHostAddress());
			}
			
	
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * * ���� �������� ������ ������
		 *   Ŭ���̾�Ʈ�� �� ������ ��û ���� => ������ ���ƿ�
		 *   
		 * - ��û�� ���信 ���ؼ� ���α׷��� �۵� ("���"�Ѵ� ǥ��)
		 * - ������ ��Ź�� : HTTP �������� ���
		 * 
		 * * �ڹٸ����� ����-Ŭ���̾�Ʈ ������ ��� �غ���
		 *  >> �̶� �����͸� ������ϰ��� �Ѵٸ� ������ Ŭ���̾�Ʈ���� ��Ʈ��(�������)�� �ʿ�
		 *  - ����: ���μ������� ����� ��� (��Ʈ���� �����ϱ� ���� ��)
		 *  - ���� ���α׷��� (TCP��� / UDP���)
		 *  : TCP��� - ������ ���ۼӵ��� �������� ��Ȯ�ϰ� ���������� ���۰��� (�ŷڼ� �䱸�Ǵ� ���α׷� : http, �̸���, FTP�����������ϵ� ��)
		 *  : UDP��� - ������ ���ۼӵ��� �������� �ŷڼ����� ������ ���޵� �� ���� (�����͸� ���� �ӵ��� �����ϰ��� �ϴ� ���α׷� : �ǽð������󼭺�)
		 */
		
		
		
	}
}

