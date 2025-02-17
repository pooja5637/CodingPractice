package com.practice.core;

import java.util.Scanner;

public class SingleDigit {
	
	public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int n = scanner.nextInt();

        // Continue the loop while n is greater than 9
        while (n > 9) {
            // Check if n is even
            if (n % 2 == 0) {
                // Perform the floor operation for even numbers
                n = (int) Math.floor((n - 2) / 2.0);
            } else {
                // Perform the floor operation for odd numbers
                n = (int) Math.floor(n / 2.0);
            }
        }

        // Output the final value of n
        System.out.println(n);

        // Close the scanner
        scanner.close();
    }

}
