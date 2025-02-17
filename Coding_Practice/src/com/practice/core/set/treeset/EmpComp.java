package com.practice.core.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
	
	String name;
	int eid;
	
	Employee(String name, int eid){
		
		this.name = name;
		
		this.eid  = eid;
		
	}

	@Override
	public String toString() {
		return name + "------" + eid;
	}

	@Override
	public int compareTo(Object o) {
		
		
		Integer eid1 = this.eid;
	
		Employee e = (Employee) o;
		
		Integer eid2 = e.eid;
		
		if( eid1 < eid2) {
			
			return -1;
			
			}
		else if(eid1 > eid2) {
			
			return 1;
		}
			
		else
		{
			return 0;
		}
		
	//	return eid1.compareTo(eid2);  // you can use this single line also
	}}

public class EmpComp{
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Pooja", 101);
		Employee e2 = new Employee("Shubham", 105);
		Employee e3 = new Employee("Riyansh", 106);
		Employee e4 = new Employee("Vaish", 102);
		Employee e5 = new Employee("Bhai", 103);
		
		TreeSet t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println(t);
		System.out.println("******");
		TreeSet t1 = new TreeSet(new MyCustomzedComparator());
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

		System.out.println(t1);
		

		
		
	}
	
}


class MyCustomzedComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {


		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
	}
	
}