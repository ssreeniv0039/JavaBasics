package com.learning.JavaBasics1;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {
		int num1 ,num2;
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		num1 = obj2.nextInt();
		System.out.println("The first number : " + num1);
		num2 = obj2.nextInt();
		System.out.println("The second number : " + num2);
		int result = num1 + num2;
		System.out.println("Result : "+ result);

	}

}
