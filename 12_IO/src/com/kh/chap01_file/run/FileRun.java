package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// ������ ���� ��������� ����
		// java.io.File Ŭ����
		
		
		try {
			// 1. ��������� ���� ���� ���·� ���� ���� => �۾����� ������Ʈ(12_IO) ������ ���� ����
			File f1 = new File("test.txt");
			f1.createNewFile(); // �޼ҵ���� �����ؾ߸� ���� ������ �������
			
			
			// 2. �����ϴ� ������ ��θ� �����ؼ� ���� ����
			File f2 = new File("D:\\test.txt");
			f2.createNewFile(); // �������� �ʴ� ��θ� �����ϸ� IOException �߻�
			
			
			// 3. ���� ����� ���ϱ��� ����
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // ���� ���� �޼ҵ�
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			
			System.out.println(f1.exists()); // f1���� �ִ°�?
			System.out.println(new File("ttt.txt").exists()); // ����(createNewFile)������ ���� ttt���� �ִ°�?
			
			System.out.println(f1.isFile()); // f1 �����ΰ�?
			System.out.println(tempFolder.isFile()); // tempFolder �����ΰ�?
			
			
			// -----------------------------
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ : " + file.getAbsoluteFile());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}
	
	/*
	 * ���α׷� ���� �����͸� �ܺθ�ü�� ����� �Ѵٰų� �Ǵ� �ܺθ�ü�κ��� �Է��� �޴� ��
	 * �ݵ�� �� �ܺθ�ü�� ��θ� ������ �� => ��� = ��Ʈ��
	 * 
	 * * ��Ʈ��(���)�� Ư¡
	 *  - �ܹ��� : �Է��ϸ� �Է� / ����̸� ��¸� ����
	 *          => �Է°� ����� ���ôٹ������� �ϰ� �ʹٸ� �Է¿�/��¿뽺Ʈ�� ���� �����
	 *  - ���Լ���(FIFO) : ��ΰ� ���������� �����̱� ������ ���� ���� ���� ���� ����
	 *  - �ð�����(delay)�̶�� ������ ���� �� ����
	 *  
	 * * ��Ʈ���� ����
	 * > ����� ������ (1byte / 2byte)
	 *  - ����Ʈ ��Ʈ�� : 1byte�� ���� �� �ִ� ������ ������ (�������) => �Է�(InputStream) / ���(OutputStream)
	 *  - ���� ��Ʈ�� : 2byte�� ���� �� �ִ� ������ ������ (�������) => �Է�(Reader) / ���(writer)
	 * 
	 * > �ܺθ�ü�� ���� �����ϴ� ����
	 *  - ��� ��Ʈ�� : �ܺ� ��ü�� ���������� �����ϴ� ���(�ʼ�)
	 *  - ���� ��Ʈ�� : �������Ҹ� �ϴ� ���(�ӵ��� ������ �Ѵٰų�, �׿ܿ� ������ ��ɵ� ����)
	 *  			������Ʈ�� �ܵ����� ��� �Ұ� (��� ��Ʈ�� �ʼ�)
	 */

}
