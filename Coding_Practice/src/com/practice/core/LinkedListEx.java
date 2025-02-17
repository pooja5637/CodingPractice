package com.practice.core;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println("check whether list is empty or not?: "+list.isEmpty());
		System.out.println("***************************************");

		
		list.add("lily");
		list.add("rose");
		list.add("hibiscous");
		list.add("lily");
		list.add("orchid");
		list.add("lily");
		list.add("lily");
		
		System.out.println("list elements: " + list);
		System.out.println("***************************************");
		list.add(2,"apple");
		System.out.println("list elements after adding apple at index 2: " + list);
		System.out.println("***************************************");

		//adding element at the beginning of the LinkedList
		
		list.addFirst("dragon fruit");
		System.out.println(list);
		System.out.println("***************************************");

		//adding element at the end of the LinkedList
		list.addLast("orange");
		System.out.println(list);
		System.out.println("***************************************");

		
		// how to get first element in the linked list 
		
		String firstElement = list.getFirst();
		System.out.println("first element :" + firstElement);
		System.out.println("***************************************");

		// how to get last element in the linked list
		String lastElement = list.getLast();
		System.out.println("last element :" + lastElement);
		System.out.println("***************************************");

		// how to get element at the given index in the linked list
		String elementAtSpecifiedIndex = list.get(4);
		System.out.println("element At Specified Index :" + elementAtSpecifiedIndex);
		System.out.println("***************************************");

		// how to get all the elements from the linked list
		for(String ls : list) {
			System.out.println(ls);
		}
		
		System.out.println("***************************************");
		// how to remove first element in the linked list 
		String element = list.removeFirst();
		System.out.println(element);
		System.out.println("after removing first element:" + list);
		System.out.println("***************************************");
		
		// how to remove last element in the linked list
		
		String element1 = list.removeLast();
		System.out.println(element1);
		System.out.println("after removing last element:" + list);
		System.out.println("***************************************");
		// how to remove first occurrence of a given element in the linked list
		
		String element3 = list.remove(2);
		System.out.println(element3);
		System.out.println("afer removing element at index 2:" + list );
		
		list.remove("apple");
		System.out.println("afer removing element apple:" + list );
		
		list.removeFirstOccurrence("lily");
		System.out.println(list);
		
		list.removeLastOccurrence("lily");
		System.out.println(list);

		
		System.out.println("***************************************");
		// how to clear the linked list completely 
		list.clear();
		System.out.println(list);
		
	}

}
