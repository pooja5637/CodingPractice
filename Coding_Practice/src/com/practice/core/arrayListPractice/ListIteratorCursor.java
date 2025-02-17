package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {

		
		List<Integer> l =new ArrayList<>();
		
		for(int i = 1; i <= 10 ; i++) {
			
			l.add(i);
		}
		
		System.out.println(l);
		
		System.out.println("**************************************************");
		
		
		ListIterator<Integer> ltr = l.listIterator();

		while( ltr.hasNext()) {
			
			int i = ltr.next();

			
			if(i %2 == 0)
			{

				System.out.println(i);
			}
			else {
			
				ltr.remove();
			}
			
		}
		
		System.out.println(l);
		System.out.println("**************************************************");
	
		while(ltr.hasPrevious()) {
		 System.out.println(ltr.previous());
	}
	}

}
