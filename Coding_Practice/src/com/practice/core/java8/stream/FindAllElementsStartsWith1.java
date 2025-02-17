package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllElementsStartsWith1 {

	public static void main(String[] args) {


		Integer[] numbers = {5,9,11,2,8,21,1};
		
		List startsWith1 = Arrays.stream(numbers)
							   //.map( s ->  s+"") // convert int to String
						       //.filter(s-> s.startsWith("1"))
								 .filter( n -> String.valueOf(n).startsWith("1"))
								 .collect(Collectors.toList());
		
		System.out.println(startsWith1);
		
		String[] str = {"Java", "SpringBoot", "1Pooja", "1Java"};
		
		List result = Arrays.stream(str)
							.filter(s-> s.startsWith("1"))
							.collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
