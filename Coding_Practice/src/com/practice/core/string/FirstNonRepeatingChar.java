package com.practice.core.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	
    public static char firstNonRepeatingChar(String str) {
    	
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for( Map.Entry<Character, Integer> entry : countMap.entrySet() ) {
        	System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // If no non-repeating character found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("swisps")); // Output: 'w'
        System.out.println(firstNonRepeatingChar("aabb"));  // Output: '_'
    }
}
