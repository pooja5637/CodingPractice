package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartCustomerDatabase {

	public static List<Customer> getAll(){
		
		return Stream.of(
				 new Customer(101,"john","john@gmail.com", Arrays.asList("4356262","74636339")),
				 new Customer(102,"riya","riya@gmail.com", Arrays.asList("64556262","73436339")),
				 new Customer(103,"pooja","pooja@gmail.com", Arrays.asList("2224356262","44636339")),
				 new Customer(104,"james","james@gmail.com", Arrays.asList("566356262","744636339"))
				).collect(Collectors.toList());
		
		
		
		
	}
}
