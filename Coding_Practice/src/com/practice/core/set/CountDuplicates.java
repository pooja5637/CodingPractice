package com.practice.core.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicates {

	public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        
        // To store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        
        // To store duplicate elements
        Set<Integer> duplicateElements = new HashSet<>();
        
        for(int num : array) {
        	
        	if( !uniqueElements.add(num))
        	{
        		duplicateElements.add(num);
        	}
        }
        
        System.out.println("original array: "+ Arrays.toString(array));
        System.out.println("without duplicates : "+ uniqueElements);
        System.out.println("duplicates : " + duplicateElements);
        

	}

}
