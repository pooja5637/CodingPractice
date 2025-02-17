package com.practice.core.array;

public class CountOfOccurrencesOfAnElement {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 2, 2, 5, 6};
	        int target = 2; // Element to count
	        int count = 0;

	        for (int num : arr) {
	            if (num == target) {
	                count++;
	            }
	        }

	        System.out.println(target + " occurs " + count + " times.");
	    }
	

}
