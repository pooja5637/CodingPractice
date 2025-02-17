package com.practice.core.array;

public class FindKthSmallestElement {

	public static void main(String[] args) {

		int[] arr = { 10, 50 , 40 , 25 , 5, 1};
	
		int k =4;
		
		// find second smallest
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++) {
				
				if( arr[i] > arr[j] ) {
					
					int temp = arr[i];
					arr[i] =  arr[j];
					arr[j] = temp;
	
				}
			}
			
			// 1,5,10,25,40,50
			
			// to stop sorting after 4 --> reduce time
			if( i == k-1) {
				
				System.out.println(arr[i]);
				break;
			}
		}
		//10,25,40,50
		
		
		

	}

}
