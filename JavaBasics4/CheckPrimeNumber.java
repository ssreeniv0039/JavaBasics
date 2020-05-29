package com.learning.JavaBasics4;

public class CheckPrimeNumber {
	
	//Java program to check whether a number can be expressed as Sum of two prime numbers
	//34 = 3+31, 5+29, 11+23, 17+17
	//11 =?(Already a prime number)
	public static boolean checkPrimeNumber(int value) {
		boolean isPrime =true;
		
		for(int i = 2;i<= value/2;i++) {
			if(value != 0 && value != 1) {
				if(value % i == 0) {
					isPrime =false;
					break;
			}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		
		int value =1;
		boolean flag = false;
		
		for(int i = 2;i<= value/2;i++) {
			if(checkPrimeNumber(i)) {
				if(checkPrimeNumber(value-i)) {
					System.out.println(value + " =" + i + " +" +(value - i));
					flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println(value + " cannot be expressed as two prime numbers");
		}

	}

}
