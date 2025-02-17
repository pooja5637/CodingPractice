package com.practice.core.array;

import java.util.Arrays;

public class CountOfOccurrenceUsingSorting {

	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 3, 4, 5, 1};
        Arrays.sort(arr); // Sort the array first

        System.out.println("Element occurrences:");
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times.");
                count = 1; // Reset count for the new element
            }
        }
        System.out.println(arr[arr.length - 1] + " occurs " + count + " times.");
    }
}
