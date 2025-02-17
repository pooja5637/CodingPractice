package com.practice.core.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringInsertedAccordingToReverseOfAlphabeticalOrder {

	public static void main(String[] args) {


		TreeSet<String> t = new TreeSet<String>(new ReverseString());
		
		t.add("Pooja");
		t.add("Shubham");
		t.add("Riyansh");
		t.add("Vaishnavi");
		t.add("Sumit");
		t.add("Roja");
		
		System.out.println(t);
	}

}

class ReverseString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String S1 = (String) o1;
		String S2 = (String) o2;
		

		return S2.compareTo(S1);
		
		// return -S1.compareTo(S2);
	}
	
	
	
}