package com.practice.core.array;

public class SecondSmallest {

//		// find second smallest
//		
//		for(int i = 0 ; i< arr.length ; i++)
//		{
//			for(int j = i+1 ; j < arr.length ; j++) {
//				
//				if( arr[i] > arr[j] ) {
//					
//					int temp = arr[i];
//					arr[i] =  arr[j];
//					arr[j] = temp;
//	
//				}
//			}
//		}
//		//10,25,40,50
//		System.out.println(arr[1]);
		
		
		    public static int findSecondSmallest(int[] nums) {
		    	
		        if (nums.length < 2) {
		        	
		            throw new IllegalArgumentException("Array must have at least two elements");
		        }

		        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		        
		        
		        

		        for (int num : nums) {
		        	
		        	// if we take smallest = 0 ;This condition will never be true because smallest starts at 0
		            if (num < smallest) {
		            	
		                secondSmallest = smallest;
		                
		                smallest = num;
		                
		            }
		            else if (num > smallest && num < secondSmallest) {
		            	
		                secondSmallest = num;
		            }
		        }

		        return secondSmallest; 
		    }

		    public static void main(String[] args) {
		        int[] nums = {3, 1, 4, 1, 2, 5, -1 , -3};
		        
		        System.out.println("The second smallest element is: " + findSecondSmallest(nums));
		    }
	



}
