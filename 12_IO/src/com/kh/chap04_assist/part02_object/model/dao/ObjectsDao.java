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
		arr[0] = new Phone("짱구폰", 1200000);
		arr[1] = new Phone("유리폰", 1400000);
		arr[2] = new Phone("훈이폰", 1100000);
		
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

	// 외계어가 출력되지만 정상적으로 출력된 것. -> 읽어들일 때는 원하는 내용 그대로 
	
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))) {
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일 끝 -> EOFException
			*/
			
			while(true) { // 무한반복 중에 EOFException을 만나면 예외처리되고 빠져나감
				System.out.println(ois.readObject());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) { // EOFException 예외처리가능
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료합니다.");
	}
}
