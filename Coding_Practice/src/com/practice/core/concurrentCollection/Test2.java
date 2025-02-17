package com.practice.core.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {

	public static void main(String[] args) {

		
//		ArrayList<String> al = new ArrayList();
//		
//		al.add("mango");
//		al.add("apple");
//		al.add("banana");
//		
//		for(String item:al) {
//			
//			System.out.println(al);
//			
//			// try to modify the list while reading
//			
//			if(item.equals("mango")) {
//				
//				al.add("mixed juice"); // R.E java.util.ConcurrentModificationException
//				System.out.println("added mixed juice while reading");
//			}
//			
//		}
//		
//		System.out.println("Updated list : " + al);
		

		List<String> l = new CopyOnWriteArrayList<>() ;
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		System.out.println(l);
		
		Iterator<String> itr = l.iterator();
		
		l.add("Z");
		
		while( itr.hasNext()) {
			
			String s = itr.next();
			System.out.println(s);
			

			
			if(s.equals("C")) {
				l.add("E");
				System.out.println("***E added!!!***");
			}
			

			
		}
		System.out.println(l);	
	}

}
