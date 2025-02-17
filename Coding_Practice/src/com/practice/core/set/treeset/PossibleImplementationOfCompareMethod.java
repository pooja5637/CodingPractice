package com.practice.core.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class PossibleImplementationOfCompareMethod {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet(new Combinations());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
	}

}


class Combinations implements Comparator{
	
	
	
	@Override
	public int compare(Object o1, Object o2) {
		
		
		
		Integer I1 = (Integer) o1;
		
		Integer I2 = (Integer) o2;
		// default natural sorting order [ Ascending order ]
		// return I1.compareTo(I2); // [0, 5, 10, 15, 20]
		
		
		// [ Descending Order ]
		// return -I1.compareTo(I2); // [20, 15, 10, 5, 0]
		
		// [ Descending Order ]
		// return I2.compareTo(I1); // [20, 15, 10, 5, 0]
		
		// default natural sorting order [ Ascending order ]
		// return -I2.compareTo(I1); // [0, 5, 10, 15, 20]
		
		// insertion order
	   // return +1; // [10, 0, 15, 5, 20, 20]

		
		// reverse of insertion order
		//  return -1; //[20, 20, 5, 15, 0, 10]

		
		return 0; // 10 --> only first element will be inserted and all remaining are treated as duplicate


	}
}