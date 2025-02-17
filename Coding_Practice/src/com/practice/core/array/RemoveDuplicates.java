package com.practice.core.array;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		 int[] arr = { 70, 10, 20 , 30 , 10 , 40 , 10 , 20 , 50 } ;
		 
		LinkedHashSet<Integer> removeDuplicates = new LinkedHashSet<Integer>();
		
 		for(int num : arr) {
			
			removeDuplicates.add(num);
		}
		
		System.out.println(removeDuplicates);
		 

	}

}
