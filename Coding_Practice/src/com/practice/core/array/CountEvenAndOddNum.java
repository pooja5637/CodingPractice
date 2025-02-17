package com.practice.core.array;

public class CountEvenAndOddNum {

	public static void main(String[] args) {


		int[] arr = { 1,2,3,4,5,6,7,8,9,10};
		
		int evenCount = 0 ;
		
		int oddCount = 0;
		
		for(int num : arr) {
			
			if(num %2 == 0) {
				
				evenCount ++;
			}
			else {
				oddCount ++;
			}
		}
		
		
		System.out.println("Even number of count: " + evenCount + "   |   Odd number of count: " + oddCount);
	}

}
