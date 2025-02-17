package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	public static void main(String[] args) {

		
		List<Integer> l =new ArrayList<>();
		
		for(int i = 1; i <= 10 ; i++) {
			
			l.add(i);
		}
		
		System.out.println(l);
		
		System.out.println("**************************************************");
		
		Iterator<Integer> itr = l.iterator();
		
		
		while( itr.hasNext()) {
			
			System.out.println( itr.next() );
		}
		
		itr.remove();
		System.out.println(l);
		
		System.out.println("**************************************************");

		for(int num : l) {
			System.out.println(num);
		}
	
	}

}
