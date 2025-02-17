package com.practice.core.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ConsumerUsingStream {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(t-> System.out.println(t));
	}

}
