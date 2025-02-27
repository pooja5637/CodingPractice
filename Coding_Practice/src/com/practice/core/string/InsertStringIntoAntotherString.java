/**
 * 
 */
package com.practice.core.string;

/**
 *  without pre-defined function
 */
public class InsertStringIntoAntotherString {

	// Function to insert string 
    public static String insertString( 
        String originalString, 
        String stringToBeInserted, 
        int index) 
    { 
  
        // Create a new string 
        String newString = new String(); 
  
        for (int i = 0; i < originalString.length(); i++) { 
  
            // Insert the original string character 
            // into the new string 
            newString += originalString.charAt(i); 
           // System.out.println(newString);
  
            if (i == index) { 
  
                // Insert the string to be inserted 
                // into the new string 
                newString += stringToBeInserted; 
            } 
        } 
  
        // return the modified String 
        return newString; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get the Strings 
        String originalString = "Pooja Ambavale"; 
        String stringToBeInserted = " Prakash"; 
        int index = 4; 
  
        System.out.println("Original String: "
                           + originalString); 
        System.out.println("String to be inserted: "
                           + stringToBeInserted); 
        System.out.println("String to be inserted at index: "
                           + index); 
  
        // Insert the String 
        System.out.println("Modified String: "
                           + insertString(originalString, 
                                          stringToBeInserted, 
                                          index)); 
    } 
}
