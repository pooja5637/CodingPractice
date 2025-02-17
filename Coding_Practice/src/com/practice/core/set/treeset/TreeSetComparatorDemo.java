package com.practice.core.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {

		// WAP to insert Integer objects into treeset where the sorting order is descending order.
		
		TreeSet<Integer> t = new TreeSet(new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
	}

}


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		Integer I1 = (Integer) o1;
		
		Integer I2 = (Integer) o2;
		
		if(I1 < I2) {
			
			return +1;
		}
		
		if(I1 > I2) {
			
			return -1;
		}
		
		else
		
		return 0;
	}
	
}