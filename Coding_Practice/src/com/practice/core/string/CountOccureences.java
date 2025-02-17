package com.practice.core.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccureences {

 public static void main(String[] args) {
	
	 
	 String str = "Hello World";
	 
	 Map<Character, Integer> map = new HashMap();
	 
	 for(char c: str.toCharArray() ) {
		 
		
		 map.put(c, map.getOrDefault(c, 0)+1);
	 }
	 
	 
	 for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		 
		 System.out.print(entry.getKey() + ":" + entry.getValue() +" ");
	 }
}
}
