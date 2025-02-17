package com.practice.core.array;

public class MissingNumber {

	
	    public static void main(String[] args) {
	        int[] arr = {1,2,3,5,6,7}; // Missing number: 3
	        int n = arr.length + 1; // Total numbers should be N

	      //  int totalSum = n * (n + 1) / 2; // Sum of 1 to N --> best and fastest method
	      
	        
	        // another way to calculate sum of 1 to N.  --> loop iteration --> slower if we have large number of N
	        int totalSum = 0;
	        for(int i = 1 ; i <= n ; i++) {
	        	
	        	totalSum += i;
	        }
	        
	        
	        
	        int arraySum = 0;

	        for (int num : arr) {
	            arraySum += num;
	        }

	        int missing = totalSum - arraySum;
	        System.out.println("Missing Number: " + missing);
	    }
	

}
