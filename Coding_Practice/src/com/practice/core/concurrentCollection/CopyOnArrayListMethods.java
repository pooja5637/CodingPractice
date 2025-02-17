package com.practice.core.concurrentCollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListMethods {

	public static void main(String[] args) {

		
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>() ;
		
		l.add("A");
		l.add("A");
		
		System.out.println(l);
		
		l.addIfAbsent("B");
		System.out.println(l);
		
		l.addIfAbsent("B");
		System.out.println(l);

		System.out.println("****************************************");
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		
		CopyOnWriteArrayList<String> l2 = new CopyOnWriteArrayList<>() ;
		l2.add("A");
		l2.add("C");
		
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2); // [A,C,A,B]
		
		ArrayList<String> l3 = new ArrayList<>();
		l3.add("A");
		l3.add("D");
		
		l2.addAllAbsent(l3); // [A, C, A, B, D]
		System.out.println(l2);
		


		
	}

}
