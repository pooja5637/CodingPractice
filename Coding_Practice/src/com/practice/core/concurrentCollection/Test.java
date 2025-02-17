package com.practice.core.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("fourth");
		
		
		Iterator itr = al.iterator();
		
		while( itr.hasNext()) {
			
			//al.remove(3);
			System.out.println(itr.next());
		//	al.add(5); // RE. : java.util.ConcurrentModificationException
			
			al.set(2, "pp");
		//	al.remove(2); // RE. : java.util.ConcurrentModificationException
			
		// if list size is changed we will get runtime exception saying, ConcurrentModificationException	
			
		}
		
		// We can solve this problem by using CopyOnWriteArrayList()
		

	}

}
