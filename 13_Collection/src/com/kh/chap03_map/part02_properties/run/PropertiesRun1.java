package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map계열의 컬렉션 => 키+밸류 세트로 저장
		// HashMap과의 차이점 : Properties에는 키값도 String, 밸류값도 String으로 담김
		
		Properties prop = new Properties();
		
		/*
		// Map 계열이기 때문에 put메소드 이용해서 키+밸류 세트 담기 가능
		prop.put("오예스", new Snack("초콜릿코티드케이크", 1800));
		prop.put("쫀득초코칩", new Snack("찰떡초코칩쿠키", 950));
		
		System.out.println(prop);
		System.out.println(prop.get("오예스")); // get메소드 이용가능
		
		// 하지만 properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력, 입력받아 올 때 사용 
		// 즉, Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			// **ClassCastException 발생
			// 내부적으로 store 실행 시 Properties에 담겨있는 키+밸류 세트들은 String으로 형변환해서 출력함
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
		
		// Properties 키+밸류 세트로 추가할 때
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서유지x, key값 중복 시 덮어씌워져
		
		// 2. getProperty(String key) : String
		// key값의 해당 밸류값을 반환
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("오예스")); // 존재하지않는 key값은 null반환
		
		try {
			// 3. store(OutPutStream os, String comments)
			//    Properties에 담겨있는 key-value값들을 파일로 출력(내부적으로 다 String)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// 4. storeToXML(OutPutStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
