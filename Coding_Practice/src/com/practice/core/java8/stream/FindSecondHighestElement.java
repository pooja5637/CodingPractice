package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElement {

	public static void main(String[] args) {


		int[] numbers = { 5 , 10 , 16 , 11 , 21 , 25 , 11 } ;
		
		Integer secondHighest = Arrays.stream(numbers) 
		        								.distinct()
		        								.boxed() // to convert primitives to object else sorted() won't work
		        								//if we took Integer[] num = {5 , 10 , 16 , 11 , 21 , 25 , 11 } ;then we dont need boxed()
		        								.sorted(Comparator.reverseOrder()) 
		        						//      .sorted( (a,b) -> b.compareTo(a) )
		        								.skip(1)
		        								.findFirst().get();

		
		System.out.println(secondHighest);
		
	}

}
