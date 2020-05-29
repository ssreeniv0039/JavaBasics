package com.learning.JavaBasics1;

import java.util.Scanner;

public class MultiplyTwoFloatingNumbers {

	public static void main(String[] args) {
		//Never forget to add 'f' at the suffix while entering the numbers
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		float num1 = obj2.nextFloat();
		System.out.println("The first number : " + num1);
		float num2 = obj2.nextFloat();
		System.out.println("The second number : " + num2);
		float result = (num1 * num2);
		System.out.println("Result : "+ result);

	}

}
