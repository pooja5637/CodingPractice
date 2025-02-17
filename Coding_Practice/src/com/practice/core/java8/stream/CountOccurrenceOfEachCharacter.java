package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachCharacter {

	public static void main(String[] args) {

		String input = "ilovejava";
		
//		String[] arr = input.split("");
//		System.out.println(Arrays.toString(arr));
		
		Map<String, Long> map = Arrays.stream(input.split(""))
									  .collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
		
		
		map.forEach((s, count) -> System.out.println(s + " : " + count));
			  
	}

}



//Used Arrays.stream(input.split("")) to create a Stream of String (since split("") returns a String[]).
//Used Function.identity() in groupingBy to group by each character.
//Used Collectors.counting() to count occurrences.
//Printed the result using forEach.