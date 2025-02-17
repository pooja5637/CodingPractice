package com.practice.core.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	
    public static Character firstNonRepeatingChar(String str) {
    	
        HashSet<Character> set = new HashSet<>();
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
	public static void main(String[] args) {

		
		System.out.println(firstNonRepeatingChar("SWISS"));
		
	}

}
