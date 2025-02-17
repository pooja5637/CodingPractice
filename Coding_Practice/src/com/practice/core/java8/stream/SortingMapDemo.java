package com.practice.core.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Pooja");
		map.put(401, "Riyansh");
		map.put(301, "Shubham");
		map.put(201, "Sumit");
		map.put(501, "Vaish");
		
		System.out.println(map);
		
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		System.out.println(entries);
		
	/*	Collections.sort(entries , new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		
		for(Entry<Integer, String> entry : entries) {
			
			System.out.println(entry.getKey() + " ----- " + entry.getValue());
		}
		
	
	
	*/
		
	/*	Collections.sort(entries ,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		
			for(Entry<Integer, String> entry : entries) {
			
			System.out.println(entry.getKey() + " ----- " + entry.getValue());
		}
		
		
		*/
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		
	}
	
	

}
