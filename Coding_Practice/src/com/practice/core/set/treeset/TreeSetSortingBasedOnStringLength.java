package com.practice.core.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingBasedOnStringLength {

	/*
	 * 
	 * sorting order is increasing length order
	 * if two objects having same length then consider their alphabetical order
	 * 
	 * */
	
	public static void main(String[] args) {

		
		TreeSet t =new TreeSet<>(new sortingBasedOnLength());
		
		t.add("A");
		
		t.add( new StringBuffer("ABC"));
		
		t.add( new StringBuffer("AA"));
		
		t.add("XX");
		
		t.add("ABCD");
		
		t.add("A");
		
		System.out.println(t);
		
	}

}

class sortingBasedOnLength implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString(); // because we used StringBuffer also so convert object toString()
		String s2 = o2.toString();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 < len2)
		{
			return -1;
		}
		
		else if(len1 > len2)
		{
			return +1;
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
	
}
