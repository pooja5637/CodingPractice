package com.practice.core.java8.stream;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortingCustomMapObject {

	public static void main(String[] args) {

/*		Map<Employee, Integer> empMap = new TreeMap<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()- o2.getId();
			}
		});
*/
		
		
		Map<Employee, Integer> empMap = new TreeMap<>((o1, o2 ) -> o1.getId()- o2.getId());
		
		
		
		
		empMap.put(new Employee( 101 , "pooja" , "IT" , 66000), 60);
		empMap.put(new Employee( 404 , "shubh" , "fire" , 18800) , 30);
		empMap.put(new Employee( 751 , "riya" , "chemist" , 45000) , 10);
		empMap.put(new Employee( 412 , "vaish" , "doctor" , 88000) , 45);
		empMap.put(new Employee( 500 , "riya" , "IT" , 80000) , 50);
		empMap.put(new Employee( 349 , "AAAAA" , "TT" , 90000) ,05);
		
		System.out.println(empMap);
		
		System.out.println("**************************");
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed())).forEach(System.out::println);
	}

}
