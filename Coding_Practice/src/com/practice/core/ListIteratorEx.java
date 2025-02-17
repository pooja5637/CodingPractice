package com.practice.core;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("Python");
		languages.add("JavaSript");
		
		System.out.println(languages);
		System.out.println("************************************");

		// getting listIterator
		
		ListIterator<String> listIterator = languages.listIterator();
		
		System.out.println("forward direction iteration");
		while(listIterator.hasNext()) {
			
			String element = listIterator.next();
			System.out.println(element);
		}

		System.out.println("************************************");
		System.out.println("backward direction iteration");
		while(listIterator.hasPrevious()) {
			
			String element = listIterator.previous();
			System.out.println(element);
		}
		
	}

}
