package com.practice.core.array;

import java.util.Arrays;

public class RemoveDuplicatesUsingArray {

	// for sorted array
	    public static void main(String[] args) {
	    	int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
	    	int[] temp = new int[arr.length]; 
	    	int j = 0;
	    	
	    	for (int i = 0; i < arr.length-1 ; i++) {
	    		
	    		if(arr[i] != arr[i+1]) {
	    			
	    			temp[j] = arr[i];
	    			j++;
	    			
	    		}
	    	}
	    	
	    	temp[j] = arr[arr.length-1];
	    	
	    	
	    	// Copying array 'temp' to 'uniqueArray' with specified size
	    	int[] uniqueArray = Arrays.copyOf(temp, j);
	    	System.out.println(Arrays.toString(uniqueArray));
	    	

	    }
	}
