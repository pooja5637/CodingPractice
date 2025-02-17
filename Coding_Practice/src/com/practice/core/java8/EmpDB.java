package com.practice.core.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpDB {

	
	// DAO layer 
	
	public static List<Employee> getEmployee(){
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("pooja" , 26 , 12000));
		list.add(new Employee("vaish" , 18 , 10000));
		list.add(new Employee("sumu" , 16 ,4000));
		list.add(new Employee("riyu" , 30 , 1000));
		
		return list;
		
		
	}
}
