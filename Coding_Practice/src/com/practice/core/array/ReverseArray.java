package com.practice.core.array;

public class ReverseArray {
	
	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5};
		
		reverseArray(arr);
}

public static void  reverseArray(int[] arr) {
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			
			System.out.print(arr[i] +" ");
		}
		
	}

}

