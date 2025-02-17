package com.practice.core.java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class MapusingStream {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		
		map.forEach( ( key,value ) -> System.out.println( key + " : " +value ) );
		System.out.println("*******************************");
		
		map.entrySet().stream().forEach( obj -> System.out.println(obj));
		System.out.println("*******************************");

		map.entrySet().stream().filter( k -> k.getKey()%2 == 0).forEach( obj -> System.out.println(obj));
	}

}
