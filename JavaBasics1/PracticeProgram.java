package com.learning.JavaBasics1;


public class PracticeProgram {
	
	
	
	public static void main(String[] args) {
		
		int num = 150;
		int result = octalToDecimal(num);
		int finalResult = decimalToBinary(result);
		System.out.println(finalResult);
		}
	
		public static int octalToDecimal(long num) {
			int decimal = 0, i = 0;
			long remainder = 0;
			while(num> 0) {
				remainder = num % 10;
				decimal+= remainder * Math.pow(8, i);
				i++;
				num = num /10;
			}
			return decimal;	
		}
		
		public static int decimalToBinary(int num) {
			int binary = 0,i = 1;
			int remainder = 0;
			while(num >0) {
				remainder  = num % 2;
				binary += remainder *i;
				i*= 10;
				num = num/2;
			}return binary;
		}
		
		
		
}
