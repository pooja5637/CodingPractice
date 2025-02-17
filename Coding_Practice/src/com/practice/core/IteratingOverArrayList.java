package com.practice.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C","C++","Java","Spring","Hibernate");
		
		// using basic for loop
		
		for (int i = 0; i < courses.size(); i++) {
			
			System.out.println(courses.get(i));
				
		}
		System.out.println("*******************************************");
		
		// using enhanced for each loop
		
		for(String course : courses) {
			System.out.println(course);
		}
		
		System.out.println("*******************************************");
		
		// for loop with iterator
		
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			
			String course =(String) iterator.next();
			System.out.println(course);
		}

		// while loop with iterator
		
		Iterator<String> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			
			String course =(String) iterator.next();
			
			System.out.println(course);
		}
		
		System.out.println("*******************************************");
		
		// java 8 stream + lambda expression
		
		courses.stream()
			   .forEach(
					   	  course -> System.out.println(course)
					   );
		
		System.out.println("*******************************************");

		// java 8 + lambda expression
		
		courses.forEach(
							course->System.out.println(course)
						);
		

	}

}
