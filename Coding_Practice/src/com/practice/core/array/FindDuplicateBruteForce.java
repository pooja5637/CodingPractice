package com.practice.core.array;

import java.util.Arrays;

public class FindDuplicateBruteForce {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7};
        
        Arrays.sort(arr); // Sorting the array first
        
        System.out.println("Duplicates: ");
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
	
}
