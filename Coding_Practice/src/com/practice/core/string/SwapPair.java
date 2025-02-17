package com.practice.core.string;

public class SwapPair {

	/*
	 * Input: str = “Java”
Output: aJav


Explanation: The given string contains even number of characters. Therefore, we swap every pair of characters.


Input: str = “GeeksForGeeks”
Output: eGkeFsroeGkes


Explanation: The given string contains odd number of characters. Therefore, we swap every pair of characters and last character remains as it is.
*/
	
	public static String swapPairs(String str)
    {
 
        // Checking if string is null
        // or empty then return str
        if (str == null || str.isEmpty())
            return str;
 
        // Converting the given string
        // into a character array
        char[] ch = str.toCharArray();
 
        // Traverse the character array
        for (int i = 0; i < ch.length-1; i += 2) {
        	
        	System.out.print(i +" ");
        	
 
            // Swapping the characters
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
 
        // Converting the result into a
        // string and return
        return new String(ch);
    }
 
    // Driver Code
    public static void main(String args[])
    {
 
        // Given String str
        String str = "GeeksForGeeks";
 
        // Print the result
        System.out.println(swapPairs(str));
    }
}
