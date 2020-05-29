package com.learning.JavaBasics3;

import java.util.Scanner;

public class PracticeProgram {

	public static void main(String[] args) {
	 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		double num1 = reader.nextDouble();
		double num2 = reader.nextDouble();
		System.out.println("Please enter the operator : (+,-,/,*)");
		char operator = reader.next().charAt(0);
		double result = 1;
		
		switch (operator) {
		case '+':
			result = num1 +num2;
			break;
		case '-':
			result = num1 -num2;
			break;
		case '*':
			result = num1 *num2;
			break;
		case '/':
			result = num1 /num2;
			break;

		default:
			System.out.println("Please enter the correct operator");
			break;
		}
		System.out.println(result);

	}
}
	
