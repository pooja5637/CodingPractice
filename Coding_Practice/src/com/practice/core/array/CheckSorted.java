package com.practice.core.array;

public class CheckSorted {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7 , 6};
        boolean isSorted = true;

        for (int i = 0; i < numbers.length-1; i++) {
        	
            if (numbers[i] > numbers[i + 1]) {
            	
                isSorted = false;
                
                break;
            }
        }

        System.out.println("Is array sorted? " + isSorted);
    }
}