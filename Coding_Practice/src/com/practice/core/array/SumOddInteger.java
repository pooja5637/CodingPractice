package com.practice.core.array;

public class SumOddInteger {


	public static void main(String[] args) {

		int[] arr = {1,2,5,7,10,12,11,1};
		
		int result = sumOdd(arr);
		System.out.println(result);
	}
	static int sumOdd(int arr[]) {
		int oddSum = 0;
		
		for(int num : arr) {
			if(num %2!=0 ) {
				oddSum += num;
			}
		}
		return oddSum;
	}
}
