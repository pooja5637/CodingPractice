package com.practice.core.java8;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {


		List<Employee> emp = EmpDB.getEmployee();
		
	
		List<Integer> ages = emp.stream().map(e -> e.getAge()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<Integer> sliceAges=ages.stream().skip(1).limit(2).collect(Collectors.toList());
		
		System.out.println(ages);
		System.out.println(sliceAges);
		
		
		// find min age 
		
		OptionalInt minAge =	emp.stream().map(e -> e.getAge()).mapToInt(Integer:: intValue) // convert Integer to primitive int.
				.min();
			
			System.out.println(minAge.getAsInt());
		
		// find sum of salary
		
	int sum =	emp.stream().map( salary -> salary.getSalary()).mapToInt(Integer:: intValue) // convert Integer to primitive int.
		.sum();
	
	System.out.println(sum);
	
	// find max salary
	
	Integer maxSalary = emp.stream().map( salary -> salary.getSalary()).reduce(Integer::max).get();
	
	System.out.println("max salary: " + maxSalary);
	
	
	List<String> names = emp.stream().map(emps -> emps.getName()).collect(Collectors.toList());
	
	String nameWithJoining= names.stream().map(name ->  name.toUpperCase()).collect(Collectors.joining(",  "));
	System.out.println(nameWithJoining);
	
	
	
	}}


