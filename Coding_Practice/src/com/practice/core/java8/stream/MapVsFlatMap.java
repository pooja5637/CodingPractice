package com.practice.core.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
 
		List<Customer> customers = EkartCustomerDatabase.getAll();
		
		// List<Customer> convert List<String> -> Data Transformation
		// Mapping :map(customer -> customer.getEmail()) -- one customer -> one email (one to one mapping)
		List<String> emails = customers.stream()
									   .map(customer -> customer.getEmail())
									   .collect(Collectors.toList());
		System.out.println(emails);
		
		
		// (one to many mapping)
		List<List<String>> phoneNos = customers.stream()
											   .map(customer -> customer.getPhoneNumber())
				                               .collect(Collectors.toList());
		System.out.println(phoneNos);
		
		
		
		List<String> phones = customers.stream()
									   .flatMap(customer -> customer.getPhoneNumber().stream())
									   .collect(Collectors.toList());
		System.out.println(phones);
		
		
	}

}
