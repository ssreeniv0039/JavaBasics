package com.learning.JavaBasics5;

public class DecimalToOctal {

	public static void main(String[] args) {
		int num =78;
		int octalres = decimalToOctal(num);
		System.out.println(octalres);

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

}
