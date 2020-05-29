package com.learning.JavaBasic2;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		//Using for loop
		int num = 100000;
		int i = 0;
		for(;num> 0;num = num /10,++i) {
			
		}
		System.out.println("Number of digits "+ i);
		
		//Using while loop
		int count =0;
		int num1 = 100;
		while(num1>0) {
			num1 = num1/10;
			++count;
		}
		System.out.println("Number of digits is :"+count);
		
		
		
		
	}

}
