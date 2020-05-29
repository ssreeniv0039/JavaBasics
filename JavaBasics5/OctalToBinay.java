package com.learning.JavaBasics5;

public class OctalToBinay {

	public static void main(String[] args) {
		
		System.out.println(octalToBinary(65));
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

public static long octalToBinary (int num) {
	int result = octalToDecimal(num);
	long finalResult = decimalToBinay(result);
	return finalResult;
}

}
