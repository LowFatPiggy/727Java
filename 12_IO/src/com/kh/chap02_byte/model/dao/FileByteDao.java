package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object)

public class FileByteDao {

	/*
	 * "����Ʈ ��� ��Ʈ��" ������ �����
	 * 
	 * - ����Ʈ ��Ʈ�� : �����͸� 1����Ʈ ������ �����ϴ� ���(���� ���)
	 * - ��� ��Ʈ�� : �ܺ� ��ü�� ���������� ����Ǵ� ���
	 * 
	 * XXXInputStream : XXX��ü�κ��� �����͸� �Է¹޴� ���
	 * XXXOutputStream : XXX��ü�� �����͸� ����ϴ� ���
	 */
	
	public void fileSave() {
		
		// FileOutputStream : ���ϰ� ���������� �����ؼ� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		// 1. ��Ʈ�� ���� (��� ����)
		// 2. ��Ʈ�����κ��� �����͸� ���(�޼ҵ� Ȱ��)
		// 3. ��� �� ��Ʈ�� �ݳ�
		
		
		FileOutputStream fout = null;
		// 1. FileOutputStram ��ü ���� => �ش� ���ϰ��� ������� ������
		try {
			fout = new FileOutputStream("byte.txt"/*, true*/); // �ش� ���� ������ ���� ������ְ� ��� ����
			// ���� ���Ͽ� �̾ ����ؼ� �ۼ��ϰ� ������ �Ű������� ", true" �߰�
			// true ���ۼ��� �����
			
			// 2. ���Ͽ� �����͸� ����ϰ��� �� ��  write �޼ҵ� ���
			//    ���ڸ� ����ϴ� ���ڸ� ����ϵ� �ǻ� ���Ͽ� ��ϵǴ� �� ���ڷ� ��� *�ƽ�Ű�ڵ�ǥ(���� 0~127)
			fout.write(97); // 'a'���ڰ� ����
			fout.write('b'); // 'b'���ڰ� ����
			fout.write('��'); // �� ���ڴ� 2byte => �ٰ����� ���(����) // '@'���
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // ���������� ������ ��� 'c''d''e'
			
			// write(byte[] b, int off, int len) : byte�迭�� off�ε������� len������ŭ ���
			fout.write(arr, 1, 2); // 'd''e' ���� ����
			
			
			// 3. ��Ʈ�� �� �̿��ϸ� �ݵ�� �ݳ�
			// fout.close(); 
			// ������ IOException �߻��ϸ� catch�� ���� �� break; => �ݳ��ڵ� ����x
			// �ذ��� => finally(�ݵ�� �����ؾ��ϴ� ���� �ۼ�)
			
			
		} catch (FileNotFoundException e) { // �������� �ʴ� ��� ���ý� �߻�
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // � ���ܰ� �߻��ߴ����� ������ �����ϰ� break;
		
			// 3. ��Ʈ�� �� �̿��ϸ� �ݵ�� �ݳ�
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void fileRead() {
		
		// FileInputStream : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ��
		
		// 1. ��Ʈ�� ����(��� ����)
		// 2. ��Ʈ�� ���ؼ� �Է��� �޾ƿ� (�޼ҵ� Ȱ��)
		// 3. ����� ���� ��Ʈ�� �ݳ�
		
		FileInputStream fin = null;
		try {
			// 1. FileInputStream ��ü ���� => ������� ����
			fin = new FileInputStream("byte.txt");
			
			// 2. ���Ϸκ��� �����͸� �о���̰��� �� �� read �޼ҵ� ���
			//    1byte������ �ϳ��� ���ڷ� �о��
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); // ������ ���� ������ ���� -1�� �о����
			*/
			
			
			// fin.read() �����ϰ� �ۼ�
			
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/ // ����: �������� �о�� (��? read()�� �ι��� �б⶧��)
			
			
			// read() �ݺ��� ���� �� �Ź� �ѹ��� ����ǵ���
			// �ذ��� 1. ���ѹݺ��ȿ� �Ź� ���ǰ˻�
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// �ذ��� 2. ���� ���
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. ����� ���� ��Ʈ�� �ݳ�
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
