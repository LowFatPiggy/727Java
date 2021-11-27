package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	public void fileSave() {
		
		// ����� ������(Phone ��ü)
		Phone ph = new Phone("�����ó�Ʈ9", 1000000);
		
		// FileOutputStream : 1����Ʈ ������ ������ ����� �� �ִ� ��ݽ�Ʈ��
		// ObjectOutputStream : ��ü ������ ����� �� �ֵ��� ���� �ִ� ������Ʈ��(ObjectWriter X)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �ܰ� ��µ����� ���������� ��µ� ��. -> �о���� ���� ���ϴ� ���� �״�� 
	
	
	public void fileRead() {
		
		// FileInputStream : 1����Ʈ ������ ������ �Է¹޴� ��ݽ�Ʈ��
		// ObjectInputStream : ��ü ������ �Է¹��� �� �ִ� ������Ʈ�� (ObjectReader X)
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			
			Phone ph = (Phone) ois.readObject();
			System.out.println(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
