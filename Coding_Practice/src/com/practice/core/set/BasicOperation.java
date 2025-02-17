package com.practice.core.set;

import java.util.HashSet;
import java.util.Iterator;

public class BasicOperation {
	
	/*
	 * Write a Java program to demonstrate the following operations with a HashSet:

	   Add elements to the set.
	   Check if an element exists.
	   Remove an element.
	   Iterate through the set.
	 */

	public static void main(String[] args) {

		// Create HashSet Object 
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// Add elements to the set 
		
		hs.add(2);
		hs.add(5);
		hs.add(7);
		hs.add(2);
		hs.add(9);
		hs.add(5);
		
		System.out.println(hs);
		
		System.out.println("*****************************************************");
		
		// check if an element exist
		
		System.out.println(hs.contains(4));
		System.out.println(hs.contains(7));
		
		System.out.println("*****************************************************");

		
		// remove an element 
		
		hs.remove(2);
		
		System.out.println(hs);
		
		System.out.println("*****************************************************");

		
		// iterate through the set : 1
		
		Iterator<Integer> itr = hs.iterator();
		
		while( itr.hasNext()) {
			
			System.out.println( itr.next());
		}
		
		
		System.out.println("*****************************************************");

		// iterate through the set : 2
		
		for( int num : hs) {
			
			System.out.println( num );
		}
		
	}

}
