package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * "���� ��� ��Ʈ��" ������ �����
	 * 
	 * - ���� ��Ʈ�� : �����͸� 2����Ʈ ������ �����ϴ� ���(���� ���)
	 * - ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ���
	 * 
	 * XXXReader : �Է¿� ��Ʈ��
	 * XXXWriter : ��¿� ��Ʈ��
	 */
	
	// ���α׷� --> ���� �������� (���)
	public void fileSave() {
		
		// FileWriter : 2����Ʈ ������ ������ ������ ����ϴ� ��Ʈ��
		
		FileWriter fw = null;
		try {
			// 1. FileWriter ��ü ����
			fw = new FileWriter("char.txt");
			
			// 2. write �޼ҵ带 �̿��ؼ� 2byte������ ������ ���
			fw.write("IO �� ��մ�~~..��");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. ��� �� �� ��Ʈ�� �ݳ�
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		
		// FileReader : ������ 2byte������ �Է¹��� �� �ִ� ��Ʈ��
		
		FileReader fr = null;
		try {
			// 1. FileReader ��ü ����
			fr = new FileReader("char.txt");
			
			// 2. read �޼ҵ� �̿��ؼ� ���������� �о���̴µ� ������ ��(-1)�� ������ ��ȯ
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
				// 3. ��Ʈ�� �ݳ�
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
