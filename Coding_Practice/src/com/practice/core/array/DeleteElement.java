package com.practice.core.array;

import java.util.Arrays;

public class DeleteElement {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		int delete = 30;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(delete == arr[i]) {
				
				for (int j = i; j < arr.length -1 ; j++) {
					
					arr[j] = arr[j+1];
				}
				
				break;
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
