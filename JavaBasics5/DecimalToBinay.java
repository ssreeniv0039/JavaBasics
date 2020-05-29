package com.learning.JavaBasics5;

public class DecimalToBinay {

	public static void main(String[] args) {
		int num = 156;
		long binay = decimalToBinay(num);
		System.out.println(binay);

	}
	
	public static long decimalToBinay(int num) {
		
		long binaryNumber = 0;
		int remainder = 1, i = 1;
		
		while(num != 0) {
			remainder = num % 2;
			binaryNumber += remainder * i;
			i *= 10;
			num = num/2;
		}
		return binaryNumber;
		
	}

}
