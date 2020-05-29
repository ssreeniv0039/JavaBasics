package com.learning.JavaBasic2;

public class FactorialOfANumber {
			
	public static void factorial(int value) {
		
			int fact = 1;
			for(int i = 1;i<=value;i++) {
				fact = fact*i;
		}
			System.out.println(fact);
	}
	// Using recursive algorithm
	public static long factorialRec(long n) {
		if(n == 0) {
			return 1;
		}else {
			return(n * factorialRec(n-1));
		}
	}

	public static void main(String[] args) {
		factorial(5);
		System.out.println(factorialRec(5));
		
		
	}

}
