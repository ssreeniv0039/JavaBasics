package com.learning.JavaBasics1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		// Without using a temp variable
		int a = 10;
		int b = 10;
		if(a!=b) {
		a  = a+ b;//10+20= 30
		b = a- b;//30-20=10
		a = a- b;//30-10=20
		System.out.println("The value of a is : "+ a);
		System.out.println("The value of b is : "+ b);
		}
		else{
			System.out.println("Both the numbers are equal to each other");
		}
		System.out.println("============================");
		
		// Using temp variable
		int temp;
		int num1 = 10;
		int num2 = 20;
		if(num1!=num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("The value of num1 is : "+ num1);
			System.out.println("The value of num2 is : "+ num2);
		}
		else {
			System.out.println("Both the numbers are equal to each other");
		}
	}

}
