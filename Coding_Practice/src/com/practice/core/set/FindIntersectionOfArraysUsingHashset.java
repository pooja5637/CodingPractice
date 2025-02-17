package com.practice.core.set;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionOfArraysUsingHashset {

	
	public static List<Integer> findIntersection(int[] arr1, int[] arr2){
		
		
		Set<Integer> set1 = new HashSet<>(); 
		 
		for(int num : arr1) {
			
			set1.add(num);
		}


		Set<Integer> set2 = new HashSet<>();
		
		for(int num : arr2) {
			
			set2.add(num);
		}
		
		
		List< Integer> intersection = new ArrayList<>(set1);
		
		intersection.retainAll(set2);
		
		
	
		return intersection;
	
	}
	
	public static void main(String[] args) {
		
		
		int[] arr1 = {2,3,1,2,5};
		
		int[] arr2 = {5,7,5,8,2,2};
		
		System.out.println("array 1: " + Arrays.toString(arr1));
		System.out.println("array 2: " + Arrays.toString(arr2));
		
		System.out.println(findIntersection(arr1, arr2));
	}
}
