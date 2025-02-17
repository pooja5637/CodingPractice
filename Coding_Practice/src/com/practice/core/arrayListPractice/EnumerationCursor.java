package com.practice.core.arrayListPractice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			v.addElement(i);
		}
		
		System.out.println(v);
		
		
		System.out.println("****************************************************");
		
		Enumeration<Integer> e = v.elements();
		
//		while(e.hasMoreElements()) {
//			
//			System.out.println(e.nextElement());
//		}
		
		
		System.out.println("****************************************************");

		
		while(e.hasMoreElements()) {
			
			int i = e.nextElement();
			
			if( i %2 == 0 ) {
				
				System.out.println(i);
			}
		}
		
	}
	
	

}
