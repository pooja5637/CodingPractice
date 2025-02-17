package com.practice.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(6);
		list.add(8);
		list.add(4);
		list.add(2);
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);

		
		list.stream().sorted().forEach(num -> System.out.print(num + " ")); // ascending order
		
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(num + " ")); // descending order


		
		
	}

}
