package com.learning.JavaBasics5;

public class BinayToOcatl {

	public static void main(String[] args) {
	
System.out.println(binaryToOctal(1001100111));
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
	
	public static int decimalToOctal(int num) {
		int remainder = 1, i =1;
		int octal = 0;
		
		while(num != 0) {
			remainder = num % 8;
			octal += remainder * i;
			i*= 10;
			num = num/8;
		}
		return octal;
	}
	public static int binaryToOctal(long num) {
		
		int result= binaryToDecimal(num);
		int finalResult = decimalToOctal(result);
			
		return finalResult;	
}
}
