package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		String input = "ilovejava";
		
		// to find occurrence of String
		Map<String, Long > map = Arrays.stream( input.split("") )
									   .collect( Collectors.groupingBy( Function.identity() ,
											   						    Collectors.counting()
											   						    )
											   );
		
		map.forEach((s, count) -> System.out.println(s + " : " + count));
		
		System.out.println("************************************");
									  
		// find duplicate elements count > 1
		List<Entry<String, Long>> duplicates =	map.entrySet()
						   	   .stream()
						   	   .filter(entry -> entry.getValue()>1)
					   //  	   .forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
						   	   .collect(Collectors.toList());
			
			System.out.println(duplicates);
			
			System.out.println("************************************");

			
			// find unique elements 
			
			map.entrySet()
		       .stream()
		       .filter( entry -> entry.getValue() == 1)
		       .forEach( entry -> System.out.print( entry.getKey() + " "));

	}

}
