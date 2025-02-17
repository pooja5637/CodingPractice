package com.practice.core.string;

public class InsertIntoNewStringUsingStringBuffer {

	public static String insertString(String in,int index, String toBeInserted) {
		
		StringBuffer sb = new StringBuffer(in);
		
		sb.insert(index+1, toBeInserted);
		
		return sb.toString();
	}
	public static void main(String[] args) {

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
                                          index, 
                                          stringToBeInserted)); 
		
	}

}
