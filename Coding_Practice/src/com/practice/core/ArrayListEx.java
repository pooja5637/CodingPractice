package com.practice.core;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("check whether list is empty or not?: "+list.isEmpty());
		
		list.add("lily");
		list.add("rose");
		list.add("hibiscous");
		list.add("orchid");
		
		System.out.println("list elements: " + list);
		list.add(2,"apple");
		
		System.out.println("list elements after adding apple at index 2: " + list);

		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Mogra");
		list2.addAll(list);
		list2.add("xyz");
		System.out.println("list 2: "+list2);
		
		
		ArrayList list3 = new ArrayList(list2);
		list3.add("chafa");
		list3.add(10);
		System.out.println("list3 elements: " +list3);
		
		System.out.println("size of list3: "+list3.size());
		
		System.out.println("get elements from list3 based on index using get(index): "+list3.get(4));
		//System.out.println(list3.get(9)); //  IndexOutOfBoundsException
		// modify the list using set(index,  element to be stored at the specified position)
		list3.set(6, "Magnolia champaca");
		// list3.set(9, "abc"); //  IndexOutOfBoundsException
		
		System.out.println(list3);
		
		// removing elements from an arraylist
		list3.remove(5);
		System.out.println("after removing element at index 5 from list3: "+list3);
		
		list3.remove("lily");
		System.out.println("after removing lily from list3: "+list3);
		
		
		
		list3.removeAll(list);
		System.out.println(list3);
		
		list3.removeAll(list2);
		System.out.println(list3);
		
		list3.clear();
		System.out.println(list3);
	}

}
