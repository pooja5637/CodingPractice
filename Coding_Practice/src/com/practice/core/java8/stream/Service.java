package com.practice.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {

//	public static List<Employee> evaluateTaxUsers(String input){
//		
//		if(input.equalsIgnoreCase("tax")) {
//			
//			return Database
//					.getEmployee()
//					.stream()
//					.filter( emp -> emp.getSalary() > 50000)
//					.collect(Collectors.toList());
//		}
//		
//		else {
//			
//			return Database
//					.getEmployee()
//					.stream()
//					.filter(emp -> emp.getSalary() < 50000)
//					.collect(Collectors.toList());
//		}
//		
//	}
	public static void countOfEmpDeptWise(){
		
		List<Employee> emp = Database.getEmployee();
		

		
		Map<String, Long> deptWise = emp.stream()
	            .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

	        // Print result in a structured format
	        deptWise.forEach((dept, count) -> System.out.println(dept + ": " + count));
		
//		List<Entry<String, Long>> entries = new ArrayList<>(deptWise.entrySet());
//
//		
//		for(Entry<String, Long> entry : entries) {
//			
//			System.out.println(entry.getKey() + " ----- " + entry.getValue());
//		}
	        
	        // Find the department with the highest employee count
	        Optional<Map.Entry<String, Long>> maxDept = deptWise.entrySet().stream()
	                .max(Map.Entry.comparingByValue());
	        
	        // Print department with highest employees
	        maxDept.ifPresent(entry -> System.out.println("Department with the highest employees: " + entry.getKey()));
		
	}
	
	//public static void streamOperationsSorting() {
		
		
//		List<Employee> emp = Database.getEmployee();
		
//		Collections.sort(emp, new MyComparator());
//		
//		System.out.println(emp);
		
		
/*		Collections.sort(emp, new Comparator<Employee>() {


			@Override
			public int compare(Employee o1 , Employee o2) {
				
				return o2.getId() - o1.getId();
				
			}
			
		});

*/
		
//		Collections.sort(emp , (o1, o2) -> o1.getId() - o2.getId());
//		System.out.println( emp);
//		
//		Collections.sort(emp ,(o1, o2) ->o1.getName().compareTo(o2.getName()) );
//		System.out.println("**************************************\n " + emp);
		
		
		
//		emp.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).forEach(System.out::println);
		
		
		
//		emp.stream().sorted(Comparator.comparing(employee -> employee.getName())).forEach(System.out::println);
		
//		emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);



		
	//}
	public static void main(String[] args) {

		//System.out.println(evaluateTaxUsers("non-tax"));
		//System.out.println(evaluateTaxUsers("tax"));
		//streamOperationsSorting();
		
		countOfEmpDeptWise();
	}

}


//class MyComparator implements Comparator<Employee>{
//	
//	@Override
//	public int compare(Employee o1 , Employee o2) {
//		
//		return o2.getId() - o1.getId();
//		
//	}
//}