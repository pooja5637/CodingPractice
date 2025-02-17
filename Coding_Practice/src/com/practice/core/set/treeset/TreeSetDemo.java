package com.practice.core.set.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		TreeSet t = new TreeSet<>();
		
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		
		//t.add(new Integer(10)); // RE: ClassCastException
		
		//t.add(null);  // RE: NullPointerException
		
		System.out.println(t);
		
		
	}

}
