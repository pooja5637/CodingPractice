package com.practice.core.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicate {

	/*
	 * Write a method to find duplicate elements in an integer array using a HashSet.

	   Example:
	   Input: [1, 2, 3, 4, 2, 5, 1]
	   Output: [1, 2]
	 */

	public static List<Integer> findDuplicates(int[] arr) {
		
		
        HashSet<Integer> set = new HashSet<>();
        
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
        	
            if ( ! set.add(num)) {
            	
                duplicates.add(num);
            }
        }

        return new ArrayList<>(duplicates);
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,5,1,2};
		
		System.out.println(findDuplicates(arr));
	}

}
