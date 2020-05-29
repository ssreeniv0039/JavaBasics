package com.learning.JavaBasics1;

import java.util.Scanner;

public class ComputeQuotientAndReminder {

	public static void main(String[] args) {
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		int dividend = obj2.nextInt();
		System.out.println("The dividend is : " + dividend);
		int divisor = obj2.nextInt();
		System.out.println("The  divisor is : " + divisor);
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient : "+ quotient);
		System.out.println("Remainder : "+ remainder);

	}

}
