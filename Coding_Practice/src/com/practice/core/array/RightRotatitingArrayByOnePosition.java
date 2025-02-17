package com.practice.core.array;

import java.util.Arrays;

public class RightRotatitingArrayByOnePosition {

	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 4, 5}; // Given array
        
        int n = arr.length; // Length of the array

        int last = arr[n - 1]; // Store the last element

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
        	
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // Move last element to the first position

        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }

}
