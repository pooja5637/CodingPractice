package com.practice.core.set;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndDifferenceOfTwoSets {

	 public static void unionAndDifference() {
		 
	        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
	        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

	        // Union
	        HashSet<Integer> union = new HashSet<>(set1);
	        
	        union.addAll(set2);
	        
	        System.out.println("Union: " + union);
	        
	        // Difference
	        
	        HashSet<Integer> difference = new HashSet<>(set1);
	        
	        difference.removeAll(set2);
	        System.out.println("Difference: " + difference);
	        
	 }
	 
	 public static void main(String[] args) {
		
		 
		 unionAndDifference();
	}
}
