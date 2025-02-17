package com.practice.core.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map< Integer , String > m = new HashMap<>();
		
		System.out.println(m.put(101, "D"));
		System.out.println(m.put(102, "S"));
		System.out.println(m.put(101, "R"));
		System.out.println(m.put(104, "P"));

		
		System.out.println(m);
		System.out.println(m.containsKey(102));
		System.out.println(m.containsValue("R"));
		
		System.out.println(m.replace(104, "Pooja"));

		System.out.println(m.remove(104));
		System.out.println(m.get(101));
		System.out.println(m.isEmpty());
		
		
		System.out.println(m);

		System.out.println(m.size());
		m.clear();
		System.out.println(m);

	}

}
