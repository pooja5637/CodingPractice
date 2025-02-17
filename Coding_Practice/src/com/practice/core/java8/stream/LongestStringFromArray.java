package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestStringFromArray {

	public static void main(String[] args) {

		String[] list = {"java" , "Springboot", " Servlet" , "Python"};
		
		// String longestString = Arrays.stream(list).max(Comparator.comparingInt(String::length)).get();
		
		Optional<String> longestString = Arrays.stream(list).max(Comparator.comparingInt(String::length));
		//Optional ensures that the code gracefully deals with an empty array.
		if(longestString.isPresent()) {
			
			System.out.println("longest String " + longestString.get());

		}
		
		else {
			System.out.println("Array is empty");
		}
		
		
		// another logic for same 
		
		Optional<String> longest =  Arrays.stream(list).reduce((word1 , word2) -> word1.length() > word2.length() ? word1 : word2);
		
		if(longest.isPresent()) {
			
			System.out.println("longest String " + longest.get());

		}
		
		else {
			System.out.println("Array is empty");
		}

	}

}
