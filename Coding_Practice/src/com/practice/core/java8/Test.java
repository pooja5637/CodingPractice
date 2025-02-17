package com.practice.core.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		List<String> result = words.stream()
		                           .peek(word -> System.out.println("Original: " + word))
		                           .map(String::toUpperCase)
		                           .collect(Collectors.toList());
		
		System.out.println(result);
		
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result1 = numbers.stream()
		                              .limit(3)
		                              .collect(Collectors.toList());
		
		System.out.println(result1);
		
		List<Integer> nums= Arrays.asList(1, 2, 3, 4, 5);
		boolean result2 = numbers.stream()
		                        .allMatch(n -> n > 0);
		
		System.out.println(result2);

	

		//**Question:** Group a list of people by their city.

		//**Solution:**

		
		Map<String, String> cityMap = new HashMap<>();
		cityMap.put("max","dallas");
		cityMap.put("john","houston");
		cityMap.put("mike", "dallas");
		cityMap.put("eric","austin");
		cityMap.put("matt","austin");

		Map<String,List<String>> m = cityMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue , Collectors.mapping(Map.Entry::getKey,Collectors.toList())));

		//result: {dallas=[max, mike], houston=[john], austin=[matt, eric]}
		
		System.out.println(m);
		

	


	}

}
