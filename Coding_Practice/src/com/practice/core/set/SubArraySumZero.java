package com.practice.core.set;

import java.util.HashSet;

public class SubArraySumZero {

	
	public class SubarraySumZero {
		
	    public static boolean hasZeroSumSubarray(int[] arr) {
	    	
	        HashSet<Integer> set = new HashSet<>();
	        
	        int sum = 0;

	        for (int num : arr) {
	            sum += num;  // Add current element to cumulative sum

	            // Check for zero-sum subarray
	            if (sum == 0 || set.contains(sum)) {
	                return true;
	            }

	            // Add the cumulative sum to the HashSet
	            set.add(sum);
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	    	
	        int[] arr = {3, 4, -7, 1, 2, -6, 5};
	        System.out.println(hasZeroSumSubarray(arr)); // Output: true
	    }
	}
	
	
}
