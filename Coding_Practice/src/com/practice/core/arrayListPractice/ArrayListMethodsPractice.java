package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsPractice {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(); // empty list will be created with initial capacity 10 
		
		

		// How to increase current capacity of an ArrayList Manually??
		
		list.ensureCapacity(20);
		
		// to check whether given arraylist is empty or not : isEmpty()
		
		System.out.println(list.isEmpty());
		

		list.add(111);
		list.add(222); 
		list.add(333);
		list.add(444);
		list.add(222);
		list.add(222);
		
	
		System.out.println(list);
		
		System.out.println(list.set(0, 000));
		System.out.println(list);
		
		// decrease the current capacity of an Arraylist to the current size : trimTosize()
		

		
		
		list.trimToSize();
		
		// find the number of elements present in an array list : size()
		
		System.out.println("size: " + list.size());
		
		// check whether given element is present in array list or not : contains()
		
		System.out.println("list contains 333 ? : "+list.contains(333));
		System.out.println("list contains 666 ? : "+list.contains(666));

		// first occurrence of specified element : indexOf()
		
		
		System.out.println("first occurrence of 222 : " + list.indexOf(222));
		
		// last occurrence of specified element : lastIndexOf()
		
		
		System.out.println("last occurrence of 222 : " + list.lastIndexOf(222));
		
		
		// convert array list to array : toArray()
		
		Object[] array = list.toArray() ;
		
		System.out.print("given list to array:");
		for(Object obj : array ) {
			
			System.out.print(" "+obj);
		}
		
		System.out.println();
		
		// retrieve an element from a particular position of an Array list : get()
		
		System.out.println("get an element at index 3 : " + list.get(3));
		
		// replace a particular element in an ArrayList with given element : set(index , element)
			
		list.set(5, 999);
		System.out.println("replace element at index 5 with 999: " + list);
		
		// insert an element at a particular position of ArrayList: add(index , element)
		
		list.add(1,000);
		
		System.out.println("list after inserting 000 at 1st index : " + list);
		
		// remove element at a particular position from arraylist: remove(int index)
		
		list.remove(1);
		System.out.println("list after removing element at 1st index: " + list);
		
		// remove(Object obj) for Integer 
		
		// Calling remove(object)
		list.remove(new Integer(444));
		System.out.println("list after removing element 444: " + list);

		
		// remove given element from array list : remove(Object obj)
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Pooja");
		l.add("shubham");
		l.add("riyansh");
		l.add("shubham");
		
		System.out.println("Name List: " + l);
		
		l.remove("shubham");
		System.out.println("list after removing shubham : "+l);
		
		l.clear();
		System.out.println("list after clear() : " + l);
		
		System.out.println("*******************************************************************");
		
		// how do you retrive a portion of arrayList: subList(start index, last index)
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(111);
		l2.add(222);
		l2.add(333);
		l2.add(444);
		l2.add(555);
		l2.add(666);
		l2.add(777);
		
		System.out.println("List : "+ l2);
		
		// retrieving sublist 
		
		List<Integer> subList = l2.subList(1, 4);
		
		System.out.println("SubList from index 1 to 4 : " + subList);
		
		// modifying the list 
		
		l2.set(2, 000);
		
		System.out.println("list after modification [ set(2,000) ] : " + l2);
		
		
		// changes will be reflected in sublist
		
		System.out.println("sublist after modification of original list[ set(2,000) ] : " + subList);
		
		// modifying the sub list 
		
		subList.set(0, 000);
		
		System.out.println("sublist after modification [ set(0,000) ] : " + subList);
		
		// changes will be reflected in original list
		
		System.out.println("original list after modification of sub list[ set(0,000) ] : " + l2);
		
		System.out.println("****************************************************");
		
		// how do you join the array list: addAll ()
		
		list.addAll(l2);
		System.out.println("adding all the elements from l2 to list using addAll()"+list);
		
		
		System.out.println("****************************************************");

		// insert more than one element at a particular index of an arraylist
		
		l2.addAll(1,list);
		
		System.out.println("after adding all the elements of list to l2 at index 1 : " + l2);
		
		
	}

}
