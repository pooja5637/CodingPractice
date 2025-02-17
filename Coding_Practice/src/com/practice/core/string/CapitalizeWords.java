package com.practice.core.string;

public class CapitalizeWords {
	
    public static String capitalizeFirstLetter(String sentence) {
    	
        if (sentence == null || sentence.trim().isEmpty()) {
            return "Invalid input"; // Handle empty input
        }

        String result = ""; // To store the final capitalized sentence
        String[] words = sentence.split("\\s+"); // Split the sentence into words

        for (String word : words) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0))  + word.substring(1).toLowerCase()  // Convert remaining letters to lowercase
                        + " ";  // Add space after each word
            }
        }

        return result.trim(); // Remove extra space at the end
    }

    public static void main(String[] args) {
        String sentence = "hello world! welcome to java programming.";
        System.out.println(capitalizeFirstLetter(sentence));  
        // Output: "Hello World! Welcome To Java Programming."
    }
}


/* using streams 

return Arrays.stream(sentence.split("\\s+"))
        .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
        .collect(Collectors.joining(" "));
*/
