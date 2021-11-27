package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("¯����", 1200000);
		arr[1] = new Phone("������", 1400000);
		arr[2] = new Phone("������", 1100000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"))) {
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �ܰ� ��µ����� ���������� ��µ� ��. -> �о���� ���� ���ϴ� ���� �״�� 
	
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // ���� �� -> EOFException
			*/
			
			while(true) { // ���ѹݺ� �߿� EOFException�� ������ ����ó���ǰ� ��������
				System.out.println(ois.readObject());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("������ �� �о�鿴���ϴ�.");
		} catch (IOException e) { // EOFException ����ó������
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� �����մϴ�.");
	}
}
