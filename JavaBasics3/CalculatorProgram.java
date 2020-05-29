package com.learning.JavaBasics3;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		double num1 = reader.nextDouble();
		double num2 = reader.nextDouble();
		System.out.println("Enter an operator : (+, -, /, *)");
		char operator = reader.next().charAt(0);
		
		double result = 0;
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
			result = num1/num2;
			break;

		default:
			System.out.println("Enter the correct operator");
			break;
		}
		
		System.out.println(result);
	}

}
