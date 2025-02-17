/**
 * 
 */
package com.practice.core.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class FirstUniqueCharcter {

	static int firstUniqueChar(String str) {
		
		int index = -1;
		
		Map<Character, Integer> charFreqMap = new HashMap<>();
		
		for(int i = 0; i< str.length(); i++) {
			
			char c = str.charAt(i);
			
			// Get the current frequency
			int freq = charFreqMap.getOrDefault(c, 0);
			
			
			// update the map 
			charFreqMap.put(c, (freq+1));
		}
		
		for(int i = 0; i< str.length(); i++)
			{
				if( charFreqMap.get(str.charAt(i)) == 1) {
					index = i;
					break;
			}
			
		}
		
		return index;
		
	}
	public static void main(String[] args) {

		System.out.println(firstUniqueChar("fourByfourfrog"));
	}

}
