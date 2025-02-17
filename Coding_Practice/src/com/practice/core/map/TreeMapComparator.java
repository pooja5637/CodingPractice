package com.practice.core.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {

		TreeMap< Integer, String> t = new TreeMap<Integer, String>(new MyComparator());
		
		t.put(100,"ZZZ");
		t.put(101,"AAA");
		t.put(104,"WWW");
		t.put(106,"GGG");
		t.put(130,"DDD");
		
		System.out.println(t);
		
		for(Map.Entry m : t.entrySet()) {
			
			System.out.println(m.getKey() + "------" + m.getValue());

		}
	}

}


class MyComparator implements Comparator{
	
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;   
		
		
		
		
		
		return i2.compareTo(i1);
	}
}