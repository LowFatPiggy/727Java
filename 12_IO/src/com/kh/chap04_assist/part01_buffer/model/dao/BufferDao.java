package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * ������Ʈ�� : ��ݽ�Ʈ�������� �����ߴ� ������ ���� ��� �����ִ� ��Ʈ��
	 *          ��ݽ�Ʈ������ �������� �ʴ� �߰����� �޼ҵ� ���� ex) ������ ���� �ӵ� ��� ���
	 *    >> �ܺ� ��ü�� ���������� ����Ǵ� ��Ʈ��x
	 *       �ܵ� ��� �Ұ� (�ݵ�� ��ݽ�Ʈ���� �Բ� ���)       
	 */
	
	public void fileSave() {
		
		// FileWriter : 2byte ��¿� ��ݽ�Ʈ��
		// BufferedWriter : ���� ���� �����ϴ� ������Ʈ��
		//                  ���� ������ �׾Ƶּ� �ѹ��� ��°��� => �ӵ� ���
		
		
		/*
		// 1. ��� ��Ʈ�� ���� ����
		FileWriter fw = new FileWriter("buffer.txt");
		
		// 2. ���� ��Ʈ�� ���� �� ��ݽ�Ʈ�� ��ü�� �����ϸ鼭 ����
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		
		/*
		// ���� �� ���� �� �ٷ�
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("buffer.txt"));
			
			// write �޼ҵ� �̿��ؼ� ������ ���
			bw.write("����\n");
			bw.write("�氡");
			bw.newLine(); // �߰����� �޼ҵ� Ȱ�� ����
			bw.write("����");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. ��Ʈ�� �ݳ�
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		// try~with~resource���� (���� ���� + ��Ʈ���ݳ�) *JDK7���� �̻���� ����
		
		/*
		 * try(try�� ������ ����� ��Ʈ����ü ���� ����){ // try �� ������ ��Ʈ�� �ڵ��ݳ�
		 * 
		 * } catch(����Ŭ���� e) {
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))) {
			
			bw.write("����");
			bw.write("�氡");
			bw.newLine();
			bw.write("����");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // ��Ʈ�� �ݳ� ���� ���� = �ڵ��ݳ�
		
		
	}
	
	public void fileRead() {
		
		// FileReader : 2����Ʈ ������ ������ �Է¹޴� ��ݽ�Ʈ��
		try(BufferedReader br = new BufferedReader(new FileReader("buffer.txt"))) {
			
			/*
			// readLine() �޼ҵ带 �̿��ؼ� ���پ� �о���̱�
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine()); // ���� �� -> null ��ȯ
			*/
			
			String value = null;
			while((value = br.readLine()) != null) {
				// ���ڿ��� ���ڿ� ����񱳴� equals, �� �ܿ� != ���
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
