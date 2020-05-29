package com.learning.JavaBasics3;

public class PalindromeNumber {

	public static void main(String[] args) {
		 int num = 141;
		 int actualNumber = num;
		 int res = 0;
		 while(num > 0 ) {
			 int n = num % 10;
			 res = res * 10 + n;
			 num = num/ 10;
		 }System.out.println(res);
		 
		 if(res == actualNumber) {
			 System.out.println("The numer is a palindrome");
		 }else {
			 System.out.println("The number is not a palindrome");
		 }

	}

}
