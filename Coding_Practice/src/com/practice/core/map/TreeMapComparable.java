package com.practice.core.map;

import java.util.Collection;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapComparable {

	public static void main(String[] args) {

		
		TreeMap t = new TreeMap();
		
		t.put(100,"ZZZ");
		t.put(101,"SSS");
		t.put(104,"AAA");
		t.put(106,"BBB");
		t.put(130,"QQQ");

	//	t.put("fff","ZZZ"); // RuntimeException : ClassCastException

	//	t.put(null,"ZZZ");  // NullPointerException

		
		System.out.println(t);
		
		System.out.println(t.ceilingKey(106));
		
		System.out.println(t.ceilingEntry(109)); // print greater than or equal object
		
		//Set s = t.keySet();
		System.out.println(t.keySet());
		
		//Collection v = t.values();
		
		System.out.println(t.values());
		
		
		Set set = t.entrySet();
		System.out.println(set);
		
		System.out.println(t.firstEntry());
		
		System.out.println(t.floorEntry(107)); // print lower than or equal object
	}

}
