package com.practice.core.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream()
			.filter(t -> t %2 == 0)
			.forEach(t -> System.out.println(t));
		
		System.out.println("*****************************");
		Predicate<Integer> odd = t -> t %2 != 0;
		
		list.stream()
		.filter(odd)
		.forEach(t -> System.out.println(t));
		
		System.out.println("*****************************");

		List<String> l = new ArrayList<>();
		l.add("mac");
		l.add("pooja");
		l.add("moana");
		
		l.stream().filter(t -> t.startsWith("m")).forEach(t ->  System.out.println(t));
	}

}
