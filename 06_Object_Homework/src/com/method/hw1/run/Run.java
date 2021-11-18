package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		
		System.out.print("1. ·£´ý °ª : ");
		nss.printLottoNumbers();
		
		System.out.println();
		nss.outputChar(5, 'a');
		
		System.out.println();
		
		System.out.println(nss.alphabette());
		
		
		System.out.println(nss.mySubstring("apple", 2, 4));

	}

}
