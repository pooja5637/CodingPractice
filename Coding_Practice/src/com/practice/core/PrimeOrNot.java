package com.practice.core;

public class PrimeOrNot {


	public boolean isPrime(int n) {
		
		// Check if the number is less than or equal to 1, which is not prime
        if (n <= 1) {
            return false;
        }
        
		for(int i = 2 ; i<=Math.sqrt(n) ; i++) {

			if(n % i == 0) {
				
				return false;
			}
		}
		
	return true;
		
	}
	

	public static void main(String[] args) {
		PrimeOrNot c= new PrimeOrNot();
		
		System.out.println(c.isPrime(37));
		System.out.println(c.isPrime(10));
	
	}

}
