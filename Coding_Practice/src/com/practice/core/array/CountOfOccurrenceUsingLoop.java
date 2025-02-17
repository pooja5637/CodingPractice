package com.practice.core.array;

public class CountOfOccurrenceUsingLoop {

	
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 3, 3, 4, 5, 1};
	        boolean[] visited = new boolean[arr.length]; // Track counted elements

	        System.out.println("Element occurrences:");
	        for (int i = 0; i < arr.length; i++) {
	            if (visited[i]) continue; // Skip counted elements

	            int count = 1; // Count occurrences
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true; // Mark as counted
	                }
	            }
	            System.out.println(arr[i] + " occurs " + count + " times.");
	        }
	    }
	
}
