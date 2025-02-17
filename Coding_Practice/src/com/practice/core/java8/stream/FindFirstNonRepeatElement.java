package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatElement {

	public static void main(String[] args) {

		String input = "ilovejava" ;
		
		/*
		Map<String, Long> map = Arrays.stream(input.split(""))
									  .collect(Collectors.groupingBy(Function.identity(),
											  						 Collectors.counting())
											  						 );
		 */
		// internally this implements hashmap and in hashmap insertion order is not preserved so that add LinkedHashMap::new to create LinkedHashMap object.									  );
		
		
		Map<String, Long> map = Arrays.stream(input.split(""))
				  .collect(Collectors.groupingBy(Function.identity(),
						  						 LinkedHashMap:: new,
						  						 Collectors.counting())
						  );
		
		
		map.entrySet().stream().forEach( entry -> System.out.println( entry.getKey() + " = " + entry.getValue() ) );
									
		// by creating linkedhashmap insertion order is preserved.
		
		
		String firstNonRepeatChar = map.entrySet()
									   .stream()
									   .filter( entry -> entry.getValue() == 1)
									   .findFirst()
									   .get()
									   .getKey();
		
		
		System.out.println("First Non repeating element : "+firstNonRepeatChar);
		
		String firstRepeatChar = map.entrySet()
				   .stream()
				   .filter( entry -> entry.getValue() > 1)
				   .findFirst()
				   .get()
				   .getKey();


		System.out.println("First repeating element : "+firstRepeatChar);
		
				
	}

}
