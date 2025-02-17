package com.practice.core.array;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {


		int[] a1 = {10,20,30};
		int[] a2 = {40,50,60,70};
		
		
		int mergeArrayLength =  a1.length + a2.length ; 
		
		int[] mergeArray = new int[mergeArrayLength];
		
		for(int i = 0 ; i < a1.length ; i++) {
			
			mergeArray[i] = a1[i];
			
		}
		
		for(int i = 0 ; i < a2.length ; i++) {
			
			mergeArray[a1.length + i] = a2[i];
			
		}
		
		System.out.println(Arrays.toString(mergeArray));
	}

}
