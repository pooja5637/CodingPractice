package com.practice.core.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Database {

	
	// DAO Layer
	
	public static List<Employee> getEmployee(){
		
		List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(101, "Pooja", "IT", 66000));
        emp.add(new Employee(404, "Shubh", "IT", 18800));  
        emp.add(new Employee(751, "Riya", "HR", 45000));   
        emp.add(new Employee(412, "Vaish", "Finance", 88000));  
        emp.add(new Employee(500, "Riya", "IT", 80000));
        emp.add(new Employee(349, "AAAAA", "HR", 90000));  

        return emp;
    }
}
