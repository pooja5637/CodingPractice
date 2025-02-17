package com.practice.core.array;

public class SecondLargestElement {

	public static void main(String[] args) {


		int[] arr = { 10, 50 , 40 , 25 };
		
		int largest = 0;
		int secondLargest = 0;
		
		for(int num : arr)
		{
			if(num > largest) {

				secondLargest = largest;
				largest = num;
			}
			
			else if(num > secondLargest && num != largest) {
				
				secondLargest = num ;
			}
		}
		
		System.out.println(secondLargest);
		
	}

}
