package com.learning.JavaBasics5;

public class BinayToDecimal {
	

	public static void main(String[] args) {
		
		long num = 1001100111;
		int decimal = binaryToDecimal(num);
		System.out.println(decimal);

	}
	
	public static int binaryToDecimal(long num) {
		int decimalNumber = 0, i = 0;
		long remainder;
		
		while(num != 0) {
		remainder = num % 10;
		//decimalNumber = (int) (decimalNumber + (remainder * Math.pow(2, i)));
		decimalNumber +=  (remainder * Math.pow(2, i));
		num = num/10;
		i++;
		}
		return decimalNumber;
	}

}
