package com.practice.core.set;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {


		Set<Integer> s1 = new HashSet<>();
		
        s1.add(1);
        s1.add(3);
        s1.add(5);
        s1.add(7);
        
        Set<Integer> s2 = new HashSet<>();
        
        s2.add(3);
        s2.add(6);
        s2.add(7);
        s2.add(8);
        
        //s1.retainAll(s2);
        
        //System.out.println(s1);
        
        Set<Integer> intersection = new HashSet<>(s1);
        
        intersection.retainAll(s2);
        
        
        System.out.println("set1 : " + s1);
        System.out.println("set2 : " + s2);
        System.out.println("intersection : "+intersection);
        
	}

}
