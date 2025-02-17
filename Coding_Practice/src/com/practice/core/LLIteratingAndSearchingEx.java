package com.practice.core;

import java.util.LinkedList;

public class LLIteratingAndSearchingEx {

	public static void main(String[] args) {

		LinkedList<String> list  = new LinkedList<>();
		
		list.add("C");
		list.add("C++");
		list.add("Core java");
		list.add("Java EE");
		list.add("Spring");
		list.add("Spring");
		list.add("Hibernate");
		
		boolean result = list.contains("C");
		System.out.println(result);
		
		// find the index of the first occurrence of an element in the LinkedList
		
		int firstIndex = list.indexOf("Core java");
		System.out.println("index: " + firstIndex);
		
		// find the index of the last occurrence of an element in the LinkedList
		
		int lastIndex = list.lastIndexOf("Spring");
		System.out.println("index: " + lastIndex);
		



	}

}
