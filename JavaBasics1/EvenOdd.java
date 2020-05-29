package com.learning.JavaBasics1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1 = obj3.nextInt();
		 if(num1 == 0) {
			System.out.println("Zero");
		}
		 else if(num1 % 2 == 0) {
				System.out.println(num1 + " Even Number");
			}
		else {
			System.out.println(num1 + " Odd Number");
		}
	}

}
