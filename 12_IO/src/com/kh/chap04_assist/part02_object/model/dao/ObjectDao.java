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
		
		// 출력할 데이터(Phone 객체)
		Phone ph = new Phone("갤럭시노트9", 1000000);
		
		// FileOutputStream : 1바이트 단위로 파일을 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움 주는 보조스트림(ObjectWriter X)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 외계어가 출력되지만 정상적으로 출력된 것. -> 읽어들일 때는 원하는 내용 그대로 
	
	
	public void fileRead() {
		
		// FileInputStream : 1바이트 단위로 파일을 입력받는 기반스트림
		// ObjectInputStream : 객체 단위로 입력받을 수 있는 보조스트림 (ObjectReader X)
		
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
