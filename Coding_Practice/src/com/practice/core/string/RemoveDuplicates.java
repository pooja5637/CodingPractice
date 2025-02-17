package com.practice.core.string;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String result = removeDuplicates(str);
        System.out.println("After removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {  // Add returns false if element already exists
                sb.append(ch);
            }
      	
 //       	set.add(ch);
        }
     //   return set.toString(); // After removing duplicates: [p, r, o, g, a, m, i, n]
        
        return sb.toString();
    }
}
