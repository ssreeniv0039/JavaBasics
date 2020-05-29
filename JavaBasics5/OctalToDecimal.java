package com.learning.JavaBasics5;

public class OctalToDecimal {

	public static void main(String[] args) {
		
		System.out.println(octalToDecimal(65));
	}
	public static int octalToDecimal(int num) {
		int decimalNumber = 0, i = 0;
		
		while(num != 0) {
			int remainder = num % 10;
			decimalNumber += remainder * Math.pow(8, i);
			num = num/10;
			i++;
		}
		return decimalNumber;
	}

}
