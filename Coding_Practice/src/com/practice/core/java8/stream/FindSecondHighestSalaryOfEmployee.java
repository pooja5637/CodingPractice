package com.practice.core.java8.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindSecondHighestSalaryOfEmployee {

//	public static Map.Entry<String, Integer> findNthHighestSalary(int n , Map<String, Integer> map){
//		
//		Map.Entry<String, Integer> result = map.entrySet().stream()
//	
//				  //.sorted(Comparator.reverseOrder())// it is not applicable for map type
//				  .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//				  .collect(Collectors.toList())
//				  .get(n-1); // index starts from zero so n-1
//		
//		return result;
//		
//	}
//	
	 public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
		 
	        return map.entrySet()
	                .stream()
	                .collect(Collectors.groupingBy(Map.Entry::getValue,
	                         Collectors.mapping(Map.Entry::getKey, Collectors.toList())
	                ))
	                .entrySet()
	                .stream()
	                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
	                .collect(Collectors.toList())
	                .get(num - 1);
	    }
	 
	public static List<Map.Entry<String, Integer>> findNthHighestSalary(int n , Map<String, Integer> map){
		
		List<Integer> sortedSalaries = map.values().stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());	
		
		int nthSalary = sortedSalaries.get(n - 1); // Get N-th highest salary
		
		return map.entrySet().stream().filter(entry -> entry.getValue() == nthSalary).collect(Collectors.toList());
		
	}
	 
	public static void main(String[] args) {

//		Map<String , Integer> map = new HashMap<>();
//		
//		map.put("Pooja", 4000);
//		map.put("Riyansh", 8000);
//		map.put("Sumit", 6000);
//		map.put("Pradip", 2000);
//		
//		System.out.println(findNthHighestSalary(2 , map));
		
		Map<String , Integer> map2 = new HashMap<>();
		
		map2.put("Pooja", 4000);
		map2.put("Riyansh", 8000);
		map2.put("Shubham", 2000);
		map2.put("Omkar", 2000);
		map2.put("Sumit", 6000);
		map2.put("Pradip", 2000);
		
		findNthHighestSalary(4 , map2).forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		
		 System.out.println(getDynamicNthHighestSalary(4, map2));
		
			
//		// 2nd lowest salary
//		Map.Entry<String, Integer> result=map.entrySet().stream()
//					  .sorted(Map.Entry.comparingByValue())
//					  .collect(Collectors.toList())
//					  .get(1);
//		
//		System.out.println("2nd lowest salary: " +result);
//	
		
		
		
	
	}

}

class Emp{
	
	private String name ;
	private int salary;
	
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	
	
}