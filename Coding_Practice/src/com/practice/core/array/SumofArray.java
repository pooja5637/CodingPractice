package com.practice.core.array;

public class SumofArray {

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5};
		
		int sum = 0 ;
		
		for(int num : a) {
			
			sum += num ;
		
		}
		System.out.println(sum);
	}

}
