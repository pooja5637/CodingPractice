package com.practice.core.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		HashMap< Integer , String >  hm = new HashMap<>();
		
		hm.put(101, "Pooja");
		
		hm.put(104, "Shubham");
		
		hm.put(102, "Riyansh");
		
		hm.put(104, "Pradeep");
		
		hm.put(105, "Vaish");
		
		hm.put(106, "null");
		
		System.out.println(hm);
		
		System.out.println("*********************************************");
		
		Set keys = hm.keySet();
		
		System.out.println(keys);
		
		System.out.println("*********************************************");

		
		Collection values = hm.values();
		
		System.out.println(values);
		
		System.out.println("*********************************************");
		
		System.out.println("Different ways to iterate entry set");
		System.out.println();
		System.out.println("1. Using normal iterator()");
		
		Set set = hm.entrySet();
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("2. If you want key and value seperatly");
		
		Set set1 = hm.entrySet();
		System.out.println(set1);
		
		Iterator itr1 = set.iterator();
		
		while(itr1.hasNext()) {
			
			Map.Entry m1 =  (Map.Entry) itr1.next();
			
			System.out.println(m1.getKey() + "------" + m1.getValue());
		
		}

		System.out.println();
		System.out.println("3. Using for Each loop ");
		
		for(Map.Entry m2 : hm.entrySet()) {
			
			System.out.println(m2.getKey() + "------" + m2.getValue());
			
			if(m2.getValue().equals("Pooja")) {
				
				m2.setValue("Poondu");
			}
		}
		
		System.out.println(hm);

	}

}
